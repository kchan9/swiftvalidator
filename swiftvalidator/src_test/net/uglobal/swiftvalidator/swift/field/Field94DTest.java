package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(countryCode)(place)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:41:01 EDT 2012
 * 
 */
public class Field94DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//[2!a]/35x
		setup(FieldComponentsFormat.FORMAT056.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String countryCode = "YY";
		String place = "this is first line" + NEW_LINE + "second line" + NEW_LINE + "then last line";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + countryCode + SINGLE_SLASH + place;
		Field94D f = new Field94D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCountryCode(), countryCode);
		org.testng.Assert.assertEquals(f.getPlace(), place);
	}

}
