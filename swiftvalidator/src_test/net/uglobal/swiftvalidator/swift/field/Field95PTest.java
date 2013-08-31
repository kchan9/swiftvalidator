package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field95P;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(identifierCode)
 * 
 * Generated on Sun Sep 02 15:38:01 EDT 2012
 * 
 */
public class Field95PTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//4!a2!a2!c[3!c]
		setup(FieldComponentsFormat.FORMAT022.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "GENL";
		String identifierCode = "ID";

		String validateData = ":" + qualifier + "//" + identifierCode;
		Field95P f = new Field95P(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getIdentifierCode(), identifierCode);
	}

}
