package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date)(currency)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field34ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6!n3!a15d
		setup(FieldComponentsFormat.FORMAT076.getFormat());
	}

	@Test
	public void testParse1() {
		String date = "123456";
		String currency = "USD";
		String amount = "9988";
		String validateData = date + currency + amount;
		Field34A f = new Field34A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
