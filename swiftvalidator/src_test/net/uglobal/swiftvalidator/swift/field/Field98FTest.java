package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(dateCode)(time)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sat Oct 20 17:46:14 EDT 2012
 * 
 */
public class Field98FTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c6!n
		setup(FieldComponentsFormat.FORMAT048.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dataSourceScheme = "yyyyyy";
		String dateCode = "ZZZZ";
		String time = "123456";
		String validateData = COLON + qualifier + SINGLE_SLASH + dataSourceScheme + SINGLE_SLASH + dateCode + time;
		Field98F f = new Field98F(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getDateCode(), dateCode);
		org.testng.Assert.assertEquals(f.getTime(), time);
	}

}
