package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(name)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 18:41:01 EDT 2012
 * 
 */
public class Field95UTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3*35x
		setup(FieldComponentsFormat.FORMAT057.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String name = "this is first line" + NEW_LINE + "then second line" + NEW_LINE + "finally last line";
		String validateData = COLON + qualifier + DOUBLE_SLASHS + name;
		Field95U f = new Field95U(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getName(), name);
	}

}
