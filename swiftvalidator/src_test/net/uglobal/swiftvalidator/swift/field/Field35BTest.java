package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field35B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (identificationOfSecurity)(descriptionOfSecurity)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field35BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [ISIN1!e12!c1!r1!w][4*35x]
		setup(FieldComponentsFormat.FORMAT031.getFormat());
	}

	@Test
	public void testParse1() {
		String id = "ISIN USTST";
		String desc = "Line1\r\nLine2";

		String validateData = id + "\r\n" + desc;
		Field35B f = new Field35B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getIdentificationOfSecurity(), id);
		org.testng.Assert.assertEquals(f.getDescriptionOfSecurity(), desc);
	}

}
