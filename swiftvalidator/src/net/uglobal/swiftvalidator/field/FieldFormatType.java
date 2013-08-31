package net.uglobal.swiftvalidator.field;

public enum FieldFormatType {
	Digits("n"), DigitsWithDecimalComma("d"), UppercaseHexadecimal("h"), UppercaseLetters("a"), UppercaseAlphanumeric("c"), Space("e"), SwiftCharacterSetX(
			"x"), SwiftCharacterSetY("y"), SwiftCharacterSetZ("z"), NewLine("w"), CarriageReturn("r"), Constant("");

	private String code;

	FieldFormatType(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}
}
