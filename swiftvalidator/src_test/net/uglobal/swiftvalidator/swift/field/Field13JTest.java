package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(extendedNumberId)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field13JTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//5!c
		setup(FieldComponentsFormat.FORMAT078.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String extendedNumberId = "YYYYY";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + extendedNumberId;
		Field13J f = new Field13J(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getExtendedNumberId(), extendedNumberId);
	}

}
