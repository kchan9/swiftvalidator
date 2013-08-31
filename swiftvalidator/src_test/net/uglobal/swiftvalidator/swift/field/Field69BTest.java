package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date1)(time1)(date2)(time2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:42:09 EDT 2012
 * 
 */
public class Field69BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n6!n/8!n6!n
		setup(FieldComponentsFormat.FORMAT039.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String date1 = "12345678";
		String time1 = "654321";
		String date2 = "00112233";
		String time2 = "998877";
		String validateData = ":" + qualifier + "//" + date1 + time1 + "/" + date2 + time2;
		Field69B f = new Field69B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate1(), date1);
		org.testng.Assert.assertEquals(f.getTime1(), time1);
		org.testng.Assert.assertEquals(f.getDate2(), date2);
		org.testng.Assert.assertEquals(f.getTime2(), time2);
	}

}
