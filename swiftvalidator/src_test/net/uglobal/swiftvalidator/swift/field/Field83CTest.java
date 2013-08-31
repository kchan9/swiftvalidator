package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (account)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Nov 02 08:32:27 EDT 2012
 * 
 */
public class Field83CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// /34x
		setup(FieldComponentsFormat.FORMAT068.getFormat());
	}

	@Test
	public void testParse1() {
		String account = "abc";
		String validateData = "/abc";
		Field83C f = new Field83C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getAccount(), account);
	}

}
