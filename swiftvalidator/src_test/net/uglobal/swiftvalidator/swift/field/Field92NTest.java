package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(quantity)(currencyCode)(amount)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field92NTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//15d/3!a15d
		setup(FieldComponentsFormat.FORMAT052.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String quantity = "80,33";
		String currencyCode = "USD";
		String amount = "88,83";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + quantity + SINGLE_SLASH + currencyCode + amount;
		Field92N f = new Field92N(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

}
