package net.uglobal.swiftvalidator.swift.field;

// TODO: need codegen for this. this is different than the rest of the fields.
public class Field16R extends Field {

	//	private final Integer maxComponentsCount = 1;

	public Field16R(String validateData, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
		super(validateData, xmlField);
	}

	@Override
	protected void parse() {
		// component pattern
		// S
		addComponent(validateData);
	}

	public String getCode() {
		return getComponent1();
	}

	//	Example: 
	//	16R - constant
	//	<content>	
	//		<value>GENL</value>
	//	</content>

	//	Example: 
	//	98E - format string
	//	<content>
	//		<format>:4!c//8!n6!n[,3n][/[N]2!n[2!n]]</format>
	//	</content>

	// number of maximum components (including optional)
	// (e.g. including slashes, colon, etc.)
	//
	// number of meaningful (business) components 

}
