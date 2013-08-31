package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.swift.field.Field13B;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Field13BTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/30x
		setup(FieldComponentsFormat.FORMAT002.getFormat());
	}

	@Test
	public void testParse1() {
		String validateData = ":LINK/xxx/yyyyy";
		Field13B f = new Field13B(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getDataSourceScheme(), "xxx");
		Assert.assertEquals(f.getNumberId(), "yyyyy");
	}

	@Test
	public void testParse2() {
		String validateData = ":LINK//yyyyy";
		Field13B f = new Field13B(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getDataSourceScheme(), "");
		Assert.assertEquals(f.getNumberId(), "yyyyy");
	}

	@Test
	public void testParse3() {
		String validateData = ":LINK//";
		Field13B f = new Field13B(validateData, xmlField);

		Assert.assertEquals(f.getQualifier(), "LINK");
		Assert.assertEquals(f.getDataSourceScheme(), "");
		Assert.assertEquals(f.getNumberId(), "");
	}
}
