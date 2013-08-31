package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(quantityTypeCode)(balanceTypeCode)(sign)(balance)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field93CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/4!c/[N]15d
		setup(FieldComponentsFormat.FORMAT035.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String quantityTypeCode = "YYYY";
		String balanceTypeCode = "ZZZZ";
		String sign = "N";
		String balance = "80,88";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + quantityTypeCode + SINGLE_SLASH + balanceTypeCode + SINGLE_SLASH + sign + balance;
		Field93C f = new Field93C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getQuantityTypeCode(), quantityTypeCode);
		org.testng.Assert.assertEquals(f.getBalanceTypeCode(), balanceTypeCode);
		org.testng.Assert.assertEquals(f.getSign(), sign);
		org.testng.Assert.assertEquals(f.getBalance(), balance);
	}

}
