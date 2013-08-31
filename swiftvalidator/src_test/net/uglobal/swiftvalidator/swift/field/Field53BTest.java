package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(location)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 00:11:57 EST 2012
 * 
 */
public class Field53BTest extends FieldTest {

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
		Field53B f = new Field53B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getLocation(), location);
	}

}
