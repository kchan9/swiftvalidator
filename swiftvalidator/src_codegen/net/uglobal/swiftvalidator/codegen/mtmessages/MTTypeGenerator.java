package net.uglobal.swiftvalidator.codegen.mtmessages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class MTTypeGenerator {
	private static final Logger logger = Logger.getLogger(MTTypeGenerator.class);

	private static final String NEW_LINE = "\r\n";
	private static final String TAB = "    ";

	private final File xsdFile = new File("resources/swift_library/mt_schema.xsd");
	private final File mtTypeFile = new File("src/net/uglobal/swiftvalidator/xml/beans/MTType.java");

	public MTTypeGenerator() {
	}

	public void run() throws IOException {
		List<String> lines = FileUtils.readLines(xsdFile);
		boolean startRecording = false;
		boolean endRecording = false;
		List<String> mtLines = new ArrayList<String>();
		for (String line : lines) {
			line = line.trim();
			if (!startRecording && line.equals("<xs:simpleType name=\"mtTypeEnum\">")) {
				startRecording = true;
			}
			if (startRecording && line.equals("</xs:simpleType>")) {
				endRecording = true;
			}
			if (startRecording && line.startsWith("<xs:enumeration value")) {
				mtLines.add(line);
			}
			if (endRecording) {
				break;
			}
		} // end for

		List<String> mtTypeStrings = getMtTypes(mtLines);

		rewriteMtTypeFile(mtTypeStrings);

		System.out.println("");
	}

	private void rewriteMtTypeFile(List<String> mtTypesStrings) throws IOException {
		String s = FileUtils.readFileToString(mtTypeFile);
		//		List<String> lines = FileUtils.readLines(mtTypeFile);

		int startIdx = s.indexOf("%%%%%BEGIN%%%%%");
		int endIdx = s.indexOf("%%%%%END%%%%%");

		String prefix = s.substring(0, startIdx + 15);
		String suffix = s.substring(endIdx - 6, s.length());

		// build content
		StringBuilder sb = new StringBuilder();
		sb.append(TAB).append("//").append(NEW_LINE);
		for (String mtType : mtTypesStrings) {
			mtType = mtType.toUpperCase();
			sb.append(TAB).append("MT" + mtType + "(\"" + mtType + "\", net.uglobal.swiftvalidator.xml.beans.MT" + mtType + ".class), //")
					.append(NEW_LINE);
		}
		sb.append(TAB).append(";").append(NEW_LINE);
		sb.append(TAB).append("//").append(NEW_LINE);

		//		mtTypeFile

		FileUtils.writeStringToFile(mtTypeFile, prefix + NEW_LINE + sb.toString() + suffix);

		System.out.println();
	}

	private List<String> getMtTypes(List<String> mtLines) {
		final String COLON = "\"";
		List<String> mtTypes = new ArrayList<String>();

		for (String line : mtLines) {
			int startIdx = line.indexOf(COLON);
			String s = line.substring(startIdx + 1, line.length());
			int endIdx = s.indexOf(COLON);

			String mtType = s.substring(0, endIdx);
			mtTypes.add(mtType);
		}
		return mtTypes;
	}

	public static void main(String argv[]) {
		MTTypeGenerator main = new MTTypeGenerator();

		try {
			main.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
