package net.uglobal.swiftvalidator.swift.field;

import java.util.HashMap;
import java.util.Map;

// TODO: codegen?
public enum FieldComponentsFormat {
	// --
	FORMAT001(":4!c//3!c"), //
	FORMAT002(":4!c/[8c]/30x"), //
	FORMAT003(":4!c//16x"), //
	FORMAT004(":4!c/[8c]/4!c"), //
	FORMAT005("4!c[/4!c]"), //
	FORMAT006(":4!c//8!n"), //
	FORMAT007(":4!c//8!n6!n"), //
	FORMAT008(":4!c//8!n6!n[,3n][/[N]2!n[2!n]]"), //
	FORMAT009(":4!c//3!n"), //
	FORMAT010(":4!c//4!c/15d"), //
	FORMAT011(":4!c//4!c/3!a15d"), //
	FORMAT012(":4!c//[N]3!n"), //
	FORMAT013(":4!c//3!a"), //
	FORMAT014(":4!c//6!c"), //
	FORMAT015(":4!c//1!a"), //
	FORMAT016(":4!c//[N]3!a15d"), //
	FORMAT017(":4!c//4*35x"), //
	FORMAT018(":4!c/[8c]/4!c/35x"), //
	FORMAT019(":4!c//34x"), //
	FORMAT020(":4!c//35x"), //
	FORMAT021(":4!c/8c/34x"), //
	FORMAT022(":4!c//4!a2!a2!c[3!c]"), //
	FORMAT023(":4!c//4!c/4!a2!a2!c[3!c]"), //
	FORMAT024(":4!c//2!a"), // 
	FORMAT025(":4!c/[8c]/4!c[/30x]"), //
	FORMAT026(":4!c/[8c]/24x"), //
	FORMAT027(":4!c//3!a/3!a/15d"), //
	FORMAT028(":4!c//[N]15d"), //
	FORMAT029(":4!c//10*35x"), //
	FORMAT030(":4!c//6*35x"), //
	FORMAT031("[ISIN1!e12!c1!r1!w][4*35x]"), //
	FORMAT032(":4!c/[8c]/4!c/2!a/30x"), //
	FORMAT033(":4!c//4!c"), // 
	FORMAT034(":4!c//4!c/[N]15d"), //
	FORMAT035(":4!c//4!c/4!c/[N]15d"), //
	FORMAT036(":4!c/[8c]/4!c/[N]15d"), //
	FORMAT037(":4!c//15d/15d"), //
	FORMAT038(":4!c//8!n/8!n"), //
	FORMAT039(":4!c//8!n6!n/8!n6!n"), // 
	FORMAT040(":4!c//8!n/4!c"), // 
	FORMAT041(":4!c//8!n6!n/4!c"), //
	FORMAT042(":4!c//4!c/8!n"), //
	FORMAT043(":4!c//4!c/8!n6!n"), //
	FORMAT044(":4!c//3!a15d"), //
	FORMAT045(":4!c/[8c]/4!c/3!a15d[/4!c]"), //
	FORMAT046(":4!c//3!a15d/15d"), //
	FORMAT047(":4!c//2*35x"), //
	FORMAT048(":4!c/[8c]/4!c6!n"), // 
	FORMAT049(":4!c//4!c/3!a15d/4!c/15d"), //
	FORMAT050(":4!c//4!c/3!a15d/3!a15d"), // 
	FORMAT051(":4!c//3!a15d/3!a15d"), //
	FORMAT052(":4!c//15d/3!a15d"), //
	FORMAT053(":4!c//15d"), //
	FORMAT054(":4!c//10*35z"), //
	FORMAT055(":4!c//25x"), //
	FORMAT056(":4!c//[2!a]/35x"), //
	FORMAT057(":4!c//3*35x"), //
	FORMAT058("5n/4!c"), //
	FORMAT059("16x"), //
	FORMAT060("6!n"), // 
	FORMAT061("6*35x"), //
	FORMAT062("[N]3!a15d"), // 
	FORMAT063("3!a15d"), // 
	FORMAT064("5n[/2n]"), //
	FORMAT065("35*50x"), //
	FORMAT066("17d"), // 
	FORMAT067("[/1!a][/34x1!r1!w]4!a2!a2!c[3!c]"), //
	FORMAT068("/34x"), // 
	FORMAT069("[/1!a][/34x1!r1!w]4*35x"), //
	FORMAT070("[/1!a][/34x1!r1!w][35x]"), //
	FORMAT071("3!c"), // 
	FORMAT072("6*50x"), //
	FORMAT073("3!a15d[1!a]"), //
	FORMAT074("4*35x"), //
	FORMAT075("12d"), //
	FORMAT076("6!n3!a15d"), //
	FORMAT077("6!n[/6!n][//35x]"), //
	FORMAT078(":4!c//5!c"), //
	FORMAT079("12d[//6!n1!a3n][/16x]"), //
	FORMAT080("6!n[29x]"), //
	FORMAT081("[6!n[4!n]][7!a]"), //
	FORMAT082(":4!c//3!c/15d"), //
	FORMAT083(":4!c//8000z"), //
	FORMAT084("6!n[/6!n]"), //
	FORMAT085("/8c/4!n1!x4!n"), //
	FORMAT086("[/34x1!r1!w]4!a2!a2!c[3!c]"), //
	FORMAT087("35x1!r1!w4*35x"), //
	FORMAT088("[/34x1!r1!w]4*35x"), //
	FORMAT089("5n/5n"), //
	FORMAT090("/34x1!r1!w4!a2!a2!c[3!c]"), //
	FORMAT091("4!c[/30x]"), //
	FORMAT092("35x"), //
	FORMAT093("4!a2!a2!c[3!c]"), //
	FORMAT094("65x"), //
	FORMAT095("15d"), //
	FORMAT096("4!c"), //
	FORMAT097("4!a2!c4!n4!a2!c"), //
	FORMAT098("1!a"), //
	FORMAT099("5*40x"), //
	FORMAT100("6a[/8!n][//4!n]"), //
	FORMAT101("8!n"), //
	FORMAT102("4!c[/35x]"), //
	FORMAT103("5n"), //
	FORMAT104("8!n4!n"), //
	FORMAT105("4!c/3!a15d"), //
	FORMAT106("5n[/5n]"), // 
	//	FORMAT999(""), //
	;//

	private String format;
	private static final Map<String, FieldComponentsFormat> mapping = new HashMap<String, FieldComponentsFormat>();

	static {
		for (FieldComponentsFormat ff : FieldComponentsFormat.values()) {
			mapping.put(ff.getFormat(), ff);
		}
	}

	FieldComponentsFormat(String format) {
		this.format = format;
	}

	public String getFormat() {
		return this.format;
	}

	public static FieldComponentsFormat getType(String format) {
		return mapping.get(format);
	}
}
