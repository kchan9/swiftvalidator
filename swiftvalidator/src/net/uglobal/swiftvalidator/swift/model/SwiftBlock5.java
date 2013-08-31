package net.uglobal.swiftvalidator.swift.model;

import java.util.List;

/**
 * README: 
 * 
 * Trailer Block (Block 5)
 * 
 * Trailers are added to a message for the following reasons: 
 *     * for control puposes,  
 *     * to indicate that special cicumstances apply to the handling of the message, 
 *     * to convey special/additional information.
 *      
 * They may be added by the user or by the FIN service.
 *  
 * For example, Block 5 of a user-to-user message, sent with a MAC and a Checksum Trailer, 
 * may appear as:
 * 
 * {5:{MAC:41720873}{CHK:123456789ABC}}
 * 
 * Some other possible fields are:
 *     > MAC - Message Authencication Code calculated based on the entire contents of the 
 *             message using a key that has been exchanged with the destination 
 *             and a secret algorithm.
 *     > CHK - Checksum calculated for all message types.
 *     > PDE - Possible Duplicate Emission added if user thinks the same message was sent 
 *             previously.
 *     > DLM - Added by SWIFT if an urgent message (U) has not been delivered within 
 *             15 minutes, or a normal message (N) within 100 minutes.
 */
public class SwiftBlock5 extends SwiftBlock {

	private List<Tag> tags;

	public SwiftBlock5(String unparsedText) {
		super(unparsedText);
	}

	protected void preconditionCheck() {
		//		if (!unparsedText.startsWith("{")) {
		//			String errMsg = "Failed to parse block3.  It must be started with '{'.";
		//			preconditionErrors.add(errMsg);
		//		}
	}

	protected void validate() {
		// TODO: Should we check if it only allows MAC and CHK, PDE, DLM? 
	}

	protected void parseDetails() {
		tags = parseTagsForBlock3And5();
	}

	public List<Tag> getTags() {
		return this.tags;
	}
}
