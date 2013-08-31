package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field36B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(quantityTypeCode)(quantity)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field36BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/15d
		setup(FieldComponentsFormat.FORMAT010.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String quantityTypeCode = "XXXX";
		String quantity = ",2009";

		String validateData = ":" + qualifier + "//" + quantityTypeCode + "/" + quantity;
		Field36B f = new Field36B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getQuantityTypeCode(), quantityTypeCode);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String quantityTypeCode = "XXXX";
		String quantity = "";

		String validateData = ":" + qualifier + "//" + quantityTypeCode + "/" + quantity;
		Field36B f = new Field36B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getQuantityTypeCode(), quantityTypeCode);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}
}
