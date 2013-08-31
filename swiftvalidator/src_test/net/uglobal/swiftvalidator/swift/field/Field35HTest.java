package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (sign)(currency)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field35HTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [N]3!a15d
		setup(FieldComponentsFormat.FORMAT062.getFormat());
	}

	@Test
	public void testParse1() {
		String sign = "N";
		String currency = "XXX";
		String quantity = "123456789";
		String validateData = sign + currency + quantity;
		Field35H f = new Field35H(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getSign(), sign);
		org.testng.Assert.assertEquals(f.getCurrency(), currency);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

}
