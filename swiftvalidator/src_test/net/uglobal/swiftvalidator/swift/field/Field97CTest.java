package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(accountCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field97CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c
		setup(FieldComponentsFormat.FORMAT033.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String accountCode = "YYYY";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + accountCode;
		Field97C f = new Field97C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getAccountCode(), accountCode);
	}

}
