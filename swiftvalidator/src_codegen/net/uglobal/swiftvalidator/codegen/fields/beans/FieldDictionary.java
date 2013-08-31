package net.uglobal.swiftvalidator.codegen.fields.beans;

import java.util.List;

public class FieldDictionary {
	//	private CodeGenConfig codeGenConfig;
	private Integer maxfid;
	private List<Field> fields;
	private Version version;

	//	public CodeGenConfig getCodeGenConfig() {
	//		return codeGenConfig;
	//	}
	//
	//	public void setCodeGenConfig(CodeGenConfig codeGenConfig) {
	//		this.codeGenConfig = codeGenConfig;
	//	}

	public String toString() {
		return "[fields=" + fields.toString() + "]";
	}

	public Integer getMaxfid() {
		return maxfid;
	}

	public void setMaxfid(Integer maxfid) {
		this.maxfid = maxfid;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}
}
