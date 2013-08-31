package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dateCode)(date)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field69ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/8!n
		setup(FieldComponentsFormat.FORMAT042.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dateCode = "YYYY";
		String date = "12345678";
		String validateData = ":" + qualifier + "//" + dateCode + "/" + date;
		Field69E f = new Field69E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
		org.testng.Assert.assertEquals(f.getDate(), date);
	}

}
