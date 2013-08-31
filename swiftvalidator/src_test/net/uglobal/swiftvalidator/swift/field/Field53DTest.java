package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field53DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w]4*35x
		setup(FieldComponentsFormat.FORMAT069.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "x";
		String nameAndAddress = "y";
		String validateData = "x\r\ny";
		Field53D f = new Field53D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
