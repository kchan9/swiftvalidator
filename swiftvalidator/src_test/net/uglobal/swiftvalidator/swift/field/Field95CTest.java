package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(countryCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Oct 05 00:08:15 EDT 2012
 * 
 */
public class Field95CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//2!a
		setup(FieldComponentsFormat.FORMAT024.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String countryCode = "BB";
		String validateData = ":" + qualifier + "//" + countryCode;
		Field95C f = new Field95C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCountryCode(), countryCode);
	}

}
