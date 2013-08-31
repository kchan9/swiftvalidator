package net.uglobal.swiftvalidator.characters;

public class UppercaseHexadecimalCharacterSet extends DigitsCharacterSet {
	private static final String constant = "ABCDEF";

	public UppercaseHexadecimalCharacterSet() {
		for (Character ch : constant.toCharArray()) {
			characterSet.add(ch);
		}
	}
}
