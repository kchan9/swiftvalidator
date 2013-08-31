package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field80CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6*35x
		setup(FieldComponentsFormat.FORMAT061.getFormat());
	}

	@Test
	public void testParse1() {
		String narrative = "test1\r\ntest2\r\ntest3";
		String validateData = "test1\r\ntest2\r\ntest3";
		Field80C f = new Field80C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

}
