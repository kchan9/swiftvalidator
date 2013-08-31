package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(amountTypeCode)(currencyCode1)(amount1)(currencyCode2)(amount2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:43:36 EDT 2012
 * 
 */
public class Field90JTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/3!a15d/3!a15d
		setup(FieldComponentsFormat.FORMAT050.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String amountTypeCode = "YYYY";
		String currencyCode1 = "USD";
		String amount1 = "80,33";
		String currencyCode2 = "EUR";
		String amount2 = "90,88";
		String validateData = ":" + qualifier + "//" + amountTypeCode + "/" + currencyCode1 + amount1 + "/" + currencyCode2 + amount2;
		Field90J f = new Field90J(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAmountTypeCode(), amountTypeCode);
		org.testng.Assert.assertEquals(f.getCurrencyCode1(), currencyCode1);
		org.testng.Assert.assertEquals(f.getAmount1(), amount1);
		org.testng.Assert.assertEquals(f.getCurrencyCode2(), currencyCode2);
		org.testng.Assert.assertEquals(f.getAmount2(), amount2);
	}

}
