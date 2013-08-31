package net.uglobal.swiftvalidator.validator.rules;

import net.uglobal.swiftvalidator.validator.rules.mt5xx.MT541Rules;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;

public class NetworkValidatedRuleEngine {
	private final MTMessage mtMessage;

	public NetworkValidatedRuleEngine(final MTMessage mtMessage) {
		this.mtMessage = mtMessage;

		//		execute();
	}

	public void execute() {
		// TODO: add all MT types
		switch (mtMessage.getMTType()) {

		case MT541:
			(new MT541Rules(this.mtMessage)).execute();
			break;
		default:
			break;
		}
	}
}
