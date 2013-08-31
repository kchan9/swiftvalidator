package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (code)(timeIndication)(sign)(timeOffset)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 01:34:52 EST 2012
 * 
 */
public class Field13CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// /8c/4!n1!x4!n
		// / 8c / 4!n 1!x 4!n
		setup(FieldComponentsFormat.FORMAT085.getFormat());
	}

	@Test
	public void testParse1() {
		String code = "AAAAAAAA";
		String timeIndication = "bbbb";
		String sign = "C";
		String timeOffset = "dddd";
		String validateData = "/AAAAAAAA/bbbbCdddd";
		Field13C f = new Field13C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCode(), code);
		org.testng.Assert.assertEquals(f.getTimeIndication(), timeIndication);
		org.testng.Assert.assertEquals(f.getSign(), sign);
		org.testng.Assert.assertEquals(f.getTimeOffset(), timeOffset);
	}

	@Test
	public void testParse2() {
		// / 8c / 4!n 1!x 4!n
		String code = "";
		String timeIndication = "bbbb";
		String sign = "C";
		String timeOffset = "dddd";
		String validateData = "//bbbbCdddd";
		Field13C f = new Field13C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getCode(), code);
		org.testng.Assert.assertEquals(f.getTimeIndication(), timeIndication);
		org.testng.Assert.assertEquals(f.getSign(), sign);
		org.testng.Assert.assertEquals(f.getTimeOffset(), timeOffset);
	}

}
