package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (type)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field35NTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String type = "USD";
		String quantity = "88,99";
		String validateData = type + quantity;
		Field35N f = new Field35N(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getType(), type);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

	@Test
	public void testParse2() {
		String type = "USD";
		String quantity = BLANK;
		String validateData = type + quantity;
		Field35N f = new Field35N(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getType(), type);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

}
