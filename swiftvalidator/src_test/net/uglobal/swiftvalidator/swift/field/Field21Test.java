package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (relatedReference)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Thu Nov 01 08:15:09 EDT 2012
 * 
 */
public class Field21Test extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 16x
		setup(FieldComponentsFormat.FORMAT059.getFormat());
	}

	@Test
	public void testParse1() {
		String relatedReference = "YYYYYYYY";
		String validateData = "YYYYYYYY";
		Field21 f = new Field21(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getRelatedReference(), relatedReference);
	}

}
