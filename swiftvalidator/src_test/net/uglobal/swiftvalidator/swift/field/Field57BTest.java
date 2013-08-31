package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(location)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field57BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w][35x]
		setup(FieldComponentsFormat.FORMAT070.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "x";
		String location = "y";
		String validateData = "x\r\ny";
		Field57B f = new Field57B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getLocation(), location);
	}

}
