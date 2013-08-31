package net.uglobal.swiftvalidator.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class FieldFormatCharList extends ObservableList<Character> {

	private static final Logger logger = Logger.getLogger(FieldFormatCharList.class);

	List<Character> constantFieldHolder = new ArrayList<Character>();

	// Examples
	// :4!c//16x
	// 4!c[/4!c]
	// :4!c//8!n
	// :4!c//8!n6!n
	// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
	// :4!c//4!c/3!a15d
	public FieldFormatCharList(String s) {
		super();

		for (char c : s.toCharArray()) {
			add(c);
		}
	}

	@Override
	public void fireOnAdd(Character c) {
		logger.debug("fire " + c);
	}

	//	private List<Character> asList(final String str) {
	//		return new AbstractList<Character>() {
	//			public int size() {
	//				return str.length();
	//			}
	//
	//			public Character get(int index) {
	//				return str.charAt(index);
	//			}
	//
	//	 for Mutable
	//			public Character set(int index, Character newVal) {
	//				char[] arr = str.toCharArray();
	//
	//				char old = arr[index];
	//				arr[index] = newVal;
	//				return old;
	//			}
	//
	//		};
	//		return list;
	//	}
}
