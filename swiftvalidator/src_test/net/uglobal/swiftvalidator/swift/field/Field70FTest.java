package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 13:07:45 EDT 2012
 * 
 */
public class Field70FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8000z
		setup(FieldComponentsFormat.FORMAT083.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String narrative = "a";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + narrative;
		Field70F f = new Field70F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

	@Test
	public void testParse2() {
		String qualifier = "XXXX";
		String narrative = BLANK;
		String validateData = COLON + qualifier + DOUBLE_SLASHS + narrative;
		Field70F f = new Field70F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}
}
