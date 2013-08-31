package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field57CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// /34x
		setup(FieldComponentsFormat.FORMAT068.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "aaaa";
		String validateData = "/aaaa";
		Field57C f = new Field57C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
	}

}
