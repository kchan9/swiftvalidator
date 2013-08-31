package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field85DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w]4*35x
		setup(FieldComponentsFormat.FORMAT069.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "line1";
		String nameAndAddress = "line2";
		String validateData = partyIdentifier + NEW_LINE + nameAndAddress;
		Field85D f = new Field85D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
