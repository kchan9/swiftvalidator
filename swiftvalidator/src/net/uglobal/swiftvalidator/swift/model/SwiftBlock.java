package net.uglobal.swiftvalidator.swift.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public abstract class SwiftBlock {
	//	protected final Logger logger = Logger.getLogger(getClass());
	protected final Logger logger = Logger.getLogger(getClass());
	protected String unparsedText;

	protected final List<String> preconditionErrors = new ArrayList<String>();

	protected SwiftBlock() {
		super();
	}

	protected SwiftBlock(String unparsedText) {
		this.unparsedText = unparsedText;
		parse();
	}

	private void parse() {
		// check applies to all block
		generalPreconditionCheck();

		// check applies to specific block (override by each SwiftBlock class).
		preconditionCheck();

		if (preconditionErrors.size() == 0) {

			prepareUnparsedText();
			generalParseDetails();
			parseDetails();
			validate();
		} else {
			// TODO: custom exception
			throw new RuntimeException("Failed precondition checks. " + preconditionErrors);
		}
	}

	private void prepareUnparsedText() {
		if (this instanceof SwiftBlock4) {
			//			unparsedText = unparsedText.substring(2, unparsedText.length() - 1);

			//			int idx = unparsedText.indexOf('\r');
			//			if (idx  != -1 && idx < ) {
			//				
			//			}

			char ch2 = unparsedText.charAt(2);
			char ch3 = unparsedText.charAt(3);

			if (ch3 == '\r' || ch3 == '\n') {
				unparsedText = unparsedText.substring(4, unparsedText.length() - 1);
			} else if (ch2 == '\r' || ch2 == '\n') {
				unparsedText = unparsedText.substring(3, unparsedText.length() - 1);
			}

		} else {
			removeBlockIdFromUnparsedText();
		}
	}

	private void generalPreconditionCheck() {
		// check text MUST NOT BE null
		if (unparsedText == null) {
			String errMsg = "Failed to parse, text cannot be null.";
			preconditionErrors.add(errMsg);
		}

		// check text is mapped to the correct Block ID
		String blockId = null;
		if (this instanceof SwiftBlock1) {
			blockId = "1";
		} else if (this instanceof SwiftBlock2) {
			blockId = "2";
		} else if (this instanceof SwiftBlock3) {
			blockId = "3";
		} else if (this instanceof SwiftBlock4) {
			blockId = "4";
		} else if (this instanceof SwiftBlock5) {
			blockId = "5";
		}
		if (!unparsedText.startsWith(blockId + ":")) {
			String errMsg = "Failed to parse, text must starts with '" + blockId + ":', but text=" + unparsedText;
			preconditionErrors.add(errMsg);
		}
	}

	protected List<Tag> parseTagsForBlock3And5() {
		int startIdx = 0;
		int endIdx = 0;
		int counter = 0;

		List<Tag> tags = new ArrayList<Tag>();
		// AtomicInteger checkCounter = new AtomicInteger(0);
		int checkCounter = 0;

		for (Character ch : unparsedText.toCharArray()) {
			// start of tag
			if (ch == '{') {
				startIdx = counter;
				// if (checkCounter.get() == 0) {
				if (checkCounter == 0) {
					// checkCounter.incrementAndGet();
					checkCounter++;
				} else {
					// TODO: error
				}
			}
			// end of tag
			else if (ch == '}') {
				endIdx = counter;
				// if (checkCounter.get() == 1) {
				if (checkCounter == 1) {

					tags.add(new Tag(unparsedText.substring(startIdx + 1, endIdx)));

					//					tags.add(unparsedText.substring(startIdx + 1, endIdx));
					// checkCounter.decrementAndGet();
					checkCounter--;
				} else {
					// TODO: error
				}
			}
			counter++;
		}
		return tags;
	}

	protected void preconditionCheck() {
		// Intentionally leave as blank
	}

	protected void parseDetails() {
		// Intentionally leave as blank
	}

	protected void validate() {
		// Intentionally leave as blank
	}

	protected void generalParseDetails() {
		// Intentionally leave as blank
	}

	// -- 
	private void removeBlockIdFromUnparsedText() {
		unparsedText = unparsedText.substring(2, unparsedText.length());
	}

	public String getUnparsedText() {
		return this.unparsedText;
	}

}
