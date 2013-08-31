package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date)(place)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 08:44:52 EDT 2012
 * 
 */
public class Field31PTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6!n[29x]
		setup(FieldComponentsFormat.FORMAT080.getFormat());
	}

	@Test
	public void testParse1() {
		String date = "123456";
		String place = "HongKong";
		String validateData = date + place;
		Field31P f = new Field31P(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getPlace(), place);
	}

}
