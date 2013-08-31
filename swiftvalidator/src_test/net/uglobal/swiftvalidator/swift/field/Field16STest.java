package net.uglobal.swiftvalidator.swift.field;

import static org.testng.Assert.assertEquals;

import net.uglobal.swiftvalidator.swift.field.Field16S;

import org.testng.annotations.Test;

public class Field16STest {

	@Test
	public void testParse() {
		String validateData = "GENL";

		Field16S f = new Field16S(validateData, null);
		String code = f.getCode();

		assertEquals(code, validateData);
	}
}
