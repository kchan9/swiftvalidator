package net.uglobal.swiftvalidator.swift.model;

import java.util.ArrayList;
import java.util.List;

public class SwiftBlock4 extends SwiftBlock {

	private List<Tag> tags;

	private SwiftBlock4() {
	}

	public SwiftBlock4(String unparsedText) {
		super(unparsedText);
	}

	@Override
	protected void preconditionCheck() {
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	@Override
	protected void parseDetails() {

		if (unparsedText.indexOf(":") != 0) {
			// error
			return;
		}

		int tagNameCounter = 0;
		int tagValueCounter = 0;
		int tagNameStartIdx = 0;
		int tagNameEndIdx = 0;
		int tagValueStartIdx = 0;
		int tagValueEndIdx = 0;
		int counter = 0;

		List<String> tagNames = new ArrayList<String>();
		List<String> tagValues = new ArrayList<String>();

		Character previousChar = null;
		for (Character currentChar : unparsedText.toCharArray()) {
			// tag name starts
			if (currentChar == ':' && (previousChar == null || previousChar == '\r' || previousChar == '\n') && tagNameCounter == 0) {
				tagNameStartIdx = counter;
				tagNameCounter++;
			} else if (currentChar == ':' && tagNameCounter == 1) {
				tagNameEndIdx = counter;
				tagValueStartIdx = counter + 1;
				tagNameCounter--;
				tagValueCounter++;
				logger.debug("tagName=" + unparsedText.substring(tagNameStartIdx + 1, tagNameEndIdx));
				tagNames.add(unparsedText.substring(tagNameStartIdx + 1, tagNameEndIdx));
			}
			// 
			else if ((currentChar == '\r' || currentChar == '\n')
					&& tagValueCounter == 1
					&& (((unparsedText.length() == counter + 1) || unparsedText.length() > counter + 1 && unparsedText.charAt(counter + 1) == ':') || ((unparsedText
							.length() == counter + 2) || unparsedText.length() > counter + 2 && unparsedText.charAt(counter + 2) == ':'))) {
				tagValueEndIdx = counter;
				tagValueCounter--;
				logger.debug("tagValue=" + unparsedText.substring(tagValueStartIdx, tagValueEndIdx));
				tagValues.add(unparsedText.substring(tagValueStartIdx, tagValueEndIdx));
			}
			previousChar = currentChar;
			counter++;
		}

		//		List<Tag> tags = null;
		if (tagNames.size() == tagValues.size() && tagNames.size() > 0) {
			this.tags = new ArrayList<Tag>();
			for (int i = 0; i < tagNames.size(); i++) {
				this.tags.add(new Tag(tagNames.get(i), tagValues.get(i)));
			}
		}
	}

	@Override
	protected void validate() {
		// TODO: 
	}
}
