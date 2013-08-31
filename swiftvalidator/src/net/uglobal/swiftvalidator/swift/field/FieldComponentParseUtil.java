package net.uglobal.swiftvalidator.swift.field;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.field.util.FieldFormatUtil;

import org.apache.commons.lang.StringUtils;

public final class FieldComponentParseUtil {
	private static final String BLANK = "";
	private static final String EOL = "\r\n";

	public static List<String> parse(String validateData, String format) {

		final List<String> components = new ArrayList<String>();
		// TODO: some of the parseFormat implementation are the same, need to figure out the common codes, and reuse them, 
		//       instead of making a new implementation for each format
		switch (FieldComponentsFormat.getType(format)) {
		case FORMAT001:
			parseFormat1(validateData, components);
			break;
		case FORMAT002:
			parseFormat2(validateData, components);
			break;
		case FORMAT003:
			parseFormat3(validateData, components);
			break;
		case FORMAT004:
			parseFormat4(validateData, components);
			break;
		case FORMAT005:
			parseFormat5(validateData, components);
			break;
		case FORMAT006:
			parseFormat6(validateData, components);
			break;
		case FORMAT007:
			parseFormat7(validateData, components);
			break;
		case FORMAT008:
			parseFormat8(validateData, components);
			break;
		case FORMAT009:
			parseFormat9(validateData, components);
			break;
		case FORMAT010:
			parseFormat10(validateData, components);
			break;
		case FORMAT011:
			parseFormat11(validateData, components);
			break;
		case FORMAT012:
			parseFormat12(validateData, components);
			break;
		case FORMAT013:
			parseFormat13(validateData, components);
			break;
		case FORMAT014:
			parseFormat14(validateData, components);
			break;
		case FORMAT015:
			parseFormat15(validateData, components);
			break;
		case FORMAT016:
			parseFormat16(validateData, components);
			break;
		case FORMAT017:
			parseFormat17(validateData, components);
			break;
		case FORMAT018:
			parseFormat18(validateData, components);
			break;
		case FORMAT019:
			parseFormat19(validateData, components);
			break;
		case FORMAT020:
			parseFormat20(validateData, components);
			break;
		case FORMAT021:
			parseFormat21(validateData, components);
			break;
		case FORMAT022:
			parseFormat22(validateData, components);
			break;
		case FORMAT023:
			parseFormat23(validateData, components);
			break;
		case FORMAT024:
			parseFormat24(validateData, components);
			break;
		case FORMAT025:
			parseFormat25(validateData, components);
			break;
		case FORMAT026:
			parseFormat26(validateData, components);
			break;
		case FORMAT027:
			parseFormat27(validateData, components);
			break;
		case FORMAT028:
			parseFormat28(validateData, components);
			break;
		case FORMAT029:
			parseFormat29(validateData, components);
			break;
		case FORMAT030:
			parseFormat30(validateData, components);
			break;
		case FORMAT031:
			parseFormat31(validateData, components);
			break;
		case FORMAT032:
			parseFormat32(validateData, components);
			break;
		case FORMAT033:
			parseFormat33(validateData, components);
			break;
		case FORMAT034:
			parseFormat34(validateData, components);
			break;
		case FORMAT035:
			parseFormat35(validateData, components);
			break;
		case FORMAT036:
			parseFormat36(validateData, components);
			break;
		case FORMAT037:
			parseFormat37(validateData, components);
			break;
		case FORMAT038:
			parseFormat38(validateData, components);
			break;
		case FORMAT039:
			parseFormat39(validateData, components);
			break;
		case FORMAT040:
			parseFormat40(validateData, components);
			break;
		case FORMAT041:
			parseFormat41(validateData, components);
			break;
		case FORMAT042:
			parseFormat42(validateData, components);
			break;
		case FORMAT043:
			parseFormat43(validateData, components);
			break;
		case FORMAT044:
			parseFormat44(validateData, components);
			break;
		case FORMAT045:
			parseFormat45(validateData, components);
			break;
		case FORMAT046:
			parseFormat46(validateData, components);
			break;
		case FORMAT047:
			parseFormat47(validateData, components);
			break;
		case FORMAT048:
			parseFormat48(validateData, components);
			break;
		case FORMAT049:
			parseFormat49(validateData, components);
			break;
		case FORMAT050:
			parseFormat50(validateData, components);
			break;
		case FORMAT051:
			parseFormat51(validateData, components);
			break;
		case FORMAT052:
			parseFormat52(validateData, components);
			break;
		case FORMAT053:
			parseFormat53(validateData, components);
			break;
		case FORMAT054:
			parseFormat54(validateData, components);
			break;
		case FORMAT055:
			parseFormat55(validateData, components);
			break;
		case FORMAT056:
			parseFormat56(validateData, components);
			break;
		case FORMAT057:
			parseFormat57(validateData, components);
			break;
		case FORMAT058:
			parseFormat58(validateData, components);
			break;
		case FORMAT059:
			parseFormat59(validateData, components);
			break;
		case FORMAT060:
			parseFormat60(validateData, components);
			break;
		case FORMAT061:
			parseFormat61(validateData, components);
			break;
		case FORMAT062:
			parseFormat62(validateData, components);
			break;
		case FORMAT063:
			parseFormat63(validateData, components);
			break;
		case FORMAT064:
			parseFormat64(validateData, components);
			break;
		case FORMAT065:
			parseFormat65(validateData, components);
			break;
		case FORMAT066:
			parseFormat66(validateData, components);
			break;
		case FORMAT067:
			parseFormat67(validateData, components);
			break;
		case FORMAT068:
			parseFormat68(validateData, components);
			break;
		case FORMAT069:
			parseFormat69(validateData, components);
			break;
		case FORMAT070:
			parseFormat70(validateData, components);
			break;
		case FORMAT071:
			parseFormat71(validateData, components);
			break;
		case FORMAT072:
			parseFormat72(validateData, components);
			break;
		case FORMAT073:
			parseFormat73(validateData, components);
			break;
		case FORMAT074:
			parseFormat74(validateData, components);
			break;
		case FORMAT075:
			parseFormat75(validateData, components);
			break;
		case FORMAT076:
			parseFormat76(validateData, components);
			break;
		case FORMAT077:
			parseFormat77(validateData, components);
			break;
		case FORMAT078:
			parseFormat78(validateData, components);
			break;
		case FORMAT079:
			parseFormat79(validateData, components);
			break;
		case FORMAT080:
			parseFormat80(validateData, components);
			break;
		case FORMAT081:
			parseFormat81(validateData, components);
			break;
		case FORMAT082:
			parseFormat82(validateData, components);
			break;
		case FORMAT083:
			parseFormat83(validateData, components);
			break;
		case FORMAT084:
			parseFormat84(validateData, components);
			break;
		case FORMAT085:
			parseFormat85(validateData, components);
			break;
		case FORMAT086:
			parseFormat86(validateData, components);
			break;
		case FORMAT087:
			parseFormat87(validateData, components);
			break;
		case FORMAT088:
			parseFormat88(validateData, components);
			break;
		case FORMAT089:
			parseFormat89(validateData, components);
			break;
		case FORMAT090:
			parseFormat90(validateData, components);
			break;
		case FORMAT091:
			parseFormat91(validateData, components);
			break;
		case FORMAT092:
			parseFormat92(validateData, components);
			break;
		case FORMAT093:
			parseFormat93(validateData, components);
			break;
		case FORMAT094:
			parseFormat94(validateData, components);
			break;
		case FORMAT095:
			parseFormat95(validateData, components);
			break;
		case FORMAT096:
			parseFormat96(validateData, components);
			break;
		case FORMAT097:
			parseFormat97(validateData, components);
			break;
		case FORMAT098:
			parseFormat98(validateData, components);
			break;
		case FORMAT099:
			parseFormat99(validateData, components);
			break;
		case FORMAT100:
			parseFormat100(validateData, components);
			break;
		case FORMAT101:
			parseFormat101(validateData, components);
			break;
		case FORMAT102:
			parseFormat102(validateData, components);
			break;
		case FORMAT103:
			parseFormat103(validateData, components);
			break;
		case FORMAT104:
			parseFormat104(validateData, components);
			break;
		case FORMAT105:
			parseFormat105(validateData, components);
			break;
		case FORMAT106:
			parseFormat106(validateData, components);
			break;
		}

		return components;
	}

	private static void parseFormat1(String validateData, List<String> components) {
		// :4!c//3!c
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);

		components.add(component1);
		components.add(component2);
	}

	// :4!c/[8c]/30x
	private static void parseFormat2(String validateData, List<String> components) {

		String component1 = validateData.substring(1, 5);
		String component2;
		String component3;

		String subStr1 = validateData.substring(6, validateData.length());

		int idx = -1;
		if ((idx = subStr1.indexOf("/")) == 0) {
			// no component2
			component2 = BLANK;
			component3 = subStr1.substring(1, subStr1.length());
		} else {
			component2 = subStr1.substring(0, idx);
			component3 = subStr1.substring(idx + 1, subStr1.length());
		}

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	// :4!c//16x
	private static void parseFormat3(String validateData, List<String> components) {
		// NOTE: cannot use split(), because x characterset can have '/' in it.

		// qualifier / reference
		//
		// component pattern
		// :S//S

		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, validateData.length());

		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat4(String validateData, List<String> components) {
		// :4!c/[8c]/4!c		
		// qualifier / data source scheme / indicator

		String component1 = validateData.substring(1, 5);
		String subStr1 = validateData.substring(6, validateData.length());

		String component2;
		String component3;

		int idx = -1;
		if ((idx = subStr1.indexOf("/")) == 0) {
			// no component2
			component2 = BLANK;
			component3 = subStr1.substring(1, subStr1.length());
		} else {
			component2 = subStr1.substring(0, idx);
			component3 = subStr1.substring(idx + 1, subStr1.length());
		}

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat5(String validateData, List<String> components) {
		// 4!c[/4!c]
		// TODO: use indexOf instead of split. it's faster
		String[] tokens = validateData.split("/");
		String component1 = tokens[0];
		String component2 = tokens.length > 1 ? tokens[1] : BLANK;

		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat6(String validateData, List<String> components) {
		// :4!c//8!n

		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 15);

		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat7(String validateData, List<String> components) {
		// :4!c//8!n6!n
		// qualifier / date / time
		//
		// component pattern
		// :S//SS
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 15);
		String component3 = validateData.substring(15, 21);

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat8(String validateData, List<String> components) {
		// formatString
		// :4!c//8!n6!n[,3n][/[N]2!n[2!n]]
		// qualifier / date / time / decimals / UTC indicator

		String qualifier = validateData.substring(1, 5);

		String date = validateData.substring(7, 15);

		String time = validateData.substring(15, 21);

		// 
		String utcIndicator = BLANK;
		String decimals = BLANK;

		String subStr = validateData.substring(21, validateData.length());
		// has decimals
		if (subStr.startsWith(",")) {
			// has UTCInd
			int slashIdx = -1;
			if ((slashIdx = subStr.indexOf("/")) != -1) {
				decimals = subStr.substring(0, slashIdx);

				String utcIndSubStr = subStr.substring(slashIdx + 1, subStr.length());
				if (utcIndSubStr.startsWith("N")) {
					utcIndicator = "-" + utcIndSubStr.substring(1, utcIndSubStr.length());
				} else {
					utcIndicator = "+" + utcIndSubStr.substring(0, utcIndSubStr.length());
				}
			}
			// no UTCInd
			else {
				decimals = subStr;
			}

		}
		// no decimals
		else if (subStr.startsWith("/")) {
			if (subStr.indexOf("N") != -1) {
				utcIndicator = "-" + subStr.substring(2, subStr.length());
			} else {
				utcIndicator = "+" + subStr.substring(1, subStr.length());
			}
		}

		// --
		components.add(qualifier);
		components.add(date);
		components.add(time);
		components.add(decimals);
		components.add(utcIndicator);
	}

	private static void parseFormat9(String validateData, List<String> components) {
		// :4!c//3!n
		// qualifier / number

		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat10(String validateData, List<String> components) {
		// :4!c//4!c/15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 11);
		String component3 = validateData.substring(12, validateData.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);

	}

	private static void parseFormat11(String validateData, List<String> components) {
		// :4!c//4!c/3!a15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 11);
		String component3 = validateData.substring(12, 15);
		String component4 = validateData.length() > 17 ? validateData.substring(15, validateData.length()) : "";
		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat12(String validateData, List<String> components) {
		// :4!c//[N]3!n
		String component1 = validateData.substring(1, 5);
		String component2;
		String component3;
		String tail = validateData.substring(7, validateData.length());
		if (tail.startsWith("N")) {
			component2 = "-";
			component3 = tail.substring(1, tail.length());
		} else {
			component2 = "+";
			component3 = tail.substring(0, tail.length());
		}
		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat13(String validateData, List<String> components) {
		// :4!c//3!a
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);
		//		if ((validateData.length() >= 5)) {
		//			component1 = validateData.substring(1, 5);
		//			if (validateData.length() >= 10) {
		//				component2 = validateData.substring(7, 10);
		//			}
		//		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat14(String validateData, List<String> components) {
		// :4!c//6!c
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 13);
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat15(String validateData, List<String> components) {
		// :4!c//1!a
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 8);
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat16(String validateData, List<String> components) {
		// :4!c//[N]3!a15d
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		String component3 = "";
		String component4 = "";

		Boolean hasSign = false;
		if (validateData.subSequence(7, 8).equals("N")) {
			if (validateData.length() >= 11) {
				// check if the 11th char is upper case or not
				String c = validateData.substring(10, 11);
				if (FieldFormatUtil.isUppercaseLetter(c.charAt(0))) {
					hasSign = true;
				}
				// else hasSign = false;
			}
			// else hasSign = false;
		}
		// else hasSign = false;

		if (hasSign) {
			component2 = "-";
			component3 = validateData.substring(8, 11);
			component4 = validateData.substring(11, validateData.length());
		} else {
			component2 = "+";
			component3 = validateData.substring(7, 10);
			component4 = validateData.substring(10, validateData.length());
		}
		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat17(String validateData, List<String> components) {
		// :4!c//4*35x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat18(String validateData, List<String> components) {
		// :4!c/[8c]/4!c/35x
		String component1 = validateData.substring(1, 5);

		String tmp1 = validateData.substring(6, validateData.length());
		int idx1 = tmp1.indexOf("/");
		String component2 = tmp1.substring(0, idx1);

		String tmp2 = tmp1.substring(idx1 + 1, tmp1.length());
		int idx2 = tmp2.indexOf("/");
		String component3 = tmp2.substring(0, idx2);
		String component4 = tmp2.substring(idx2 + 1, tmp2.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat19(String validateData, List<String> components) {
		// :4!c//34x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat20(String validateData, List<String> components) {
		// :4!c//35x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat21(String validateData, List<String> components) {
		// :4!c/8c/34x
		String component1 = validateData.substring(1, 5);

		String tmp1 = validateData.substring(6, validateData.length());
		int idx1 = tmp1.indexOf("/");
		String component2 = tmp1.substring(0, idx1);
		String component3 = tmp1.substring(idx1 + 1, tmp1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat22(String validateData, List<String> components) {
		// :4!c//4!a2!a2!c[3!c]
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat23(String validateData, List<String> components) {
		// :4!c//4!c/4!a2!a2!c[3!c]
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 11);
		String component3 = validateData.substring(12, validateData.length());
		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat24(String validateData, List<String> components) {
		// :4!c//2!a
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, validateData.length());

		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat25(String validateData, List<String> components) {
		// :4!c/[8c]/4!c[/30x]
		String component1 = validateData.substring(1, 5);

		// tmp1 = [8c]/4!c[/30x]
		String tmp1 = validateData.substring(6, validateData.length());
		int idx1 = tmp1.indexOf("/");
		String component2 = tmp1.substring(0, idx1);

		// tmp2 = 4!c[/30x]
		String tmp2 = tmp1.substring(idx1 + 1, tmp1.length());
		int idx2 = tmp2.indexOf("/");
		String component3 = tmp2.substring(0, 4);

		String component4 = "";
		if (tmp2.length() > 5) {
			component4 = tmp2.substring(5, tmp2.length());
		}

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat26(String validateData, List<String> components) {
		// :4!c/[8c]/24x
		String component1 = validateData.substring(1, 5);

		// tmp1 = [8c]/24x
		String tmp1 = validateData.substring(6, validateData.length());
		int idx1 = tmp1.indexOf("/");

		String component2 = tmp1.substring(0, idx1);
		String component3 = tmp1.substring(idx1 + 1, tmp1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat27(String validateData, List<String> components) {
		// :4!c//3!a/3!a/15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);
		String component3 = validateData.substring(11, 14);
		String component4 = validateData.substring(15, validateData.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat28(String validateData, List<String> components) {
		// :4!c//[N]15d
		String component1 = validateData.substring(1, 5);

		String component2 = "";
		String component3 = "";
		if (validateData.length() > 7) {
			String sign = validateData.substring(7, 8);
			if (sign.equals("N")) {
				component2 = "-";
				component3 = validateData.substring(8, validateData.length());
			} else {
				component2 = "+";
				component3 = validateData.substring(7, validateData.length());
			}
		}
		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat29(String validateData, List<String> components) {
		// :4!c//10*35x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat30(String validateData, List<String> components) {
		// :4!c//6*35x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat31(String validateData, List<String> components) {
		// [ISIN1!e12!c1!r1!w][4*35x]
		String component1 = BLANK;
		String component2 = BLANK;
		if (validateData.startsWith("ISIN")) {
			int idx1 = validateData.indexOf(EOL);
			if (idx1 != -1) {
				component1 = validateData.substring(0, idx1);
				component2 = validateData.substring(idx1 + 2, validateData.length());
			} else {
				component1 = validateData;
			}
		} else {
			component2 = validateData;
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat32(String validateData, List<String> components) {
		// :4!c/[8c]/4!c/2!a/30x
		String component1 = validateData.substring(1, 5);

		// [8c]/4!c/2!a/30x
		String tmp1 = validateData.substring(6, validateData.length());
		int idx1 = tmp1.indexOf("/");
		String component2 = tmp1.substring(0, idx1);

		// 4!c/2!a/30x
		String tmp2 = tmp1.substring(idx1 + 1, tmp1.length());
		String component3 = tmp2.substring(0, 4);
		String component4 = tmp2.substring(5, 7);
		String component5 = tmp2.substring(8, tmp2.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
	}

	private static void parseFormat33(String validateData, List<String> components) {
		// :4!c//4!c
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 11);
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat34(String validateData, List<String> components) {
		// :4!c//4!c/15d
		String component3 = BLANK;
		String component4 = null;
		if (validateData.charAt(12) == 'N') {
			component3 = validateData.substring(12, 13);
			component4 = validateData.substring(13, validateData.length());
		} else {
			component4 = validateData.substring(12, validateData.length());
		}
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 11));
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat35(String validateData, List<String> components) {
		// :4!c//4!c/4!c/[N]15d
		String component4 = BLANK;
		String component5 = null;
		if (validateData.charAt(17) == 'N') {
			component4 = validateData.substring(17, 18);
			component5 = validateData.substring(18, validateData.length());
		} else {
			component5 = validateData.substring(17, validateData.length());
		}
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 11));
		components.add(validateData.substring(12, 16));
		components.add(component4);
		components.add(component5);
	}

	private static void parseFormat36(String validateData, List<String> components) {
		// :4!c/[8c]/4!c/[N]15d
		final String subStr1 = validateData.substring(6, validateData.length());

		String component2 = BLANK;
		String component3 = null;

		int idx = subStr1.indexOf("/");
		int nextIdx = idx + 5;
		if (idx == 0) {
			// no component2
			component3 = subStr1.substring(1, nextIdx);
		} else {
			component2 = subStr1.substring(0, idx);
			component3 = subStr1.substring(idx + 1, nextIdx);
		}
		String component4 = BLANK;
		String component5 = null;
		if (subStr1.charAt(nextIdx + 1) == 'N') {
			component4 = subStr1.substring(nextIdx + 1, nextIdx + 2);
			component5 = subStr1.substring(nextIdx + 2, subStr1.length());
		} else {
			// no component4
			component5 = subStr1.substring(nextIdx + 1, subStr1.length());
		}
		components.add(validateData.substring(1, 5));
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
	}

	private static void parseFormat37(String validateData, List<String> components) {
		// :4!c//15d/15d
		final String subStr1 = validateData.substring(7, validateData.length());
		int idx = subStr1.indexOf("/");

		components.add(validateData.substring(1, 5));
		components.add(subStr1.substring(0, idx));
		components.add(subStr1.substring(idx + 1, subStr1.length()));
	}

	private static void parseFormat38(String validateData, List<String> components) {
		// :4!c//8!n/8!n
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 15));
		components.add(validateData.substring(16, validateData.length()));
	}

	private static void parseFormat39(String validateData, List<String> components) {
		// :4!c//8!n6!n/8!n6!n
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 15));
		components.add(validateData.substring(15, 21));
		components.add(validateData.substring(22, 30));
		components.add(validateData.substring(30, validateData.length()));
	}

	private static void parseFormat40(String validateData, List<String> components) {
		// :4!c//8!n/4!c
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 15));
		components.add(validateData.substring(16, validateData.length()));
	}

	private static void parseFormat41(String validateData, List<String> components) {
		// :4!c//8!n6!n/4!c
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 15));
		components.add(validateData.substring(15, 21));
		components.add(validateData.substring(22, validateData.length()));
	}

	private static void parseFormat42(String validateData, List<String> components) {
		// :4!c//4!c/8!n
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 11));
		components.add(validateData.substring(12, validateData.length()));
	}

	private static void parseFormat43(String validateData, List<String> components) {
		// :4!c//4!c/8!n6!n
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 11));
		components.add(validateData.substring(12, 20));
		components.add(validateData.substring(20, validateData.length()));
	}

	private static void parseFormat44(String validateData, List<String> components) {
		// :4!c//3!a15d
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, 10));
		components.add(validateData.substring(10, validateData.length()));
	}

	private static void parseFormat45(String validateData, List<String> components) {
		// :4!c/[8c]/4!c /3!a15d[/4!c]
		String component1 = validateData.substring(1, 5);
		String subStr1 = validateData.substring(6, validateData.length());

		String component2 = BLANK;
		String component3;

		int idx = subStr1.indexOf("/");
		int idx2 = 0;
		if (idx == 0) {
			// no component2
			component3 = subStr1.substring(1, 5);
			idx2 = 5;
		} else {
			component2 = subStr1.substring(0, idx);
			component3 = subStr1.substring(idx + 1, idx + 5);
			idx2 = idx + 5;
		}

		String subStr2 = subStr1.substring(idx2 + 1, subStr1.length());
		String component4 = subStr2.substring(0, 3);
		int idx3 = subStr2.indexOf("/");
		String component5 = null;
		String component6 = BLANK;
		if (idx3 != -1) {
			component5 = subStr2.substring(3, idx3);
			component6 = subStr2.substring(idx3 + 1, subStr2.length());
		} else {
			component5 = subStr2.substring(3, subStr2.length());
		}

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
		components.add(component6);
	}

	private static void parseFormat46(String validateData, List<String> components) {
		// :4!c//3!a15d/15d
		String subStr1 = validateData.substring(10, validateData.length());
		int idx = subStr1.indexOf("/");

		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);
		String component3 = subStr1.substring(0, idx);
		String component4 = subStr1.substring(idx + 1, subStr1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat47(String validateData, List<String> components) {
		// :4!c//2*35x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat48(String validateData, List<String> components) {
		// :4!c/[8c]/4!c6!n
		String component1 = validateData.substring(1, 5);
		String subStr1 = validateData.substring(6, validateData.length());

		String component2;
		String component3;
		String component4;
		int idx = subStr1.indexOf("/");
		if (idx == 0) {
			// no component2
			component2 = BLANK;
			component3 = subStr1.substring(1, 5);
			component4 = subStr1.substring(5, subStr1.length());
		} else {
			component2 = subStr1.substring(0, idx);
			component3 = subStr1.substring(idx + 1, idx + 5);
			component4 = subStr1.substring(idx + 5, subStr1.length());
		}

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat49(String validateData, List<String> components) {
		// :4!c//4!c/3!a15d/4!c/15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 11);
		String component3 = validateData.substring(12, 15);

		String substr1 = validateData.substring(15, validateData.length());
		int idx = substr1.indexOf("/");
		String component4 = substr1.substring(0, idx);
		String component5 = substr1.substring(idx + 1, idx + 5);
		String component6 = substr1.substring(idx + 6, substr1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
		components.add(component6);
	}

	private static void parseFormat50(String validateData, List<String> components) {
		// :4!c//4!c/3!a15d/3!a15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 11);
		String component3 = validateData.substring(12, 15);

		String substr1 = validateData.substring(15, validateData.length());
		int idx = substr1.indexOf("/");
		String component4 = substr1.substring(0, idx);
		String component5 = substr1.substring(idx + 1, idx + 4);
		String component6 = substr1.substring(idx + 4, substr1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
		components.add(component6);
	}

	private static void parseFormat51(String validateData, List<String> components) {
		// :4!c//3!a15d/3!a15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);

		String substr1 = validateData.substring(10, validateData.length());
		int idx = substr1.indexOf("/");
		String component3 = substr1.substring(0, idx);
		String component4 = substr1.substring(idx + 1, idx + 4);
		String component5 = substr1.substring(idx + 4, substr1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
	}

	private static void parseFormat52(String validateData, List<String> components) {
		// :4!c//15d/3!a15d
		String component1 = validateData.substring(1, 5);

		String substr1 = validateData.substring(7, validateData.length());
		int idx = substr1.indexOf("/");
		String component2 = substr1.substring(0, idx);
		String component3 = substr1.substring(idx + 1, idx + 4);
		String component4 = substr1.substring(idx + 4, substr1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
	}

	private static void parseFormat53(String validateData, List<String> components) {
		// :4!c//15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, validateData.length());

		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat54(String validateData, List<String> components) {
		// :4!c//10*35z
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat55(String validateData, List<String> components) {
		// :4!c//25x
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, validateData.length());

		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat56(String validateData, List<String> components) {
		// :4!c//[2!a]/35x
		String component1 = validateData.substring(1, 5);
		String substr1 = validateData.substring(7, validateData.length());

		int idx = substr1.indexOf("/");

		String component2 = substr1.substring(0, idx);
		String component3 = substr1.substring(idx + 1, substr1.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat57(String validateData, List<String> components) {
		// :4!c//3*35x
		String component1 = validateData.substring(1, 5);
		String component2 = "";
		if (validateData.length() > 7) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat58(String validateData, List<String> components) {
		// 5n/4!c
		int idx = validateData.indexOf("/");
		String component1 = validateData.substring(0, idx);
		String component2 = validateData.substring(idx + 1, validateData.length());
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat59(String validateData, List<String> components) {
		// 16x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat60(String validateData, List<String> components) {
		// 6!n
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat61(String validateData, List<String> components) {
		// 6*35x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat62(String validateData, List<String> components) {
		// [N]3!a15d
		if (validateData.charAt(0) == 'N') {
			components.add("N");
			components.add(validateData.substring(1, 4));
			components.add(validateData.substring(4, validateData.length()));
		} else {
			components.add(BLANK);
			components.add(validateData.substring(0, 3));
			components.add(validateData.substring(3, validateData.length()));
		}
	}

	private static void parseFormat63(String validateData, List<String> components) {
		// 3!a15d
		components.add(validateData.substring(0, 3));
		components.add(validateData.substring(3, validateData.length()));
	}

	private static void parseFormat64(String validateData, List<String> components) {
		// 5n[/2n]
		int idx = validateData.indexOf("/");
		if (idx == -1) {
			components.add(validateData == null ? BLANK : validateData);
			components.add(BLANK);
		} else {
			components.add(validateData.substring(0, idx));
			components.add(validateData.substring(idx + 1, validateData.length()));
		}
		System.out.println("");
	}

	private static void parseFormat65(String validateData, List<String> components) {
		// 35*50x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat66(String validateData, List<String> components) {
		// 17d
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat67(String validateData, List<String> components) {
		// [/1!a][/34x]
		// 4!a2!a2!c[3!c]
		int idx = validateData.indexOf(EOL);
		String component1 = BLANK;
		String component2 = BLANK;
		if (idx == -1) {
			component2 = validateData;
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat68(String validateData, List<String> components) {
		// /34x
		components.add(validateData.substring(1, validateData.length()));
	}

	private static void parseFormat69(String validateData, List<String> components) {
		// [/1!a][/34x]
		// 4*35x
		String component1 = BLANK;
		String component2 = BLANK;
		int idx = validateData.indexOf(EOL);
		if (idx == -1) {
			if (validateData.indexOf("/") != -1) {
				component1 = validateData;
			} else {
				component2 = validateData;
			}
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat70(String validateData, List<String> components) {
		// [/1!a][/34x]
		// [35x]
		String component1 = BLANK;
		String component2 = BLANK;
		int idx = validateData.indexOf(EOL);
		if (idx == -1) {
			if (validateData.indexOf("/") != -1) {
				component1 = validateData;
			} else {
				component2 = validateData;
			}
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat71(String validateData, List<String> components) {
		// 3!c
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat72(String validateData, List<String> components) {
		// 6*50x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat73(String validateData, List<String> components) {
		// 3!a 15d [1!a]
		String component1 = validateData.substring(0, 3);
		String component2 = BLANK;
		String component3 = BLANK;

		String lastChar = validateData.substring(validateData.length() - 1, validateData.length());
		if (StringUtils.isNumeric(lastChar) || lastChar.equals(",")) {
			component2 = validateData.substring(3, validateData.length());
		} else {
			component2 = validateData.substring(3, validateData.length() - 1);
			component3 = lastChar;
		}
		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat74(String validateData, List<String> components) {
		// 4*35x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat75(String validateData, List<String> components) {
		// 12d
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat76(String validateData, List<String> components) {
		// 6!n3!a15d
		components.add(validateData.substring(0, 6));
		components.add(validateData.substring(6, 9));
		components.add(validateData.substring(9, validateData.length()));
	}

	private static void parseFormat77(String validateData, List<String> components) {
		// 6!n[/6!n][//35x]
		components.add(validateData.substring(0, 6));

		String component2 = BLANK;
		String component3 = BLANK;
		if (validateData.charAt(7) == '/') {
			component3 = validateData.substring(8, validateData.length());
		} else {
			component2 = validateData.substring(7, 13);
			if (validateData.length() > 13) {
				component3 = validateData.substring(15, validateData.length());
			}
		}
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat78(String validateData, List<String> components) {
		// :4!c//5!c
		components.add(validateData.substring(1, 5));
		components.add(validateData.substring(7, validateData.length()));

		System.out.println(components);
	}

	private static void parseFormat79(String validateData, List<String> components) {
		// 12d[// 6!n 1!a 3n][/16x]
		// (Rate)(End Date)(Period)(Number)(Information)
		String component1 = BLANK;
		String component2 = BLANK;
		String component3 = BLANK;
		String component4 = BLANK;
		String component5 = BLANK;
		int idx = validateData.indexOf("//");

		if (idx != -1) {
			component1 = validateData.substring(0, idx);
			String s1 = validateData.substring(idx + 2, validateData.length());

			int idx2 = s1.indexOf("/");
			component2 = s1.substring(0, 6);
			component3 = s1.substring(6, 7);
			component4 = s1.substring(7, idx2);
			if (idx2 != -1) {
				component5 = s1.substring(idx2 + 1, s1.length());
			}
		} else {
			int idx3 = validateData.indexOf("/");
			if (idx3 != -1) {
				component1 = validateData.substring(0, idx3);
				component5 = validateData.substring(idx3 + 1, validateData.length());
			} else {
				component1 = validateData;
			}
		}

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		components.add(component5);
	}

	private static void parseFormat80(String validateData, List<String> components) {
		// 6!n[29x]
		components.add(validateData.substring(0, 6));
		components.add(validateData.substring(6, validateData.length()));
		System.out.println(components);
	}

	private static void parseFormat81(String validateData, List<String> components) {
		// [6!n[4!n]][7!a]
		// date time code
		// 0  - 
		// 6  - date
		// 10 - date time
		// 17 - date time code
		// 13 - date code
		// 7  - code
		String component1 = BLANK;
		String component2 = BLANK;
		String component3 = BLANK;
		int length = validateData.length();
		if (length > 0) {
			boolean hasDate = StringUtils.isNumeric(validateData.substring(0, 1));
			boolean hasTime = length > 6 && StringUtils.isNumeric(validateData.substring(6, 7));
			boolean hasCode = (hasTime && length > 10) || (!hasTime && hasDate && length > 6) || (!hasTime && !hasDate && length > 1);

			if (hasDate) {
				component1 = validateData.substring(0, 6);
			} else {
				if (hasCode) {
					component3 = validateData;
				}
			}
			if (hasTime) {
				component2 = validateData.substring(6, 10);
				if (hasCode) {
					component3 = validateData.substring(10, length);
				}
			} else {
				if (hasDate && hasCode) {
					component3 = validateData.substring(6, length);
				}
			}
		}
		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat82(String validateData, List<String> components) {
		// :4!c//3!c/15d
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, 10);
		String component3 = validateData.substring(11, validateData.length());

		components.add(component1);
		components.add(component2);
		components.add(component3);
	}

	private static void parseFormat83(String validateData, List<String> components) {
		// :4!c//8000z
		String component1 = validateData.substring(1, 5);
		String component2 = validateData.substring(7, validateData.length());
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat84(String validateData, List<String> components) {
		// 6!n[/6!n]
		String component1 = validateData.substring(0, 6);
		String component2 = BLANK;
		if (validateData.length() > 6) {
			component2 = validateData.substring(7, validateData.length());
		}
		components.add(component1);
		components.add(component2);

		System.out.println(components);
	}

	private static void parseFormat85(String validateData, List<String> components) {
		// /8c/4!n1!x4!n
		String s1 = validateData.substring(1, validateData.length()); // strip the first character (the slash)
		int idx = s1.indexOf("/");
		String component1 = s1.substring(0, idx);
		String component2 = s1.substring(idx + 1, idx + 5);
		String component3 = s1.substring(idx + 5, idx + 6);
		String component4 = s1.substring(idx + 6, idx + 10);

		components.add(component1);
		components.add(component2);
		components.add(component3);
		components.add(component4);
		System.out.println(components);
	}

	private static void parseFormat86(String validateData, List<String> components) {
		// [/34x]
		// 4!a2!a2!c[3!c]
		int idx = validateData.indexOf(EOL);
		String component1 = BLANK;
		String component2 = BLANK;
		if (idx == -1) {
			component2 = validateData;
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat87(String validateData, List<String> components) {
		// 35x
		// 4*35x
		int idx = validateData.indexOf(EOL);
		String component1 = BLANK;
		String component2 = BLANK;
		if (idx == -1) {
			component2 = validateData;
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat88(String validateData, List<String> components) {
		// [/34x]
		// 4*35x
		int idx = validateData.indexOf(EOL);
		String component1 = BLANK;
		String component2 = BLANK;
		if (idx == -1) {
			component2 = validateData;
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat89(String validateData, List<String> components) {
		// 5n/5n
		int idx = validateData.indexOf("/");
		String component1 = validateData.substring(0, idx);
		String component2 = validateData.substring(idx + 1, validateData.length());
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat90(String validateData, List<String> components) {
		// /34x1!r1!w4!a2!a2!c[3!c]
		int idx = validateData.indexOf(EOL);
		String component1 = BLANK;
		String component2 = BLANK;
		if (idx == -1) {
			component2 = validateData;
		} else {
			component1 = validateData.substring(0, idx);
			component2 = validateData.substring(idx + 2, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat91(String validateData, List<String> components) {
		// 4!c[/30x]
		String component1 = validateData.substring(0, 4);
		String component2 = BLANK;
		//		Character ch = validateData.charAt(4);
		if (validateData.length() > 4 && validateData.charAt(4) == '/') {
			component2 = validateData.substring(5, validateData.length());
		}
		components.add(component1);
		components.add(component2);
	}

	private static void parseFormat92(String validateData, List<String> components) {
		// 35x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat93(String validateData, List<String> components) {
		// 4!a2!a2!c[3!c]
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat94(String validateData, List<String> components) {
		// 65x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat95(String validateData, List<String> components) {
		// 15d
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat96(String validateData, List<String> components) {
		// 4!c
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat97(String validateData, List<String> components) {
		// 4!a2!c4!n4!a2!c
		components.add(validateData.substring(0, 4));
		components.add(validateData.substring(4, 6));
		components.add(validateData.substring(6, 10));
		components.add(validateData.substring(10, 14));
		components.add(validateData.substring(14, 16));
	}

	private static void parseFormat98(String validateData, List<String> components) {
		// 1!a
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat99(String validateData, List<String> components) {
		// 5*40x
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat100(String validateData, List<String> components) {
		// 6a[/8!n][//4!n]
		int idx = validateData.indexOf("/");
		if (idx >= 0) {
			if (idx == 0) {
				components.add(BLANK); // component 1	
			} else {
				components.add(validateData.substring(0, idx)); // component 1	
			}
			if (validateData.charAt(idx + 1) == '/') {
				components.add(BLANK); // component 2
				components.add(validateData.substring(idx + 2, validateData.length())); // component 3
			} else {
				final String s1 = validateData.substring(idx + 1, validateData.length());
				int idx2 = s1.indexOf("/");
				if (idx2 == -1) {
					components.add(s1); // component 2
					components.add(BLANK); // component 3
				} else {
					components.add(s1.substring(0, idx2)); // component 2
					components.add(s1.substring(idx2 + 2, s1.length())); // component 3
				}
			}
		} else {
			components.add(validateData.substring(0, validateData.length())); // component 1
			components.add(BLANK); // component 2
			components.add(BLANK); // component 3
		}

		// TODO: 
		// test scenarios: 
		// 1) aaaaaa/BBBBBBBB//cccc
		// 2) aaaaaa/BBBBBBBB
		// 3) aaaaaa//cccc
		// 4) aaa/BBBBBBBB//cccc
		// 5) /BBBBBBBB//cccc
		// 6) /BBBBBBBB
		// 7) //cccc
		// 8) aaaaaa
	}

	private static void parseFormat101(String validateData, List<String> components) {
		// 8!n
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat102(String validateData, List<String> components) {
		// 4!c[/35x]
		components.add(validateData.substring(0, 4));
		if (validateData.length() > 5) {
			components.add(validateData.substring(5, validateData.length()));
		} else {
			components.add(BLANK);
		}
	}

	private static void parseFormat103(String validateData, List<String> components) {
		// 5n
		components.add(validateData == null ? BLANK : validateData);
	}

	private static void parseFormat104(String validateData, List<String> components) {
		// 8!n4!n
		components.add(validateData.substring(0, 8));
		components.add(validateData.substring(8, 12));
	}

	private static void parseFormat105(String validateData, List<String> components) {
		// 4!c/3!a15d
		components.add(validateData.substring(0, 4));
		components.add(validateData.substring(5, 8));
		components.add(validateData.substring(8, validateData.length()));
	}

	private static void parseFormat106(String validateData, List<String> components) {
		// 5n[/5n]
		int idx = validateData.indexOf("/");
		if (idx == -1) {
			components.add(validateData);
			components.add(BLANK);
		} else {
			components.add(validateData.substring(0, idx));
			components.add(validateData.substring(idx + 1, validateData.length()));
		}
	}

	public static void main(String argv[]) {
		// 5n[/5n]
		String validateData = "aaa";
		List<String> components = new ArrayList<String>();
		parseFormat106(validateData, components);
		System.out.println(components);
	}
}
