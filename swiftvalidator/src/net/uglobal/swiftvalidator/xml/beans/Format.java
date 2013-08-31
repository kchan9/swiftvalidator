package net.uglobal.swiftvalidator.xml.beans;

public class Format implements XmlBean {
	private String text;

	public Format() {
	}

	public Format(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return "[text=" + getText() + "]";
	}
}
