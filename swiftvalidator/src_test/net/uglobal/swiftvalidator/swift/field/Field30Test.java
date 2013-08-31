package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (dateOfAdjustment)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field30Test extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6!n
		setup(FieldComponentsFormat.FORMAT060.getFormat());
	}

	@Test
	public void testParse1() {
		String date = "123456";
		String validateData = "123456";
		Field30 f = new Field30(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
	}

}
