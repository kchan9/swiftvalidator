package net.uglobal.swiftvalidator.parser;

import net.uglobal.swiftvalidator.field.FieldPart;
import net.uglobal.swiftvalidator.swift.field.FieldComponentsFormat;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

// -- Test Cases
//
// test 5  = 4!c
// test 19 = [ISIN1!e12!c]
// test 24 = [ISIN1!e12!c]\n[4*35x]

//33-84
//

public class FieldPartParserTest {
	private static final Logger logger = Logger.getLogger(FieldPartParserTest.class);

	private static final String NEW_LINE = "\n";

	@Test
	public void testFORMAT001() {
		// -- 
		String formatStr = FieldComponentsFormat.FORMAT001.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//3!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT002() {
		// -- 
		//		String formatStr = ":4!c/[8c]/30x";
		String formatStr = FieldComponentsFormat.FORMAT002.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c/[8c]/30x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=30x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT003() {
		String formatStr = FieldComponentsFormat.FORMAT003.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//16x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=16x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT004() {
		// -- 
		String formatStr = FieldComponentsFormat.FORMAT004.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c/[8c]/4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT005() {
		// -- 
		String formatStr = FieldComponentsFormat.FORMAT005.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c[/4!c]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=/4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);

		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	public void testFORMAT006() {
		// -- 
		String formatStr = FieldComponentsFormat.FORMAT006.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//8!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT007() {
		// -- 
		String formatStr = FieldComponentsFormat.FORMAT007.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//8!n6!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=6!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT008() {
		// -- 
		//		String formatStr = ":4!c//8!n6!n[,3n][/[N]2!n[2!n]]";
		String formatStr = FieldComponentsFormat.FORMAT008.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//8!n6!n[,3n][/[N]2!n[2!n]]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=6!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=,3n]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=,]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=/[N]2!n[2!n]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);

		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT009() {
		// -- 
		String formatStr = FieldComponentsFormat.FORMAT009.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//3!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT010() {
		// -- 
		//		String formatStr = ":4!c//4!c/15d";
		String formatStr = FieldComponentsFormat.FORMAT010.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//4!c/15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT011() {
		// -- 
		//		String formatStr = ":4!c//4!c/3!a15d";
		String formatStr = FieldComponentsFormat.FORMAT011.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//4!c/3!a15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);

		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT012() {
		// -- 
		//		String formatStr = ":4!c//[N]3!n";
		String formatStr = FieldComponentsFormat.FORMAT012.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//[N]3!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!n]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT013() {
		// :4!c//3!a
		final String formatStr = FieldComponentsFormat.FORMAT013.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT014() {
		// :4!c//6!c
		final String formatStr = FieldComponentsFormat.FORMAT014.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT015() {
		// :4!c//1!a
		final String formatStr = FieldComponentsFormat.FORMAT015.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT016() {
		// -- 
		//		String formatStr = ":4!c//[N]3!a15d";
		String formatStr = FieldComponentsFormat.FORMAT016.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//[N]3!a15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT017() {
		// :4!c//4*35x
		final String formatStr = FieldComponentsFormat.FORMAT017.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT018() {
		// -- 
		//		String formatStr = ":4!c/[8c]/4!c/35x";
		String formatStr = FieldComponentsFormat.FORMAT018.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c/[8c]/4!c/35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT019() {
		// :4!c//34x
		final String formatStr = FieldComponentsFormat.FORMAT019.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT020() {
		// :4!c//35x
		final String formatStr = FieldComponentsFormat.FORMAT020.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT021() {
		// :4!c/8c/34x
		final String formatStr = FieldComponentsFormat.FORMAT021.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT022() {
		// -- 
		//		String formatStr = ":4!c//4!a2!a2!c[3!c]";
		String formatStr = FieldComponentsFormat.FORMAT022.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//4!a2!a2!c[3!c]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT023() {
		// -- 
		//		String formatStr = ":4!c//4!c/4!a2!a2!c[3!c]";
		String formatStr = FieldComponentsFormat.FORMAT023.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//4!c/4!a2!a2!c[3!c]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=3!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT024() {
		// :4!c//2!a
		final String formatStr = FieldComponentsFormat.FORMAT024.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT025() {
		// -- 
		//		String formatStr = ":4!c/[8c]/4!c[/30x]";
		String formatStr = FieldComponentsFormat.FORMAT025.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c/[8c]/4!c[/30x]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=/30x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=30x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT026() {
		// :4!c/[8c]/24x
		final String formatStr = FieldComponentsFormat.FORMAT026.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT027() {
		// :4!c//3!a/3!a/15d
		final String formatStr = FieldComponentsFormat.FORMAT027.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT028() {
		// -- 
		//		String formatStr = ":4!c//[N]15d";
		String formatStr = FieldComponentsFormat.FORMAT028.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//[N]15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=N]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=15d]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT029() {
		// -- 
		//		String formatStr = ":4!c//10*35x";
		String formatStr = FieldComponentsFormat.FORMAT029.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//10*35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=10*35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT030() {
		// -- 
		//		String formatStr = ":4!c//6*35x";
		String formatStr = FieldComponentsFormat.FORMAT030.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c//6*35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=//]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=6*35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT031() {
		// [ISIN1!e12!c1!r1!w][4*35x]
		final String formatStr = FieldComponentsFormat.FORMAT031.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual 
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT032() {
		// -- 
		//		String formatStr = ":4!c/[8c]/4!c/2!a/30x";
		String formatStr = FieldComponentsFormat.FORMAT032.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:4!c/[8c]/4!c/2!a/30x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=:]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=8c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=2!a]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=/]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=30x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	// ----------------------------------------------------------------------------
	// %%%%%BEGIN%%%%%

	@Test
	public void testFORMAT033() {
		// :4!c//4!c
		final String formatStr = FieldComponentsFormat.FORMAT033.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT034() {
		// :4!c//4!c/[N]15d
		final String formatStr = FieldComponentsFormat.FORMAT034.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT035() {
		// :4!c//4!c/4!c/[N]15d
		final String formatStr = FieldComponentsFormat.FORMAT035.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT036() {
		// :4!c/[8c]/4!c/[N]15d
		final String formatStr = FieldComponentsFormat.FORMAT036.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT037() {
		// :4!c//15d/15d
		final String formatStr = FieldComponentsFormat.FORMAT037.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT038() {
		// :4!c//8!n/8!n
		final String formatStr = FieldComponentsFormat.FORMAT038.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT039() {
		// :4!c//8!n6!n/8!n6!n
		final String formatStr = FieldComponentsFormat.FORMAT039.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT040() {
		// :4!c//8!n/4!c
		final String formatStr = FieldComponentsFormat.FORMAT040.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT041() {
		// :4!c//8!n6!n/4!c
		final String formatStr = FieldComponentsFormat.FORMAT041.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT042() {
		// :4!c//4!c/8!n
		final String formatStr = FieldComponentsFormat.FORMAT042.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT043() {
		// :4!c//4!c/8!n6!n
		final String formatStr = FieldComponentsFormat.FORMAT043.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT044() {
		// :4!c//3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT044.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT045() {
		// :4!c/[8c]/4!c/3!a15d[/4!c]
		final String formatStr = FieldComponentsFormat.FORMAT045.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT046() {
		// :4!c//3!a15d/15d
		final String formatStr = FieldComponentsFormat.FORMAT046.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT047() {
		// :4!c//2*35x
		final String formatStr = FieldComponentsFormat.FORMAT047.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT048() {
		// :4!c/[8c]/4!c6!n
		final String formatStr = FieldComponentsFormat.FORMAT048.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT049() {
		// :4!c//4!c/3!a15d/4!c/15d
		final String formatStr = FieldComponentsFormat.FORMAT049.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT050() {
		// :4!c//4!c/3!a15d/3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT050.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT051() {
		// :4!c//3!a15d/3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT051.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT052() {
		// :4!c//15d/3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT052.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT053() {
		// :4!c//15d
		final String formatStr = FieldComponentsFormat.FORMAT053.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT054() {
		// :4!c//10*35z
		final String formatStr = FieldComponentsFormat.FORMAT054.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT055() {
		// :4!c//25x
		final String formatStr = FieldComponentsFormat.FORMAT055.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT056() {
		// :4!c//[2!a]/35x
		final String formatStr = FieldComponentsFormat.FORMAT056.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT057() {
		// :4!c//3*35x
		final String formatStr = FieldComponentsFormat.FORMAT057.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT058() {
		// 5n/4!c
		final String formatStr = FieldComponentsFormat.FORMAT058.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT059() {
		// 16x
		final String formatStr = FieldComponentsFormat.FORMAT059.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT060() {
		// 6!n
		final String formatStr = FieldComponentsFormat.FORMAT060.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT061() {
		// 6*35x
		final String formatStr = FieldComponentsFormat.FORMAT061.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT062() {
		// [N]3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT062.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT063() {
		// 3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT063.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT064() {
		// 5n[/2n]
		final String formatStr = FieldComponentsFormat.FORMAT064.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT065() {
		// 35*50x
		final String formatStr = FieldComponentsFormat.FORMAT065.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT066() {
		// 17d
		final String formatStr = FieldComponentsFormat.FORMAT066.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT067() {
		// [/1!a][/34x1!r1!w]4!a2!a2!c[3!c]
		final String formatStr = FieldComponentsFormat.FORMAT067.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT068() {
		// /34x
		final String formatStr = FieldComponentsFormat.FORMAT068.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT069() {
		// [/1!a][/34x1!r1!w]4*35x
		final String formatStr = FieldComponentsFormat.FORMAT069.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT070() {
		// [/1!a][/34x1!r1!w][35x]
		final String formatStr = FieldComponentsFormat.FORMAT070.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT071() {
		// 3!c
		final String formatStr = FieldComponentsFormat.FORMAT071.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT072() {
		// 6*50x
		final String formatStr = FieldComponentsFormat.FORMAT072.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT073() {
		// 3!a15d[1!a]
		final String formatStr = FieldComponentsFormat.FORMAT073.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT074() {
		// 4*35x
		final String formatStr = FieldComponentsFormat.FORMAT074.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT075() {
		// 12d
		final String formatStr = FieldComponentsFormat.FORMAT075.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT076() {
		// 6!n3!a15d
		final String formatStr = FieldComponentsFormat.FORMAT076.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT077() {
		// 6!n[/6!n][//35x]
		final String formatStr = FieldComponentsFormat.FORMAT077.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT078() {
		// :4!c//5!c
		final String formatStr = FieldComponentsFormat.FORMAT078.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT079() {
		// 12d[//6!n1!a3n][/16x]
		final String formatStr = FieldComponentsFormat.FORMAT079.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT080() {
		// 6!n[29x]
		final String formatStr = FieldComponentsFormat.FORMAT080.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT081() {
		// [6!n[4!n]][7!a]
		final String formatStr = FieldComponentsFormat.FORMAT081.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT082() {
		// :4!c//3!c/15d
		final String formatStr = FieldComponentsFormat.FORMAT082.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT083() {
		// :4!c//8000z
		final String formatStr = FieldComponentsFormat.FORMAT083.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT084() {
		// 6!n[/6!n]
		final String formatStr = FieldComponentsFormat.FORMAT084.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT085() {
		// /8c/4!n1!x4!n
		final String formatStr = FieldComponentsFormat.FORMAT085.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT086() {
		// [/34x1!r1!w]4!a2!a2!c[3!c]
		final String formatStr = FieldComponentsFormat.FORMAT086.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT087() {
		// 35x1!r1!w4*35x
		final String formatStr = FieldComponentsFormat.FORMAT087.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT088() {
		// [/34x1!r1!w]4*35x
		final String formatStr = FieldComponentsFormat.FORMAT088.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT089() {
		// 5n/5n
		final String formatStr = FieldComponentsFormat.FORMAT089.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT090() {
		// /34x1!r1!w4!a2!a2!c[3!c]
		final String formatStr = FieldComponentsFormat.FORMAT090.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT091() {
		// 4!c[/30x]
		final String formatStr = FieldComponentsFormat.FORMAT091.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT092() {
		// 35x
		final String formatStr = FieldComponentsFormat.FORMAT092.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT093() {
		// 4!a2!a2!c[3!c]
		final String formatStr = FieldComponentsFormat.FORMAT093.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT094() {
		// 65x
		final String formatStr = FieldComponentsFormat.FORMAT094.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void testFORMAT095() {
		// 15d
		final String formatStr = FieldComponentsFormat.FORMAT095.getFormat();

		// -- expected
		StringBuilder expected = new StringBuilder();
		// TODO: 
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		logger.info("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	    @Test
    public void testFORMAT096() {
        // 4!c
        final String formatStr = FieldComponentsFormat.FORMAT096.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT097() {
        // 4!a2!c4!n4!a2!c
        final String formatStr = FieldComponentsFormat.FORMAT097.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT098() {
        // 1!a
        final String formatStr = FieldComponentsFormat.FORMAT098.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT099() {
        // 5*40x
        final String formatStr = FieldComponentsFormat.FORMAT099.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT100() {
        // 6a[/8!n][//4!n]
        final String formatStr = FieldComponentsFormat.FORMAT100.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT101() {
        // 8!n
        final String formatStr = FieldComponentsFormat.FORMAT101.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT102() {
        // 4!c[/35x]
        final String formatStr = FieldComponentsFormat.FORMAT102.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT103() {
        // 5n
        final String formatStr = FieldComponentsFormat.FORMAT103.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }


    @Test
    public void testFORMAT104() {
        // 8!n4!n
        final String formatStr = FieldComponentsFormat.FORMAT104.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT105() {
        // 4!c/3!a15d
        final String formatStr = FieldComponentsFormat.FORMAT105.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }

    @Test
    public void testFORMAT106() {
        // 5n[/5n]
        final String formatStr = FieldComponentsFormat.FORMAT106.getFormat();

        // -- expected
        StringBuilder expected = new StringBuilder();
        // TODO: 
        String expectedStr = expected.toString();

        // -- actual
        FieldPartParser parser = new FieldPartParser(formatStr);
        parser.parse();
        FieldPart completeFieldPart = parser.getCompleteFieldPart();
        String actualStr = completeFieldPart.toString();
        logger.info("actual:\n" + actualStr);

        Assert.assertEquals(expectedStr, actualStr);
    }







// %%%%%END%%%%%
	// ----------------------------------------------------------------------------

	@Test
	public void test5() {
		// -- 
		String formatStr = "4!c";

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	@Test
	public void test19() {
		// -- 
		String formatStr = "[ISIN1!e12!c]";

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=[ISIN1!e12!c]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=ISIN]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=1!e]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=12!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	// TODO: Fix this using the new syntax for newline (@see MT541 35B tag)
	@Test(enabled = false)
	public void test24() {
		// -- 
		String formatStr = "[ISIN1!e12!c]\n[4*35x]";

		// -- expected
		StringBuilder expected = new StringBuilder();
		expected.append("[fieldPartType=COMPOSITE_OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=[ISIN1!e12!c]").append(NEW_LINE);
		expected.append("[4*35x]]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=ISIN1!e12!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=ISIN]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=1!e]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append(", [fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=12!c]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append(", [fieldPartType=OPTIONAL]").append(NEW_LINE);
		expected.append("[fieldPartStr=4*35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[[fieldPartType=MANDATORY]").append(NEW_LINE);
		expected.append("[fieldPartStr=4*35x]").append(NEW_LINE);
		expected.append("[fieldPartList=[]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		expected.append("]]").append(NEW_LINE);
		String expectedStr = expected.toString();

		// -- actual
		FieldPartParser parser = new FieldPartParser(formatStr);
		parser.parse();
		FieldPart completeFieldPart = parser.getCompleteFieldPart();
		String actualStr = completeFieldPart.toString();
		System.out.println("actual:\n" + actualStr);

		Assert.assertEquals(expectedStr, actualStr);
	}

	// -- 
	// -- 

	//	@BeforeClass
	//	public void setUp() {
	//	}
	//
	//	@AfterClass
	//	public void tearDown() {
	//	}

}
