package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(identifierCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Oct 05 00:08:15 EDT 2012
 * 
 */
public class Field94HTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!a2!a2!c[3!c]
		setup(FieldComponentsFormat.FORMAT022.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String identifierCode = "BBBBCCDDEEE";
		String validateData = ":" + qualifier + "//" + identifierCode;
		Field94H f = new Field94H(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
	}

}
