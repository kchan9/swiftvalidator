package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field12B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(instrumentTypeCode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field12BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c
		setup(FieldComponentsFormat.FORMAT004.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXXXXXXX";
		String instrumentTypeCode = "YYYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + instrumentTypeCode;
		Field12B f = new Field12B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getInstrumentTypeCode(), instrumentTypeCode);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String instrumentTypeCode = "YYYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + instrumentTypeCode;
		Field12B f = new Field12B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getInstrumentTypeCode(), instrumentTypeCode);
	}

}
