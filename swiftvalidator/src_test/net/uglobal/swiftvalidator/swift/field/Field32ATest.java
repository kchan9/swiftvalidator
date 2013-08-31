package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date)(currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field32ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6!n3!a15d
		setup(FieldComponentsFormat.FORMAT076.getFormat());
	}

	@Test
	public void testParse1() {
		String date = "123456";
		String currency = "USD";
		String amount = "88,99";
		String validateData = date + currency + amount;
		Field32A f = new Field32A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

	@Test
	public void testParse2() {
		String date = "123456";
		String currency = "USD";
		String amount = BLANK;
		String validateData = date + currency + amount;
		Field32A f = new Field32A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
