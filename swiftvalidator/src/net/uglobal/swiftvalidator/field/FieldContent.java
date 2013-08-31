package net.uglobal.swiftvalidator.field;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.characters.AllUppercaseLettersCharacterSet;
import net.uglobal.swiftvalidator.characters.CarriageReturnCharacterSet;
import net.uglobal.swiftvalidator.characters.CharacterSet;
import net.uglobal.swiftvalidator.characters.ColonCharacterSet;
import net.uglobal.swiftvalidator.characters.DigitsCharacterSet;
import net.uglobal.swiftvalidator.characters.DigitsWithDecimalCommaCharacterSet;
import net.uglobal.swiftvalidator.characters.ForwardSlashCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterACharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterBCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterCCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterDCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterECharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterFCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterGCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterHCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterICharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterJCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterKCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterLCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterMCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterNCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterOCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterPCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterQCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterRCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterSCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterTCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterUCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterVCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterWCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterXCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterYCharacterSet;
import net.uglobal.swiftvalidator.characters.LowerCaseLetterZCharacterSet;
import net.uglobal.swiftvalidator.characters.NewLineCharacterSet;
import net.uglobal.swiftvalidator.characters.SpaceCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterACharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterBCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterCCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterDCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterECharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterFCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterGCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterHCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterICharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterJCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterKCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterLCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterMCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterNCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterOCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterPCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterQCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterRCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterSCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterTCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterUCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterVCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterWCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterXCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterYCharacterSet;
import net.uglobal.swiftvalidator.characters.UpperCaseLetterZCharacterSet;
import net.uglobal.swiftvalidator.characters.UppercaseAlphanumericCharacterSet;
import net.uglobal.swiftvalidator.characters.UppercaseHexadecimalCharacterSet;
import net.uglobal.swiftvalidator.characters.XSwiftCharacterSet;
import net.uglobal.swiftvalidator.characters.YSwiftCharacterSet;
import net.uglobal.swiftvalidator.characters.ZSwiftCharacterSet;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class FieldContent {

	private static final Logger logger = Logger.getLogger(FieldContent.class);

	private Integer id;

	//	TODO:
	//		need 2 dimensional to store fixed length and multiLength
	//	private final List<PredefinedCharacter> predefinedCharacterList = new ArrayList<PredefinedCharacter>();

	private final List<List<PredefinedCharacter>> predefinedCharacterList = new ArrayList<List<PredefinedCharacter>>();

	private String requiredValue;

	public FieldContent(Integer id, String requiredValue, FieldPart fieldPart) {
		this.id = id;
		this.requiredValue = requiredValue;

		buildPredefinedCharacterList(fieldPart.getFieldLengthType(), fieldPart.getFieldFormatType());
	}

	public FieldContent(Integer id) {
		this(id, (String) null, null);
	}

	public FieldContent(Integer id, FieldFormatType formatType) {
		// TODO
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return this.id;
	}

	public void setRequiredValue(String requiredValue) {
		this.requiredValue = requiredValue;
	}

	public String getRequiredValue() {
		return this.requiredValue;
	}

	public void addPredefinedCharacter(PredefinedCharacter ch) {
		int rowCounter = 0;
		addPredefinedCharacter(ch, rowCounter);
		//		if (predefinedCharacterList.size() == 0) {
		//			List<PredefinedCharacter> list = new ArrayList<PredefinedCharacter>();
		//			predefinedCharacterList.add(list);
		//		}
		//		predefinedCharacterList.get(0).add(ch);
	}

	public void addPredefinedCharacter(PredefinedCharacter ch, int rowCounter) {
		if (predefinedCharacterList.size() <= rowCounter) {
			List<PredefinedCharacter> list = new ArrayList<PredefinedCharacter>();
			predefinedCharacterList.add(list);
		}
		predefinedCharacterList.get(rowCounter).add(ch);
	}

	public void addPredefinedCharacterList(List<List<PredefinedCharacter>> list) {
		predefinedCharacterList.addAll(list);
	}

	public void clearPredefinedCharacterList() {
		getPredefinedCharacterList().clear();
	}

	public List<List<PredefinedCharacter>> getPredefinedCharacterList() {
		return this.predefinedCharacterList;
	}

	private void buildPredefinedCharacterList(FieldLengthType fieldLengthType, FieldFormatType fieldFormatType) {
		// TODO: should not need to clear list, revisit, and remove it later.
		//		clearPredefinedCharacterList();

		String reqValue = getRequiredValue();
		// skip root
		if (StringUtils.isBlank(reqValue) || reqValue.equals("root")) {
			return;
		}

		//		FieldFormatType fieldFormatType = FieldFormatUtil.getFormatType(reqValue);
		switch (fieldFormatType) {
		case Digits:
		case DigitsWithDecimalComma:
		case UppercaseHexadecimal:
		case UppercaseLetters:
		case UppercaseAlphanumeric:
		case Space:
		case SwiftCharacterSetX:
		case SwiftCharacterSetY:
		case SwiftCharacterSetZ:
		case NewLine:
		case CarriageReturn:
			buildPredefinedCharacterSet(reqValue, fieldLengthType, fieldFormatType);
			break;
		case Constant:
			buildConstant(reqValue);
			break;
		default:
			// TODO: error - cannot recognize field
		}
	}

	private void buildPredefinedCharacterSet(String field, FieldLengthType fieldLengthType, FieldFormatType fieldFormatType) {

		Integer quantity = null;

		Integer rowCount = null;
		Integer columnCount = null;
		// fixed or max length
		if (field.contains("!")) {
			String[] tokens = field.split("!");
			if (tokens.length == 2) {
				String count = tokens[0];
				String type = tokens[1];

				quantity = Integer.parseInt(count);
			} else {
				logger.error("Failed to recognize FieldContent.  requiredField=" + field);
			}
		}
		// multi line length
		else if (field.contains("*")) {
			String[] tokens = field.split("\\*");
			rowCount = Integer.parseInt(tokens[0]);
			columnCount = Integer.parseInt(tokens[1].replaceFirst(fieldFormatType.getCode(), ""));

			//			quantity = rowNum * columnNum;
		}

		switch (fieldLengthType) {
		case MultiLinesLength:
			for (int rowCounter = 0; rowCounter < rowCount; rowCounter++) {
				for (int columnCounter = 0; columnCounter < columnCount; columnCounter++) {
					CharacterSet characterSet = null;
					switch (fieldFormatType) {
					case UppercaseAlphanumeric:
						characterSet = new UppercaseAlphanumericCharacterSet();
						break;
					case SwiftCharacterSetX:
						characterSet = new XSwiftCharacterSet();
						break;
					case SwiftCharacterSetY:
						characterSet = new YSwiftCharacterSet();
						break;
					case SwiftCharacterSetZ:
						characterSet = new ZSwiftCharacterSet();
						break;
					case Space:
						characterSet = new SpaceCharacterSet();
						break;
					case UppercaseLetters:
						characterSet = new AllUppercaseLettersCharacterSet();
						break;
					case UppercaseHexadecimal:
						characterSet = new UppercaseHexadecimalCharacterSet();
						break;
					case DigitsWithDecimalComma:
						characterSet = new DigitsWithDecimalCommaCharacterSet();
						break;
					case Digits:
						characterSet = new DigitsCharacterSet();
						break;
					case NewLine:
						characterSet = new NewLineCharacterSet();
						break;
					case CarriageReturn:
						characterSet = new CarriageReturnCharacterSet();
						break;
					default:
					}
					addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(characterSet, rowCount, columnCount));
				}
			}
			break;
		case FixedLength:
		case MaxLength:
			if (field.contains("!") && (quantity == null || quantity == 0)) {
				return;
			} else {
				for (int counter = 0; counter < quantity; counter++) {
					CharacterSet characterSet = null;
					switch (fieldFormatType) {
					case UppercaseAlphanumeric:
						characterSet = new UppercaseAlphanumericCharacterSet();
						break;
					case SwiftCharacterSetX:
						characterSet = new XSwiftCharacterSet();
						break;
					case SwiftCharacterSetY:
						characterSet = new YSwiftCharacterSet();
						break;
					case SwiftCharacterSetZ:
						characterSet = new ZSwiftCharacterSet();
						break;
					case Space:
						characterSet = new SpaceCharacterSet();
						break;
					case UppercaseLetters:
						characterSet = new AllUppercaseLettersCharacterSet();
						break;
					case UppercaseHexadecimal:
						characterSet = new UppercaseHexadecimalCharacterSet();
						break;
					case DigitsWithDecimalComma:
						characterSet = new DigitsWithDecimalCommaCharacterSet();
						break;
					case Digits:
						characterSet = new DigitsCharacterSet();
						break;
					case NewLine:
						characterSet = new NewLineCharacterSet();
						break;
					case CarriageReturn:
						characterSet = new CarriageReturnCharacterSet();
						break;
					default:
					}
					addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(characterSet,
							(fieldLengthType == FieldLengthType.MultiLinesLength) ? Boolean.TRUE : Boolean.FALSE));
				}
			}
			break;
		default:
			break;
		}
	}

	private void buildConstant(String field) {
		for (Character ch : field.toCharArray()) {
			switch (ch) {
			case 'a':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterACharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterACharacterSet()));
				break;
			case 'b':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterBCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterBCharacterSet()));
				break;
			case 'c':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterCCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterCCharacterSet()));
				break;
			case 'd':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterDCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterDCharacterSet()));
				break;
			case 'e':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterECharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterECharacterSet()));
				break;
			case 'f':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterFCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterFCharacterSet()));
				break;
			case 'g':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterGCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterGCharacterSet()));
				break;
			case 'h':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterHCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterHCharacterSet()));
				break;
			case 'i':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterICharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterICharacterSet()));
				break;
			case 'j':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterJCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterJCharacterSet()));
				break;
			case 'k':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterKCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterKCharacterSet()));
				break;
			case 'l':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterLCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterLCharacterSet()));
				break;
			case 'm':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterMCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterMCharacterSet()));
				break;
			case 'n':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterNCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterNCharacterSet()));
				break;
			case 'o':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterOCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterOCharacterSet()));
				break;
			case 'p':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterPCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterPCharacterSet()));
				break;
			case 'q':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterQCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterQCharacterSet()));
				break;
			case 'r':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterRCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterRCharacterSet()));
				break;
			case 's':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterSCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterSCharacterSet()));
				break;
			case 't':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterTCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterTCharacterSet()));
				break;
			case 'u':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterUCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterUCharacterSet()));
				break;
			case 'v':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterVCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterVCharacterSet()));
				break;
			case 'w':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterWCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterWCharacterSet()));
				break;
			case 'x':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterXCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterXCharacterSet()));
				break;
			case 'y':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterYCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterYCharacterSet()));
				break;
			case 'z':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterZCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterZCharacterSet()));
				break;
			// upper case
			case 'A':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterACharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterACharacterSet()));
				break;
			case 'B':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterBCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterBCharacterSet()));
				break;
			case 'C':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterCCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterCCharacterSet()));
				break;
			case 'D':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterDCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterDCharacterSet()));
				break;
			case 'E':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterECharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterECharacterSet()));
				break;
			case 'F':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterFCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterFCharacterSet()));
				break;
			case 'G':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterGCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterGCharacterSet()));
				break;
			case 'H':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterHCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterHCharacterSet()));
				break;
			case 'I':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterICharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterICharacterSet()));
				break;
			case 'J':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterJCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterJCharacterSet()));
				break;
			case 'K':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterKCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterKCharacterSet()));
				break;
			case 'L':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterLCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterLCharacterSet()));
				break;
			case 'M':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterMCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterMCharacterSet()));
				break;
			case 'N':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterNCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterNCharacterSet()));
				break;
			case 'O':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterOCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterOCharacterSet()));
				break;
			case 'P':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterPCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterPCharacterSet()));
				break;
			case 'Q':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterQCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterQCharacterSet()));
				break;
			case 'R':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterRCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterRCharacterSet()));
				break;
			case 'S':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterSCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterSCharacterSet()));
				break;
			case 'T':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterTCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterTCharacterSet()));
				break;
			case 'U':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterUCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterUCharacterSet()));
				break;
			case 'V':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterVCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterVCharacterSet()));
				break;
			case 'W':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterWCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterWCharacterSet()));
				break;
			case 'X':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterXCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterXCharacterSet()));
				break;
			case 'Y':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterYCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterYCharacterSet()));
				break;
			case 'Z':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterZCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterZCharacterSet()));
				break;
			// colon
			case ':':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new ColonCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new ColonCharacterSet()));
				break;
			// forward slash
			case '/':
				addPredefinedCharacter(PredefinedCharacter.newPredefinedCharacter(new ForwardSlashCharacterSet()));
				//				getPredefinedCharacterList().get(0).add(PredefinedCharacter.newPredefinedCharacter(new ForwardSlashCharacterSet()));
				break;
			default:
				// TODO: error - cannot recognize character
			}
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append("id=").append(getId());
		sb.append(", requiredValue=").append(getRequiredValue());
		sb.append(", predefinedCharacterList=").append(getPredefinedCharacterList());
		sb.append("]");
		return sb.toString();
	}
}
