package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field20C;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Field20CTest extends FieldTest {

	@BeforeTest
	public void beforeTest() {
		// :4!c//16x
		setup(FieldComponentsFormat.FORMAT003.getFormat());
	}

	@Test
	public void testParse1() {
		// 
		// qualifier / reference

		String validateData = ":LINK//test";
		Field20C f = new Field20C(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getReference(), "test");
	}

	@Test
	public void testParse2() {

		// qualifier / reference

		String validateData = ":LINK//";
		Field20C f = new Field20C(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getReference(), "");
	}
}
