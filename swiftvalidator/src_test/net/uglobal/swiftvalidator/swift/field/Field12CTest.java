package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field12C;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(cFICode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field12CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//6!c
		setup(FieldComponentsFormat.FORMAT014.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String cFICode = "BBBBBB";

		String validateData = ":" + qualifier + "//" + cFICode;
		Field12C f = new Field12C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCFICode(), cFICode);
	}

}
