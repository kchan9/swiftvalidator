package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field22F;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Field22FTest extends FieldTest {
	@BeforeTest
	public void beforeTest() {
		// :4!c/[8c]/4!c
		setup(FieldComponentsFormat.FORMAT004.getFormat());
	}

	@Test
	public void testParse1() {
		// :4!c/[8c]/4!c		
		// qualifier / data source scheme / indicator

		String validateData = ":LINK/xxx/yyyy";
		Field22F f = new Field22F(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getDataSourceScheme(), "xxx");
		Assert.assertEquals(f.getIndicator(), "yyyy");
	}

	@Test
	public void testParse2() {
		String validateData = ":LINK//yyyy";
		Field22F f = new Field22F(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getDataSourceScheme(), "");
		Assert.assertEquals(f.getIndicator(), "yyyy");
	}
}
