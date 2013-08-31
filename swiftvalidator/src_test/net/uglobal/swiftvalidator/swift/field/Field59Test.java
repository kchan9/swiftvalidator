package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (account)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field59Test extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [/34x1!r1!w]4*35x
		setup(FieldComponentsFormat.FORMAT088.getFormat());
	}

	@Test
	public void testParse1() {
		String account = "line1";
		String nameAndAddress = "line2";
		String validateData = account + NEW_LINE + nameAndAddress;
		Field59 f = new Field59(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getAccount(), account);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
