package net.uglobal.swiftvalidator.swift.model;

import static org.testng.Assert.assertEquals;

import net.uglobal.swiftvalidator.swift.model.SwiftBlock2Input;

import org.testng.annotations.Test;

public class SwiftBlock2InputTest {

	@Test
	public void testParseSwiftBlock2Input() {
		String blockId = "2";
		String inputOutputType = "I";
		String messageType = "541";
		String receiverAddress = "KEYBUS30AXXX";
		String messagePriority = "";
		String deliveryMonitoring = "";
		String obsolescencePeriod = "";
		// TODO: add messagePriority, delivery monitoring, obsolescence period.

		String unparsedText = blockId + ":" + inputOutputType + messageType + receiverAddress;
		SwiftBlock2Input block2Input = new SwiftBlock2Input(unparsedText);

		block2Input.getUnparsedText();

		block2Input.getDeliveryMonitoring();
		block2Input.getMessagePriority();
		block2Input.getObsolescencePeriod();

		assertEquals(block2Input.getUnparsedText(), unparsedText.replaceFirst("2:", ""));
		assertEquals(block2Input.getMessageType().getText(), messageType);
		assertEquals(block2Input.getInputOutputType().getText(), inputOutputType);
		assertEquals(block2Input.getReceiverAddress(), receiverAddress);

		System.out.println(block2Input);
	}
}
