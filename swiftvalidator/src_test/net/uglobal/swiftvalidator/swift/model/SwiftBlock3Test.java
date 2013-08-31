package net.uglobal.swiftvalidator.swift.model;

import static org.testng.Assert.assertEquals;

import java.util.List;

import net.uglobal.swiftvalidator.swift.model.SwiftBlock3;
import net.uglobal.swiftvalidator.swift.model.Tag;

import org.testng.annotations.Test;

public class SwiftBlock3Test {

	@Test
	public void testParseSwiftBlock3() {

		String unparsedText = "3:{113:abcdef}{108:MT502 001 OF 008}";

		SwiftBlock3 block3 = new SwiftBlock3(unparsedText);

		List<Tag> tags = block3.getTags();

		assertEquals(tags.size(), 2);
		assertEquals(tags.get(0).getName(), "113");
		assertEquals(tags.get(1).getName(), "108");
		assertEquals(tags.get(0).getValue(), "abcdef");
		assertEquals(tags.get(1).getValue(), "MT502 001 OF 008");

	}
}
