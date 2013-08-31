package net.uglobal.swiftvalidator.swift.model;

import net.uglobal.swiftvalidator.xml.beans.MTType;

/*
 * README: 
 * 
 * Application Header (Block 2)
 * 
 * The Application Header of a FIN message provides information about the message itself.
 * 
 * It differs according to whether the message is a GPA or a FIN message and whether the 
 * Application Header is part of an input or an output message. A message sent from the 
 * user's application to SWIFTNet will be an INPUT message, and a message received from 
 * SWIFTNet will be an OUTPUT message.
 */
public abstract class SwiftBlock2 extends SwiftBlock {

	protected MTType messageType;
	protected SwiftBlock2Type inputOutputType;

	protected SwiftBlock2() {
	}

	public SwiftBlock2(String unparsedText) {
		super(unparsedText);
	}

	public MTType getMessageType() {
		return this.messageType;
	}

	public SwiftBlock2Type getInputOutputType() {
		return this.inputOutputType;
	}

	protected void generalParseDetails() {
		parseInputOuputType();
		parseMessageType();
	}

	private void parseInputOuputType() {
		String inputOutputIdentifier = unparsedText.substring(0, 1);
		inputOutputType = SwiftBlock2Type.fromText(inputOutputIdentifier);
	}

	private void parseMessageType() {
		String mtTypeString = unparsedText.substring(1, 4);
		messageType = MTType.fromText(mtTypeString);
	}
}
