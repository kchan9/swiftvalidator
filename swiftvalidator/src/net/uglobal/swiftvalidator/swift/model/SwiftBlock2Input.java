package net.uglobal.swiftvalidator.swift.model;

/*
 * README: 
 * 
 * Input
 * 
 * For input messages, the Application Header describes the type of message, its addressee and how it should be sent.
 * 
 * The following is an example of an input header:
 * 
 * {2:	I	103	BANKDEFFXXX	U	3	003}
 *  (a)	(b)	(c)	(d)	        (e)	(f)	(g)
 *  
 * (a) Block Identifier
 * The Block Identifier for an Application Header Block is always '2:'.
 * 
 * (b) Input/Output Identifier
 * For an input message, the Input/Output Identifier consists of the single letter 'I'.
 * 
 * (c) Message Type
 * The Message Type consists of 3 digits which define the MT number of the message being input. The example used 
 * above is for an MT 103 Customer Transfer.
 * 
 * (d) Receiver's Address
 * This address is the 12-character SWIFT address of the receiver of the message, but with a LT Code of 'X'. 
 * It defines the destination to which the message should be sent.
 * The system will replace the 'X' with a specific LT Code on delivery of the message according to the delivery 
 * control exercised by the receiving user.
 * The Branch Code is mandatory and will be validated. The default of 'XXX' may be used, as in the example above.
 * 
 * (e) Message Priority
 * This character, used within FIN Application Headers only, defines the priority with which a message is delivered. 
 * The possible values are:
 * S = System
 * U = Urgent
 * N = Normal
 * 
 * (f) Delivery Monitoring
 * Delivery monitoring options apply only to FIN user-to-user messages.
 * The chosen option is expressed as a single digit:
 * 1 = Non-Delivery Warning
 * 2 = Delivery Notification
 * 3 = Non-Delivery Warning and Delivery Notification.
 * 
 * If the message has priority 'U' then the user must request delivery monitoring option '1' or '3'. If the message 
 * has priority 'N', the user can request delivery monitoring option '2', or, by leaving the option blank, no delivery
 * monitoring.
 * 
 * (g) Obsolescence Period
 * The obsolescence period defines the period of time after which a Delayed Message (DLM) trailer is added to a FIN 
 * user-to-user message when the message is delivered. For urgent priority messages, it is also the period of time 
 * after which, if the message remains undelivered, a Non-Delivery Warning is generated. The values for the obsolescence 
 * period are:
 * 003 (15 minutes) for 'U' priority, and
 * 020 (100 minutes) for 'N' priority.
 */
public class SwiftBlock2Input extends SwiftBlock2 {

	private String receiverAddress;
	private String messagePriority;
	private String deliveryMonitoring;
	private String obsolescencePeriod;

	private SwiftBlock2Input() {
	}

	public SwiftBlock2Input(String unparsedText) {
		super(unparsedText);
	}

	@Override
	protected void preconditionCheck() {
		// Make sure it must have the length of 
		//    18 - <blockId><<input/outputId><msgType><receiverAddress> 
		//    19 - <blockId><<input/outputId><msgType><receiverAddress><msgPriority> 
		//    20 -  <blockId><<input/outputId><msgType><receiverAddress><msgPriority><deliveryPriority>
		//    23 - <blockId><<input/outputId><msgType><receiverAddress><msgPriority><deliveryPriority><obsolescencePeriod>
		if (!(unparsedText.length() == 18 || unparsedText.length() == 19 || unparsedText.length() == 20 || unparsedText.length() == 23)) {
			String errMsg = "Failed to parse, text.length is " + unparsedText.length() + ", but only allow 18, 19,20 or 23.";
			preconditionErrors.add(errMsg);
		}
	}

	@Override
	protected void parseDetails() {

		receiverAddress = unparsedText.substring(4, 16);

		if (unparsedText.length() >= 17) {
			messagePriority = unparsedText.substring(16, 17); // TODO: use enum
		}
		if (unparsedText.length() >= 18) {
			deliveryMonitoring = unparsedText.substring(17, 18); // TODO: use enum
		}
		if (unparsedText.length() >= 21) {
			obsolescencePeriod = unparsedText.substring(18, 21);
		}
	}

	@Override
	protected void validate() {
		// TODO: 
	}

	public String getReceiverAddress() {
		return this.receiverAddress;
	}

	public String getMessagePriority() {
		return this.messagePriority;
	}

	public String getDeliveryMonitoring() {
		return this.deliveryMonitoring;
	}

	public String getObsolescencePeriod() {
		return this.obsolescencePeriod;
	}
}
