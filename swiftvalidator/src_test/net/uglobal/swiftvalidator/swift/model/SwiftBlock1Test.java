package net.uglobal.swiftvalidator.swift.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwiftBlock1Test {

	@Test
	public void testParseSwiftBlock1() {
		String blockId = "1";
		String applicationId = "F";
		String serviceId = "01";
		String bankCode = "BONY";
		String countryCode = "US";
		String locationCode1 = "3";
		String locationCode2 = "0";
		String logicalTerminalCode = "A";
		String branchCode = "VCM";
		String sessionNumber = "0000";
		String sequenceNumber = "000001";
		String unparsedText = blockId + ":" + applicationId + serviceId + bankCode + countryCode + locationCode1 + locationCode2
				+ logicalTerminalCode + branchCode + sessionNumber + sequenceNumber;

		SwiftBlock1 block1 = new SwiftBlock1(unparsedText);

		Assert.assertEquals(block1.getUnparsedText(), unparsedText.replaceFirst("1:", ""));
		Assert.assertEquals(block1.getApplicationId(), applicationId);
		Assert.assertEquals(block1.getServiceId(), serviceId);
		Assert.assertEquals(block1.getLogicalTerminal().getBankCode(), bankCode);
		Assert.assertEquals(block1.getLogicalTerminal().getBranchCode(), branchCode);
		Assert.assertEquals(block1.getLogicalTerminal().getCountryCode(), countryCode);
		Assert.assertEquals(block1.getLogicalTerminal().getLocationCode1(), locationCode1);
		Assert.assertEquals(block1.getLogicalTerminal().getLocationCode2(), locationCode2);
		Assert.assertEquals(block1.getLogicalTerminal().getLogicalTerminalCode(), logicalTerminalCode);
		Assert.assertEquals(block1.getLogicalTerminal().getUnparsedText(), bankCode + countryCode + locationCode1 + locationCode2
				+ logicalTerminalCode + branchCode);
		Assert.assertEquals(block1.getSessionNumber(), sessionNumber);
		Assert.assertEquals(block1.getSequenceNumber(), sequenceNumber);
	}
}
