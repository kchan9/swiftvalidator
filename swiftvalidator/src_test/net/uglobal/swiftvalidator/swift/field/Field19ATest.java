package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field19A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(sign)(currencyCode)(amount)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field19ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//[N]3!a15d
		setup(FieldComponentsFormat.FORMAT016.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String sign = "N";
		String currencyCode = "USD";
		String amount = "2,00";

		String validateData = ":" + qualifier + "//" + sign + currencyCode + amount;
		Field19A f = new Field19A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String sign = "";
		String currencyCode = "USD";
		String amount = "2,00";

		String validateData = ":" + qualifier + "//" + sign + currencyCode + amount;
		Field19A f = new Field19A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}

	@Test
	public void testParse3() {
		String qualifier = "GENL";
		String sign = "";
		String currencyCode = "USD";
		String amount = "";

		String validateData = ":" + qualifier + "//" + sign + currencyCode + amount;
		Field19A f = new Field19A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
	}
}
