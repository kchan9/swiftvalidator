package net.uglobal.swiftvalidator.parser;

import net.uglobal.swiftvalidator.swift.model.SwiftBlock;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock1;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock2Input;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock2Output;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock3;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock4;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock5;
import net.uglobal.swiftvalidator.swift.model.SwiftMessage;

public class SwiftMessageParser {

	private final String fin;
	private final SwiftMessage swiftMessage = new SwiftMessage();

	public SwiftMessageParser(String fin) {
		this.fin = fin;
	}

	public void parse() {
		String unparsedText = fin.trim();

		int blockStartIdx = 0;
		int blockEndIdx = 0;

		int blockCounter = 0;

		int counter = 0;

		for (Character currentChar : unparsedText.toCharArray()) {
			if (currentChar == '{' && blockCounter == 0) {
				blockStartIdx = counter;
				blockCounter++;
			} else if (currentChar == '{') {
				blockCounter++;
			} else if (currentChar == '}' && blockCounter == 1) {
				blockEndIdx = counter;

				String blockText = unparsedText.substring(blockStartIdx + 1, blockEndIdx);

				SwiftBlock swiftBlock = null;
				if (blockText.startsWith("1:")) {
					swiftBlock = new SwiftBlock1(blockText);
				} else if (blockText.startsWith("2:I")) {
					swiftBlock = new SwiftBlock2Input(blockText);
				} else if (blockText.startsWith("2:O")) {
					swiftBlock = new SwiftBlock2Output(blockText);
				} else if (blockText.startsWith("3:")) {
					swiftBlock = new SwiftBlock3(blockText);
				} else if (blockText.startsWith("4:")) {
					swiftBlock = new SwiftBlock4(blockText);
				} else if (blockText.startsWith("5:")) {
					swiftBlock = new SwiftBlock5(blockText);
				}
				swiftMessage.addBlock(swiftBlock);
				blockCounter--;
			} else if (currentChar == '}') {
				blockCounter--;
			}
			counter++;
		}
	}

	public SwiftMessage getSwiftMessage() {
		return this.swiftMessage;
	}
}
