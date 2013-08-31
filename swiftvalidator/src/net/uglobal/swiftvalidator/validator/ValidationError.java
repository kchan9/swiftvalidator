package net.uglobal.swiftvalidator.validator;

public class ValidationError {
	protected String errMsg;

	public ValidationError() {
	}

	public ValidationError(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrorMessage() {
		return errMsg;
	}

	public void setErrorMessage(String errorMessage) {
		this.errMsg = errorMessage;
	}

}
