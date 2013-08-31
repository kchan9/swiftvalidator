package net.uglobal.swiftvalidator.swift.model;

import java.util.HashMap;
import java.util.Map;

public enum SwiftBlock2Type {
	INPUT("I"), OUTPUT("O");

	private String text;
	private static final Map<String, SwiftBlock2Type> mapping = new HashMap<String, SwiftBlock2Type>();
	static {
		for (SwiftBlock2Type type : SwiftBlock2Type.values()) {
			mapping.put(type.getText(), type);
		}
	}

	private SwiftBlock2Type(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static SwiftBlock2Type fromText(final String text) {
		return mapping.get(text);
	}

}
