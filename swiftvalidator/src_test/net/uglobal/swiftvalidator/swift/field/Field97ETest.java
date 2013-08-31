package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field97E;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(internationalBankAccountNumber)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field97ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//34x
		setup(FieldComponentsFormat.FORMAT019.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String internationalBankAccountNumber = "0123";

		String validateData = ":" + qualifier + "//" + internationalBankAccountNumber;
		Field97E f = new Field97E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getInternationalBankAccountNumber(), internationalBankAccountNumber);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String internationalBankAccountNumber = "";

		String validateData = ":" + qualifier + "//" + internationalBankAccountNumber;
		Field97E f = new Field97E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getInternationalBankAccountNumber(), internationalBankAccountNumber);
	}
}
