package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (type)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 13:45:22 EDT 2012
 * 
 */
public class Field35ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 3!a15d
		setup(FieldComponentsFormat.FORMAT063.getFormat());
	}

	@Test
	public void testParse1() {
		String type = "USD";
		String quantity = "123456";
		String validateData = type + quantity;
		Field35A f = new Field35A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getType(), type);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

}
