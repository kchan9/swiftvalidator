package net.uglobal.swiftvalidator.validator.rules.mt5xx;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.validator.rules.RuleValidationError;
import net.uglobal.swiftvalidator.xml.beans.MT541;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;

public class MT541Rules {
	private final MT541 mt541;

	private final List<RuleValidationError> validationErrors = new ArrayList<RuleValidationError>();;

	public MT541Rules(MTMessage mt541) {
		this.mt541 = (MT541) mt541;
	}

	public void execute() {

		List<RuleValidationError> validationErrors = new ArrayList<RuleValidationError>();
		List<RuleValidationError> tmpErrors = null;

		// C1 
		// The following amount fields cannot appear in more than one occurrence of the subsequence E3 Amounts:
		// Subsequence E3
		// :19A::ACRU
		// :19A::ANTO
		// :19A::CHAR
		// :19A::COUN
		// :19A::DEAL
		// :19A::EXEC
		// :19A::ISDI
		// :19A::LADT
		// :19A::LEVY
		// :19A::LOCL
		// :19A::LOCO
		// :19A::MARG
		// :19A::OTHR
		// :19A::POST
		// :19A::REGF
		// :19A::SETT
		// :19A::SHIP
		// :19A::SPCN
		// :19A::STAM
		// :19A::STEX
		// :19A::TRAN
		// :19A::TRAX
		// :19A::VATA
		// :19A::WITH
		// :19A::COAX
		// :19A::ACCA
		// TODO: 

		// C2 
		// It is mandatory to specify a settlement amount: 
		// one occurrence of the amounts subsequence E3 must contain amount field :19A::SETT.
		// TODO: 

		// C3 
		// In sequence A, if the total of linked settlement instructions (field :99B::TOSE) is present, 
		// then the current settlement instruction number (field :99B::SETT) must be present.
		// +------------------------------------------------------------+ 
		// |       Sequence A           | Sequence A                    | 
		// | if field :99B::TOSE is ... | then field :99B::SETT is ...  |
		// +----------------------------+-------------------------------+
		// | Present                    | Mandatory                     |
		// | Not present                | Optional                      |
		// +------------------------------------------------------------+
		if ((tmpErrors = MT541RuleOperations.testRule_C3(mt541.getField99B("A"))) != null) {
			validationErrors.addAll(tmpErrors);
		}

		// C4 
		// In (sub)sequence E3, if an exchange rate (field :92B::EXCH) is present, 
		// the corresponding resulting amount (field :19A::RESU) must be present in the same subsequence. 
		// If the exchange rate is not present then the resulting amount is not allowed.
		// +----------------------------+-------------------------------+
		// | Subsequence E3             | Subsequence E3                |
		// | if field :92B::EXCH is ... | then field :19A::RESU is ...  |
		// +----------------------------+-------------------------------+
		// | Present                    | Mandatory                     |
		// | Not present                | Not allowed                   |
		// +----------------------------+-------------------------------+ 
		if ((tmpErrors = MT541RuleOperations.testRule_C4(mt541.getField92B("E3"), mt541.getField19A("E3"))) != null) {
			validationErrors.addAll(tmpErrors);
		}

		// C5 
		// The following party fields cannot appear more than once in a message:
		// +----------------+----------------+--------------+
		// |Subsequence E1  | Subsequence E2 | Sequence F   |
		// +----------------+----------------+--------------+
		// | :95a::BUYR     | :95a::ACCW     | :95a::EXCH   |
		// | :95a::DEAG     | :95a::BENM     | :95a::MEOR   |
		// | :95a::DECU     | :95a::PAYE     | :95a::MERE   |
		// | :95a::DEI1     | :95a::DEBT     | :95a::TRRE   |
		// | :95a::DEI2     |                |              |
		// | :95a::PSET     |                | :95a::VEND   |
		// | :95a::REAG     |                | :95a::TRAG   |
		// | :95a::RECU     |                | :95a::BRKR   |
		// | :95a::REI1     |                |              | 
		// | :95a::REI2     |                |              |
		// | :95a::SELL     |                |              |
		// +----------------+----------------+--------------+
		// TODO: 

		// C6 
		// If field :22F::DBNM is NOT present in sequence E, 
		// then it is mandatory to specify a delivering agent and a place of settlement: 
		// one occurrence of subsequence E1 Settlement Parties must contain party field :95a::DEAG and 
		// another one must contain party field :95a::PSET.
		// 
		// NOTE: 95a (C, P, Q, R, or S)

		mt541.getField22F("E");
		mt541.getField95C("E1");
		mt541.getField95P("E1");
		mt541.getField95Q("E1");
		mt541.getField95R("E1");
		mt541.getField95S("E1");

		// C7 
		// If a qualifier from the list Deliverers is present in a subsequence E1, 
		// in a field :95a::4!c, then all the remaining qualifiers following this 
		// qualifier in the list Deliverers (see below) must be present.
		// 
		// In other words, in sequence E, the following scenarios must be validated:
		//   * If :95a::DEI2 is present in subsequence E1, then :95a::DEI1 must be present in another subsequence E1.
		//   * If :95a::DEI1 is present in subsequence E1, then :95a::DECU must be present in another subsequence E1.
		//   * If :95a::DECU is present in subsequence E1, then :95a::SELL must be present in another subsequence E1.
		// 
		// If a qualifier from the list Receivers is present in a subsequence E1, in a field :95a::4!c, then all the remaining qualifiers following this qualifier in the list Receivers (see below) must be present.
		// 
		// In other words, in sequence E, the following scenarios must be validated:
		//   * If :95a::REI2 is present in subsequence E1, then :95a::REI1 must be present in another subsequence E1.
		//   * If :95a::REI1 is present in subsequence E1, then :95a::RECU must be present in another subsequence E1.
		//   * If :95a::RECU is present in subsequence E1, then :95a::BUYR must be present in another subsequence E1.
		// +-----------------------------------+----------------------------------+
		// |          Deliverers               |           Receivers              |
		// +-----------------------------------+----------------------------------+
		// | DEI2 | Deliverer's Intermediary 2 | REI2 | Receiver's Intermediary 2 |
		// | DEI1 | Deliverer's Intermediary 1 | REI1 | Receiver's Intermediary 1 |
		// | DECU | Deliverer's Custodian      | RECU | Receiver's Custodian      | 
		// | SELL | Seller (Deliverer)         | BUYR | Buyer (Receiver)          |
		// +-----------------------------------+----------------------------------+		

		// C8 
		// If the message is a cancellation, that is, Function of the Message (field 23G) is CANC, 
		// then subsequence A1 (Linkages) must be present at least once in the message, and 
		// in one and only one occurrence of A1, field :20C::PREV must be present; consequently, 
		// in all other occurrences of A1, field :20C::PREV is not allowed.
		// +-----------------------+-----------------------------------+--------------------------------------------+
		// | Sequence A            | Then subsequence A1 is ...        | And field :20C::PREV is ...                |
		// | if field :23G: is ... |                                   |                                            |
		// +-----------------------+-----------------------------------+--------------------------------------------+
		// | CANC                  | Mandatory (minimum one occurrence | Mandatory in one occurrence of subsequence |
		// |                       | of A1 must be present)            | A1, and not allowed in all other           |
		// |                       |                                   | occurrences of subsequence A1              |
		// +-----------------------+-----------------------------------+--------------------------------------------+
		// | NEWM or PREA          | Optional                          | NA                                         |
		// +-----------------------+-----------------------------------+--------------------------------------------+

		// C9 In subsequence E1, if field :95a::PSET is present, then field :97a::SAFE is not allowed 
		// in the same subsequence..
		// +-----------------------------------------------------------+
		// | Subsequence E1             | Subsequence E1               |
		// | if field :95a::PSET is ... | then field :97a::SAFE is ... +
		// +-----------------------------------------------------------+
		// | Present                    | Not allowed within the same  | 
		// |                            | occurrence                   |
		// +-----------------------------------------------------------+
		// | Not present                | Optional                     |
		// +-----------------------------------------------------------+

		// C10 
		// If field :22F::FXCX//FXNO or FXYE is present in sequence E, then the message must be a cancellation,
		// that is, Function of the Message in sequence A (field 23G) is CANC.
		//
		// If field :22F::FXCX//SINO is present in sequence E, then the message must be new, that is, 
		// Function of the Message in sequence A (field 23G) is NEWM..
		//
		// +----------------------------+----------------------------+
		// | Sequence E                 | In sequence A              |
		// | if field :22F::FXCX is ... | then field :23G:4!c is ... |
		// +----------------------------+----------------------------+
		// | FXNO                       | CANC                       |
		// | FXYE                       | CANC                       |
		// | SINO                       | NEWM                       |
		// | Not present                | NA                         |
		// +----------------------------+----------------------------+
		// (*) if the Data Source Scheme is present in 
		// field :22F::FXCX// then the conditional rule does not apply.

		// C11 
		// If field :22F::DBNM is present in sequence E, then a seller must be specified, 
		// that is one occurrence of subsequence E1 must contain field :95a::SELL.
		// +----------------------------+-------------------------------+
		// | Sequence E                 | Then in one occurrence        |
		// | if field :22F::DBNM is ... | of subsequence E1 ...         |
		// +----------------------------+-------------------------------+
		// | Present                    | Field :95a::SELL is Mandatory |
		// | Not present                | NA                            |
		// +----------------------------+-------------------------------+

		// C12 
		// If field :22F::DBNM//VEND is present in sequence E, 
		// then a vendor must be specified; that is one occurrence of 
		// sequence F must contain field :95a::VEND.
		// +--------------------------------------+--------------------------------+-------------------------------------+
		// | In sequence E                        | Then                           | And in one occurrence of sequence F |
		// | if field :22F::DBNM//VEND is ... (*) | sequence F is ...              | field :95a::VEND is ...             |
		// +--------------------------------------+--------------------------------+-------------------------------------+
		// | Present                              | Mandatory, that is sequence F  | Mandatory                           |
		// |                                      | must be present once           |                                     |
		// +--------------------------------------+--------------------------------+-------------------------------------+ 
		// | Not present                          | Optional                       | Optional                            |
		// +--------------------------------------+--------------------------------+-------------------------------------+
		// (*) if the Data Source Scheme is present in field :22F::DBNM//VEND then the conditional rule does not apply.

		// C13 
		// If field :36B: is present in minimum one occurrence of sequence A1, 
		// then the type of settlement transaction must be a pair-off or a turn-around; that is,
		// sequence E field :22F::SETR//PAIR or :22F::SETR//TURN must be present.
		// +--------------------------------------+--------------------------------------------------+
		// | In sequence A1 if field :36B: is ... | Then in sequence E, field :22F::SETR must be ... |
		// +--------------------------------------+--------------------------------------------------+
		// | Present                              | :22F::SETR//PAIR and DSS must not be present     |
		// |                                      | or                                               |
		// |                                      | :22F::SETR//TURN and DSS must not be present     |
		// +--------------------------------------+--------------------------------------------------+
		// | Not present                          | NA                                               |
		// +--------------------------------------+--------------------------------------------------+

		// C14 
		// In sequence C, field :36B::SETT cannot appear more than twice (maximum two occurrences). 
		// When repeated, one occurrence must have Quantity Type Code FAMT and the other occurrence 
		// must have Quantity Type Code AMOR.
		// |----------------------------+-----------------------------------+----------------------------------------+
		// | Sequence C                 | Then one occurrence of :36B::SETT | And the other occurrence of :36B::SETT |
		// | if field :36B::SETT is ... | must be ...                       | must be ...                            |
		// |----------------------------+-----------------------------------+----------------------------------------+
		// | Repeated                   | :36B::SETT//FAMT                  |:36B::SETT//AMOR                        |
		// | Not repeated               | NA                                | NA                                     |
		// |----------------------------+-----------------------------------+----------------------------------------+

		// C15
		// A value date must only be provided for cash/securities split settlement. 
		// That is, in any occurrence of subsequence E3, if value date field :98a::VALU is present, 
		// then in sequence E field :22F::STCO//SPST must be present, and 
		// settlement amount field :19A::SETT must be present in the same subsequence E3.
		// +---------------------------+------------------------------------------+-----------------------------+
		// | In any occurrence of      | Sequence E                               | In the same occurrence of   |
		// | subsequence E3            | then field :22F::STCO//SPST with DSS not | subsequence E3              |
		// | if field :98a::VALU is ...| present is ...                           | and field :19A::SETT is ... |
		// +---------------------------+------------------------------------------+-----------------------------+
		// | Present                   | Mandatory                                | Mandatory                   |
		// | Not present               | Optional                                 | Optional                    |
		// +---------------------------+------------------------------------------+-----------------------------+

		//MT541RuleOperations.
	}
}
