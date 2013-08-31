package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (partyIdentifier)(identifierCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 00:11:57 EST 2012
 * 
 */
public class Field56ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/1!a][/34x1!r1!w]4!a2!a2!c[3!c]
		setup(FieldComponentsFormat.FORMAT067.getFormat());
	}

	@Test
	public void testParse1() {
		String partyIdentifier = "line1";
		String identifierCode = "line2";
		String validateData = partyIdentifier + NEW_LINE + identifierCode;
		Field56A f = new Field56A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPartyIdentifier(), partyIdentifier);
		org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
	}

}
