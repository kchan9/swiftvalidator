package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (messageIndex)(total)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field28DTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 5n/5n
		setup(FieldComponentsFormat.FORMAT089.getFormat());
	}

	@Test
	public void testParse1() {
		// 5n/5n
		String messageIndex = "AAAAA";
		String total = "bbbbb";
		String validateData = "AAAAA/bbbbb";
		Field28D f = new Field28D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getMessageIndex(), messageIndex);
		org.testng.Assert.assertEquals(f.getTotal(), total);
	}

	@Test
	public void testParse2() {
		// 5n/5n
		String messageIndex = "";
		String total = "bbbbb";
		String validateData = "/bbbbb";
		Field28D f = new Field28D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getMessageIndex(), messageIndex);
		org.testng.Assert.assertEquals(f.getTotal(), total);
	}

	@Test
	public void testParse3() {
		// 5n/5n
		String messageIndex = "AAAAA";
		String total = "";
		String validateData = "AAAAA/";
		Field28D f = new Field28D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getMessageIndex(), messageIndex);
		org.testng.Assert.assertEquals(f.getTotal(), total);
	}

	@Test
	public void testParse4() {
		// 5n/5n
		String messageIndex = "";
		String total = "";
		String validateData = "/";
		Field28D f = new Field28D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getMessageIndex(), messageIndex);
		org.testng.Assert.assertEquals(f.getTotal(), total);
	}

	@Test
	public void testParse5() {
		// 5n/5n
		String messageIndex = "A";
		String total = "b";
		String validateData = "A/b";
		Field28D f = new Field28D(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getMessageIndex(), messageIndex);
		org.testng.Assert.assertEquals(f.getTotal(), total);
	}

}
