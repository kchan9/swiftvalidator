package net.uglobal.swiftvalidator.swift.model;

public class Tag {
	private String name;
	private String value;

	//	private String unparsedText;

	private Tag() {
	}

	public Tag(String unparsedText) {
		int idx = unparsedText.indexOf(":");

		this.name = unparsedText.substring(0, idx);
		this.value = unparsedText.substring(idx + 1, unparsedText.length());
	}

	public Tag(String name, String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return this.name;
	}

	public String getValue() {
		return this.value;
	}

	public String getLetterOption() {
		if (name != null) {
			for (Character ch : name.toCharArray()) {
				if (Character.isLetter(ch)) {
					return Character.toString(ch);
				}
			}
		}
		return null;
	}

	public String getUnparsedString() {
		return name + ":" + value;
	}

	public String toString() {
		return (new StringBuilder()).append("Tag[name=").append(name).append(", value=").append(value + "]").toString();
	}
}
