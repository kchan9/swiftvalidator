package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (code)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field33STest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String code = "USD";
		String amount = "88,99";
		String validateData = code + amount;
		Field33S f = new Field33S(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCode(), code);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

	@Test
	public void testParse2() {
		String code = "USD";
		String amount = BLANK;
		String validateData = code + amount;
		Field33S f = new Field33S(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCode(), code);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
