package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field34BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String currency = "XXX";
		String amount = "123456,789";
		String validateData = currency + amount;
		Field34B f = new Field34B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
