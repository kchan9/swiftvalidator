package net.uglobal.swiftvalidator.characters;

public class AllUppercaseLettersCharacterSet extends CharacterSet {
	private static final String constant = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public AllUppercaseLettersCharacterSet() {
		for (Character ch : constant.toCharArray()) {
			characterSet.add(ch);
		}
	}
}
