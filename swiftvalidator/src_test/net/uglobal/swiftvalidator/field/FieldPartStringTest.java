package net.uglobal.swiftvalidator.field;

import net.uglobal.swiftvalidator.characters.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FieldPartStringTest {

	// TODO: revisit. what are we testing here? 
	@Test
	public void test1() {
		// :SEME//845666
		// Digits
		PredefinedCharacter digitsCharacterSet = PredefinedCharacter.newPredefinedCharacter(new DigitsCharacterSet());

		PredefinedCharacter colon = PredefinedCharacter.newPredefinedCharacter(new ColonCharacterSet());
		PredefinedCharacter s = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterSCharacterSet());
		PredefinedCharacter e = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterECharacterSet());
		PredefinedCharacter m = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterMCharacterSet());
		PredefinedCharacter slash = PredefinedCharacter.newPredefinedCharacter(new ForwardSlashCharacterSet());

		FieldPartString actual = new FieldPartString();
		actual.addPredefinedCharacter(colon);
		actual.addPredefinedCharacter(s);
		actual.addPredefinedCharacter(e);
		actual.addPredefinedCharacter(m);
		actual.addPredefinedCharacter(e);
		actual.addPredefinedCharacter(slash);
		actual.addPredefinedCharacter(slash);
		actual.addPredefinedCharacter(digitsCharacterSet);
		actual.addPredefinedCharacter(digitsCharacterSet);
		actual.addPredefinedCharacter(digitsCharacterSet);
		actual.addPredefinedCharacter(digitsCharacterSet);
		actual.addPredefinedCharacter(digitsCharacterSet);
		actual.addPredefinedCharacter(digitsCharacterSet);

		Boolean b = actual.isEqual(":SEME//845666");

		Assert.assertEquals(b, Boolean.TRUE);
	}

	@Test
	public void test2() {
		// Digits
		PredefinedCharacter digitsCharacterSet = PredefinedCharacter.newPredefinedCharacter(new DigitsCharacterSet());
		// Digits With Decimal Comma
		PredefinedCharacter digitsWithDecimalCommaCharacterSet = PredefinedCharacter.newPredefinedCharacter(new DigitsWithDecimalCommaCharacterSet());

		FieldPartString str = new FieldPartString();
		str.addPredefinedCharacter(digitsCharacterSet);
		str.addPredefinedCharacter(digitsCharacterSet);
		str.addPredefinedCharacter(digitsCharacterSet);
		str.addPredefinedCharacter(digitsWithDecimalCommaCharacterSet);

		Boolean b = str.isEqual("294,");

		Assert.assertEquals(b, Boolean.TRUE);
	}

	@Test
	public void test3() {
		// Digits
		PredefinedCharacter digitsCharacterSet = PredefinedCharacter.newPredefinedCharacter(new DigitsCharacterSet());
		String s1 = digitsCharacterSet.toVerboseString();
		Boolean b1 = s1.equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
		Assert.assertEquals(b1, Boolean.TRUE);

		// Digits With Decimal Comma
		PredefinedCharacter digitsWithDecimalCommaCharacterSet = PredefinedCharacter.newPredefinedCharacter(new DigitsWithDecimalCommaCharacterSet());
		Boolean b2 = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ,]".equals(digitsWithDecimalCommaCharacterSet.toVerboseString());
		Assert.assertEquals(b2, Boolean.TRUE);

		// Lowercase Letters
		PredefinedCharacter lowercaseLettersCharacterSet = PredefinedCharacter.newPredefinedCharacter(new AllLowercaseLettersCharacterSet());
		Boolean b3 = "[a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]".equals(lowercaseLettersCharacterSet
				.toVerboseString());
		Assert.assertEquals(b3, Boolean.TRUE);

		// Space
		PredefinedCharacter spaceCharacterSet = PredefinedCharacter.newPredefinedCharacter(new SpaceCharacterSet());
		Boolean b4 = "[ ]".equals(spaceCharacterSet.toVerboseString());
		Assert.assertEquals(b4, Boolean.TRUE);

		// Uppercase Alphanumeric
		PredefinedCharacter uppercaseAlphanumericCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UppercaseAlphanumericCharacterSet());
		Boolean b5 = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]"
				.equals(uppercaseAlphanumericCharacterSet.toVerboseString());
		Assert.assertEquals(b5, Boolean.TRUE);

		// Uppercase Hexadecimal
		PredefinedCharacter uppercaseHexadecimalCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UppercaseHexadecimalCharacterSet());
		Boolean b6 = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F]".equals(uppercaseHexadecimalCharacterSet.toVerboseString());
		Assert.assertEquals(b6, Boolean.TRUE);

		// Uppercase Letters
		PredefinedCharacter uppercaseLettersCharacterSet = PredefinedCharacter.newPredefinedCharacter(new AllUppercaseLettersCharacterSet());
		Boolean b7 = "[A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]".equals(uppercaseLettersCharacterSet
				.toVerboseString());
		Assert.assertEquals(b7, Boolean.TRUE);

		// X Swift
		PredefinedCharacter xSwiftCharacterSet = PredefinedCharacter.newPredefinedCharacter(new XSwiftCharacterSet());
		System.out.println("xSwiftCharacterSet=" + xSwiftCharacterSet.toVerboseString());
		//		Assert.assertEquals(b, Boolean.TRUE);
		// TODO: test XSwiftCharacter

		// Y Swift
		PredefinedCharacter ySwiftCharacterSet = PredefinedCharacter.newPredefinedCharacter(new YSwiftCharacterSet());
		Boolean b8 = "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z,  , ., ,, -, (, ), /, =, ', +, :, ?, !, \", %, &, *, ;, <, >]"
				.equals(ySwiftCharacterSet.toVerboseString());
		//		System.out.println("ySwiftCharacterSet=" + ySwiftCharacterSet.toString());
		Assert.assertEquals(b8, Boolean.TRUE);

		// UppercaseLetter A Letter
		PredefinedCharacter uppercaseLetterACharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterACharacterSet());
		Boolean b9 = "[A]".equals(uppercaseLetterACharacterSet.toVerboseString());
		Assert.assertEquals(b9, Boolean.TRUE);

		// UppercaseLetter B Letter
		PredefinedCharacter uppercaseLetterBCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterBCharacterSet());
		Boolean b10 = "[B]".equals(uppercaseLetterBCharacterSet.toVerboseString());
		Assert.assertEquals(b10, Boolean.TRUE);

		// UppercaseLetter C Letter
		PredefinedCharacter uppercaseLetterCCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterCCharacterSet());
		Boolean b11 = "[C]".equals(uppercaseLetterCCharacterSet.toVerboseString());
		Assert.assertEquals(b11, Boolean.TRUE);

		// UppercaseLetter D Letter
		PredefinedCharacter uppercaseLetterDCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterDCharacterSet());
		Boolean b12 = "[D]".equals(uppercaseLetterDCharacterSet.toVerboseString());
		Assert.assertEquals(b12, Boolean.TRUE);

		// UppercaseLetter E Letter
		PredefinedCharacter uppercaseLetterECharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterECharacterSet());
		Boolean b13 = "[E]".equals(uppercaseLetterECharacterSet.toVerboseString());
		Assert.assertEquals(b13, Boolean.TRUE);

		// UppercaseLetter F Letter
		PredefinedCharacter uppercaseLetterFCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterFCharacterSet());
		Boolean b14 = "[F]".equals(uppercaseLetterFCharacterSet.toVerboseString());
		Assert.assertEquals(b14, Boolean.TRUE);

		// UppercaseLetter G Letter
		PredefinedCharacter uppercaseLetterGCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterGCharacterSet());
		Boolean b15 = "[G]".equals(uppercaseLetterGCharacterSet.toVerboseString());
		Assert.assertEquals(b15, Boolean.TRUE);

		// UppercaseLetter H Letter
		PredefinedCharacter uppercaseLetterHCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterHCharacterSet());
		Boolean b16 = "[H]".equals(uppercaseLetterHCharacterSet.toVerboseString());
		Assert.assertEquals(b16, Boolean.TRUE);

		// UppercaseLetter I Letter
		PredefinedCharacter uppercaseLetterICharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterICharacterSet());
		Boolean b17 = "[I]".equals(uppercaseLetterICharacterSet.toVerboseString());
		Assert.assertEquals(b17, Boolean.TRUE);

		// UppercaseLetter J Letter
		PredefinedCharacter uppercaseLetterJCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterJCharacterSet());
		Boolean b18 = "[J]".equals(uppercaseLetterJCharacterSet.toVerboseString());
		Assert.assertEquals(b18, Boolean.TRUE);

		// UppercaseLetter K Letter
		PredefinedCharacter uppercaseLetterKCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterKCharacterSet());
		Boolean b19 = "[K]".equals(uppercaseLetterKCharacterSet.toVerboseString());
		Assert.assertEquals(b19, Boolean.TRUE);

		// UppercaseLetter L Letter
		PredefinedCharacter uppercaseLetterLCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterLCharacterSet());
		Boolean b20 = "[L]".equals(uppercaseLetterLCharacterSet.toVerboseString());
		Assert.assertEquals(b20, Boolean.TRUE);

		// UppercaseLetter M Letter
		PredefinedCharacter uppercaseLetterMCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterMCharacterSet());
		Boolean b21 = "[M]".equals(uppercaseLetterMCharacterSet.toVerboseString());
		Assert.assertEquals(b21, Boolean.TRUE);

		// UppercaseLetter N Letter
		PredefinedCharacter uppercaseLetterNCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterNCharacterSet());
		Boolean b22 = "[N]".equals(uppercaseLetterNCharacterSet.toVerboseString());
		Assert.assertEquals(b22, Boolean.TRUE);

		// UppercaseLetter O Letter
		PredefinedCharacter uppercaseLetterOCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterOCharacterSet());
		Boolean b23 = "[O]".equals(uppercaseLetterOCharacterSet.toVerboseString());
		Assert.assertEquals(b23, Boolean.TRUE);

		// UppercaseLetter P Letter
		PredefinedCharacter uppercaseLetterPCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterPCharacterSet());
		Boolean b24 = "[P]".equals(uppercaseLetterPCharacterSet.toVerboseString());
		Assert.assertEquals(b24, Boolean.TRUE);

		// UppercaseLetter Q Letter
		PredefinedCharacter uppercaseLetterQCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterQCharacterSet());
		Boolean b25 = "[Q]".equals(uppercaseLetterQCharacterSet.toVerboseString());
		Assert.assertEquals(b25, Boolean.TRUE);

		// UppercaseLetter R Letter
		PredefinedCharacter uppercaseLetterRCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterRCharacterSet());
		Boolean b26 = "[R]".equals(uppercaseLetterRCharacterSet.toVerboseString());
		Assert.assertEquals(b26, Boolean.TRUE);

		// UppercaseLetter S Letter
		PredefinedCharacter uppercaseLetterSCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterSCharacterSet());
		Boolean b27 = "[S]".equals(uppercaseLetterSCharacterSet.toVerboseString());
		Assert.assertEquals(b27, Boolean.TRUE);

		// UppercaseLetter T Letter
		PredefinedCharacter uppercaseLetterTCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterTCharacterSet());
		Boolean b28 = "[T]".equals(uppercaseLetterTCharacterSet.toVerboseString());
		Assert.assertEquals(b28, Boolean.TRUE);

		// UppercaseLetter U Letter
		PredefinedCharacter uppercaseLetterUCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterUCharacterSet());
		Boolean b29 = "[U]".equals(uppercaseLetterUCharacterSet.toVerboseString());
		Assert.assertEquals(b29, Boolean.TRUE);

		// UppercaseLetter V Letter
		PredefinedCharacter uppercaseLetterVCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterVCharacterSet());
		Boolean b30 = "[V]".equals(uppercaseLetterVCharacterSet.toVerboseString());
		Assert.assertEquals(b30, Boolean.TRUE);

		// UppercaseLetter W Letter
		PredefinedCharacter uppercaseLetterWCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterWCharacterSet());
		Boolean b31 = "[W]".equals(uppercaseLetterWCharacterSet.toVerboseString());
		Assert.assertEquals(b31, Boolean.TRUE);

		// UppercaseLetter X Letter
		PredefinedCharacter uppercaseLetterXCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterXCharacterSet());
		Boolean b32 = "[X]".equals(uppercaseLetterXCharacterSet.toVerboseString());
		Assert.assertEquals(b32, Boolean.TRUE);

		// UppercaseLetter Y Letter
		PredefinedCharacter uppercaseLetterYCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterYCharacterSet());
		Boolean b33 = "[Y]".equals(uppercaseLetterYCharacterSet.toVerboseString());
		Assert.assertEquals(b33, Boolean.TRUE);

		// UppercaseLetter Z Letter
		PredefinedCharacter uppercaseLetterZCharacterSet = PredefinedCharacter.newPredefinedCharacter(new UpperCaseLetterZCharacterSet());
		Boolean b34 = "[Z]".equals(uppercaseLetterZCharacterSet.toVerboseString());
		Assert.assertEquals(b34, Boolean.TRUE);

		// LowercaseLetter a Letter
		PredefinedCharacter lowercaseLetterACharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterACharacterSet());
		Boolean b35 = "[a]".equals(lowercaseLetterACharacterSet.toVerboseString());
		Assert.assertEquals(b35, Boolean.TRUE);

		// LowercaseLetter b Letter
		PredefinedCharacter lowercaseLetterBCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterBCharacterSet());
		Boolean b36 = "[b]".equals(lowercaseLetterBCharacterSet.toVerboseString());
		Assert.assertEquals(b36, Boolean.TRUE);

		// LowercaseLetter c Letter
		PredefinedCharacter lowercaseLetterCCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterCCharacterSet());
		Boolean b37 = "[c]".equals(lowercaseLetterCCharacterSet.toVerboseString());
		Assert.assertEquals(b37, Boolean.TRUE);

		// LowercaseLetter d Letter
		PredefinedCharacter lowercaseLetterDCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterDCharacterSet());
		Boolean b38 = "[d]".equals(lowercaseLetterDCharacterSet.toVerboseString());
		Assert.assertEquals(b38, Boolean.TRUE);

		// LowercaseLetter e Letter
		PredefinedCharacter lowercaseLetterECharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterECharacterSet());
		Boolean b39 = "[e]".equals(lowercaseLetterECharacterSet.toVerboseString());
		Assert.assertEquals(b39, Boolean.TRUE);

		// LowercaseLetter f Letter
		PredefinedCharacter lowercaseLetterFCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterFCharacterSet());
		Boolean b40 = "[f]".equals(lowercaseLetterFCharacterSet.toVerboseString());
		Assert.assertEquals(b40, Boolean.TRUE);

		// LowercaseLetter g Letter
		PredefinedCharacter lowercaseLetterGCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterGCharacterSet());
		Boolean b41 = "[g]".equals(lowercaseLetterGCharacterSet.toVerboseString());
		Assert.assertEquals(b41, Boolean.TRUE);

		// LowercaseLetter h Letter
		PredefinedCharacter lowercaseLetterHCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterHCharacterSet());
		Boolean b42 = "[h]".equals(lowercaseLetterHCharacterSet.toVerboseString());
		Assert.assertEquals(b42, Boolean.TRUE);

		// LowercaseLetter i Letter
		PredefinedCharacter lowercaseLetterICharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterICharacterSet());
		Boolean b43 = "[i]".equals(lowercaseLetterICharacterSet.toVerboseString());
		Assert.assertEquals(b43, Boolean.TRUE);

		// LowercaseLetter j Letter
		PredefinedCharacter lowercaseLetterJCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterJCharacterSet());
		Boolean b44 = "[j]".equals(lowercaseLetterJCharacterSet.toVerboseString());
		Assert.assertEquals(b44, Boolean.TRUE);

		// LowercaseLetter k Letter
		PredefinedCharacter lowercaseLetterKCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterKCharacterSet());
		Boolean b45 = "[k]".equals(lowercaseLetterKCharacterSet.toVerboseString());
		Assert.assertEquals(b45, Boolean.TRUE);

		// LowercaseLetter l Letter
		PredefinedCharacter lowercaseLetterLCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterLCharacterSet());
		Boolean b46 = "[l]".equals(lowercaseLetterLCharacterSet.toVerboseString());
		Assert.assertEquals(b46, Boolean.TRUE);

		// LowercaseLetter m Letter
		PredefinedCharacter lowercaseLetterMCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterMCharacterSet());
		Boolean b47 = "[m]".equals(lowercaseLetterMCharacterSet.toVerboseString());
		Assert.assertEquals(b47, Boolean.TRUE);

		// LowercaseLetter n Letter
		PredefinedCharacter lowercaseLetterNCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterNCharacterSet());
		Boolean b48 = "[n]".equals(lowercaseLetterNCharacterSet.toVerboseString());
		Assert.assertEquals(b48, Boolean.TRUE);

		// LowercaseLetter o Letter
		PredefinedCharacter lowercaseLetterOCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterOCharacterSet());
		Boolean b49 = "[o]".equals(lowercaseLetterOCharacterSet.toVerboseString());
		Assert.assertEquals(b49, Boolean.TRUE);

		// LowercaseLetter p Letter
		PredefinedCharacter lowercaseLetterPCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterPCharacterSet());
		Boolean b50 = "[p]".equals(lowercaseLetterPCharacterSet.toVerboseString());
		Assert.assertEquals(b50, Boolean.TRUE);

		// LowercaseLetter q Letter
		PredefinedCharacter lowercaseLetterQCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterQCharacterSet());
		Boolean b51 = "[q]".equals(lowercaseLetterQCharacterSet.toVerboseString());
		Assert.assertEquals(b51, Boolean.TRUE);

		// LowercaseLetter r Letter
		PredefinedCharacter lowercaseLetterRCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterRCharacterSet());
		Boolean b52 = "[r]".equals(lowercaseLetterRCharacterSet.toVerboseString());
		Assert.assertEquals(b52, Boolean.TRUE);

		// LowercaseLetter s Letter
		PredefinedCharacter lowercaseLetterSCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterSCharacterSet());
		Boolean b53 = "[s]".equals(lowercaseLetterSCharacterSet.toVerboseString());
		Assert.assertEquals(b53, Boolean.TRUE);

		// LowercaseLetter t Letter
		PredefinedCharacter lowercaseLetterTCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterTCharacterSet());
		Boolean b54 = "[t]".equals(lowercaseLetterTCharacterSet.toVerboseString());
		Assert.assertEquals(b54, Boolean.TRUE);

		// LowercaseLetter u Letter
		PredefinedCharacter lowercaseLetterUCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterUCharacterSet());
		Boolean b55 = "[u]".equals(lowercaseLetterUCharacterSet.toVerboseString());
		Assert.assertEquals(b55, Boolean.TRUE);

		// LowercaseLetter v Letter
		PredefinedCharacter lowercaseLetterVCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterVCharacterSet());
		Boolean b56 = "[v]".equals(lowercaseLetterVCharacterSet.toVerboseString());
		Assert.assertEquals(b56, Boolean.TRUE);

		// LowercaseLetter w Letter
		PredefinedCharacter lowercaseLetterWCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterWCharacterSet());
		Boolean b57 = "[w]".equals(lowercaseLetterWCharacterSet.toVerboseString());
		Assert.assertEquals(b57, Boolean.TRUE);

		// LowercaseLetter x Letter
		PredefinedCharacter lowercaseLetterXCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterXCharacterSet());
		Boolean b58 = "[x]".equals(lowercaseLetterXCharacterSet.toVerboseString());
		Assert.assertEquals(b58, Boolean.TRUE);

		// LowercaseLetter y Letter
		PredefinedCharacter lowercaseLetterYCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterYCharacterSet());
		Boolean b59 = "[y]".equals(lowercaseLetterYCharacterSet.toVerboseString());
		Assert.assertEquals(b59, Boolean.TRUE);

		// LowercaseLetter z Letter
		PredefinedCharacter lowercaseLetterZCharacterSet = PredefinedCharacter.newPredefinedCharacter(new LowerCaseLetterZCharacterSet());
		Boolean b60 = "[z]".equals(lowercaseLetterZCharacterSet.toVerboseString());
		Assert.assertEquals(b60, Boolean.TRUE);

		// Z Swift
		PredefinedCharacter zSwiftCharacterSet = PredefinedCharacter.newPredefinedCharacter(new ZSwiftCharacterSet());
		System.out.println("zSwiftCharacterSet=" + zSwiftCharacterSet.toVerboseString());
		// TODO: add test for ZSwiftCharacterSet

		// TODO: add NewLineCharacterSet, CarriageReturnCharacterSet

		Boolean b = b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 && b10 && b11 && b12 && b13 && b14 && b15 && b16 && b17 && b18 && b19 && b20
				&& b21 && b22 && b23 && b24 && b25 && b26 && b27 && b28 && b29 && b30 && b31 && b32 && b33 && b34 && b35 && b36 && b37 && b38 && b39
				&& b40 && b41 && b42 && b43 && b44 && b45 && b46 && b47 && b48 && b49 && b50 && b51 && b52 && b53 && b54 && b55 && b56 && b57 && b58
				&& b59 && b60;
		Assert.assertEquals(b, Boolean.TRUE);
	}
}
