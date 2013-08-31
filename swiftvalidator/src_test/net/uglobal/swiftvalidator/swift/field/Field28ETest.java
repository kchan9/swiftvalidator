package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (pageNumber)(continationIndicator)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field28ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 5n/4!c
		setup(FieldComponentsFormat.FORMAT058.getFormat());
	}

	@Test
	public void testParse1() {
		String pageNumber = "12345";
		String continationIndicator = "XXXX";
		String validateData = pageNumber + SINGLE_SLASH + continationIndicator;
		Field28E f = new Field28E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPageNumber(), pageNumber);
		org.testng.Assert.assertEquals(f.getContinationIndicator(), continationIndicator);
	}

}
