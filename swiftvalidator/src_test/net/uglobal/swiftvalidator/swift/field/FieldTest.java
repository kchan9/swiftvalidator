package net.uglobal.swiftvalidator.swift.field;

import net.uglobal.swiftvalidator.xml.beans.Content;
import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.Format;

public abstract class FieldTest {
	protected Field xmlField;
	protected String formatString;

	protected static final String BLANK = "";
	protected static final String SINGLE_SLASH = "/";
	protected static final String DOUBLE_SLASHS = "//";
	protected static final String COLON = ":";
	protected static final String NEW_LINE = "\r\n";

	protected void setup(final String formatStr) {
		formatString = formatStr;

		xmlField = new Field();
		Content content = new Content();
		Format format = new Format();
		format.setText(formatString);
		content.setFormat(format);
		xmlField.setContent(content);
	}
}
