package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(typeOfID)(countryCode)(alternateID)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Oct 05 00:36:52 EDT 2012
 * 
 */
public class Field95STest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c/2!a/30x
		setup(FieldComponentsFormat.FORMAT032.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String dataSourceScheme = "BBBB";
		String typeOfID = "CCCC";
		String countryCode = "DD";
		String alternateID = "E";
		String validateData = ":" + qualifier + "/" + dataSourceScheme + "/" + typeOfID + "/" + countryCode + "/" + alternateID;
		Field95S f = new Field95S(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getTypeOfID(), typeOfID);
		org.testng.Assert.assertEquals(f.getCountryCode(), countryCode);
		org.testng.Assert.assertEquals(f.getAlternateID(), alternateID);
	}

}
