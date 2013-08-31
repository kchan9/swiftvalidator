package net.uglobal.swiftvalidator.codegen.fields;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.uglobal.swiftvalidator.codegen.fields.beans.Component;
import net.uglobal.swiftvalidator.codegen.fields.beans.Field;
import net.uglobal.swiftvalidator.codegen.fields.beans.FieldDictionary;
import net.uglobal.swiftvalidator.codegen.fields.util.SwiftFieldsMarshaller;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sun.codemodel.JBlock;
import com.sun.codemodel.JClassAlreadyExistsException;
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JDocComment;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.JPackage;
import com.sun.codemodel.JType;

/**
 * 1) This class is to generate codes for all the Field classes in 
 * package net.uglobal.swiftvalidator.swift.field
 * 2) and also generate the unit tests for all the Field classes
 *
 * TODO: need auto gen to create script for TestSuite, just need to print out to 
 * System.out, and I can copy paste to TestSuite.xml
 */
public class FieldsGenerator {
	private static final Logger logger = Logger.getLogger(FieldsGenerator.class);

	private static final List<String> errorMessages = new ArrayList<String>();

	private static String configFile;
	private static final String DEFAULT_CONFIG_FILE = "resources\\swift_library\\swift.fields.codegen.config.xml";
	private static final String outputDir = "src";
	private static final String testOutputDir = "src_temp";
	private static final String EOL = "\n";

	private static final String packageName = "net.uglobal.swiftvalidator.swift.field";

	private List<Field> fields;

	public static void main(String[] argv) {
		FieldsGenerator fieldsCodeGenerator = new FieldsGenerator();
		fieldsCodeGenerator.run(argv[0]);
	}

	public void run(String f) {
		configFile = (StringUtils.isNotBlank(f)) ? f : DEFAULT_CONFIG_FILE;

		//		FieldsGenerator main = new FieldsGenerator();
		init();

		generateFieldClassCode();

		generateFieldTestCode();

		printFieldTestXmlToConsole();

		if (errorMessages.size() > 0) {
			logger.error("---------------------------------------------------------------");
			logger.error("ATTENTION:");
			for (String s : errorMessages) {
				logger.error(s);
			}
			logger.error("---------------------------------------------------------------");
		} else {
			logger.info("Done on " + new Date());
		}

	}

	private void init() {
		this.fields = getFieldDictionary().getFields();
	}

	private FieldDictionary getFieldDictionary() {
		FieldDictionary dictionary = null;
		try {
			dictionary = SwiftFieldsMarshaller.fromXml(readConfigFile().toString());
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
		return dictionary;
	}

	private String readConfigFile() throws IOException {
		File file = new File(configFile);
		BufferedReader br = new BufferedReader(new FileReader(file));

		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line).append(EOL);
		}
		return sb.toString();
	}

	private void generateFieldClassCode() {
		for (Field field : this.fields) {
			try {
				generateCode(field);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		logger.info("Generated Field class source code in " + (new File(outputDir)).getAbsolutePath());
	}

	private void generateFieldTestCode() {
		for (Field field : this.fields) {
			try {
				generateCodeForTest(field);

			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
		logger.info("Generated unit test source code in " + (new File(testOutputDir)).getAbsolutePath());
	}

	private void printFieldTestXmlToConsole() {
		//		logger.info("--------------------------------------------------------------------------");
		//		logger.info("Copy and paste the following to TestSuite.xml");
		//		logger.info("--------------------------------------------------------------------------");
		StringBuilder sb = new StringBuilder();
		sb.append("    <test name=\"All CodeGen Field Tests\">").append(EOL);
		sb.append("        <classes>").append(EOL);

		for (Field field : this.fields) {
			sb.append("            <class name=\"net.uglobal.swiftvalidator.swift.field.Field" + field.getName() + "Test\" />").append(EOL);
		}
		sb.append("            <class name=\"net.uglobal.swiftvalidator.swift.field.Field16RTest\" />").append(EOL);
		sb.append("            <class name=\"net.uglobal.swiftvalidator.swift.field.Field16STest\" />").append(EOL);
		sb.append("        </classes>").append(EOL);
		sb.append("    </test>").append(EOL);

		//		logger.info(sb.toString());

		File file = new File("resources/test/fields-testsuite.xml");
		try {
			FileUtils.writeStringToFile(file, sb.toString());
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}

		// NOTE: 
		//		logger.info("-------------------------------------------------------------------------------------------------------");
		//		logger.info("------                                  IMPORTANT                                                ------");
		//		logger.info("-------------------------------------------------------------------------------------------------------");
		//		logger.info("Go to net.uglobal.swiftvalidator.xml.beans.Field.java");
		//		logger.info("Add field(s) to the following method");
		//		logger.info("public net.uglobal.swiftvalidator.swift.field.Field buildField(String validateData, String fieldName) {");
		//		logger.info("-------------------------------------------------------------------------------------------------------");
	}

	private void generateCodeForTest(Field field) throws Exception {
		JCodeModel codeModel = new JCodeModel();
		JPackage jPackage = buildPackage(codeModel);
		JDefinedClass definedClass = buildClass(jPackage, field, true);
		buildClassLevelJavaDoc(definedClass, field.getComponents(), true);
		buildBeforeClassMethod(definedClass, codeModel, field);
		buildTestParseMethod(definedClass, codeModel, field);
		codeModel.build(new File(testOutputDir));
	}

	private void generateCode(Field field) throws JClassAlreadyExistsException, ClassNotFoundException, IOException {
		JCodeModel codeModel = new JCodeModel();

		JPackage jPackage = buildPackage(codeModel);
		JDefinedClass definedClass = buildClass(jPackage, field, false);
		buildClassLevelJavaDoc(definedClass, field.getComponents(), false);
		//
		buildConstructor(definedClass, codeModel);
		//
		buildParseMethod(definedClass, codeModel, field);
		//
		buildGetterMethods(definedClass, field);
		// 
		buildToStringMethod(definedClass, field);

		codeModel.build(new File(outputDir));
	}

	private void buildToStringMethod(JDefinedClass definedClass, Field field) {
		StringBuilder sb = new StringBuilder();
		sb.append("return (new StringBuilder()).append(\"[\" ");
		for (int i = 0; i < field.getComponents().size(); i++) {
			Component component = field.getComponents().get(i);
			if (i == 0) {
				sb.append(").append( \"" + component.getName() + "=\" + getComponent" + (i + 1) + "()");
			} else {
				sb.append(").append( \", " + component.getName() + "=\" + getComponent" + (i + 1) + "()");
			}
		}
		sb.append(" ).append( \"]\").toString();");

		String methodName = "toString";
		JMethod method = definedClass.method(JMod.PUBLIC, java.lang.String.class, methodName);
		JBlock methodBlock = method.body();
		methodBlock.directStatement(sb.toString());
	}

	private void buildTestParseMethod(JDefinedClass definedClass, JCodeModel codeModel, Field field) {
		String methodName = "testParse1";
		JMethod method = definedClass.method(JMod.PUBLIC, codeModel.VOID, methodName);
		method.annotate(org.testng.annotations.Test.class);
		JBlock methodBlock = method.body();

		String fieldName = "Field" + field.getName();

		//		StringBuilder stmt = new StringBuilder();
		//		stmt.append("String validateData = \"TODO\";").append(EOL);
		List<Component> components = field.getComponents();

		for (Component component : components) {
			String componentName = component.getName();
			methodBlock.directStatement("String " + componentName + " = \"TODO\";");
		}

		methodBlock.directStatement("String validateData = \"TODO\";");
		methodBlock.directStatement(fieldName + " f = new " + fieldName + "(validateData, xmlField);");

		for (Component component : components) {
			String componentName = component.getName();
			methodBlock.directStatement("org.testng.Assert.assertEquals(f.get" + upperCaseFirstCharacter(componentName) + "(), " + componentName
					+ ");");
		}
	}

	private void buildBeforeClassMethod(JDefinedClass definedClass, JCodeModel codeModel, Field field) throws Exception {
		String methodName = "beforeClass";
		JMethod method = definedClass.method(JMod.PUBLIC, codeModel.VOID, methodName);
		method.annotate(org.testng.annotations.BeforeClass.class);
		JBlock methodBlock = method.body();

		String formatString = field.getFormatString();

		FieldComponentsFormat[] fArr = FieldComponentsFormat.values();
		FieldComponentsFormat formatFound = null;
		for (FieldComponentsFormat f : fArr) {
			if (f.getFormat().equals(formatString)) {
				formatFound = f;
			}
		}

		methodBlock.directStatement("// " + formatString);
		if (formatFound != null) {
			methodBlock.directStatement("setup(FieldComponentsFormat." + formatFound.name() + ".getFormat());");
		} else {
			String errMsg = "Missing formatString for field" + field + " in FieldComponentsFormat.java. ";
			errorMessages.add(errMsg);
			throw new Exception(errMsg);
		}
	}

	private void buildParseMethod(JDefinedClass definedClass, JCodeModel codeModel, Field field) {
		String methodName = "parse";
		JMethod method = definedClass.method(JMod.PROTECTED, codeModel.VOID, methodName);
		method.annotate(java.lang.Override.class);
		JBlock methodBlock = method.body();
		// NOTE: special case for 16R and 16S
		if (field.getName().equals("16S") || field.getName().equals("16S")) {
			methodBlock.directStatement("addComponent(validateData);");
		} else {
			methodBlock
					.directStatement("addComponents(net.uglobal.swiftvalidator.swift.field.FieldComponentParseUtil.parse(validateData, getContentFormat()));");
		}
	}

	private void buildGetterMethods(JDefinedClass definedClass, Field field) {
		List<Component> components = field.getComponents();

		//		for (Component component : components) {
		for (int i = 0; i < components.size(); i++) {
			Component component = components.get(i);
			JMethod method = definedClass.method(JMod.PUBLIC, java.lang.String.class, "get" + upperCaseFirstCharacter(component.getName()));
			//			method.annotate(java.lang.Override.class);

			JBlock methodBlock = method.body();
			methodBlock.directStatement("return getComponent" + (i + 1) + "();");
		}
	}

	private String upperCaseFirstCharacter(String s) {
		String ss = s.substring(0, 1).toUpperCase() + s.substring(1);
		return ss;
	}

	private void buildConstructor(JDefinedClass definedClass, JCodeModel codeModel) throws ClassNotFoundException {
		JMethod constructor = definedClass.constructor(JMod.PUBLIC);
		JType jt1 = codeModel.parseType("java.lang.String");
		JType jt2 = codeModel.parseType("net.uglobal.swiftvalidator.xml.beans.Field");
		constructor.param(jt1, "validateData");
		constructor.param(jt2, "xmlField");
		JBlock jconstructorBlock = constructor.body();
		jconstructorBlock.directStatement("super(validateData, xmlField);");
	}

	private JPackage buildPackage(JCodeModel codeModel) {
		return codeModel._package(packageName);
	}

	private JDefinedClass buildClass(JPackage jPackage, Field field, Boolean isForTest) throws JClassAlreadyExistsException {
		JDefinedClass definedClass = jPackage._class("Field" + field.getName() + (isForTest ? "Test" : ""));
		definedClass
				._extends(isForTest ? net.uglobal.swiftvalidator.swift.field.FieldTest.class : net.uglobal.swiftvalidator.swift.field.Field.class);
		return definedClass;
	}

	private void buildClassLevelJavaDoc(JDefinedClass definedClass, List<Component> components, Boolean isTest) {
		StringBuilder componentFormat = new StringBuilder();
		for (Component component : components) {
			componentFormat.append("(").append(component.getName()).append(")");
		}

		StringBuilder comment = new StringBuilder();
		comment.append("Field format : ").append(componentFormat).append(EOL).append(EOL);
		if (isTest) {
			comment.append("TODO: ADD TESTS").append(EOL).append(EOL);
		} else {
			comment.append("AUTO GENERATED - DO NOT HAND MODIFY").append(EOL);
		}
		comment.append("Generated on " + new Date());

		JDocComment classLevelDoc = definedClass.javadoc();
		classLevelDoc.add(comment.toString());
	}

	public List<Field> getFields() {
		return this.fields;
	}

	// -- 
	private void buildParseMethod() {

	}

}

/*
 * Steps 
 * 
 * 1) Build class Field13A
 *   a) class name
 *   b) extends class
 *   c) class level document
 * 2) Build constructor
 *   a) method name
 *   b) PUBLIC modifier
 *   c) parameter1 - String validateData
 *   d) parameter2 - Field xmlField
 *   e) directed text - super(validateData, xmlField)
 * 3) Build parse() method
 *   a) method name
 *   b) PUBLIC modifier
 *   c) return type VOID
 *   d) annotation @Override
 *   e) directed text - ???
 * 4) Build getter method(s)
 *   a) method name
 *   b) PUBLIC modifier
 *   c) return type : java.lang.String
 *   d) directed text - return getComponent1();
 */