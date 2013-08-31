package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(quantity1)(quantity2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:43:36 EDT 2012
 * 
 */
public class Field92DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//15d/15d
		setup(FieldComponentsFormat.FORMAT037.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String quantity1 = "123456789";
		String quantity2 = "987654321";
		String validateData = ":" + qualifier + "//" + quantity1 + "/" + quantity2;
		Field92D f = new Field92D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getQuantity1(), quantity1);
		org.testng.Assert.assertEquals(f.getQuantity2(), quantity2);
	}

}
