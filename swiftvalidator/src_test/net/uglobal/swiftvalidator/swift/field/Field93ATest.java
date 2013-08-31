package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(subBalanceType)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 00:57:14 EDT 2012
 * 
 */
public class Field93ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c
		setup(FieldComponentsFormat.FORMAT004.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dataSourceScheme = "abc";
		String subBalanceType = "YYYY";
		String validateData = COLON + qualifier + SINGLE_SLASH + dataSourceScheme + SINGLE_SLASH + subBalanceType;
		Field93A f = new Field93A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getSubBalanceType(), subBalanceType);
	}

}
