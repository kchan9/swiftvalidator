package net.uglobal.swiftvalidator.characters;

public class XSwiftCharacterSet extends UppercaseAlphanumericCharacterSet {
	public XSwiftCharacterSet() {
		characterSet.addAll((new AllLowercaseLettersCharacterSet()).getCharacterSet());

		// special characters
		// / - ? : ( ) . , ’ + SPACE CrLf
		characterSet.add('/');
		characterSet.add('-');
		characterSet.add('?');
		characterSet.add(':');
		characterSet.add('(');
		characterSet.add(')');
		characterSet.add('.');
		characterSet.add(',');
		characterSet.add('\'');
		characterSet.add('+');
		characterSet.addAll((new SpaceCharacterSet()).getCharacterSet());
		characterSet.add('\r');
		characterSet.add('\n');
	}
}
