package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field92A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(sign)(rate)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field92ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//[N]15d
		setup(FieldComponentsFormat.FORMAT028.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String sign = "N";
		String rate = "2,00";

		String validateData = ":" + qualifier + "//" + sign + rate;
		Field92A f = new Field92A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String sign = "";
		String rate = "2,00";

		String validateData = ":" + qualifier + "//" + sign + rate;
		Field92A f = new Field92A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}

	@Test
	public void testParse3() {
		String qualifier = "GENL";
		String sign = "";
		String rate = "";

		String validateData = ":" + qualifier + "//" + sign + rate;
		Field92A f = new Field92A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), "");
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}

	@Test
	public void testParse4() {
		String qualifier = "GENL";
		String sign = "N";
		String rate = "2";

		String validateData = ":" + qualifier + "//" + sign + rate;
		Field92A f = new Field92A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getRate(), rate);
	}
}
