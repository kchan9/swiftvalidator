package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field71HTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String currency = "USD";
		String amount = "12346578";
		String validateData = currency + amount;
		Field71H f = new Field71H(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
