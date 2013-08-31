package net.uglobal.swiftvalidator.codegen.fields.beans;

import java.util.List;

public class Field {
	private String name;
	private Integer fid;
	private List<Component> components;
	private String formatString;

	public Integer getFid() {
		return fid;
	}

	public void setFid(Integer fid) {
		this.fid = fid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public String getFormatString() {
		return this.formatString;
	}

	public void setFormatString(String formatString) {
		this.formatString = formatString;

	}

	public String toString() {
		return "[name=" + this.name + ", fid=" + this.fid + ", components=" + this.components + ", formatString=" + this.formatString + "]";
	}

}
