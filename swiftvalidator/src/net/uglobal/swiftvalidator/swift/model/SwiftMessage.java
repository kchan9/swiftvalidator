package net.uglobal.swiftvalidator.swift.model;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.validator.ValidationError;

public class SwiftMessage {
	private SwiftBlock1 swiftBlock1;
	private SwiftBlock2 swiftBlock2;
	private SwiftBlock3 swiftBlock3;
	private SwiftBlock4 swiftBlock4;
	private SwiftBlock5 swiftBlock5;
	private final List<ValidationError> validationErrors = new ArrayList<ValidationError>();

	public List<ValidationError> getValidationErrors() {
		return this.validationErrors;
	}

	public void setValidationErrors(List<ValidationError> validationErrors) {
		this.validationErrors.addAll(validationErrors);
	}

	public SwiftBlock1 getSwiftBlock1() {
		return swiftBlock1;
	}

	public void addBlock(SwiftBlock swiftBlock) {
		if (swiftBlock instanceof SwiftBlock1) {
			setSwiftBlock1((SwiftBlock1) swiftBlock);
		} else if (swiftBlock instanceof SwiftBlock2) {
			setSwiftBlock2((SwiftBlock2) swiftBlock);
		} else if (swiftBlock instanceof SwiftBlock3) {
			setSwiftBlock3((SwiftBlock3) swiftBlock);
		} else if (swiftBlock instanceof SwiftBlock4) {
			setSwiftBlock4((SwiftBlock4) swiftBlock);
		} else if (swiftBlock instanceof SwiftBlock5) {
			setSwiftBlock5((SwiftBlock5) swiftBlock);
		}
	}

	private void setSwiftBlock1(SwiftBlock1 swiftBlock1) {
		this.swiftBlock1 = swiftBlock1;
	}

	public SwiftBlock2 getSwiftBlock2() {
		return swiftBlock2;
	}

	private void setSwiftBlock2(SwiftBlock2 swiftBlock2) {
		this.swiftBlock2 = swiftBlock2;
	}

	public SwiftBlock3 getSwiftBlock3() {
		return swiftBlock3;
	}

	private void setSwiftBlock3(SwiftBlock3 swiftBlock3) {
		this.swiftBlock3 = swiftBlock3;
	}

	public SwiftBlock4 getSwiftBlock4() {
		return swiftBlock4;
	}

	private void setSwiftBlock4(SwiftBlock4 swiftBlock4) {
		this.swiftBlock4 = swiftBlock4;
	}

	public SwiftBlock5 getSwiftBlock5() {
		return swiftBlock5;
	}

	private void setSwiftBlock5(SwiftBlock5 swiftBlock5) {
		this.swiftBlock5 = swiftBlock5;
	}

}
