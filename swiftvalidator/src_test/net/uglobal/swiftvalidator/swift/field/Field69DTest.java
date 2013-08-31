package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date)(time)(dateCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field69DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n6!n/4!c
		setup(FieldComponentsFormat.FORMAT041.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String date = "12345678";
		String time = "998877";
		String dateCode = "yyyy";
		String validateData = ":" + qualifier + "//" + date + time + "/" + dateCode;
		Field69D f = new Field69D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
	}

}
