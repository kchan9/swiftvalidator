package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field70C;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(narrative)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field70CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4*35x
		setup(FieldComponentsFormat.FORMAT017.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String narrative = "Line1\r\nLine 2\r\nLine3 \r\nLine4";
		String validateData = ":" + qualifier + "//" + narrative;
		Field70C f = new Field70C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

}
