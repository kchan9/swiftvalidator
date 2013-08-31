package net.uglobal.swiftvalidator.xml.beans;

/*
 *         <option name="A">
 *             <format>:4!c//8!n</format>
 *         </option>
 */
public class Option implements XmlBean {
	private String name;
	private Format format;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[name=").append(getName());
		sb.append(", format=").append(getFormat().getText()).append("]");
		return sb.toString();
	}
}
