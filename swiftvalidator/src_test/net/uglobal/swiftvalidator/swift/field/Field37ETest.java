package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (rate)(endDate)(period)(number)(information)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Nov 03 00:49:46 EDT 2012
 * 
 */
public class Field37ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 12d[//6!n1!a3n][/16x]
		setup(FieldComponentsFormat.FORMAT079.getFormat());
	}

	@Test
	public void testParse1() {
		//    	String validateData = "123456//889900A01/YYY";
		String rate = "123456";
		String endDate = "889900";
		String period = "A";
		String number = "01";
		String information = "YYY";
		String validateData = rate + DOUBLE_SLASHS + endDate + period + number + SINGLE_SLASH + information;
		Field37A f = new Field37A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getRate(), rate);
		org.testng.Assert.assertEquals(f.getEndDate(), endDate);
		org.testng.Assert.assertEquals(f.getPeriod(), period);
		org.testng.Assert.assertEquals(f.getNumber(), number);
		org.testng.Assert.assertEquals(f.getInformation(), information);
	}

	@Test
	public void testParse2() {
		//		String validateData = "12345/ZZYYXX";
		String rate = "12345";
		String endDate = "";
		String period = "";
		String number = "";
		String information = "ZZYYXX";
		String validateData = rate + SINGLE_SLASH + information;
		Field37A f = new Field37A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getRate(), rate);
		org.testng.Assert.assertEquals(f.getEndDate(), endDate);
		org.testng.Assert.assertEquals(f.getPeriod(), period);
		org.testng.Assert.assertEquals(f.getNumber(), number);
		org.testng.Assert.assertEquals(f.getInformation(), information);
	}

	@Test
	public void testParse3() {
		//    	String validateData = "123456789";
		String rate = "123456789";
		String endDate = "";
		String period = "";
		String number = "";
		String information = "";
		String validateData = rate;
		Field37A f = new Field37A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getRate(), rate);
		org.testng.Assert.assertEquals(f.getEndDate(), endDate);
		org.testng.Assert.assertEquals(f.getPeriod(), period);
		org.testng.Assert.assertEquals(f.getNumber(), number);
		org.testng.Assert.assertEquals(f.getInformation(), information);
	}

}
