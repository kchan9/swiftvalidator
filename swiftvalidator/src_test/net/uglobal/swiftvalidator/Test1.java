package net.uglobal.swiftvalidator;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.field.FieldPart;
import net.uglobal.swiftvalidator.parser.FieldPartParser;

public class Test1 {

	private static final String FORMAT1 = ":4!c//16x";

	private static final String FORMAT2 = "ISIN1!e12!c";

	private static List<Character> partHolder = new ArrayList<Character>();

	public static void main(String argv[]) {
		Test1 main = new Test1();
		main.test();
	}

	private void test() {

		String formatStr = "";

		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();

		System.out.println(completeFieldPart);

	}
}
