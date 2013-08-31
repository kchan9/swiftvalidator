package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date)(periodDate)(periodDetails)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Fri Nov 02 08:32:27 EDT 2012
 * 
 */
public class Field31FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6!n[/6!n][//35x]
		setup(FieldComponentsFormat.FORMAT077.getFormat());
	}

	@Test
	public void testParse1() {
		String date = "123456";
		String periodDate = "999888";
		String periodDetails = "xxYYzz";
		String validateData = date + SINGLE_SLASH + periodDate + DOUBLE_SLASHS + periodDetails;
		Field31F f = new Field31F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getPeriodDate(), periodDate);
		org.testng.Assert.assertEquals(f.getPeriodDetails(), periodDetails);
	}

	@Test
	public void testParse2() {
		String date = "123456";
		String periodDate = "999888";
		String periodDetails = "";
		String validateData = date + SINGLE_SLASH + periodDate + DOUBLE_SLASHS + periodDetails;
		Field31F f = new Field31F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getPeriodDate(), periodDate);
		org.testng.Assert.assertEquals(f.getPeriodDetails(), periodDetails);
	}

	@Test
	public void testParse3() {
		String date = "123456";
		String periodDate = "";
		String periodDetails = "xxYYzz";
		String validateData = date + DOUBLE_SLASHS + periodDetails;
		Field31F f = new Field31F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getPeriodDate(), periodDate);
		org.testng.Assert.assertEquals(f.getPeriodDetails(), periodDetails);
	}

}
