package net.uglobal.swiftvalidator.codegen.fields.beans;

public class Version {
	private Integer major;
	private Integer minor;

	public Integer getMajor() {
		return major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	public Integer getMinor() {
		return minor;
	}

	public void setMinor(Integer minor) {
		this.minor = minor;
	}

	public String toString() {
		return "[major=" + major + ", minor=" + minor + "]";
	}
}
