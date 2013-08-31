package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dateCode)(date)(time)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field69FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/8!n6!n
		setup(FieldComponentsFormat.FORMAT043.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dateCode = "YYYY";
		String date = "12345678";
		String time = "998877";
		String validateData = ":" + qualifier + "//" + dateCode + "/" + date + time;
		Field69F f = new Field69F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
	}

}
