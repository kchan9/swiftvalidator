package net.uglobal.swiftvalidator.characters;

public class YSwiftCharacterSet extends UppercaseAlphanumericCharacterSet {
	public YSwiftCharacterSet() {
		// special characters
		// SPACE . , - ( ) / = ’ + : ?
		characterSet.addAll((new SpaceCharacterSet()).getCharacterSet());
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

		// Special Characters (incompatible with international telex)
		// ! ” % & * ; < >
		characterSet.add('!');
		characterSet.add('"');
		characterSet.add('%');
		characterSet.add('&');
		characterSet.add('*');
		characterSet.add(';');
		characterSet.add('<');
		characterSet.add('>');
	}
}
