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
public class Field35FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 35*50x
		setup(FieldComponentsFormat.FORMAT065.getFormat());
	}

	@Test
	public void testParse1() {
		String narrative = "test\r\ntest2";
		String validateData = "test\r\ntest2";
		Field35F f = new Field35F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

}
