package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(amountTypeCode)(currencyCode)(amount)(quantityTypeCode)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field90FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/3!a15d/4!c/15d
		setup(FieldComponentsFormat.FORMAT049.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String amountTypeCode = "YYYY";
		String currencyCode = "USD";
		String amount = "2,00";
		String quantityTypeCode = "ZZZZ";
		String quantity = "80,88";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + amountTypeCode + SINGLE_SLASH + currencyCode + amount + SINGLE_SLASH
				+ quantityTypeCode + SINGLE_SLASH + quantity;
		Field90F f = new Field90F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAmountTypeCode(), amountTypeCode);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
		org.testng.Assert.assertEquals(f.getQuantityTypeCode(), quantityTypeCode);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}
}
