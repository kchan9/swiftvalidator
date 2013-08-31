package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field98C;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date)(time)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field98CTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n6!n
		setup(FieldComponentsFormat.FORMAT007.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String date = "09022012";
		String time = "030000";

		String validateData = ":" + qualifier + "//" + date + time;
		Field98C f = new Field98C(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
	}

}
