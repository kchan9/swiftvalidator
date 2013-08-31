package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(nameAndAddress)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Oct 05 00:08:15 EDT 2012
 * 
 */
public class Field95QTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4*35x
		setup(FieldComponentsFormat.FORMAT017.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "AAAA";
		String nameAndAddress = "name\r\naddress";
		String validateData = ":" + qualifier + "//" + nameAndAddress;
		Field95Q f = new Field95Q(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getNameAndAddress(), nameAndAddress);
	}

}
