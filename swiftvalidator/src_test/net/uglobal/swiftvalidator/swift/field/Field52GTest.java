package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (account)(identifierCode)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field52GTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// /34x1!r1!w4!a2!a2!c[3!c]
		setup(FieldComponentsFormat.FORMAT090.getFormat());
	}

	@Test
	public void testParse1() {
		String account = "line1";
		String identifierCode = "line2";
		String validateData = account + NEW_LINE + identifierCode;
		Field52G f = new Field52G(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getAccount(), account);
		org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
	}

}
