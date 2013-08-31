package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date)(dateCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field69CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n/4!c
		setup(FieldComponentsFormat.FORMAT040.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String date = "12345678";
		String dateCode = "yyy";
		String validateData = ":XXXX//" + date + "/yyy";
		Field69C f = new Field69C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
	}

}
