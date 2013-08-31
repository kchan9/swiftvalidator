package net.uglobal.swiftvalidator.codegen.fields;

import java.io.File;
import java.io.IOException;
import java.util.List;

import net.uglobal.swiftvalidator.codegen.fields.beans.Field;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

/**
 * This is used for generating code in <code>net.uglobal.swiftvalidator.xml.beans.Field.java</code>
 * See <code>FieldsGenerator</code> for more details.
 * 
 * NOTE: (quoted from FieldsGenrator.java)
 * Go to net.uglobal.swiftvalidator.xml.beans.Field.java
 * Add field(s) to the following method
 * public net.uglobal.swiftvalidator.swift.field.Field buildField(String validateData, String fieldName) {
 *
 */
public class FieldClassBuildFieldMethodGenerator {
	private static final Logger logger = Logger.getLogger(FieldClassBuildFieldMethodGenerator.class);

	//	public static void main(String argv[]) {
	//		FieldClassBuildFieldMethodGenerator generator = new FieldClassBuildFieldMethodGenerator();
	//		generator.run(null);
	//	}

	private static final String BEGIN = "%%%%%BEGIN%%%%%";
	private static final String END = "%%%%%END%%%%%";

	public void run(List<Field> fields) {
		File fieldClassFile = new File("src/net/uglobal/swiftvalidator/xml/beans/Field.java");

		try {
			String content = FileUtils.readFileToString(fieldClassFile);
			int beginIdx = content.indexOf(BEGIN) + 16;
			int endIdx = content.indexOf(END) - 5;

			String c = generateContent(fields);

			String pre = content.substring(0, beginIdx);
			String post = content.substring(endIdx, content.length());

			FileUtils.writeStringToFile(fieldClassFile, pre + c + post);
			System.out.println("");
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}
	}

	private static final String NEW_LINE = "\n";

	private String generateContent(List<Field> fields) {
		final String TABx1 = "    ";
		final String TABx2 = TABx1 + TABx1;
		final String TABx3 = TABx2 + TABx1;
		StringBuilder sb = new StringBuilder();
		sb.append(TABx1 + "public net.uglobal.swiftvalidator.swift.field.Field buildField(String validateData, String fieldName) {").append(NEW_LINE);

		sb.append(TABx2 + "if (fieldName == null) {").append(NEW_LINE);
		sb.append(TABx3 + "return null;").append(NEW_LINE);
		sb.append(TABx2 + "}").append(NEW_LINE);
		// TODO: 
		// For now need to hardcode 16R and 16S in, since 'swift.fields.codegen.config.xml' does not have 16R and 16S defined.
		sb.append(TABx2 + "// NOTE: ").append(NEW_LINE);
		sb.append(TABx2 + "// For now need to hardcode 16R and 16S in, since 'swift.fields.codegen.config.xml' does not have 16R and 16S defined.")
				.append(NEW_LINE);
		sb.append(TABx2 + "else if (fieldName.equals(\"16R\")) {").append(NEW_LINE);
		sb.append(TABx3 + "return new Field16R(validateData, this);").append(NEW_LINE);
		sb.append(TABx2 + "}").append(NEW_LINE);

		sb.append(TABx2 + "else if (fieldName.equals(\"16S\")) {").append(NEW_LINE);
		sb.append(TABx3 + "return new Field16S(validateData, this);").append(NEW_LINE);
		sb.append(TABx2 + "}").append(NEW_LINE);

		for (Field field : fields) {
			String fName = field.getName();
			sb.append(TABx2 + "else if (fieldName.equals(\"" + fName + "\")) {").append(NEW_LINE);
			sb.append(TABx3 + "return new Field" + fName + "(validateData, this);").append(NEW_LINE);
			sb.append(TABx2 + "}").append(NEW_LINE);

		}
		sb.append(TABx2 + "return null;").append(NEW_LINE);
		sb.append(TABx1 + "}").append(NEW_LINE);

		return sb.toString();
	}
}
