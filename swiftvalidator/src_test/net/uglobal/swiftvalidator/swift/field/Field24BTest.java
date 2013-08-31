package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(reasonCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:41:00 EDT 2012
 * 
 */
public class Field24BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c
		setup(FieldComponentsFormat.FORMAT004.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dataSourceScheme = "yyyyyy";
		String reasonCode = "ZZZZ";
		String validateData = COLON + qualifier + SINGLE_SLASH + dataSourceScheme + SINGLE_SLASH + reasonCode;
		Field24B f = new Field24B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getReasonCode(), reasonCode);
	}

}
