package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (entryNumber)(pageNumber)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field28CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 5n[/5n]
		setup(FieldComponentsFormat.FORMAT106.getFormat());
	}

	@Test
	public void testParse1() {
		String entryNumber = "aaaaa";
		String pageNumber = "BBBBB";
		String validateData = entryNumber + SINGLE_SLASH + pageNumber;
		Field28C f = new Field28C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getEntryNumber(), entryNumber);
		org.testng.Assert.assertEquals(f.getPageNumber(), pageNumber);
	}

	@Test
	public void testParse2() {
		String entryNumber = "aaaaa";
		String pageNumber = BLANK;
		String validateData = entryNumber;
		Field28C f = new Field28C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getEntryNumber(), entryNumber);
		org.testng.Assert.assertEquals(f.getPageNumber(), pageNumber);
	}

}
