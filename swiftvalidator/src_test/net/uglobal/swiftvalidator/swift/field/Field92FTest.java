package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(currencyCode)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field92FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!a15d
		setup(FieldComponentsFormat.FORMAT044.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String currencyCode = "EUR";
		String amount = "123456789";
		String validateData = ":" + qualifier + "//" + currencyCode + amount;
		Field92F f = new Field92F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
