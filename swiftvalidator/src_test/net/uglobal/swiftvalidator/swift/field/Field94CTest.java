package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field94C;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(country)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field94CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//2!a
		setup(FieldComponentsFormat.FORMAT024.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String country = "US";

		String validateData = ":" + qualifier + "//" + country;
		Field94C f = new Field94C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCountry(), country);
	}

}
