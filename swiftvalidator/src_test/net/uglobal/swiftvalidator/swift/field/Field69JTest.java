package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dateCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field69JTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c
		setup(FieldComponentsFormat.FORMAT033.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dateCode = "YYYY";
		String validateData = ":" + qualifier + "//" + dateCode;
		Field69J f = new Field69J(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
	}

}
