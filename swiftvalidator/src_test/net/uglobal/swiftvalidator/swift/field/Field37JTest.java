package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (rate)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field37JTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 12d
		setup(FieldComponentsFormat.FORMAT075.getFormat());
	}

	@Test
	public void testParse1() {
		String rate = "123456";
		String validateData = rate;
		Field37J f = new Field37J(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}

	@Test
	public void testParse2() {
		String rate = BLANK;
		String validateData = rate;
		Field37J f = new Field37J(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}

}
