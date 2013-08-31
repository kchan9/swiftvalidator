package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (typeOfAgreement)(date)(version)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Dec 08 14:19:33 EST 2012
 * 
 */
public class Field77HTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 6a[/8!n][//4!n]
		setup(FieldComponentsFormat.FORMAT100.getFormat());
	}

	@Test
	public void testParse1() {
		String typeOfAgreement = "aaaaaa";
		String date = "20120308";
		String version = "9999";
		String validateData = typeOfAgreement + SINGLE_SLASH + date + DOUBLE_SLASHS + version;
		Field77H f = new Field77H(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getTypeOfAgreement(), typeOfAgreement);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getVersion(), version);
	}

}
