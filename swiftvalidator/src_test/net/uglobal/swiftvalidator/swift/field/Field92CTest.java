package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field92C;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(rateNumber)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field92CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/24x
		setup(FieldComponentsFormat.FORMAT026.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXXXXXXX";
		String rateNumber = "YYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + rateNumber;
		Field92C f = new Field92C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getRateNumber(), rateNumber);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String rateNumber = "YYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + rateNumber;
		Field92C f = new Field92C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getRateNumber(), rateNumber);
	}

	@Test
	public void testParse3() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXXXXXXX";
		String rateNumber = "";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + rateNumber;
		Field92C f = new Field92C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getRateNumber(), rateNumber);
	}

	@Test
	public void testParse4() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String rateNumber = "";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + rateNumber;
		Field92C f = new Field92C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getRateNumber(), rateNumber);
	}

}
