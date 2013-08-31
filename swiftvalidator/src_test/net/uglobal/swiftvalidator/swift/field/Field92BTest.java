package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field92B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(firstCurrencyCode)(secondCurrencyCOde)(rate)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field92BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!a/3!a/15d
		setup(FieldComponentsFormat.FORMAT027.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String firstCurrencyCode = "USD";
		String secondCurrencyCode = "EUR";
		String rate = "8,0";
		String validateData = ":" + qualifier + "//" + firstCurrencyCode + "/" + secondCurrencyCode + "/" + rate;
		Field92B f = new Field92B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getFirstCurrencyCode(), firstCurrencyCode);
		org.testng.Assert.assertEquals(f.getSecondCurrencyCode(), secondCurrencyCode);
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String firstCurrencyCode = "USD";
		String secondCurrencyCode = "EUR";
		String rate = "";
		String validateData = ":" + qualifier + "//" + firstCurrencyCode + "/" + secondCurrencyCode + "/" + rate;
		Field92B f = new Field92B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getFirstCurrencyCode(), firstCurrencyCode);
		org.testng.Assert.assertEquals(f.getSecondCurrencyCode(), secondCurrencyCode);
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}
}
