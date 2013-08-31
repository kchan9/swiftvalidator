package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date1)(date2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 17:26:36 EDT 2012
 * 
 */
public class Field67ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6!n[/6!n]
		setup(FieldComponentsFormat.FORMAT084.getFormat());
	}

	@Test
	public void testParse1() {
		String date1 = "123456";
		String date2 = "8899";
		String validateData = date1 + SINGLE_SLASH + date2;
		Field67A f = new Field67A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate1(), date1);
		org.testng.Assert.assertEquals(f.getDate2(), date2);
	}

	@Test
	public void testParse2() {
		String date1 = "123456";
		String date2 = BLANK;
		String validateData = date1;
		Field67A f = new Field67A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate1(), date1);
		org.testng.Assert.assertEquals(f.getDate2(), date2);
	}

}
