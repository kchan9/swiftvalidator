package net.uglobal.swiftvalidator.xml.beans;

import java.util.ArrayList;
import java.util.List;

/*
 *     <options>
 *         <option name="A">
 *             <format>:4!c//8!n</format>
 *         </option>
 *         <option name="C">
 *             <format>:4!c//8!n6!n</format>
 *         </option>
 *         <option name="C">
 *             <format>:4!c//8!n6!n[.3][/[N]2!n[2!n]]</format>
 *         </option>
 *     </options>
 */
public class Options implements XmlBean {
	private final List<Option> optionList = new ArrayList<Option>();

	public void addOption(Option option) {
		this.optionList.add(option);
	}

	public List<Option> getOptionList() {
		return optionList;
	}

	public void setOptionList(List<Option> optionList) {
		for (Option option : optionList) {
			addOption(option);
		}
		//		this.optionList = optionList;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (getOptionList().size() > 0) {
			sb.append("[");
			for (Option option : getOptionList()) {
				sb.append("option=" + option + ", ");
			}
			//			sb.substring(0, sb.length() - 2);
			sb.delete(sb.length() - 2, sb.length());
			sb.append("]");
		}
		return sb.toString();
	}

}
