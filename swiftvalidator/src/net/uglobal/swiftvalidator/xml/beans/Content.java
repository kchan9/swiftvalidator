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
public class Content implements XmlBean {
	private Value value;
	private Format format;

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
		if (getValue() != null && StringUtils.isNotBlank(getValue().getText())) {
			sb.append("value=" + getValue().getText());
		} else if (getFormat() != null && StringUtils.isNotBlank(getFormat().getText())) {
			sb.append("format=" + getFormat().getText());
		}
		sb.append("]");
		return sb.toString();
	}
}
