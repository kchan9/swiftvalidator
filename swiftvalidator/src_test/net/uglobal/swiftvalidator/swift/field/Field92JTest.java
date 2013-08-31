package net.uglobal.swiftvalidator.swift.field;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Field format : (qualifier)(dataSourceScheme)(rateTypeCode)(currencyCode)(amount)(rateStatus)
 * 
 * TODO: ADD TESTS
 * 
 * Generated on Sun Oct 28 08:43:22 EDT 2012
 * 
 */
public class Field92JTest extends FieldTest {

	@BeforeClass
	public void beforeClass() {
		// :4!c/[8c]/4!c/3!a15d[/4!c]
		setup(FieldComponentsFormat.FORMAT045.getFormat());
	}

	@Test
	public void testParse1() {
		String qualifier = "XXXX";
		String dataSourceScheme = "YYYYYY";
		String rateTypeCode = "ZZZZ";
		String currencyCode = "EUR";
		String amount = "80,89";
		String rateStatus = "TTTT";
		String validateData = COLON + qualifier + SINGLE_SLASH + dataSourceScheme + SINGLE_SLASH + rateTypeCode + SINGLE_SLASH + currencyCode
				+ amount + SINGLE_SLASH + rateStatus;
		Field92J f = new Field92J(validateData, xmlField);
		org.testng.Assert.assertEquals(f.getQualifier(), qualifier);
		org.testng.Assert.assertEquals(f.getDataSourceScheme(), dataSourceScheme);
		org.testng.Assert.assertEquals(f.getRateTypeCode(), rateTypeCode);
		org.testng.Assert.assertEquals(f.getCurrencyCode(), currencyCode);
		org.testng.Assert.assertEquals(f.getAmount(), amount);
		org.testng.Assert.assertEquals(f.getRateStatus(), rateStatus);
	}

}
