package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(firstCurrencyCode)(amount1)(secondCurrencyCode)(amount2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:42:09 EDT 2012
 * 
 */
public class Field92LTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!a15d/3!a15d
		setup(FieldComponentsFormat.FORMAT051.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String firstCurrencyCode = "USD";
		String amount1 = "80,88";
		String secondCurrencyCode = "EUR";
		String amount2 = "99,33";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + firstCurrencyCode + amount1 + SINGLE_SLASH + secondCurrencyCode + amount2;
		Field92L f = new Field92L(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getFirstCurrencyCode(), firstCurrencyCode);
		org.testng.Assert.assertEquals(f.getAmount1(), amount1);
		org.testng.Assert.assertEquals(f.getSecondCurrencyCode(), secondCurrencyCode);
		org.testng.Assert.assertEquals(f.getAmount2(), amount2);
	}

}
