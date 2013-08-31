package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(narrative)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field70GTest extends FieldTest {

	private static final String NEW_LINE = "\r\n";

	@BeforeClass
	public void beforeClass() {
		// :4!c//10*35z
		setup(FieldComponentsFormat.FORMAT054.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String narrative = "this is the first line" + NEW_LINE + "second line" + NEW_LINE + "another line";
		String validateData = ":" + qualifier + "//" + narrative;
		Field70G f = new Field70G(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

}
