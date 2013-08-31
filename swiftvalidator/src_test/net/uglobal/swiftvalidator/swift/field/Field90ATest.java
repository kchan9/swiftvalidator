package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field90A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(percentageTypeCode)(price)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field90ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!c/15d
		setup(FieldComponentsFormat.FORMAT010.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String percentageTypeCode = "CODE";
		String price = "2,00";

		String validateData = ":" + qualifier + "//" + percentageTypeCode + "/" + price;
		Field90A f = new Field90A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getPercentageTypeCode(), percentageTypeCode);
		org.testng.Assert.assertEquals(f.getPrice(), price);
	}

	@Test
	public void testParse2() {
		String qualifier = "GENL";
		String percentageTypeCode = "CODE";
		String price = "";

		String validateData = ":" + qualifier + "//" + percentageTypeCode + "/" + price;
		Field90A f = new Field90A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getPercentageTypeCode(), percentageTypeCode);
		org.testng.Assert.assertEquals(f.getPrice(), price);
	}

}
