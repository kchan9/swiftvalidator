package net.uglobal.swiftvalidator.swift.field;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.xml.beans.Option;

public abstract class Field {
	protected static final String BLANK = "";

	protected net.uglobal.swiftvalidator.xml.beans.Field xmlField;

	protected String validateData;

	private final List<String> components = new ArrayList<String>();

	public Field(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
		this.validateData = validateData;
		this.xmlField = xmlField;
		parse();
	}

	protected String getContentValue() {
		return xmlField.getContent().getValue().getText();
	}

	protected String getContentFormat() {
		if (xmlField.getContent() == null) {
			String s = getClass().getName();
			String optionLetter = Character.toString(s.charAt(s.length() - 1));
			for (Option o : xmlField.getOptions().getOptionList()) {
				if (o.getName().equals(optionLetter)) {
					return o.getFormat().getText();
				}
			}
			return null;
		} else {
			return xmlField.getContent().getFormat().getText();
		}
	}

	// --

	protected String getComponent1() {
		return components.get(0);
	}

	protected String getComponent2() {
		return components.get(1);
	}

	protected String getComponent3() {
		return components.get(2);
	}

	protected String getComponent4() {
		return components.get(3);
	}

	protected String getComponent5() {
		return components.get(4);
	}

	protected String getComponent6() {
		return components.get(5);
	}

	protected String getValidateData() {
		return this.validateData;
	}

	protected void addComponent(String component) {
		components.add(component);
	}

	protected void addComponents(List<String> components) {
		this.components.addAll(components);
	}

	public List<String> getComponents() {
		return this.components;
	}

	// -- NOTE:
	// 
	// No need to provide fieldName.
	// fieldNameClass can be determined by getClass().getName()

	// No need to provide sequenceId, since sequenceId is an unique id only used internally in the system. 
	// It has no meaning to the users.

	// We need to provide sequenceShortName, because in a mt message, it might have a list of fields with the same name, (e.g. 98A), and 
	// 98A can be in different sequence, so in order to identify which sequence each field is associated to, sequenceShortName is visible to callers.
	public String getSequenceShortName() {
		return this.xmlField.getSequenceShortName();
	}

	public Integer getSequenceId() {
		return this.xmlField.getSequenceId();
	}

	// -- 
	protected abstract void parse();

}
