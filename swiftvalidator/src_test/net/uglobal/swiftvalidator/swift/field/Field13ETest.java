package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (date)(time)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 09 10:24:34 EST 2012
 * 
 */
public class Field13ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 8!n4!n
		setup(FieldComponentsFormat.FORMAT104.getFormat());
	}

	@Test
	public void testParse1() {
		String date = "20120304";
		String time = "6688";
		String validateData = date + time;
		Field13E f = new Field13E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
	}

}
