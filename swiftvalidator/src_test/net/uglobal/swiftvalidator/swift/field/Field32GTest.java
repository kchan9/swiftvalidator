package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field32GTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String currency = "USD";
		String amount = "123456789";
		String validateData = currency + amount;
		Field32G f = new Field32G(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
