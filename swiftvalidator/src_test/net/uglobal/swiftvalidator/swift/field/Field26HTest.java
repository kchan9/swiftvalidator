package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (collateralType)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:15:20 EDT 2012
 * 
 */
public class Field26HTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 16x
		setup(FieldComponentsFormat.FORMAT059.getFormat());
	}

	@Test
	public void testParse1() {
		String collateralType = "123456";
		String validateData = collateralType;
		Field26H f = new Field26H(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCollateralType(), collateralType);
	}

}
