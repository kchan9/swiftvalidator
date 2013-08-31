package net.uglobal.swiftvalidator.characters;

import java.util.ArrayList;
import java.util.List;

public abstract class CharacterSet {
	protected List<java.lang.Character> characterSet = new ArrayList<java.lang.Character>();

	public List<java.lang.Character> getCharacterSet() {
		return this.characterSet;
	}
}
