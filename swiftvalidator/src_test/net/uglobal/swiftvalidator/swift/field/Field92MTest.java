package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(currencyCode)(amount)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field92MTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!a15d/15d
		setup(FieldComponentsFormat.FORMAT046.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String currencyCode = "USD";
		String amount = "90,33";
		String quantity = "88";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + currencyCode + amount + SINGLE_SLASH + quantity;
		Field92M f = new Field92M(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

}
