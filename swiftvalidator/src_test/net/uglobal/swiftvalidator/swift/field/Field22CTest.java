package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (bankCode1)(locationCode1)(referenceCode)(bankCode2)(locationCode2)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field22CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 4!a 2!c 4!n 4!a 2!c
		setup(FieldComponentsFormat.FORMAT097.getFormat());
	}

	@Test
	public void testParse1() {
		String bankCode1 = "aaaa";
		String locationCode1 = "BB";
		String referenceCode = "cccc";
		String bankCode2 = "dddd";
		String locationCode2 = "EE";

		String validateData = bankCode1 + locationCode1 + referenceCode + bankCode2 + locationCode2;
		Field22C f = new Field22C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getBankCode1(), bankCode1);
		org.testng.Assert.assertEquals(f.getLocationCode1(), locationCode1);
		org.testng.Assert.assertEquals(f.getReferenceCode(), referenceCode);
		org.testng.Assert.assertEquals(f.getBankCode2(), bankCode2);
		org.testng.Assert.assertEquals(f.getLocationCode2(), locationCode2);
	}

}
