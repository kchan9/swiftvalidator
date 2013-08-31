package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field50FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 35x1!r1!w4*35x
		setup(FieldComponentsFormat.FORMAT087.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "line1";
		String nameAndAddress = "line2";
		String validateData = partyIdentifier + NEW_LINE + nameAndAddress;
		Field50F f = new Field50F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
