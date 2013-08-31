package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field52CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// /34x
		setup(FieldComponentsFormat.FORMAT068.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "aaa";
		String validateData = "/aaa";
		Field52C f = new Field52C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
	}

	@Test
	public void testParse2() {
		String partyIdentifier = "";
		String validateData = "/";
		Field52C f = new Field52C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
	}

}
