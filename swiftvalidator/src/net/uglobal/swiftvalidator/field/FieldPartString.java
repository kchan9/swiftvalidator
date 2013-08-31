package net.uglobal.swiftvalidator.field;

import java.util.ArrayList;
import java.util.List;

public class FieldPartString {

	private final List<PredefinedCharacter> predefinedCharacterList = new ArrayList<PredefinedCharacter>();

	public void addPredefinedCharacter(PredefinedCharacter predefinedCharacter) {
		predefinedCharacterList.add(predefinedCharacter);
	}

	public void addPredefinedCharacterList(List<PredefinedCharacter> predefinedCharacterList) {
		this.predefinedCharacterList.addAll(predefinedCharacterList);
	}

	public List<PredefinedCharacter> getPredefinedCharacterList() {
		return this.predefinedCharacterList;
	}

	// TODO: revisit, NOT the right place, we already know it's a multi line at FieldPart level, should not redo this again
	public Boolean isMultiLine() {
		for (PredefinedCharacter ch : predefinedCharacterList) {
			if (ch.isMultiLineCharacter()) {
				return true;
			}
		}
		return false;
	}

	public Boolean isEqual(String tgtStr) {
		if (tgtStr.length() != this.predefinedCharacterList.size()) {
			return false;
		}

		for (int i = 0; i < tgtStr.length(); i++) {
			Character ch = tgtStr.charAt(i);
			PredefinedCharacter predefinedCharacter = this.predefinedCharacterList.get(i);

			Boolean isContain = predefinedCharacter.contains(ch);
			if (!isContain) {
				return false;
			}
		}
		return true;
	}

	public Boolean hasMatch(String data) {
		// TODO:
		//		2 things need to be changed
		//		1) PredefinedCharacterList needs to be X dimensional in order to validate "4 * 35" format  (data is tokenized by '\r\n')
		//		  e.g. a list which contains 4 lists (in which has 35 characterset)
		//		2) the if condition check needs to be changed, for single line, it will check the first list of list
		//		   if it is multi line , it will check against lists of list
		//		3) for multi line, it may not be exactly the same length.
		//		   e.g. if the data is 10 characters by 3 lines, it will still be checking against 35 characters by 4 lines
		// -- 

		// This check only applies to NON Multi line part
		if (!isMultiLine() && getPredefinedCharacterList().size() != data.length()) {
			return false;
		}
		for (int i = 0; i < getPredefinedCharacterList().size(); i++) {
			PredefinedCharacter predefinedCharacter = getPredefinedCharacterList().get(i);

			if (predefinedCharacter.isMultiLineCharacter()) {
				// NOTE: If it is a multi line character, it marks it is the beginning of the multiline part.  
				//       We take the rest of the characters, and check if there is a match
				// NOTE: We make an assumption that the multiLine part is always the last part of the field. 
				//       If there is any field following the multi line part. This logic WILL NOT work.
				return isMultiLineMatch(predefinedCharacter, data.substring(i, data.length()), predefinedCharacter.getRowCount(),
						predefinedCharacter.getColumnCount());
			} else {
				Character ch = data.charAt(i);
				if (!predefinedCharacter.contains(ch)) {
					return false;
				}
			}
		}
		return true;
	}

	private Boolean isMultiLineMatch(PredefinedCharacter predefinedCharacter, String validateData, int rowCount, int columnCount) {
		final String SWIFT_EOL = "\r\n";
		String tokens[] = validateData.split(SWIFT_EOL);

		// 1st check
		if (tokens.length > rowCount) {
			return false;
		}
		// 2nd check
		for (String token : tokens) {
			if (token.length() > columnCount) {
				return false;
			}
		}
		// 3rd check
		for (String token : tokens) {
			for (int i = 0; i < token.length(); i++) {
				Character ch = token.charAt(i);
				if (!predefinedCharacter.contains(ch)) {
					return false;
				}
			}
		}
		return true;
	}

	public String toString() {
		return predefinedCharacterList.toString();
	}
}
