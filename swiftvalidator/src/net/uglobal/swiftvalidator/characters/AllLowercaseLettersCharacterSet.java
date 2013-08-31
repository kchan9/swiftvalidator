package net.uglobal.swiftvalidator.characters;

public class AllLowercaseLettersCharacterSet extends CharacterSet {
	private static final String constant = "abcdefghijklmnopqrstuvwxyz";

	public AllLowercaseLettersCharacterSet() {
		for (Character ch : constant.toCharArray()) {
			characterSet.add(ch);
		}
	}
}
