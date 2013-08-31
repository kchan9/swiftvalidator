package net.uglobal.swiftvalidator.characters;

public class ZSwiftCharacterSet extends UppercaseAlphanumericCharacterSet {
	public ZSwiftCharacterSet() {
		characterSet.addAll((new AllLowercaseLettersCharacterSet()).getCharacterSet());

		// special characters
		// . , - ( ) / = ’ + : ? @ # Cr Lf SPACE {
		characterSet.add('.');
		characterSet.add(',');
		characterSet.add('-');
		characterSet.add('(');
		characterSet.add(')');
		characterSet.add('/');
		characterSet.add('=');
		characterSet.add('\'');
		characterSet.add('+');
		characterSet.add(':');
		characterSet.add('?');
		characterSet.add('@');
		characterSet.add('\r');
		characterSet.add('\n');
		characterSet.addAll((new SpaceCharacterSet()).getCharacterSet());
	}
}
