package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (account)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field53CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// /34x
		setup(FieldComponentsFormat.FORMAT068.getFormat());
	}

	@Test
	public void testParse1() {
		String account = "abc";
		String validateData = "/abc";
		Field53C f = new Field53C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getAccount(), account);
	}

}
