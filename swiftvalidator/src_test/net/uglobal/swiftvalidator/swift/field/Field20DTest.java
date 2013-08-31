package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(reference)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:41:00 EDT 2012
 * 
 */
public class Field20DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//25x
		setup(FieldComponentsFormat.FORMAT055.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String reference = "aaa";
		String validateData = ":XXXX//aaa";
		Field20D f = new Field20D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getReference(), reference);
	}

}
