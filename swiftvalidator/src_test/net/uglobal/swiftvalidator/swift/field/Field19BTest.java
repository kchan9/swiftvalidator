package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(currencyCode)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:41:00 EDT 2012
 * 
 */
public class Field19BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!a15d
		setup(FieldComponentsFormat.FORMAT044.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String currencyCode = "YYY";
		String amount = "123";
		String validateData = ":XXXX//YYY123";
		Field19B f = new Field19B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
