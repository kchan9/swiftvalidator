package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field97A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(accountNumber)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field97ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//35x
		setup(FieldComponentsFormat.FORMAT020.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String accountANumber = "XXX";

		String validateData = ":" + qualifier + "//" + accountANumber;
		Field97A f = new Field97A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAccountNumber(), accountANumber);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String accountANumber = "";

		String validateData = ":" + qualifier + "//" + accountANumber;
		Field97A f = new Field97A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAccountNumber(), accountANumber);
	}
}
