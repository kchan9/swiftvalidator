package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field97B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(accountTypeCode)(accountNumber)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field97BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c/35x
		setup(FieldComponentsFormat.FORMAT018.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXX";
		String accountTypeCode = "CODE";
		String accountName = "YYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + accountTypeCode + "/" + accountName;
		Field97B f = new Field97B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getAccountTypeCode(), accountTypeCode);
		org.testng.Assert.assertEquals(f.getAccountNumber(), accountName);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String accountTypeCode = "CODE";
		String accountName = "";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + accountTypeCode + "/" + accountName;

		Field97B f = new Field97B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getAccountTypeCode(), accountTypeCode);
		org.testng.Assert.assertEquals(f.getAccountNumber(), accountName);
	}

}
