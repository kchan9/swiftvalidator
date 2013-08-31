package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field98E;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(date)(time)(decimals)(uTCIndicator)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field98ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
		setup(FieldComponentsFormat.FORMAT008.getFormat());
	}

	@Test
	public void testParse1() {
		// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
		String qualifier = "GENL";
		String date = "09022012";
		String time = "030000";
		String decimals = ",000";
		String utcIndicator = "10";

		String validateData = ":" + qualifier + "//" + date + time + decimals + "/" + utcIndicator;
		Field98E f = new Field98E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getDecimals(), decimals);
		org.testng.Assert.assertEquals(f.getUTCIndicator(), "+" + utcIndicator);
	}

	@Test
	public void testParse2() {
		// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
		String qualifier = "GENL";
		String date = "09022012";
		String time = "030000";
		String decimals = ",000";
		String utcIndicator = "2080";

		String validateData = ":" + qualifier + "//" + date + time + decimals + "/N" + utcIndicator;
		Field98E f = new Field98E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getDecimals(), decimals);
		org.testng.Assert.assertEquals(f.getUTCIndicator(), "-" + utcIndicator);
	}

	@Test
	public void testParse3() {
		// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
		String qualifier = "GENL";
		String date = "09022012";
		String time = "030000";
		String decimals = "";
		String utcIndicator = "2080";

		String validateData = ":" + qualifier + "//" + date + time + decimals + "/N" + utcIndicator;
		Field98E f = new Field98E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getDecimals(), decimals);
		org.testng.Assert.assertEquals(f.getUTCIndicator(), "-" + utcIndicator);
	}

	@Test
	public void testParse4() {
		// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
		String qualifier = "GENL";
		String date = "09022012";
		String time = "030000";
		String decimals = "";
		String utcIndicator = "2080";

		String validateData = ":" + qualifier + "//" + date + time + decimals + "/" + utcIndicator;
		Field98E f = new Field98E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDate(), date);
		org.testng.Assert.assertEquals(f.getTime(), time);
		org.testng.Assert.assertEquals(f.getDecimals(), decimals);
		org.testng.Assert.assertEquals(f.getUTCIndicator(), "+" + utcIndicator);
	}
}
