package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(priceCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field90ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c
		setup(FieldComponentsFormat.FORMAT033.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String priceCode = "YYYY";
		String validateData = ":XXXX//YYYY";
		Field90E f = new Field90E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getPriceCode(), priceCode);
	}

}
