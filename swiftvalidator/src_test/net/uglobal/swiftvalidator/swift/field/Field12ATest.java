package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field12A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(instrumentCodeOrDescription)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field12ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/30x
		setup(FieldComponentsFormat.FORMAT002.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXXXXXXX";
		String instrumentCodeOrDescription = "YYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + instrumentCodeOrDescription;
		Field12A f = new Field12A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getInstrumentCodeOrDescription(), instrumentCodeOrDescription);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String instrumentCodeOrDescription = "YYY";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + instrumentCodeOrDescription;
		Field12A f = new Field12A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getInstrumentCodeOrDescription(), instrumentCodeOrDescription);
	}

	@Test
	public void testParse3() {
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String instrumentCodeOrDescription = "";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + instrumentCodeOrDescription;
		Field12A f = new Field12A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getInstrumentCodeOrDescription(), instrumentCodeOrDescription);
	}
}
