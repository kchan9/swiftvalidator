package net.uglobal.swiftvalidator.swift.field;

import static org.testng.Assert.assertEquals;

import net.uglobal.swiftvalidator.swift.field.Field13A;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Field13ATest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c//3!c
		setup(FieldComponentsFormat.FORMAT001.getFormat());
	}

	@Test
	public void testParse1() {
		// :4!c//3!c
		String qualifier = "LINK";
		String numberId = "123";
		String validateData = ":" + qualifier + "//" + numberId;
		Field13A f = new Field13A(validateData, xmlField);
		f.getQualifier();
		f.getNumberId();

		assertEquals(f.getQualifier(), qualifier);
		assertEquals(f.getNumberId(), numberId);
	}
}
