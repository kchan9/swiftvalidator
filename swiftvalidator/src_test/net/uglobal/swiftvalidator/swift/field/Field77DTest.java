package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field77DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6*35x
		setup(FieldComponentsFormat.FORMAT061.getFormat());
	}

	@Test
	public void testParse1() {
		String narrative = "test";
		String validateData = narrative;
		Field77D f = new Field77D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

	@Test
	public void testParse2() {
		String narrative = BLANK;
		String validateData = narrative;
		Field77D f = new Field77D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

}
