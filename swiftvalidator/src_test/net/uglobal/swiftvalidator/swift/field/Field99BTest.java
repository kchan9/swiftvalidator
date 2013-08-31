package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field99B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(number)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field99BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!n
		setup(FieldComponentsFormat.FORMAT009.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String number = "100";

		String validateData = ":" + qualifier + "//" + number;
		Field99B f = new Field99B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNumber(), number);
	}

}
