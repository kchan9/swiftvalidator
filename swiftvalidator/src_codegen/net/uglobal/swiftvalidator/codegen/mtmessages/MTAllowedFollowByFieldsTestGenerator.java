package net.uglobal.swiftvalidator.codegen.mtmessages;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class MTAllowedFollowByFieldsTestGenerator {
	private static final Logger logger = Logger.getLogger(MTAllowedFollowByFieldsTestGenerator.class);

	public static void main(String argv[]) throws IOException {
		MTAllowedFollowByFieldsTestGenerator generator = new MTAllowedFollowByFieldsTestGenerator();
		generator.run();
		logger.info("Done on " + new Date());
	}

	private static final String NEW_LINE = "\n";

	public void run() throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("<test name=\"MT AllowedFollowByFields Test\">").append(NEW_LINE);
		sb.append("        <classes>").append(NEW_LINE);

		File dir = new File("resources/swift_library");
		File[] mtSchemaFiles = dir.listFiles();
		for (File mtSchemaFile : mtSchemaFiles) {
			String fName = mtSchemaFile.getName();
			String mt = getMT(fName);
			if (mt != null) {
				sb.append("            <class name=\"net.uglobal.swiftvalidator.xml.Mt" + mt + "AllowedFollowByFieldsTest\" />").append(NEW_LINE);
			}
		}

		sb.append("        </classes>").append(NEW_LINE);
		sb.append("    </test>").append(NEW_LINE);

		File file = new File("resources/test/mt-allowed-follow-by-fields-testsuite.xml");
		FileUtils.writeStringToFile(file, sb.toString());
	}

	private String getMT(String name) {
		int idx1 = name.indexOf("_");
		if (name.endsWith(".xml") && idx1 != -1) {
			return name.substring(2, idx1);
		} else {
			return null;
		}
	}
}
