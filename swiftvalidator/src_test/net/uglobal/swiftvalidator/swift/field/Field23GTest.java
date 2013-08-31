package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field23G;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (function)(subfunction)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field23GTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 4!c[/4!c]
		setup(FieldComponentsFormat.FORMAT005.getFormat());
	}

	@Test
	public void testParse1() {
		String function = "FUNC";
		String subfunction = "ABCD";

		String validateData = function + "/" + subfunction;
		Field23G f = new Field23G(validateData, xmlField);

		org.testng.Assert.assertEquals(f.getFunction(), function);
		org.testng.Assert.assertEquals(f.getSubfunction(), subfunction);
	}

	@Test
	public void testParse2() {
		String function = "FUNC";
		String subfunction = "";

		String validateData = function;
		Field23G f = new Field23G(validateData, xmlField);

		org.testng.Assert.assertEquals(f.getFunction(), function);
		org.testng.Assert.assertEquals(f.getSubfunction(), subfunction);
	}

	@Test
	public void testParse3() {
		String function = "FUNC";
		String subfunction = "";

		String validateData = function + "/";
		Field23G f = new Field23G(validateData, xmlField);

		org.testng.Assert.assertEquals(f.getFunction(), function);
		org.testng.Assert.assertEquals(f.getSubfunction(), subfunction);
	}
}
