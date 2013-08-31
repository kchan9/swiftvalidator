package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Nov 02 08:32:27 EDT 2012
 * 
 */
public class Field87DTest extends FieldTest {

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
		Field87D f = new Field87D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
