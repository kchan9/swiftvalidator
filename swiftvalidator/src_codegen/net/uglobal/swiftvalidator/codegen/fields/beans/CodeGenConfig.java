package net.uglobal.swiftvalidator.codegen.fields.beans;

public class CodeGenConfig {
	private String packageName;
	private String classNamePrefix;

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getClassNamePrefix() {
		return classNamePrefix;
	}

	public void setClassNamePrefix(String classNamePrefix) {
		this.classNamePrefix = classNamePrefix;
	}

	public String toString() {
		return "[packageName=" + packageName + ", classNamePrefix=" + classNamePrefix + "]";
	}
}
