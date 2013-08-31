package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date)(time)(code)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 08:44:52 EDT 2012
 * 
 */
public class Field31XTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// [6!n[4!n]][7!a]
		setup(FieldComponentsFormat.FORMAT081.getFormat());
	}

	// date time code
	// 13 - date code
	// 7  - code

	@Test
	public void testParse1() {
		String date = BLANK;
		String time = BLANK;
		String code = BLANK;
		String validateData = date + time + code;
		Field31X f = new Field31X(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getCode(), code);
	}

	@Test
	public void testParse2() {
		// date
		String date = "123456";
		String time = BLANK;
		String code = BLANK;
		String validateData = date + time + code;
		Field31X f = new Field31X(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getCode(), code);
	}

	@Test
	public void testParse3() {
		// date time
		String date = "123456";
		String time = "8899";
		String code = BLANK;
		String validateData = date + time + code;
		Field31X f = new Field31X(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getCode(), code);
	}

	@Test
	public void testParse4() {
		// date time code
		String date = "123456";
		String time = "8899";
		String code = "abcxyz";
		String validateData = date + time + code;
		Field31X f = new Field31X(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getCode(), code);
	}

	@Test
	public void testParse5() {
		String date = "123456";
		String time = BLANK;
		String code = "xyzABC";
		String validateData = date + time + code;
		Field31X f = new Field31X(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getCode(), code);
	}

	@Test
	public void testParse6() {
		String date = BLANK;
		String time = BLANK;
		String code = "xyzABC";
		String validateData = date + time + code;
		Field31X f = new Field31X(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getCode(), code);
	}

}
