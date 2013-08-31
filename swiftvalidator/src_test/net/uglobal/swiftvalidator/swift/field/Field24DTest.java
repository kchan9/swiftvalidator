package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (method)(additionalInformation)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field24DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 4!c[/35x]
		setup(FieldComponentsFormat.FORMAT102.getFormat());
	}

	@Test
	public void testParse1() {
		String method = "aaaa";
		String additionalInformation = "CCC";

		String validateData = method + "/" + additionalInformation;
		Field24D f = new Field24D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getMethod(), method);
		org.testng.Assert.assertEquals(f.getAdditionalInformation(), additionalInformation);
	}

}
