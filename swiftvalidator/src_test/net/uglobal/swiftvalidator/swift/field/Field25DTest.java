package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field25D;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(statusCode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field25DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c
		setup(FieldComponentsFormat.FORMAT004.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXXXXXXX";
		String statusCode = "ACPT";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + statusCode;
		Field25D f = new Field25D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getStatusCode(), statusCode);
	}

	@Test
	public void testParse2() {
		// :4!c/[8c]/4!c
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String statusCode = "ACPT";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + statusCode;
		Field25D f = new Field25D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getStatusCode(), statusCode);
	}
}
