package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field94F;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(placeCode)(identifierCode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field94FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/4!a2!a2!c[3!c]
		setup(FieldComponentsFormat.FORMAT023.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String placeCode = "XXXX";
		String identifierCode = "ABC";

		String validateData = ":" + qualifier + "//" + placeCode + "/" + identifierCode;
		Field94F f = new Field94F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getPlaceCode(), placeCode);
		org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
	}

}
