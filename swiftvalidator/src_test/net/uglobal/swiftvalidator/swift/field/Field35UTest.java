package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (currency)(price)(period)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field35UTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d[1!a]
		setup(FieldComponentsFormat.FORMAT073.getFormat());
	}

	@Test
	public void testParse1() {
		String currency = "USD";
		String price = "123456";
		String period = "A";
		String validateData = currency + price + period;
		Field35U f = new Field35U(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getPrice(), price);
		org.testng.Assert.assertEquals(f.getPeriod(), period);
	}

}
