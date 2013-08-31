package net.uglobal.swiftvalidator.parser;

import net.uglobal.swiftvalidator.field.CompositeOptionalFieldPart;
import net.uglobal.swiftvalidator.field.FieldPart;
import net.uglobal.swiftvalidator.field.FieldPartType;
import net.uglobal.swiftvalidator.field.MandatoryFieldPart;
import net.uglobal.swiftvalidator.field.OptionalFieldPart;
import net.uglobal.swiftvalidator.field.util.FieldFormatUtil;

public class FieldPartParser {
	private FieldPart completeFieldPart;

	private String fieldPartStr;

	private int cursorPosition = 0;

	public FieldPartParser(String str) {
		this.fieldPartStr = str;
	}

	//	public void parse(String str) {
	//		if (fieldPartStr == null) {
	//			this.fieldPartStr = str;
	//		}
	//		parse();
	//	}

	public void parse() {
		FieldPart fp = newCompleteFieldPart();
		if (fp.getFieldPartType() == FieldPartType.OPTIONAL) {
			this.fieldPartStr = this.fieldPartStr.substring(1, fieldPartStr.length() - 1);
		}
		//			parse(fp.getFieldPartStr().substring(1, fp.getFieldPartStr().length() - 1));
		//		} else {

		parse(fp);
		//		}
	}

	public FieldPart getCompleteFieldPart() {
		return this.completeFieldPart;
	}

	private void parse(FieldPart fp) {
		this.completeFieldPart = fp;

		while (hasMoreParts()) {
			FieldPart fieldPart = nextPart();
			if (fieldPart != null) {
				this.completeFieldPart.add(fieldPart);
			}
		}
	}

	private boolean hasMoreParts() {
		return cursorPosition < fieldPartStr.length();
	}

	private FieldPart nextPart() {
		//		cursorPosition++;
		FieldPart fp = null;

		Character ch = fieldPartStr.charAt(cursorPosition);
		if (ch != null) {

			if (FieldFormatUtil.isOpenBracket(ch)) {
				fp = getnextOptionalFieldPart();

				FieldPartParser parser = new FieldPartParser(fp.getFieldPartStr());
				parser.parse(fp);
			}
			// Constant (e.g. ISIN :)
			else if (FieldFormatUtil.isConstant(ch)) {
				fp = getNextConstantFieldPart();
			}
			// Non-constant (e.g. 4!c)
			else if (FieldFormatUtil.isDigit(ch)) {
				fp = getNextNonConstantFieldPart();

			} else {
				cursorPosition++;
			}
		}

		return fp;
	}

	private FieldPart getnextOptionalFieldPart() {
		int tmpCursorPosition = cursorPosition;
		int counter = 0;
		boolean counterStarted = false;

		for (int i = cursorPosition; i <= fieldPartStr.length(); i++) {
			Character ch = null;
			if (fieldPartStr.length() != i) {
				ch = fieldPartStr.charAt(i);
			}

			if (FieldFormatUtil.isOpenBracket(ch)) {
				counter++;
				counterStarted = true;
			} else if (FieldFormatUtil.isCloseBracket(ch)) {
				counter--;
			}

			if (counterStarted && counter == 0) {
				cursorPosition++; // skip the close bracket
				return new OptionalFieldPart(fieldPartStr.substring(tmpCursorPosition + 1 /* skip the open bracket */, i));
			}
			cursorPosition++;
		}
		// TODO: throw exception. failed to parse
		return null;
	}

	private FieldPart getNextNonConstantFieldPart() {
		int tmpCursorPosition = cursorPosition;

		boolean isFirstDigitField = true;
		int firstlDigitFieldFoundPosition = 0;
		int nextDigitFieldFoundPosition = 0;
		int asteriskPosition = 0;
		boolean hasAsterisk = false;

		for (int i = cursorPosition; i <= fieldPartStr.length(); i++) {
			Character ch = null;
			if (fieldPartStr.length() != i) {
				ch = fieldPartStr.charAt(i);
			}

			if (FieldFormatUtil.isDigit(ch) && isFirstDigitField) {
				isFirstDigitField = false;
				firstlDigitFieldFoundPosition = i;
			} else if (FieldFormatUtil.isDigit(ch) && !isFirstDigitField && !FieldFormatUtil.isAsterisk(ch) && !FieldFormatUtil.isDash(ch)) {
				nextDigitFieldFoundPosition = i;
			} else if (ch != null && FieldFormatUtil.isAsterisk(ch)) {
				hasAsterisk = true;
				asteriskPosition = i;
			}

			if (ch == null || FieldFormatUtil.isConstant(ch) || FieldFormatUtil.isOpenBracket(ch)
					|| (!isFirstDigitField && (nextDigitFieldFoundPosition - firstlDigitFieldFoundPosition) > 2)
					&& (!hasAsterisk || (hasAsterisk && (i - asteriskPosition) > 3))) {
				return new MandatoryFieldPart(fieldPartStr.substring(tmpCursorPosition, i));
			}
			cursorPosition++;
		}

		// TODO: throw exception. failed to parse
		return null;
	}

	private FieldPart getNextConstantFieldPart() {
		int tmpCursorPosition = cursorPosition;
		for (int i = cursorPosition; i <= fieldPartStr.length(); i++) {
			Character ch = null;
			if (fieldPartStr.length() != i) {
				ch = fieldPartStr.charAt(i);
			}
			if (ch == null || !FieldFormatUtil.isConstant(ch)) {
				return new MandatoryFieldPart(fieldPartStr.substring(tmpCursorPosition, i));
			}
			cursorPosition++;
		}
		// TODO: throw exception. failed to parse
		return null;
	}

	private FieldPart newCompleteFieldPart() {
		// OptionalField
		if (isOptionalField(fieldPartStr)) {
			return new OptionalFieldPart(this.fieldPartStr);
		}
		// CompositeOptionalField
		else if (isCompositeOptionalField(fieldPartStr)) {
			return new CompositeOptionalFieldPart(this.fieldPartStr);
		}
		// MandatoryField
		else {
			return new MandatoryFieldPart(this.fieldPartStr);
		}
	}

	// Example: 
	// Optional Fields: 
	// [abc]
	// [abc[abc][abc]]
	// 
	// NOT Option Fields:
	// abc
	// [abc]a
	// c[abc]
	// [abc][def]
	private boolean isOptionalField(String str) {
		if (!FieldFormatUtil.isOpenBracket(str.charAt(0))) {
			return false;
		}

		if (!FieldFormatUtil.isCloseBracket(str.charAt(str.length() - 1))) {
			return false;
		}

		int counter = 0;
		boolean counterStarted = false;
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (FieldFormatUtil.isOpenBracket(c)) {
				counter++;
				counterStarted = true;
			} else if (FieldFormatUtil.isCloseBracket(c)) {
				counter--;
			}
			if (counterStarted && counter == 0 && i != str.length() - 1) {
				return false;
			}
		}

		if (counterStarted && counter == 0) {
			return true;
		}
		return false;
	}

	// NOTE: Make sure that isOptionalField is checked first before isCompositeOptionalField
	// Example: 
	// CompositeOptionalFields
	// [a]       NOTE: that is why we need to check isOptionalField first, if so, then do not perform this isCompositeOptionalField check
	// [a][b]
	// [a[b][c]][d]
	// [[a]b][c][d[e]]
	// 
	// NOT CompositeOptionalField
	// a[a]
	// [a]a
	// [a]a[a]
	// [a[a]]a[d]
	private boolean isCompositeOptionalField(String str) {
		if (!FieldFormatUtil.isOpenBracket(str.charAt(0))) {
			return false;
		}

		if (!FieldFormatUtil.isCloseBracket(str.charAt(str.length() - 1))) {
			return false;
		}

		int counter = 0;
		boolean counterStarted = false;
		int strLength = str.length();
		for (int i = 0; i < strLength; i++) {
			Character ch = str.charAt(i);
			if (FieldFormatUtil.isOpenBracket(ch)) {
				counter++;
				counterStarted = true;
			} else if (FieldFormatUtil.isCloseBracket(ch)) {
				counter--;
				Character nextChar = null;
				if ((i + 1) < strLength) {
					nextChar = str.charAt(i + 1);
				}
				Character nextNextChar = null;
				if (nextChar != null && (FieldFormatUtil.isNewLine(nextChar) || FieldFormatUtil.isCarriageReturn(nextChar))) {
					nextNextChar = str.charAt(i + 2);
				}
				if (nextChar != null && (FieldFormatUtil.isNewLine(nextChar) || FieldFormatUtil.isCarriageReturn(nextChar)) && nextNextChar != null
						&& !FieldFormatUtil.isOpenBracket(nextNextChar)) {
					return false;
				} else if (nextChar != null && !FieldFormatUtil.isOpenBracket(nextChar)
						&& !(FieldFormatUtil.isNewLine(nextChar) && FieldFormatUtil.isCarriageReturn(nextChar)) && counter == 0) {
					// not a composite optional field
					return false;
				}
			}
		}

		if (counterStarted && counter == 0) {
			return true;
		}
		return false;
	}

	//	public static void main(String argv[]) {
	//		String str = "[4!c][16x]";
	//		FieldPartParser parser = new FieldPartParser(str);
	//		parser.parse();
	//	}

}
