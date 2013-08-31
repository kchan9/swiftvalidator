package net.uglobal.swiftvalidator.swift.model;

import net.uglobal.swiftvalidator.swift.model.SwiftBlock2Output;

import org.testng.annotations.Test;

public class SwiftBlock2OutputTest {

	@Test
	public void testParseSwiftBlock2Output() {
		final String unparsedText = "2:O5020750040609LRLRXXXX4A0400004386330406090954U";

		SwiftBlock2Output block2Output = new SwiftBlock2Output(unparsedText);

		String inputOutputType = block2Output.getInputOutputType().getText();
		String messageType = block2Output.getMessageType().getText();
		String intputTime = block2Output.getInputTime();
		String mir = block2Output.getMIR();
		String outputDate = block2Output.getOutputDate();
		String outputTime = block2Output.getOutputTime();
		String messagePriority = block2Output.getMessagePriority();

		// TODO: 
		System.out.println(block2Output);
	}
}
