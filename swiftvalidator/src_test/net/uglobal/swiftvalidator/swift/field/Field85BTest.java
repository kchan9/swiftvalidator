package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(location)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field85BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w][35x]
		setup(FieldComponentsFormat.FORMAT070.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "line1";
		String location = "line2";
		String validateData = partyIdentifier + NEW_LINE + location;
		Field85B f = new Field85B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getLocation(), location);
	}

}
