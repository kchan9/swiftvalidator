package net.uglobal.swiftvalidator.characters;

// multiple inheritance (DigitsCharacterSet, UppercaseLettersCharacterSet)
public class UppercaseAlphanumericCharacterSet extends DigitsCharacterSet {
	public UppercaseAlphanumericCharacterSet() {
		characterSet.addAll(new AllUppercaseLettersCharacterSet().getCharacterSet());
	}
}
