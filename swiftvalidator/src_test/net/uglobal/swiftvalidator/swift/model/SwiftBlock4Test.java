package net.uglobal.swiftvalidator.swift.model;

import static org.testng.Assert.assertEquals;

import java.util.List;

import net.uglobal.swiftvalidator.swift.model.SwiftBlock4;
import net.uglobal.swiftvalidator.swift.model.Tag;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwiftBlock4Test {

	private static final String EOL = "\r\n";

	private static final StringBuilder unparsedText = new StringBuilder();

	@BeforeClass
	public void beforeClass() {
		addLineToUnparsedText("4:");
		addLineToUnparsedText(":16R:GENL");
		addLineToUnparsedText(":20C::SEME//845666");
		addLineToUnparsedText(":23G:NEWM");
		addLineToUnparsedText(":16S:GENL");
		addLineToUnparsedText(":16R:TRADDET");
		addLineToUnparsedText(":94B::PLAC//PLAC");
		addLineToUnparsedText(":98A::TRAD//20120418");
		addLineToUnparsedText(":98A::SETT//20120514");
		addLineToUnparsedText(":90A::DEAL//PRCT/100,5");
		addLineToUnparsedText(":35B:/US/3138E0AB5");
		addLineToUnparsedText("FN AJ7201");
		addLineToUnparsedText(":16R:FIA");
		addLineToUnparsedText(":12A::CLAS/ISIT/FN");
		addLineToUnparsedText(":98A::ISSU//20120101");
		addLineToUnparsedText(":98A::MATU//20420101");
		addLineToUnparsedText(":92A::INTR//4,");
		addLineToUnparsedText(":16S:FIA");
		addLineToUnparsedText(":16S:TRADDET");
		addLineToUnparsedText(":16R:FIAC");
		addLineToUnparsedText(":36B::SETT//AMOR/99448,778");
		addLineToUnparsedText(":36B::SETT//FAMT/100000,");
		addLineToUnparsedText(":97A::SAFE//1046320");
		addLineToUnparsedText(":16S:FIAC");
		addLineToUnparsedText(":16R:SETDET");
		addLineToUnparsedText(":22F::ABCD//DCBA");
		addLineToUnparsedText(":16R:SETPRTY");
		addLineToUnparsedText(":95P::PSET//FRNYUS33");
		addLineToUnparsedText(":16S:SETPRTY");
		addLineToUnparsedText(":16R:SETPRTY");
		addLineToUnparsedText(":95R::SELL/DTCYID/00274");
		addLineToUnparsedText(":16S:SETPRTY");
		addLineToUnparsedText(":16R:SETPRTY");
		addLineToUnparsedText(":95R::DEAG/USFW/021000018");
		addLineToUnparsedText(":97A::SAFE//SALOMON");
		addLineToUnparsedText(":16S:SETPRTY");
		addLineToUnparsedText(":16R:AMT");
		addLineToUnparsedText(":17B::ACRU//Y");
		addLineToUnparsedText(":19A::SETT//USD100089,67");
		addLineToUnparsedText(":16S:AMT");
		addLineToUnparsedText(":16R:AMT");
		addLineToUnparsedText(":19A::DEAL//USD99946,02");
		addLineToUnparsedText(":16S:AMT");
		addLineToUnparsedText(":16R:AMT");
		addLineToUnparsedText(":19A::ACRU//USD143,65");
		addLineToUnparsedText(":16S:AMT");
		addLineToUnparsedText(":16S:SETDET");
		unparsedText.append("-");
	}

	@Test
	public void testParseSwiftBlock4() {

		SwiftBlock4 block4 = new SwiftBlock4(unparsedText.toString());

		List<Tag> tags = block4.getTags();

		assertEquals(tags.size(), 2);
		assertEquals(tags.get(0).getName(), "113");
		assertEquals(tags.get(1).getName(), "108");
		assertEquals(tags.get(0).getValue(), "abcdef");
		assertEquals(tags.get(1).getValue(), "MT502 001 OF 008");

	}

	private void addLineToUnparsedText(String line) {
		unparsedText.append(line).append(EOL);
	}
}
