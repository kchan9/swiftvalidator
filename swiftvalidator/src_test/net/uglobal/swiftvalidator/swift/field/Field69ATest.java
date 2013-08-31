package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date1)(date2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:42:09 EDT 2012
 * 
 */
public class Field69ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n/8!n
		setup(FieldComponentsFormat.FORMAT038.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String date1 = "12345678";
		String date2 = "87654321";
		String validateData = ":XXXX//12345678/87654321";
		Field69A f = new Field69A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate1(), date1);
		org.testng.Assert.assertEquals(f.getDate2(), date2);
	}

}
