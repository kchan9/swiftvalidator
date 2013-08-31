package net.uglobal.swiftvalidator.swift.model;

import java.util.List;

/**
 * README: 
 * 
 * The User Header is an optional header available within FIN for user-to-user messages only,
 * and allows users to provide their own reference within the headers for a particular message.
 * 
 * A User Header can only be assigned by the sender of a message and, if assigned, will always 
 * appear on the output message copy. Relevant parts of the User Header will be repeated in 
 * related system messages and acknowledgements.
 * 
 * Block 3 may contain different combination of tags, so it is not a fixed length string as
 * seen for blocks 1 and 2.
 * 
 * The following it's and example of User Header in a FIN message:
 * {3:	{113:xxxx}	{108:ABC}}
 * (a)	(b)	        (c)
 * 
 * a) Block Identifier
 * The Block Identifier for a User Header Block always has the value '3:'.
 * 
 * b) Banking Priority 
 * Tag 113 defines an optional 4-character banking priority.
 * The contents of tag 113 are agreed between two or more users.
 * 
 * c) Message User Reference (MUR)
 * Tag 108 defines a free-format field in which users may specify their own reference of 
 * up to 16 characters of the permitted character set.
 */
public class SwiftBlock3 extends SwiftBlock {

	private List<Tag> tags;

	private SwiftBlock3() {
	}

	public SwiftBlock3(String unparsedText) {
		super(unparsedText);
	}

	protected void preconditionCheck() {
		//		if (!unparsedText.startsWith("{")) {
		//			String errMsg = "Failed to parse block3.  It must be started with '{'.";
		//			preconditionErrors.add(errMsg);
		//		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	protected void parseDetails() {
		tags = parseTagsForBlock3And5();
	}

	protected void validate() {
		// TODO: Should we check if it only allows 108 and 113? 
	}

	//	public static void main(String argv[]) {
	//		SwiftBlock3 main = new SwiftBlock3("3:{113:abcdef}{108:MT502 001 OF 008}");
	//		List<Tag> tags = main.getTags();
	//	}
}
