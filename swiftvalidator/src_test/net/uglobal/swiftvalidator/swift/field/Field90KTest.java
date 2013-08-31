package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(indexPoints)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field90KTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//15d
		setup(FieldComponentsFormat.FORMAT053.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String indexPoints = "123456789";
		String validateData = ":" + qualifier + "//" + indexPoints;
		Field90K f = new Field90K(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getIndexPoints(), indexPoints);
	}

}
