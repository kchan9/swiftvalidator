package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(address)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field94GTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//2*35x
		setup(FieldComponentsFormat.FORMAT047.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String address = "this is first line" + NEW_LINE + "then second line";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + address;
		Field94G f = new Field94G(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAddress(), address);
	}

}
