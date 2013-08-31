package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field94B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(placeCode)(narrative)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field94BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c[/30x]
		setup(FieldComponentsFormat.FORMAT025.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String dataSourceScheme = "XXXXXXXX";
		String placeCode = "YYYY";
		String narrative = "ZZ";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + placeCode + "/" + narrative;
		Field94B f = new Field94B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getPlaceCode(), placeCode);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}

	@Test
	public void testParse2() {
		// :4!c/[8c]/4!c[/30x]
		String qualifier = "GENL";
		String dataSourceScheme = "";
		String placeCode = "YYYY";
		String narrative = "";

		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + placeCode;
		Field94B f = new Field94B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getPlaceCode(), placeCode);
		org.testng.Assert.assertEquals(f.getNarrative(), narrative);
	}
}
