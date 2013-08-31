package net.uglobal.swiftvalidator.codegen.fields.beans;

public class Component {
	private String name;

	//	private Integer order;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	public Integer getOrder() {
	//		return order;
	//	}
	//
	//	public void setOrder(Integer order) {
	//		this.order = order;
	//	}

	public String toString() {
		return "[name=" + name + "]";
	}

}
