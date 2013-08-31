package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field70E;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(narrative)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field70ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//10*35x
		setup(FieldComponentsFormat.FORMAT029.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String narrative = "LIne 1 \r\nLine2\r\nLIne    3\r\nLine 4   \r\n Line 5 \r\n\r\n";

		String validateData = ":" + qualifier + "//" + narrative;
		Field70E f = new Field70E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String narrative = "LIne 1 \r\nLine2\r\nLIne    3\r\nLine 4   \r\n Line 5 \r\n\r\nline7\r\nline8\r\nline9\r\nline10";

		String validateData = ":" + qualifier + "//" + narrative;
		Field70E f = new Field70E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}
}
