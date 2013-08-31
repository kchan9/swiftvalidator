package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(identifierCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 17:26:36 EDT 2012
 * 
 */
public class Field83ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w]4!a2!a2!c[3!c]
		setup(FieldComponentsFormat.FORMAT067.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "";
		String identifierCode = "Y";
		String validateData = partyIdentifier + NEW_LINE + identifierCode;
		Field83A f = new Field83A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
	}

}
