package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field90B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(amountTypeCode)(currencyCode)(price)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field90BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/3!a15d
		setup(FieldComponentsFormat.FORMAT011.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String amountTypeCode = "CODE";
		String currencyCode = "EUR";
		String price = "2,00";

		String validateData = ":" + qualifier + "//" + amountTypeCode + "/" + currencyCode + price;
		Field90B f = new Field90B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAmountTypeCode(), amountTypeCode);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getPrice(), price);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String amountTypeCode = "CODE";
		String currencyCode = "EUR";
		String price = "";

		String validateData = ":" + qualifier + "//" + amountTypeCode + "/" + currencyCode + price;
		Field90B f = new Field90B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAmountTypeCode(), amountTypeCode);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getPrice(), price);
	}
}
