package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field95R;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(proprietaryCode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field95RTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/8c/34x
		setup(FieldComponentsFormat.FORMAT021.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "DB";
		String proprietaryCode = "XX";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + proprietaryCode;
		Field95R f = new Field95R(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getProprietaryCode(), proprietaryCode);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String proprietaryCode = "XX";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + proprietaryCode;
		Field95R f = new Field95R(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getProprietaryCode(), proprietaryCode);
	}

	@Test
	public void testParse3() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String proprietaryCode = "";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + proprietaryCode;
		Field95R f = new Field95R(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getProprietaryCode(), proprietaryCode);
	}

	@Test
	public void testParse4() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String proprietaryCode = "XX";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + proprietaryCode;
		Field95R f = new Field95R(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getProprietaryCode(), proprietaryCode);
	}
}
