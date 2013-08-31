package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (type)(currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field39PTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 4!c/3!a15d
		setup(FieldComponentsFormat.FORMAT105.getFormat());
	}

	@Test
	public void testParse1() {
		String type = "aaaa";
		String currency = "USD";
		String amount = "1234567890";
		String validateData = type + SINGLE_SLASH + currency + amount;
		Field39P f = new Field39P(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getType(), type);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
