package net.uglobal.swiftvalidator.validator;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import net.uglobal.swiftvalidator.parser.SwiftMessageParser;
import net.uglobal.swiftvalidator.swift.model.SwiftMessage;
import net.uglobal.swiftvalidator.swift.model.Tag;
import net.uglobal.swiftvalidator.xml.XmlBeanParser;
import net.uglobal.swiftvalidator.xml.beans.Content;
import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.Format;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;
import net.uglobal.swiftvalidator.xml.beans.MTType;
import net.uglobal.swiftvalidator.xml.beans.Option;
import net.uglobal.swiftvalidator.xml.beans.Options;
import net.uglobal.swiftvalidator.xml.beans.Sequence;
import net.uglobal.swiftvalidator.xml.beans.Value;

import org.apache.log4j.Logger;

import com.rits.cloning.Cloner;

public class FieldOrderValidator {
	private static final Logger logger = Logger.getLogger(FieldOrderValidator.class);

	private SwiftMessage swiftMessage;

	private static final String BLANK = "";
	private static final String SWIFT_EOL = "\r\n";
	private final Boolean fieldPartValidationEnabled = true;

	private Boolean isValid;
	private Map<Integer, Field> fieldMap;
	private List<Field> fieldList;
	private CopyOnWriteArrayList<Field> fieldListCopy;
	private Map<Integer, Sequence> sequenceMap;
	private MTMessage mtMessage;

	private final List<ValidationError> validationErrors = new ArrayList<ValidationError>();

	private Map<Integer, Field> getFieldMap() {
		return this.fieldMap;
	}

	private List<Field> getFieldList() {
		return this.fieldList;
	}

	private List<Field> getFieldListCopy() {
		return this.fieldListCopy;
	}

	private Map<Integer, Sequence> getSequenceMap() {
		return this.sequenceMap;
	}

	// By default, set to false
	private Boolean enrichMTMessage = Boolean.FALSE;

	/**
	 * private constructor
	 * 
	 * Use FieldOrderValidator(MTType mtType) instead
	 */
	private FieldOrderValidator() {
	}

	//	public FieldOrderValidator(SwiftMessage swiftMessage) {
	//		this(swiftMessage, Boolean.FALSE);
	//	}

	public FieldOrderValidator(SwiftMessage swiftMessage, Boolean enrichMTMessage) {
		this.swiftMessage = swiftMessage;
		this.enrichMTMessage = enrichMTMessage;
		init(swiftMessage.getSwiftBlock2().getMessageType());
	}

	//	public FieldOrderValidator(SwiftMessage swiftMessage) {
	//		this.mtMessage = mtMessage;
	//		this.enrichMTMessage = Boolean.TRUE;
	//		init(swiftMessage.getSwiftBlock2().getMessageType());
	//	}

	//	public FieldOrderValidator(SwiftMessage swiftMessage, boolean enrichMTMessge) {
	//		this(swiftMessage, swiftMessage.getSwiftBlock2().getMessageType(), enrichMTMessge);
	//	}

	//	public FieldOrderValidator(SwiftMessage swiftMessage, MTType mtType) {
	//		this(swiftMessage, mtType, Boolean.FALSE);
	//	}

	public MTMessage getMTMessage() {
		return this.mtMessage;
	}

	/**
	 * This is used for validating block4 ONLY.
	 * A SwiftMessage is perfectly fine without any blocks except block4.
	 * In that case, it will only validate block4.
	 */
	//	public FieldOrderValidator(SwiftMessage swiftMessage, MTType mtType, boolean enrichMTMessage) {
	//		this.swiftMessage = swiftMessage;
	//		this.enrichMTMessage = enrichMTMessage;
	//		init(mtType);
	//	}

	private void init(final MTType mtType) {
		// TODO: cache this xmlBeanParser by mtType???
		XmlBeanParser xmlBeanParser = null;
		try {
			xmlBeanParser = new XmlBeanParser(mtType);
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage(), e);
		}

		xmlBeanParser.parse();
		this.fieldMap = xmlBeanParser.getFieldMap();
		this.fieldList = xmlBeanParser.getFieldList();
		this.sequenceMap = xmlBeanParser.getSequenceMap();

		if (enrichMTMessage) {
			this.mtMessage = xmlBeanParser.getMTMessageXmlBean();
			this.mtMessage.setEnrichedSequencesBySequenceId(sequenceMap);
			this.mtMessage.setSwiftMessage(this.swiftMessage);
		}

		// TODO: what do i use this for? 
		// deep copy fieldList
		fieldListCopy = new CopyOnWriteArrayList<Field>(fieldList);// (new Cloner()).deepClone(getFieldList());

	}

	//	private boolean isAllowedFollowByFieldsContainsTagName(List<Field> allowedFollowByFields, String tagName) {
	//		for (Field f : allowedFollowByFields) {
	//			if (f.getTag().equals(tagName)) {
	//				return true;
	//			}
	//		}
	//		return false;
	//	}

	private Field tryToFindFieldByTagName(List<Field> allowedFollowByFields, Tag tag) {
		List<Field> candidateFields = new ArrayList<Field>();
		for (Field field : allowedFollowByFields) {
			boolean candidateFound = false;
			// IMPORTANT: 
			// TODO: 
			// what if there are 2 possible fields that can match with tagName, e.g. 16R, 16S are common
			// in that case, we need to look at the content of the field
			if (field.getOptions() != null && field.getOptions().getOptionList().size() > 0) {
				List<String> fullOptionNames = field.getFullOptionNames();
				if (fullOptionNames.contains(tag.getName())) {
					//					newField = (new Cloner()).deepClone(field);
					candidateFound = true;
				}
			} else if (field.getTag().equals(tag.getName())) {
				candidateFound = true;
			}

			if (candidateFound) {
				candidateFields.add(field);
			}
		} // end for

		// if there are multiple candidates, test for each individual candidateField
		if (candidateFields.size() > 1) {
			for (Field f : candidateFields) {
				FieldPartValidator validator = new FieldPartValidator(f, tag.getValue());
				validator.validate();
				if (validator.isValid()) {
					return f;
				}
			}
			return null;
		}
		// 1 candidate found
		else if (candidateFields.size() == 1) {
			return candidateFields.get(0);
		}
		// No candidateField found
		else {
			return null;
		}

	}

	//	public void validate(SwiftMessage swiftMessage) {
	//		this.swiftMessage = swiftMessage;
	//		validate();
	//	}

	private void addEnrichedFieldToBlock4(net.uglobal.swiftvalidator.swift.field.Field field, Field xmlField) {
		//		field.setTag(tag);
		mtMessage.addEnrichedField(field, xmlField);
	}

	public void validate() {
		Boolean isValid = true;
		List<Tag> tags = swiftMessage.getSwiftBlock4().getTags();

		Field firstField = getFieldList().get(0);
		Tag firstTag = tags.get(0);

		// very first check, make sure the first field is valid, and set it as starting point
		if (!firstField.getTag().equals(firstTag.getName())) {
			// TODO: failed validation by not being able to find the starting field
			// 5
			String errMsg = "Failed to validate, tag=" + firstTag.getName();
			logger.error(errMsg);
			validationErrors.add(new ValidationError(errMsg));
			return;
		}
		logger.info("passed tagName=" + firstTag.getName());
		if (enrichMTMessage) {
			addEnrichedFieldToBlock4(firstField.buildField(firstTag.getValue(), firstTag.getName()), firstField);
		}
		if (isValid && fieldPartValidationEnabled) {
			isValid = processFieldPartValidation(firstTag, firstField);
			//			if (isValid) {
			// TODO: 
			// store this field in a persistent place.
			//				net.uglobal.swiftvalidator.swift.field.Field16R f16R = firstField.buildField16R(firstTag.getValue());
			//
			//				String code = f16R.getCode();
			//			}
		}

		//		Boolean skip = true;
		List<Field> allowedFollowByFields = firstField.getAllowedFollowByFields();
		for (int i = 1; i < tags.size(); i++) {
			Tag tag = tags.get(i);
			String tagName = tag.getName();
			Field possibleMatchedField = null;
			if (!(allowedFollowByFields != null && allowedFollowByFields.size() > 0 && (possibleMatchedField = tryToFindFieldByTagName(
					allowedFollowByFields, tag)) != null)) {
				isValid = false;
				// 1
				String errMsg = "Failed to validate, tagName=" + tagName + ", validateData=" + tag.getValue();
				logger.error(errMsg);
				validationErrors.add(new ValidationError(errMsg));
				break;
			}

			//			Field currentField = retrieveFieldFromFieldListCopyByTagName(tagName);
			Field currentField = possibleMatchedField;
			if (currentField == null) {
				isValid = false;
				// 2
				String errMsg = "Failed to validate, tagName=" + tagName + ", validateData=" + tag.getValue();
				logger.error(errMsg);
				validationErrors.add(new ValidationError(errMsg));
				break;
			}

			logger.info("passed tagName=" + tagName);

			// -- 
			// If passed fieldOrderValidation, try to validate FieldPart
			Boolean isFieldPartValid = false;
			if (isValid && fieldPartValidationEnabled) {
				// TODO:
				isFieldPartValid = processFieldPartValidation(tag, currentField);
				//				isValid = isFieldPartValid;
			}
			allowedFollowByFields = currentField.getAllowedFollowByFields();

			if (enrichMTMessage /*&& isValid && isFieldPartValid*/) {
				//				addEnrichedFieldToBlock4(currentField, tag.getName());
				addEnrichedFieldToBlock4(currentField.buildField(tag.getValue(), tag.getName()), currentField);
				// firstField.buildField(firstTag.getValue(), firstTag.getName())
			}
		} // end for

		if (!isValid) {
			this.isValid = false;
			// TODO: invalid swift message 
			logger.info("Detected invalid swift message");
		} else {
			this.isValid = true;
			// TODO:
			logger.info("Swift message validation pass.");
		}
	}

	private Boolean processFieldPartValidation(Tag tag, Field currentField) {

		String formatStr = null;

		String validateData = tag.getValue();
		Content content = currentField.getContent();
		Options options = currentField.getOptions();
		if (content != null) {
			Format format = content.getFormat();
			Value value = content.getValue();

			if (format != null) {
				formatStr = format.getText();
			} else if (value != null) {
				formatStr = value.getText();
			} else {
				// TODO: error
				//						formatStr = BLANK;
			}
		} else if (options != null) {
			String letterOption = tag.getLetterOption();
			for (Option option : options.getOptionList()) {
				if (letterOption.equals(option.getName())) {
					formatStr = option.getFormat().getText();
					break;
				}
			}
		}

		if (formatStr == null) {
			// TODO: 
			// 3
			String errMsg = "Failed to find formatStr.  tag=" + tag + ", field=" + currentField;
			logger.error(errMsg);
			validationErrors.add(new ValidationError(errMsg));
			this.isValid = false;
		}

		FieldPartValidator validator = new FieldPartValidator(new Format(formatStr), validateData);
		validator.validate();
		Boolean isFieldPartValid = validator.isValid();
		if (!isFieldPartValid) {
			// 4
			String errMsg = "Failed to validate, tagName=" + tag.getName() + ", validateData=" + tag.getValue() + ", formatStr=" + formatStr;
			logger.error(errMsg);
			validationErrors.add(new ValidationError(errMsg));
			//			this.isValid = false;
		} else {
			logger.info("Passed fieldPart validation.  tagName=" + tag.getName() + ", validateData=" + tag.getValue() + ", formatStr=" + formatStr);
		}
		return isFieldPartValid;
	}

	public Boolean isValid() {
		return this.isValid;
	}

	public List<ValidationError> getValidationErrors() {
		return this.validationErrors;
	}

	private Field retrieveFieldFromFieldListCopyByTagName(String tagName) {
		Field newField = null;
		boolean found = false;
		for (Field field : getFieldListCopy()) {
			if (field.getOptions() != null && field.getOptions().getOptionList().size() > 0) {
				List<String> fullOptionNames = field.getFullOptionNames();
				if (fullOptionNames.contains(tagName)) {
					newField = (new Cloner()).deepClone(field);
					found = true;
				}
			} else if (field.getTag().equals(tagName)) {
				newField = (new Cloner()).deepClone(field);
				found = true;
			}

			// remove field from list
			getFieldListCopy().remove(field);

			if (found) {
				return newField;
			}
		}
		return null;
	}

	public static void main(String argv[]) {
		StringBuilder fin = new StringBuilder();
		fin.append("{1:F01BONYUS30AVCM0000000001}{2:I541KEYBUS30AXXX}{3:{108:CUS1205051637133}}{4:").append(SWIFT_EOL);
		fin.append(":16R:GENL").append(SWIFT_EOL);
		fin.append(":20C::SEME//845666").append(SWIFT_EOL);
		fin.append(":23G:NEWM").append(SWIFT_EOL);
		fin.append(":16S:GENL").append(SWIFT_EOL);
		fin.append(":16R:TRADDET").append(SWIFT_EOL);
		fin.append(":94B::PLAC//PLAC").append(SWIFT_EOL);
		fin.append(":98A::TRAD//20120418").append(SWIFT_EOL);
		fin.append(":98A::SETT//20120514").append(SWIFT_EOL);
		fin.append(":90A::DEAL//PRCT/100,5").append(SWIFT_EOL);
		fin.append(":35B:ISIN 123456789012").append(SWIFT_EOL);
		fin.append("/US/3138E0AB5").append(SWIFT_EOL);
		fin.append("/US/3138E0AB5").append(SWIFT_EOL);
		fin.append("FN AJ7201:yyyyyyyyyyyyyyyyyyyyyyyyy").append(SWIFT_EOL);
		fin.append("FN AJ7201                        xx").append(SWIFT_EOL);
		fin.append(":16R:FIA").append(SWIFT_EOL);
		fin.append(":12A::CLAS/ISIT/FN").append(SWIFT_EOL);
		fin.append(":98A::ISSU//20120101").append(SWIFT_EOL);
		fin.append(":98A::MATU//20420101").append(SWIFT_EOL);
		fin.append(":92A::INTR//4,").append(SWIFT_EOL);
		fin.append(":16S:FIA").append(SWIFT_EOL);
		fin.append(":16S:TRADDET").append(SWIFT_EOL);
		fin.append(":16R:FIAC").append(SWIFT_EOL);
		fin.append(":36B::SETT//AMOR/99448,778").append(SWIFT_EOL);
		fin.append(":36B::SETT//FAMT/100000,").append(SWIFT_EOL);
		fin.append(":97A::SAFE//1046320").append(SWIFT_EOL);
		fin.append(":16S:FIAC").append(SWIFT_EOL);
		fin.append(":16R:SETDET").append(SWIFT_EOL);
		fin.append(":22F::ABCD//DCBA").append(SWIFT_EOL);
		fin.append(":16R:SETPRTY").append(SWIFT_EOL);
		fin.append(":95P::PSET//FRNYUS33").append(SWIFT_EOL);
		fin.append(":16S:SETPRTY").append(SWIFT_EOL);
		fin.append(":16R:SETPRTY").append(SWIFT_EOL);
		fin.append(":95R::SELL/DTCYID/00274").append(SWIFT_EOL);
		fin.append(":16S:SETPRTY").append(SWIFT_EOL);
		fin.append(":16R:SETPRTY").append(SWIFT_EOL);
		fin.append(":95R::DEAG/USFW/021000018").append(SWIFT_EOL);
		fin.append(":97A::SAFE//SALOMON").append(SWIFT_EOL);
		fin.append(":16S:SETPRTY").append(SWIFT_EOL);
		fin.append(":16R:AMT").append(SWIFT_EOL);
		fin.append(":17B::ACRU//Y").append(SWIFT_EOL);
		fin.append(":19A::SETT//USD100089,67").append(SWIFT_EOL);
		fin.append(":16S:AMT").append(SWIFT_EOL);
		fin.append(":16R:AMT").append(SWIFT_EOL);
		fin.append(":19A::DEAL//USD99946,02").append(SWIFT_EOL);
		fin.append(":16S:AMT").append(SWIFT_EOL);
		fin.append(":16R:AMT").append(SWIFT_EOL);
		fin.append(":19A::ACRU//USD143,65").append(SWIFT_EOL);
		fin.append(":16S:AMT").append(SWIFT_EOL);
		fin.append(":16S:SETDET").append(SWIFT_EOL);
		fin.append("-}");

		SwiftMessageParser swiftMessageParser = new SwiftMessageParser(fin.toString());
		swiftMessageParser.parse();
		net.uglobal.swiftvalidator.swift.model.SwiftMessage swiftMessage = swiftMessageParser.getSwiftMessage();

		// TODO: 
		// 1) very first check before parsing, make sure each line ended with \r\n, if not, it automatically fail validation.
		// 2) 2nd check, make sure all lines other than \r\n, should have length, meaning there MUST NOT have any blank line.

		//		MTMessage mt541 = new MT541();
		//		FieldOrderValidator validator = new FieldOrderValidator(swiftMessage);
		//		validator.validate();
		//		Boolean isValid = validator.isValid();

		FieldOrderValidator validator = new FieldOrderValidator(swiftMessage, Boolean.FALSE);

		//		FieldOrderValidator validator = new FieldOrderValidator();
		//		validator.validate(swiftMessage);
		//		Boolean isValid = validator.isValid();

		if (validator.getValidationErrors().size() > 0) {
			List<ValidationError> validationErrors = validator.getValidationErrors();
			System.err.println(validationErrors);
		} else {
			System.out.println("Validation pass.");
		}
	}
}
