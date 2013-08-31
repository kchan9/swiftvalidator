package net.uglobal.swiftvalidator.field.util;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.field.FieldFormatType;
import net.uglobal.swiftvalidator.field.FieldLengthType;
import net.uglobal.swiftvalidator.field.FieldPart;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public final class FieldFormatUtil {

	private static final Logger logger = Logger.getLogger(FieldFormatUtil.class);

	public static final Character CharZero = new Character('0');
	public static final Character CharOne = new Character('1');
	public static final Character CharTwo = new Character('2');
	public static final Character CharThree = new Character('3');
	public static final Character CharFour = new Character('4');
	public static final Character CharFive = new Character('5');
	public static final Character CharSix = new Character('6');
	public static final Character CharSeven = new Character('7');
	public static final Character CharEight = new Character('8');
	public static final Character CharNine = new Character('9');

	public static final Character CharUpperA = new Character('A');
	public static final Character CharUpperB = new Character('B');
	public static final Character CharUpperC = new Character('C');
	public static final Character CharUpperD = new Character('D');
	public static final Character CharUpperE = new Character('E');
	public static final Character CharUpperF = new Character('F');
	public static final Character CharUpperG = new Character('G');
	public static final Character CharUpperH = new Character('H');
	public static final Character CharUpperI = new Character('I');
	public static final Character CharUpperJ = new Character('J');
	public static final Character CharUpperK = new Character('K');
	public static final Character CharUpperL = new Character('L');
	public static final Character CharUpperM = new Character('M');
	public static final Character CharUpperN = new Character('N');
	public static final Character CharUpperO = new Character('O');
	public static final Character CharUpperP = new Character('P');
	public static final Character CharUpperQ = new Character('Q');
	public static final Character CharUpperR = new Character('R');
	public static final Character CharUpperS = new Character('S');
	public static final Character CharUpperT = new Character('T');
	public static final Character CharUpperU = new Character('U');
	public static final Character CharUpperV = new Character('V');
	public static final Character CharUpperW = new Character('W');
	public static final Character CharUpperX = new Character('X');
	public static final Character CharUpperY = new Character('Y');
	public static final Character CharUpperZ = new Character('Z');

	public static final Character CharLowerA = new Character('a');
	public static final Character CharLowerB = new Character('b');
	public static final Character CharLowerC = new Character('c');
	public static final Character CharLowerD = new Character('d');
	public static final Character CharLowerE = new Character('e');
	public static final Character CharLowerF = new Character('f');
	public static final Character CharLowerG = new Character('g');
	public static final Character CharLowerH = new Character('h');
	public static final Character CharLowerI = new Character('i');
	public static final Character CharLowerJ = new Character('j');
	public static final Character CharLowerK = new Character('k');
	public static final Character CharLowerL = new Character('l');
	public static final Character CharLowerM = new Character('m');
	public static final Character CharLowerN = new Character('n');
	public static final Character CharLowerO = new Character('o');
	public static final Character CharLowerP = new Character('p');
	public static final Character CharLowerQ = new Character('q');
	public static final Character CharLowerR = new Character('r');
	public static final Character CharLowerS = new Character('s');
	public static final Character CharLowerT = new Character('t');
	public static final Character CharLowerU = new Character('u');
	public static final Character CharLowerV = new Character('v');
	public static final Character CharLowerW = new Character('w');
	public static final Character CharLowerX = new Character('x');
	public static final Character CharLowerY = new Character('y');
	public static final Character CharLowerZ = new Character('z');

	public static final Character CharComma = new Character(',');
	public static final Character CharExclamationMark = new Character('!');
	public static final Character CharAsterisk = new Character('*');
	public static final Character CharDash = new Character('-');
	public static final Character CharColon = new Character(':');
	public static final Character CharSpace = new Character(' ');
	public static final Character CharOpenBracket = new Character('[');
	public static final Character CharCloseBracket = new Character(']');
	public static final Character CharSlash = new Character('/');

	// n
	public static final List<Character> DIGITS = new ArrayList<Character>() {
		{
			add(CharZero);
			add(CharOne);
			add(CharTwo);
			add(CharThree);
			add(CharFour);
			add(CharFive);
			add(CharSix);
			add(CharSeven);
			add(CharEight);
			add(CharNine);
		}
	};

	// d
	public static final List<Character> DIGITS_WITH_COMMA = new ArrayList<Character>() {
		{
			addAll(DIGITS);
			add(CharComma);
		}
	};

	// a
	public static final List<Character> UPPERCASE_LETTERS = new ArrayList<Character>() {
		{
			add(CharUpperA);
			add(CharUpperB);
			add(CharUpperC);
			add(CharUpperD);
			add(CharUpperE);
			add(CharUpperF);
			add(CharUpperG);
			add(CharUpperH);
			add(CharUpperI);
			add(CharUpperJ);
			add(CharUpperK);
			add(CharUpperL);
			add(CharUpperM);
			add(CharUpperN);
			add(CharUpperO);
			add(CharUpperP);
			add(CharUpperQ);
			add(CharUpperR);
			add(CharUpperS);
			add(CharUpperT);
			add(CharUpperU);
			add(CharUpperV);
			add(CharUpperW);
			add(CharUpperX);
			add(CharUpperY);
			add(CharUpperZ);
		}
	};

	// c
	public static final List<Character> UPPERCASE_ALPHANUMERIC = new ArrayList<Character>() {
		{
			addAll(UPPERCASE_LETTERS);
			addAll(DIGITS);
		}
	};

	// -- 
	public static boolean isDigit(Character c) {
		return DIGITS.contains(c);
	}

	public static boolean isUppercaseLetter(Character c) {
		return UPPERCASE_LETTERS.contains(c);
	}

	public static boolean isUppercaseAlphaNumeric(Character c) {
		return isUppercaseLetter(c) | isDigit(c);
	}

	public static boolean isSpace(Character c) {
		return c.compareTo(CharSpace) == 0;
	}

	public static boolean isExclamationMark(Character c) {
		return c.compareTo(CharExclamationMark) == 0;
	}

	public static boolean isDash(Character c) {
		return c.compareTo(CharDash) == 0;
	}

	public static boolean isAsterisk(Character c) {
		return c.compareTo(CharAsterisk) == 0;
	}

	public static boolean isOpenBracket(Character c) {
		return c.compareTo(CharOpenBracket) == 0;
	}

	public static boolean isCloseBracket(Character c) {
		return c.compareTo(CharCloseBracket) == 0;
	}

	public static boolean isLowercaseN(Character c) {
		return c.compareTo(CharLowerN) == 0;
	}

	public static boolean isLowercaseD(Character c) {
		return c.compareTo(CharLowerD) == 0;
	}

	public static boolean isLowercaseH(Character c) {
		return c.compareTo(CharLowerH) == 0;
	}

	public static boolean isLowercaseA(Character c) {
		return c.compareTo(CharLowerA) == 0;
	}

	public static boolean isLowercaseC(Character c) {
		return c.compareTo(CharLowerC) == 0;
	}

	public static boolean isLowercaseE(Character c) {
		return c.compareTo(CharLowerE) == 0;
	}

	public static boolean isLowercaseX(Character c) {
		return c.compareTo(CharLowerX) == 0;
	}

	public static boolean isLowercaseY(Character c) {
		return c.compareTo(CharLowerY) == 0;
	}

	public static boolean isLowercaseZ(Character c) {
		return c.compareTo(CharLowerZ) == 0;
	}

	public static boolean isUppercase(Character c) {
		return Character.isUpperCase(c);
	}

	public static boolean isLowercase(Character c) {
		return Character.isLowerCase(c);
	}

	//	public static boolean isConstant(Character c) {
	//		// NOT n d h a c e x y z ! - * [ ] 0 1 2 3 4 5 6 7 8 9 
	//		if (!isLowercaseN(c) && !isLowercaseD(c) && !isLowercaseH(c) && !isLowercaseA(c) && !isLowercaseC(c)
	//				&& !isLowercaseE(c) && !isLowercaseX(c) && !isLowercaseY(c) && !isLowercaseZ(c)
	//				&& !isExclamationMark(c) && !isDash(c) && !isAsterisk(c) && !isDigit(c) && !isOpenBracket(c)
	//				&& !isCloseBracket(c)) {
	//			return true;
	//		}
	//		return false;
	//	}

	public static boolean isColon(Character c) {
		if (c.compareTo(CharColon) == 0) {
			return true;
		}
		return false;
	}

	public static boolean isComma(Character c) {
		if (c.compareTo(CharComma) == 0) {
			return true;
		}
		return false;
	}

	public static boolean isSlash(Character c) {
		if (c.compareTo(CharSlash) == 0) {
			return true;
		}
		return false;
	}

	public static boolean isNewLine(Character c) {
		if (c.compareTo('\n') == 0) {
			return true;
		}
		return false;
	}

	public static boolean isCarriageReturn(Character c) {
		if (c.compareTo('\r') == 0) {
			return true;
		}
		return false;
	}

	public static boolean isConstant(Character c) {
		// all upper case : , /
		if (isUppercaseLetter(c) || isColon(c) || isComma(c) || isSlash(c)) {
			return true;
		}
		return false;
	}

	// -- 
	public static boolean isOptional(String field) {
		if (StringUtils.isNotBlank(field) && field.startsWith("[")) {
			return true;
		}
		return false;
	}

	/*
	  The length of a field is as follows: 
		nn 		= Maximum length 
		nn! 	= Fixed-length
		nn-nn 	= Minimum and maximum length
		nn * nn = Maximum number of lines times maximum line length
	*/
	public static FieldLengthType getLengthType(String field) {
		if (isFixedLength(field) || getFormatType(field) == FieldFormatType.Constant) {
			return FieldLengthType.FixedLength;
		} else if (isMinMaxLength(field)) {
			return FieldLengthType.MinMaxLength;
		} else if (isMultiLines(field)) {
			return FieldLengthType.MultiLinesLength;
		} else {
			return FieldLengthType.MaxLength;
		}
	}

	/*
	  The format of the data is as follows:
		n = Digits
		d = Digits with decimal comma
		h = Uppercase hexadecimal
		a = Uppercase letters
		c = Uppercase alphanumeric
		e = Space
		x = SWIFT character set
		y = Uppercase level AISO 9735 characters
		z = SWIFT extended character set
		w = NewLine character set
	*/
	public static FieldFormatType getFormatType(String field) {
		if (isDigits(field)) {
			return FieldFormatType.Digits;
		} else if (isDigitsWithDecimalComma(field)) {
			return FieldFormatType.DigitsWithDecimalComma;
		} else if (isUppercaseHexadecimal(field)) {
			return FieldFormatType.UppercaseHexadecimal;
		} else if (isUppercaseLetters(field)) {
			return FieldFormatType.UppercaseLetters;
		} else if (isUppercaseAlphanumeric(field)) {
			return FieldFormatType.UppercaseAlphanumeric;
		} else if (isSpace(field)) {
			return FieldFormatType.Space;
		} else if (isSwiftCharacterSetX(field)) {
			return FieldFormatType.SwiftCharacterSetX;
		} else if (isSwiftCharacterSetY(field)) {
			return FieldFormatType.SwiftCharacterSetY;
		} else if (isSwiftCharacterSetZ(field)) {
			return FieldFormatType.SwiftCharacterSetZ;
		} else if (isNewLine(field)) {
			return FieldFormatType.NewLine;
		} else if (isCarriageReturn(field)) {
			return FieldFormatType.CarriageReturn;
		} else {
			return FieldFormatType.Constant;
		}
	}

	//
	public static boolean isDigits(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'n')) {
			return true;
		}
		return false;
	}

	public static boolean isDigitsWithDecimalComma(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'd')) {
			return true;
		}
		return false;
	}

	public static boolean isUppercaseHexadecimal(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'h')) {
			return true;
		}
		return false;
	}

	public static boolean isUppercaseLetters(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'a')) {
			return true;
		}
		return false;
	}

	public static boolean isUppercaseAlphanumeric(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'c')) {
			return true;
		}
		return false;
	}

	public static boolean isNewLine(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'w')) {
			return true;
		}
		return false;
	}

	public static boolean isCarriageReturn(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'r')) {
			return true;
		}
		return false;
	}

	public static boolean isSpace(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'e')) {
			return true;
		}
		return false;
	}

	public static boolean isSwiftCharacterSetX(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'x')) {
			return true;
		}
		return false;
	}

	public static boolean isSwiftCharacterSetY(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'y')) {
			return true;
		}
		return false;
	}

	public static boolean isSwiftCharacterSetZ(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, 'z')) {
			return true;
		}
		return false;
	}

	//
	public static boolean isMultiLines(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, '*')) {
			return true;
		}
		return false;
	}

	public static boolean isMinMaxLength(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, '-')) {
			return true;
		}
		return false;
	}

	public static boolean isFixedLength(String field) {
		if (StringUtils.isNotBlank(field) && StringUtils.contains(field, '!')) {
			return true;
		}
		return false;
	}

	//	public enum LengthType {
	//		MaxLength, FixedLength, MinMaxLength, MultiLinesLength
	//	}
	//
	//	public enum FormatType {
	//		Digits, DigitsWithDecimalComma, UppercaseHexadecimal, UppercaseLetters, UppercaseAlphanumeric, Space, SwiftCharacterSetX, SwiftCharacterSetY, SwiftCharacterSetZ, Constant
	//	}

	//

	public static Integer getLengthValue(FieldPart fp /*String field*/) {

		// workaround: 
		// if fields has '*', it's a MultiLine field
		if (fp.getFieldLengthType().equals(FieldLengthType.MultiLinesLength)) {
			//			String field =  fp.getFieldPartStr();
			String field = fp.getFieldPartStr().replaceFirst(fp.getFieldFormatType().getCode(), "");
			String[] tokens = field.split("\\*");
			Integer rowNum = Integer.parseInt(tokens[0]);
			Integer colNum = Integer.parseInt(tokens[1]);
			return rowNum * colNum;
		} else {
			String field = fp.getFieldPartStr();
			StringBuilder sb = new StringBuilder();
			for (char ch : field.toCharArray()) {
				if (isDigit(ch)) {
					sb.append(ch);
				}
			}
			return sb.length() > 0 ? Integer.parseInt(sb.toString()) : null;
		}
	}

	public static MinMaxLengthValue getMinMaxLengthValues(String field) {
		if (field.indexOf("-") != -1) {
			String[] s = field.split("-");
			return new FieldFormatUtil().new MinMaxLengthValue(s[0].trim(), s[1].trim());
		} else {
			return null;
		}
	}

	public class MinMaxLengthValue {
		private final int min;
		private final int max;

		public MinMaxLengthValue(int min, int max) {
			this.min = min;
			this.max = max;
		}

		public MinMaxLengthValue(String min, String max) {
			this.min = Integer.parseInt(min);
			this.max = Integer.parseInt(max);
		}

		public int getMin() {
			return this.min;
		}

		public int getMax() {
			return this.max;
		}
	}
}
