package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(dateCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Oct 05 00:08:15 EDT 2012
 * 
 */
public class Field98BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c
		setup(FieldComponentsFormat.FORMAT004.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String dataSourceScheme = "B";
		String dateCode = "CCCC";
		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + dateCode;
		Field98B f = new Field98B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
	}

}
