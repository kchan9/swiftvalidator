package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field33BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		// 3!a15d
		String currency = "USD";
		String amount = "123456789";
		String validateData = "USD123456789";
		Field33B f = new Field33B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

	@Test
	public void testParse2() {
		// 3!a15d
		String currency = "USD";
		String amount = "";
		String validateData = "USD";
		Field33B f = new Field33B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
