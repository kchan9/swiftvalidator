package net.uglobal.swiftvalidator.swift.service;

import net.uglobal.swiftvalidator.parser.SwiftMessageParser;
import net.uglobal.swiftvalidator.swift.model.SwiftMessage;
import net.uglobal.swiftvalidator.validator.FieldOrderValidator;
import net.uglobal.swiftvalidator.validator.rules.NetworkValidatedRuleEngine;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;

public class SwiftMessageService {
	public SwiftMessageService() {
	}

	public MTMessage getMTMessageFromFIN(final String fin) {
		// 1) Swift message parsing
		SwiftMessageParser swiftMessageParser = new SwiftMessageParser(fin);
		swiftMessageParser.parse();
		SwiftMessage swiftMessage = swiftMessageParser.getSwiftMessage();

		// 2) Field order validation
		// 3) Building MTxxx message
		FieldOrderValidator validator = new FieldOrderValidator(swiftMessage, true);
		validator.validate();
		if (validator.getValidationErrors().size() > 0) {
			swiftMessage.setValidationErrors(validator.getValidationErrors());
		}
		MTMessage mtMessage = validator.getMTMessage();

		// 4) Validation against network validated rules 
		NetworkValidatedRuleEngine ruleEngine = new NetworkValidatedRuleEngine(mtMessage);
		ruleEngine.execute();

		return mtMessage;
	}

	public SwiftMessage getSwiftMessageFromFIN(final String fin) {
		SwiftMessageParser swiftMessageParser = new SwiftMessageParser(fin);
		swiftMessageParser.parse();
		SwiftMessage swiftMessage = swiftMessageParser.getSwiftMessage();
		FieldOrderValidator validator = new FieldOrderValidator(swiftMessage, false);
		validator.validate();
		if (validator.getValidationErrors().size() > 0) {
			swiftMessage.setValidationErrors(validator.getValidationErrors());
		}
		return swiftMessage;
	}
}
