package net.uglobal.swiftvalidator.validator.rules;

import net.uglobal.swiftvalidator.validator.ValidationError;
import net.uglobal.swiftvalidator.validator.ValidationErrorCode;

public class RuleValidationError extends ValidationError {

	private ValidationErrorCode errorCode;

	public RuleValidationError() {
	}

	public RuleValidationError(String errMsg) {
		super(errMsg);
	}

	public void setErrorCode(ValidationErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public ValidationErrorCode getErrorCode() {
		return this.errorCode;
	}

}
