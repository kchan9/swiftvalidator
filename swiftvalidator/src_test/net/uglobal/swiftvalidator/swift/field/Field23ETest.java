package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (instructionCode)(additionalInformation)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Dec 02 09:14:00 EST 2012
 * 
 */
public class Field23ETest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// 4!c[/30x]
		setup(FieldComponentsFormat.FORMAT091.getFormat());
	}

	@Test
	public void testParse1() {
		// 4!c [/30x]
		String instructionCode = "AAAA";
		String additionalInformation = "bbbbbbbbbb";
		String validateData = "AAAA/bbbbbbbbbb";
		Field23E f = new Field23E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getInstructionCode(), instructionCode);
		org.testng.Assert.assertEquals(f.getAdditionalInformation(), additionalInformation);
	}

	@Test
	public void testParse2() {
		// 4!c [/30x]
		String instructionCode = "AAAA";
		String additionalInformation = "";
		String validateData = "AAAA";
		Field23E f = new Field23E(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getInstructionCode(), instructionCode);
		org.testng.Assert.assertEquals(f.getAdditionalInformation(), additionalInformation);
	}

}
