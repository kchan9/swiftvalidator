package net.uglobal.swiftvalidator.xml.beans;

public enum Status implements XmlBean {
	MANDATORY("M"), OPTIONAL("O");

	private String text;

	private Status(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}
}
