package net.uglobal.swiftvalidator.swift.model;

/**
 * README:
 * 
 * Basic Header (Block 1)
 * 
 * The Basic Header is given in Block 1 of a FIN message and is the only header that appears 
 * on all messages. The Basic Header provides the fundamental reference for any particular 
 * message and is almost always automatically built by the FIN interface.
 * 
 * The Basic Header has the same format for both input and output messages. However, the information 
 * contained in the Basic Header is relative to the sender when the message is input but relative to 
 * the receiver when the same message is output.
 * 
 * The following is an example of a basic input header, as it might appear at the beginning of a 
 * user-to-user message input within FIN:
 * 
 * {1:F01BANKBEBBAXXX2222123456}
 * 
 * The components can be separated as follows
 * 
 * {1:	F	01	BANKBEBBAXXX	2222	123456}
 *  (a)	(b)	(c)	(d)	            (e)     (f)
 *  
 * (a) Block Identifier
 * The Block Identifier for a Basic Header Block is always '1:'.
 * 
 * (b) Application Identifier
 * The Application Identifier identifies the application within which the message is being sent or received. 
 * The available options are:
 * F = FIN All user-to-user, FIN system and FIN service messages
 * A = GPA Most GPA system and service messages
 * L = GPA Certain GPA service messages, for example, LOGIN, LAKs, ABORT
 * These values are automatically assigned by the SWIFT system and the user's CBT, but the user should be 
 * aware of their existence and significance.
 * 
 * (c) Service Identifier
 * The Service Identifier consists of 2 numeric characters. It identifies the type of data that is being 
 * sent or received and, in doing so, whether the message which follows is one of the following:
 * a user-to-user message
 * a system message
 * a service message, for example, a session control command, such as SELECT, or a logical acknowledgement, 
 * such as ACK/SAK/UAK
 * 
 * In general you will be primarily concerned with identifier '01' which applies to all GPA and FIN system and 
 * user-to-user messages. Other values include: '21' for message acknowledgements such as ACK/NAK, UAK/UNK, 
 * '03' for SELECT commands, and so on.
 * 
 * (d) LT Identifier
 * This 12-character FIN address, given in the Basic Header Block, is the address of the sending LT for input 
 * messages or of the receiving LT for output messages, and includes the Branch Code.
 * In the Basic Header, the LT Code within the LT Identifier is specific to the LT that has established the 
 * session in which the message is being transmitted, that is the sending LT for input messages or the receiving 
 * LT for output messages.
 * 
 * (e) Session Number
 * The Session Number identifies the session in which the message was transmitted. Within the Basic Header, 
 * the 4-digit Session Number is the user's current GPA or FIN Session Number.
 * 
 * (f) Sequence Number (ISN or OSN)
 * The sequence number always consists of 6 digits. It is the ISN of the sender's current input session or the 
 * OSN of the receiver's current output session.
 * Required only in the following instances:
 * 
 * For all GPA messages/service messages with the following Service Identifiers, the Sequence Number must be 
 * equal to the next expected number:
 *   * 01 (user-to-user messages)
 *   * 03 (SELECT)
 *   * 06 (LOGOUT)
 *   
 * For all GPA messages with the following Service Identifiers, the Sequence Number must be equal to that of 
 * the acknowledged service message:
 *   * 21 (ACK/NAK/UAK/UNK)
 *   * 23 (SELECT ACK (SAK))
 *   * 26 (LOGOUT ACK)
 *   * 43 (SELECT NAK (SNK))
 *   
 * For all FIN messages/service messages with the following Service Identifiers, the Sequence Number must be 
 * equal to the next expected number:
 *   * 01 (user-to-user messages)
 *   * 05 (QUIT)
 *   
 * For all FIN messages with the following Service Identifiers, the Sequence Number must be equal to that of 
 * the acknowledged service message:
 *   * 21 (ACK/NAK/UAK/UNK)
 *   * 25 (QUIT ACK)
 */
public class SwiftBlock1 extends SwiftBlock {

	private String applicationId;
	private String serviceId;
	private LogicalTerminal logicalTerminal;
	private String sessionNumber;
	private String sequenceNumber;

	private SwiftBlock1() {
	}

	public SwiftBlock1(String unparsedText) {
		super(unparsedText);
	}

	@Override
	protected void preconditionCheck() {
		// e.g. 1:F01BONYUS30AVCM0000000001
		// Make sure it is 27 characters length (including 1:) or 17 characters (if session number and sequence number are missing)
		if (!(unparsedText.length() == 27 || unparsedText.length() == 17)) {
			String errMsg = "Failed to parse, text.length is " + unparsedText.length() + ", but only allow 27 or 17.";
			preconditionErrors.add(errMsg);
		}
	}

	@Override
	protected void parseDetails() {
		//		removeBlockIdFromUnparsedText();

		applicationId = unparsedText.substring(0, 1);
		serviceId = unparsedText.substring(1, 3);
		logicalTerminal = new LogicalTerminal(unparsedText.substring(3, 15));
		//		sessionNumber = unparsedText.substring(15, 19);
		if (unparsedText.length() >= 19) {
			sessionNumber = unparsedText.substring(15, 19);
		} else {
			sessionNumber = "";
		}
		if (unparsedText.length() >= 25) {
			sequenceNumber = unparsedText.substring(19, 25);
		} else {
			sequenceNumber = "";
		}
	}

	@Override
	protected void validate() {
		// check applicationId
		Character ch = this.applicationId.charAt(0);
		if (!(ch == 'F' || ch == 'A' || ch == 'L')) {
			String errMsg = "Failed to validate, applicationId=" + applicationId + ", but only allow (F, A, L).";
			// TODO: custom exception
			throw new RuntimeException(errMsg);
		}

		// check serviceId
		if (!(serviceId.equals("01") || serviceId.equals("03") || serviceId.equals("21"))) {
			String errMsg = "Failed to validate, serviceId=" + serviceId + ", but only allow (01, 03, 21).";
			// TODO: custom exception
			throw new RuntimeException(errMsg);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public LogicalTerminal getLogicalTerminal() {
		return logicalTerminal;
	}

	public String getSessionNumber() {
		return this.sessionNumber;
	}

	public String getSequenceNumber() {
		return this.sequenceNumber;
	}

	// Inner class
	public static class LogicalTerminal {
		private final String unparsedString;
		private final String bankCode;
		private final String countryCode;
		private final String locationCode1;
		private final String locationCode2;
		private final String logicalTerminalCode;
		private final String branchCode;

		LogicalTerminal(String s) {
			this.unparsedString = s;

			bankCode = s.substring(0, 4);
			countryCode = s.substring(4, 6);
			locationCode1 = s.substring(6, 7);
			locationCode2 = s.substring(7, 8);
			logicalTerminalCode = s.substring(8, 9);
			branchCode = s.substring(9, 12);
		}

		public String getUnparsedText() {
			return unparsedString;
		}

		public String getBankCode() {
			return bankCode;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public String getLocationCode1() {
			return locationCode1;
		}

		public String getLocationCode2() {
			return locationCode2;
		}

		public String getLogicalTerminalCode() {
			return logicalTerminalCode;
		}

		public String getBranchCode() {
			return branchCode;
		}

		public String toString() {
			return (new StringBuilder()).append(getClass().getName()).append("[bankCode=").append(bankCode).append(", countryCode=")
					.append(countryCode).append(", locationCode1=").append(locationCode1).append(", locationCode2=").append(locationCode2)
					.append(", logicalTerminalCode=").append(logicalTerminalCode).append(", branchCode=").append(branchCode).append("]").toString();
		}
	}
}
