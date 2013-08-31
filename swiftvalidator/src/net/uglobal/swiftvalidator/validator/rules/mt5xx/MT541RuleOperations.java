package net.uglobal.swiftvalidator.validator.rules.mt5xx;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.swift.field.Field;
import net.uglobal.swiftvalidator.swift.field.Field19A;
import net.uglobal.swiftvalidator.swift.field.Field92B;
import net.uglobal.swiftvalidator.swift.field.Field99B;
import net.uglobal.swiftvalidator.validator.ValidationErrorCode;
import net.uglobal.swiftvalidator.validator.rules.RuleOperations;
import net.uglobal.swiftvalidator.validator.rules.RuleValidationError;
import net.uglobal.swiftvalidator.xml.beans.MT541;

public final class MT541RuleOperations extends RuleOperations {

	public static void executeRule1(MT541 mt541) {

	}

	public static List<RuleValidationError> testRule_C1() {
		return null;
	}

	public static List<RuleValidationError> testRule_C2() {
		return null;
	}

	public static List<RuleValidationError> testRule_C3(List<Field> fields) {
		List<RuleValidationError> errors = null;

		Boolean foundToseIn99B = Boolean.FALSE;
		Boolean foundSettIn99B = Boolean.FALSE;
		if (fields != null && fields.size() > 0) {
			for (Field field : fields) {
				Field99B field99B = (Field99B) field;
				String qualifier = field99B.getQualifier();
				if (qualifier.equals("TOSE")) {
					foundToseIn99B = Boolean.TRUE;
				} else if (qualifier.equals("SETT")) {
					foundSettIn99B = Boolean.TRUE;
				}
			}
		}

		if (foundToseIn99B && !foundSettIn99B) {
			final String errorMessage = "In sequence A, if the total of linked settlement instructions (field :99B::TOSE) is present, then the current settlement instruction number (field :99B::SETT) must be present.";
			final ValidationErrorCode errorCode = ValidationErrorCode.T89;

			errors = new ArrayList<RuleValidationError>() {
				{
					final RuleValidationError error = new RuleValidationError();
					error.setErrorMessage(errorMessage);
					error.setErrorCode(errorCode);

					add(error);
				}
			};
		}
		return errors;
	}

	// TODO: add annotation for errorCode and error Message
	public static List<RuleValidationError> testRule_C4(List<Field> field92BList, List<Field> field19AList) {
		List<RuleValidationError> errors = null;

		Boolean foundExchIn92B = Boolean.FALSE;
		Boolean foundResuIn19A = Boolean.FALSE;

		if (field92BList != null && field92BList.size() > 0) {
			for (Field f92B : field92BList) {
				if (((Field92B) f92B).getQualifier().equals("EXCH")) {
					foundExchIn92B = Boolean.TRUE;
				}
			}
		}
		if (field19AList != null && field19AList.size() > 0) {
			for (Field f19A : field19AList) {
				if (((Field19A) f19A).getQualifier().equals("RESU")) {
					foundResuIn19A = Boolean.TRUE;
				}
			}
		}
		if (foundExchIn92B && !foundResuIn19A) {
			final String errorMessage = "In (sub)sequence E3, if an exchange rate (field :92B::EXCH) is present, the corresponding resulting amount (field :19A::RESU) must be present in the same subsequence.  If the exchange rate is not present then the resulting amount is not allowed.";
			final ValidationErrorCode errorCode = ValidationErrorCode.UNKNOWN;

			errors = new ArrayList<RuleValidationError>() {
				{
					final RuleValidationError error = new RuleValidationError();
					error.setErrorMessage(errorMessage);
					error.setErrorCode(errorCode);

					add(error);
				}
			};
		}
		return errors;
	}

	public static List<RuleValidationError> testRule_C5() {
		return null;
	}
}
