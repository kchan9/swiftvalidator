package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field17B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(flag)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field17BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//1!a
		setup(FieldComponentsFormat.FORMAT015.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String flag = "Y";

		String validateData = ":" + qualifier + "//" + flag;
		Field17B f = new Field17B(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getFlag(), flag);
	}

}
