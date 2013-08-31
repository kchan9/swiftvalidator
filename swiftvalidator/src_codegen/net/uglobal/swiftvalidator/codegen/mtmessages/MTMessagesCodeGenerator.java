package net.uglobal.swiftvalidator.codegen.mtmessages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.uglobal.swiftvalidator.xml.XmlBeanParser;
import net.uglobal.swiftvalidator.xml.beans.MTType;
import net.uglobal.swiftvalidator.xml.beans.Option;
import net.uglobal.swiftvalidator.xml.beans.Options;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClass;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;

/**
 * @deprecated
 * 
 * NOTE: To generate unit test class for MT messages. 
 *       1) copy MT307AllowedFollowByFieldsTest.java to a new file (e.g. MT500AllowedFollowByFieldsTest.java)
 *       2) in the copied file (MT500AllowedFollowByFieldsTest.java, modify arraylist
 */
@Deprecated
public class MTMessagesCodeGenerator {
	private static final Logger logger = Logger.getLogger(MTMessagesCodeGenerator.class);

	private static String mtSchemaDir;
	private static final String DEFAULT_MT_SCHEMA_DIR = "resources\\swift_library";
	private static final String outputDir = "src";
	private static final String EOL = "\n";

	private static final String packageName = "net.uglobal.swiftvalidator.xml.beans";

	private final Map<MTType, List<net.uglobal.swiftvalidator.xml.beans.Field>> mtMessagesMap = new HashMap<MTType, List<net.uglobal.swiftvalidator.xml.beans.Field>>();

	public static void main(String[] argv) throws IOException, JClassAlreadyExistsException, ClassNotFoundException {
		String f = null;
		if (argv != null && argv.length == 1) {
			f = argv[0];
		}

		mtSchemaDir = (StringUtils.isNotBlank(f)) ? f : DEFAULT_MT_SCHEMA_DIR;

		MTMessagesCodeGenerator main = new MTMessagesCodeGenerator();
		main.preCreateMTFiles();

		main.init();

		main.generateClassCode();
	}

	private MTType getMTType(File file) {
		return MTType.fromText(file.getName().substring(2, 5));
	}

	private void init() throws IOException {
		File dir = new File(mtSchemaDir);
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();

			for (File file : files) {
				if (file.getName().endsWith("_schema.xml")) {
					XmlBeanParser xmlBeanParser = null;
					MTType mtType = getMTType(file);
					try {
						xmlBeanParser = new XmlBeanParser(mtType);
					} catch (FileNotFoundException e) {
						logger.error(e.getMessage(), e);
					}
					xmlBeanParser.parse();
					List<net.uglobal.swiftvalidator.xml.beans.Field> xmlFields = xmlBeanParser.getFieldList();

					mtMessagesMap.put(mtType, xmlFields);
				}
			}
		}
	}

	private void preCreateMTFiles() throws JClassAlreadyExistsException, ClassNotFoundException, IOException {

		File dir = new File(mtSchemaDir);
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();

			for (File file : files) {
				// TODO: use regex
				if (file.getName().endsWith("_schema.xml") && file.getName().startsWith("mt")) {
					JCodeModel codeModel = new JCodeModel();
					JPackage jPackage = buildPackage(codeModel);

					JDefinedClass definedClass = buildClass(jPackage, MTType.fromText(file.getName().substring(2, 5)), null);
					codeModel.build(new File(outputDir));
				}
			}
		}
	}

	private void generateClassCode() throws IOException, JClassAlreadyExistsException, ClassNotFoundException {
		for (Entry<MTType, List<net.uglobal.swiftvalidator.xml.beans.Field>> entry : this.mtMessagesMap.entrySet()) {
			MTType mtType = entry.getKey();
			List<net.uglobal.swiftvalidator.xml.beans.Field> fields = entry.getValue();

			generateCode(mtType, fields);
		}
	}

	private void generateCode(MTType mtType, List<net.uglobal.swiftvalidator.xml.beans.Field> fields) throws IOException,
			JClassAlreadyExistsException, ClassNotFoundException {
		JCodeModel codeModel = new JCodeModel();

		JPackage jPackage = buildPackage(codeModel);
		JDefinedClass definedClass = buildClass(jPackage, mtType, fields);

		buildClassLevelJavaDoc(definedClass);
		//
		buildConstructor(definedClass);
		//
		buildGetFieldMethods(definedClass, codeModel, fields);
		// 
		buildGetFieldMethods2(definedClass, codeModel, fields);
		// 
		codeModel.build(new File(outputDir));
	}

	private void buildGetFieldMethods(JDefinedClass definedClass, JCodeModel codeModel, List<net.uglobal.swiftvalidator.xml.beans.Field> fields)
			throws ClassNotFoundException {
		String methodNamePrefix = "getField";
		Set<String> processedFields = new LinkedHashSet<String>();
		for (net.uglobal.swiftvalidator.xml.beans.Field field : fields) {
			Options options = null;
			String fieldName = field.getTag();

			if (processedFields.contains(fieldName)) {
				continue;
			}
			if ((options = field.getOptions()) == null) {
				JClass clazz = codeModel.ref(List.class).narrow(codeModel.ref(net.uglobal.swiftvalidator.swift.field.Field.class));
				JMethod method = definedClass.method(JMod.PUBLIC, clazz, methodNamePrefix + fieldName);
				JBlock methodBlock = method.body();
				methodBlock.directStatement("return getFieldsByFieldClass().get(net.uglobal.swiftvalidator.swift.field.Field" + fieldName
						+ ".class);");
				if (!processedFields.contains(fieldName)) {
					processedFields.add(fieldName);
				}
			} else {
				List<Option> optionList = options.getOptionList();
				for (Option option : optionList) {

					String optionLetter = option.getName();
					fieldName = fieldName.substring(0, fieldName.length() - 1) + optionLetter;
					if (processedFields.contains(fieldName)) {
						continue;
					}
					JClass clazz = codeModel.ref(List.class).narrow(codeModel.ref(net.uglobal.swiftvalidator.swift.field.Field.class));
					JMethod method = definedClass.method(JMod.PUBLIC, clazz, methodNamePrefix + fieldName);
					JBlock methodBlock = method.body();
					methodBlock.directStatement("return getFieldsByFieldClass().get(net.uglobal.swiftvalidator.swift.field.Field" + fieldName
							+ ".class);");
					if (!processedFields.contains(fieldName)) {
						processedFields.add(fieldName);
					}
				}
			}
		}
	}

	private void buildGetFieldMethods2(JDefinedClass definedClass, JCodeModel codeModel, List<net.uglobal.swiftvalidator.xml.beans.Field> fields)
			throws ClassNotFoundException {
		String methodNamePrefix = "getField";
		Set<String> processedFields = new LinkedHashSet<String>();
		for (net.uglobal.swiftvalidator.xml.beans.Field field : fields) {
			Options options = null;
			String fieldName = field.getTag();

			if (processedFields.contains(fieldName)) {
				continue;
			}
			if ((options = field.getOptions()) == null) {
				JClass clazz = codeModel.ref(List.class).narrow(codeModel.ref(net.uglobal.swiftvalidator.swift.field.Field.class));
				JMethod method = definedClass.method(JMod.PUBLIC, clazz, methodNamePrefix + fieldName);
				JType jt1 = codeModel.parseType("java.lang.String");
				method.param(jt1, "sequenceShortName");
				JBlock methodBlock = method.body();
				methodBlock.directStatement("return filterFieldsBySequenceShortName(getField" + fieldName + "(), sequenceShortName);");
				//				methodBlock.directStatement("return getFieldsByFieldClass().get(net.uglobal.swiftvalidator.swift.field.Field" + fieldName
				//						+ ".class);");
				if (!processedFields.contains(fieldName)) {
					processedFields.add(fieldName);
				}
			} else {
				List<Option> optionList = options.getOptionList();
				for (Option option : optionList) {

					String optionLetter = option.getName();
					fieldName = fieldName.substring(0, fieldName.length() - 1) + optionLetter;
					if (processedFields.contains(fieldName)) {
						continue;
					}
					JClass clazz = codeModel.ref(List.class).narrow(codeModel.ref(net.uglobal.swiftvalidator.swift.field.Field.class));
					JMethod method = definedClass.method(JMod.PUBLIC, clazz, methodNamePrefix + fieldName);
					JType jt1 = codeModel.parseType("java.lang.String");
					method.param(jt1, "sequenceShortName");
					JBlock methodBlock = method.body();
					methodBlock.directStatement("return filterFieldsBySequenceShortName(getField" + fieldName + "(), sequenceShortName);");
					//					methodBlock.directStatement("return getFieldsByFieldClass().get(net.uglobal.swiftvalidator.swift.field.Field" + fieldName
					//							+ ".class);");
					if (!processedFields.contains(fieldName)) {
						processedFields.add(fieldName);
					}
				}
			}
		}
	}

	private void buildConstructor(JDefinedClass definedClass) throws ClassNotFoundException {
		JMethod constructor = definedClass.constructor(JMod.PUBLIC);
		JBlock block = constructor.body();
		block.directStatement("super();");
	}

	private JPackage buildPackage(JCodeModel codeModel) {
		return codeModel._package(packageName);
	}

	private JDefinedClass buildClass(JPackage jPackage, MTType mtType, List<net.uglobal.swiftvalidator.xml.beans.Field> fields)
			throws JClassAlreadyExistsException, ClassNotFoundException {
		JDefinedClass definedClass = jPackage._class(mtType.name());

		definedClass._extends(net.uglobal.swiftvalidator.xml.beans.MTMessage.class);

		//		if (fields != null && fields.size() > 0) {
		//			for (net.uglobal.swiftvalidator.xml.beans.Field field : fields) {
		//				Options options = null;
		//				String fieldName = field.getTag();
		//				if ((options = field.getOptions()) == null) {
		//					Class clazz = Class.forName("net.uglobal.swiftvalidator.swift.field.Field" + fieldName);
		//					definedClass._extends(clazz);
		//					definedClass._
		//				} else {
		//					List<Option> optionList = options.getOptionList();
		//					for (Option option : optionList) {
		//						String optionLetter = option.getName();
		//						Class clazz = Class.forName("net.uglobal.swiftvalidator.swift.field.Field" + fieldName.substring(0, fieldName.length() - 1)
		//								+ optionLetter);
		//						definedClass._extends(clazz);
		//					}
		//				}
		//			}
		//		}
		return definedClass;
	}

	private void buildClassLevelJavaDoc(JDefinedClass definedClass) {
		StringBuilder comment = new StringBuilder();
		comment.append("AUTO GENERATED - DO NOT HAND MODIFY").append(EOL);
		comment.append("Generated on " + new Date());

		JDocComment classLevelDoc = definedClass.javadoc();
		classLevelDoc.add(comment.toString());
	}

}
