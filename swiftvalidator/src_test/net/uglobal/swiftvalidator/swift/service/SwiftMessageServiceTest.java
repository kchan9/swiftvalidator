package net.uglobal.swiftvalidator.swift.service;

import java.util.List;
import java.util.Map;

import net.uglobal.swiftvalidator.swift.field.Field;
import net.uglobal.swiftvalidator.swift.field.Field16R;
import net.uglobal.swiftvalidator.swift.field.Field35B;
import net.uglobal.swiftvalidator.swift.field.Field98A;
import net.uglobal.swiftvalidator.xml.beans.MT541;
import net.uglobal.swiftvalidator.xml.beans.Sequence;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwiftMessageServiceTest {
	private static final StringBuilder unparsedText = new StringBuilder();

	@BeforeClass
	public void beforeClass() {
		addLineToUnparsedText("{1:F01BONYUS30AVCM0000000001}{2:I541KEYBUS30AXXX}{3:{108:CUS1205051637133}}{4:");
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
		unparsedText.append("-}");
	}

	@Test
	public void testGetMTMessageFromFIN() {
		SwiftMessageService service = new SwiftMessageService();
		MT541 mtMessage = (MT541) service.getMTMessageFromFIN(unparsedText.toString());

		//		Map<String, List<Field>> map = mtMessage.getEnrichedFieldMap();
		//		mtMessage.getEnrichedFields().contains(new Field16r)

		//		mtMessage.getEnrichedSequenceMap().get(key)

		//		List<Field> fields = mtMessage.getEnrichedFields("16R");

		Map<Sequence, List<net.uglobal.swiftvalidator.swift.field.Field>> map1 = mtMessage.getFieldsBySequence();
		Map<String, List<net.uglobal.swiftvalidator.swift.field.Field>> map2 = mtMessage.getFieldsBySequenceShortName();
		Map<String, List<net.uglobal.swiftvalidator.swift.field.Field>> map3 = mtMessage.getFieldsByFieldName();

		for (String s : map3.keySet()) {
			System.out.println(s);
		}

		Map<Integer, Sequence> map4 = mtMessage.getSequencesBySequenceId();

		if (mtMessage instanceof MT541) {
			System.out.println("true");
		}

		List<Field> f35Bs = mtMessage.getField35B();
		Field35B f = (Field35B) f35Bs.get(0);
		f.getDescriptionOfSecurity();
		f.getIdentificationOfSecurity();

		List<Field> f98AList = mtMessage.getField98A();
		List<Field> list = mtMessage.getFieldsByFieldClass().get(Field98A.class);

		List<Field> list2 = mtMessage.getFields("98A");

		List<Field> f98CList = mtMessage.getField98C();
		List<Field> f98EList = mtMessage.getField98E();

		List<net.uglobal.swiftvalidator.swift.field.Field> field16Rs = mtMessage.getField16R();
		Field16R ff1 = (Field16R) field16Rs.get(0);
		ff1.getSequenceShortName();
		ff1.getCode();
		ff1.getComponents();
		//		String code = ((Field16R) field16Rs.get(0)).getSequenceId()
		int i = 0;
		i = 2;
	}

	// ----------
	private static final String EOL = "\n";

	private void addLineToUnparsedText(String line) {
		unparsedText.append(line).append(EOL);
	}
}
