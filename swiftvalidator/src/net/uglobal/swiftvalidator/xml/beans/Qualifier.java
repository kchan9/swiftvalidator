package net.uglobal.swiftvalidator.xml.beans;

import org.apache.commons.lang.StringUtils;

/*
 * <field id="1" tag="16R" status="M" repetitive="N">
 *     <qualifier>
 *         <value></value>
 *         <format></format>
 *     </qualifier>
 *     <genericFieldName></genericFieldName>
 *     <detailedFieldName>Start of Block</detailedFieldName>
 *     <content>
 *         <value>GENL</value>
 *         <format>{data}</format>
 *     </content>
 * </field> 
 */
public class Qualifier implements XmlBean {

	private Description description;
	private Value value;
	private Format format;

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		boolean addComma = false;
		if (getDescription() != null && StringUtils.isNotBlank(getDescription().getText())) {
			sb.append("description=").append(getDescription().getText());
			addComma = true;
		}
		if (addComma) {
			sb.append(", ");
		}
		if (getValue() != null && StringUtils.isNotBlank(getValue().getText())) {
			sb.append("value=").append(getValue().getText());
			addComma = true;
		}
		if (addComma) {
			sb.append(", ");
		}
		if (getFormat() != null && StringUtils.isNotBlank(getFormat().getText())) {
			sb.append("format=").append(getFormat().getText());
		}
		sb.append("]");
		return sb.toString();
	}
}
