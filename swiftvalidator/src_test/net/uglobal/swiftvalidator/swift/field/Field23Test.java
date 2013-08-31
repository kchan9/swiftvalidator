package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (furtherIdentification)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field23Test extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 16x
		setup(FieldComponentsFormat.FORMAT059.getFormat());
	}

	@Test
	public void testParse1() {
		String furtherIdentification = "ZZZZZZZZZZZZZZZZ";
		String validateData = "ZZZZZZZZZZZZZZZZ";
		Field23 f = new Field23(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getFurtherIdentification(), furtherIdentification);
	}

}
