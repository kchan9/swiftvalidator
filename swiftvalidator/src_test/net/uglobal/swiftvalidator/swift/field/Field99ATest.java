package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field99A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(sign)(number)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field99ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//[N]3!n
		setup(FieldComponentsFormat.FORMAT012.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String sign = "N";
		String number = "100";

		String validateData = ":" + qualifier + "//" + sign + number;
		Field99A f = new Field99A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getNumber(), number);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String sign = "";
		String number = "100";

		String validateData = ":" + qualifier + "//" + sign + number;
		Field99A f = new Field99A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getSign(), sign.equals("N") ? "-" : "+");
		org.testng.Assert.assertEquals(f.getNumber(), number);
	}

}
