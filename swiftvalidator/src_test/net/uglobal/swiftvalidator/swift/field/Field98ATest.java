package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field98ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n
		setup(FieldComponentsFormat.FORMAT006.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String date = "09022012";

		String validateData = ":" + qualifier + "//" + date;
		Field98A f = new Field98A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
	}

	@Test
	public void testParse2() {
		// :ISSU//2012010
		String qualifier = "ISSU";
		String date = "2012010";

		String validateData = ":" + qualifier + "//" + date;
		Field98A f = new Field98A(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
	}

}
