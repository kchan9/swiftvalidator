package net.uglobal.swiftvalidator.parser;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class FieldPartParserTestGenerator {
	private static final Logger logger = Logger.getLogger(FieldPartParserTestGenerator.class);

	private final SortedMap<String, String> formatMap = new TreeMap<String, String>();

	private static final String NEW_LINE = "\r\n";
	private static final String TAB_1 = "    ";
	private static final String TAB_2 = TAB_1 + TAB_1;
	//	private static final String BEGIN = "%%%%%BEGIN%%%%%";
	private static final String END = "// %%%%%END%%%%%";

	private static final File fieldPartParserTestFile = new File("src_test/net/uglobal/swiftvalidator/parser/FieldPartParserTest.java");

	public void run() {
		Class fieldComponentsFormatClazz = FieldComponentsFormat.class;
		Field[] fields = fieldComponentsFormatClazz.getFields();
		for (Field field : fields) {
			try {
				FieldComponentsFormat formatField = (FieldComponentsFormat) field.get(Class
						.forName("net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat"));
				formatMap.put(formatField.name(), formatField.getFormat());
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		Class fieldPartParserTestClazz = FieldPartParserTest.class;
		Method[] methods = fieldPartParserTestClazz.getMethods();
		for (Method method : methods) {
			String methodName = method.getName();
			if (methodName.startsWith("testFORMAT")) {
				methodName = methodName.replaceFirst("test", "");

				if (formatMap.containsKey(methodName)) {
					formatMap.remove(methodName);
				}
			}
		}

		try {
			String content = FileUtils.readFileToString(fieldPartParserTestFile);
			int idx = content.indexOf(END);

			String c = generateContent();

			String pre = content.substring(0, idx);
			String post = content.substring(idx, content.length());

			FileUtils.writeStringToFile(fieldPartParserTestFile, pre + c + NEW_LINE + NEW_LINE + post);
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}

		System.out.println("");
	}

	private String generateContent() {
		StringBuilder sb = new StringBuilder();
		for (Entry<String, String> entry : formatMap.entrySet()) {
			sb.append(TAB_1 + "@Test").append(NEW_LINE);
			sb.append(TAB_1 + "public void test" + entry.getKey() + "() {").append(NEW_LINE);
			sb.append(TAB_2 + "// " + entry.getValue()).append(NEW_LINE);
			sb.append(TAB_2 + "final String formatStr = FieldComponentsFormat." + entry.getKey() + ".getFormat();").append(NEW_LINE);
			sb.append(NEW_LINE);
			sb.append(TAB_2 + "// -- expected").append(NEW_LINE);
			sb.append(TAB_2 + "StringBuilder expected = new StringBuilder();").append(NEW_LINE);
			sb.append(TAB_2 + "// TODO: ").append(NEW_LINE);
			sb.append(TAB_2 + "String expectedStr = expected.toString();").append(NEW_LINE);
			sb.append(NEW_LINE);
			sb.append(TAB_2 + "// -- actual").append(NEW_LINE);
			sb.append(TAB_2 + "FieldPartParser parser = new FieldPartParser(formatStr);").append(NEW_LINE);
			sb.append(TAB_2 + "parser.parse();").append(NEW_LINE);
			sb.append(TAB_2 + "FieldPart completeFieldPart = parser.getCompleteFieldPart();").append(NEW_LINE);
			sb.append(TAB_2 + "String actualStr = completeFieldPart.toString();").append(NEW_LINE);
			sb.append(TAB_2 + "logger.info(\"actual:\\n\" + actualStr);").append(NEW_LINE);
			sb.append(NEW_LINE);
			sb.append(TAB_2 + "Assert.assertEquals(expectedStr, actualStr);").append(NEW_LINE);
			sb.append(TAB_1 + "}").append(NEW_LINE);
			sb.append(NEW_LINE);
		}
		return sb.toString();
	}

	public static void main(String argv[]) {
		FieldPartParserTestGenerator generator = new FieldPartParserTestGenerator();
		generator.run();
	}
}
