package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(numberId)(quantity)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 12:52:23 EDT 2012
 * 
 */
public class Field13KTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!c/15d
		setup(FieldComponentsFormat.FORMAT082.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String numberId = "YYY";
		String quantity = "123";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + numberId + SINGLE_SLASH + quantity;
		Field13K f = new Field13K(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNumberId(), numberId);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

	@Test
	public void testParse2() {
		String qualifier = "XXXX";
		String numberId = "YYY";
		String quantity = BLANK;
		String validateData = COLON + qualifier + DOUBLE_SLASHS + numberId + SINGLE_SLASH + quantity;
		Field13K f = new Field13K(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNumberId(), numberId);
		org.testng.Assert.assertEquals(f.getQuantity(), quantity);
	}

}
