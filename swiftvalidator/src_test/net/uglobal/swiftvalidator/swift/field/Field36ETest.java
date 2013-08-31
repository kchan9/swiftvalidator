package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(quantityTypeCode)(sign)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field36ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/[N]15d
		setup(FieldComponentsFormat.FORMAT034.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String quantityTypeCode = "YYYY";
		String sign = "N";
		String quantity = "80,88";
		String validateData = ":XXXX//YYYY/N80,88";
		Field36E f = new Field36E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getQuantityTypeCode(), quantityTypeCode);
		org.testng.Assert.assertEquals(f.getSign(), sign);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

}
