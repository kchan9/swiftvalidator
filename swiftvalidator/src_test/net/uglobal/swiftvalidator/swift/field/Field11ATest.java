package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(currencyCode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field11ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!a
		setup(FieldComponentsFormat.FORMAT013.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String currencyCode = "BBB";

		String validateData = ":" + qualifier + "//" + currencyCode;
		Field11A f = new Field11A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
	}

}
