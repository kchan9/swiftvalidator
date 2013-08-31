package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field16R;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Field16RTest {

	@Test
	public void testParse() {
		String validateData = "GENL";

		Field16R f = new Field16R(validateData, null);
		String code = f.getCode();

		Assert.assertEquals(code, validateData);
	}
}
