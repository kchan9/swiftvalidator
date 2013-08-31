package net.uglobal.swiftvalidator.field;

import java.util.List;

import net.uglobal.swiftvalidator.characters.CharacterSet;

public class PredefinedCharacter {
	// NOTE: is this the right place to add?
	// NOTE: this is added to identify that this character is being treated as a multi line character or not.
	// E.g. 4*35x 
	//      in this case, it is represented by a multiLineCharacter (isMultiLineCharacter = true)
	// E.g. 4!c
	//      in this case, it is represented by a singleLineCharacter (isMultiLineCharacter = false)
	// NOTE: 
	// The reason why we use this flag is that. for a multiLineCharacter, we do not want to list 
	// all the possible combination of 4*35, which would be 140 possibilities)
	private Boolean isMultiLineCharacter = Boolean.FALSE; // By default, it is a single line character
	// NOTE: If it is multi line character, we need to know the row and column count
	private Integer rowCount = null;
	private Integer columnCount = null;

	private CharacterSet characterSet;

	public PredefinedCharacter setCharacter(CharacterSet characterSet) {
		this.characterSet = characterSet;
		return this;
	}

	public PredefinedCharacter setMultiLineCharacter(Boolean isMultiLineCharacter) {
		this.isMultiLineCharacter = isMultiLineCharacter;
		return this;
	}

	public PredefinedCharacter setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
		return this;
	}

	public PredefinedCharacter setColumnCount(Integer columnCount) {
		this.columnCount = columnCount;
		return this;
	}

	public Integer getRowCount() {
		return this.rowCount;
	}

	public Integer getColumnCount() {
		return this.columnCount;
	}

	public static PredefinedCharacter newPredefinedCharacter(CharacterSet ch, Integer rowCount, Integer columnCount) {
		return (new PredefinedCharacter()).setCharacter(ch).setMultiLineCharacter(true).setRowCount(rowCount).setColumnCount(columnCount);
	}

	public static PredefinedCharacter newPredefinedCharacter(CharacterSet ch, Boolean isMultiLineCharacter) {
		return (new PredefinedCharacter()).setCharacter(ch).setMultiLineCharacter(isMultiLineCharacter);
	}

	public static PredefinedCharacter newPredefinedCharacter(CharacterSet ch) {
		return newPredefinedCharacter(ch, Boolean.FALSE);
	}

	public Boolean contains(java.lang.Character ch) {
		List<Character> characterList = characterSet.getCharacterSet();
		if (characterList != null && characterList.size() > 0) {
			for (Character character : characterList) {
				if (character == ch) {
					return true;
				}
			}
		}
		return false;
	}

	public Boolean isMultiLineCharacter() {
		return this.isMultiLineCharacter;
	}

	public String toString() {
		// TODO: characterSet.getCharacterSet().toString() prints out too much log
		//		return characterSet.getCharacterSet().toString();
		return characterSet.getClass().getName();
	}

	public String toVerboseString() {
		return characterSet.getCharacterSet().toString();
	}
}
