package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(quantityTypeCode)(sign)(balance)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field93BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c/[N]15d
		setup(FieldComponentsFormat.FORMAT036.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dataSourceScheme = "yyyyyyyy";
		String quantityTypeCode = "ZZZZ";
		String sign = "N";
		String balance = "123456789";
		String validateData = COLON + qualifier + SINGLE_SLASH + dataSourceScheme + SINGLE_SLASH + quantityTypeCode + SINGLE_SLASH + sign + balance;
		Field93B f = new Field93B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getQuantityTypeCode(), quantityTypeCode);
		org.testng.Assert.assertEquals(f.getSign(), sign);
		org.testng.Assert.assertEquals(f.getBalance(), balance);
	}

}
