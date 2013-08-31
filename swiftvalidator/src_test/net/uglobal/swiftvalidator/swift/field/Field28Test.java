package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (pageNumber)(indicator)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field28Test extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 5n[/2n]
		setup(FieldComponentsFormat.FORMAT064.getFormat());
	}

	@Test
	public void testParse1() {
		String pageNumber = "12345";
		String indicator = "99";
		String validateData = pageNumber + SINGLE_SLASH + indicator;
		Field28 f = new Field28(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getPageNumber(), pageNumber);
		org.testng.Assert.assertEquals(f.getIndicator(), indicator);
	}

}
