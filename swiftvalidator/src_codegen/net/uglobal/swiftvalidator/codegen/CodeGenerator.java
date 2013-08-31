package net.uglobal.swiftvalidator.codegen;

import java.io.File;
import java.io.IOException;
import java.util.List;

import net.uglobal.swiftvalidator.codegen.fields.FieldClassBuildFieldMethodGenerator;
import net.uglobal.swiftvalidator.codegen.fields.FieldsGenerator;
import net.uglobal.swiftvalidator.codegen.fields.beans.Field;
import net.uglobal.swiftvalidator.codegen.mtmessages.MTAllowedFollowByFieldsTestGenerator;
import net.uglobal.swiftvalidator.codegen.mtmessages.MTTypeGenerator;
import net.uglobal.swiftvalidator.parser.FieldPartParserTestGenerator;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

public class CodeGenerator {
	private static final Logger logger = Logger.getLogger(CodeGenerator.class);

	public static void main(String argv[]) {
		CodeGenerator generator = new CodeGenerator();
		generator.run();
	}

	private void run() {
		logger.info("Starting code generation ... ");
		List<Field> fields = null;
		try {
			logger.info("Starting Field (POJO and Unit Test) classes Generation.");
			FieldsGenerator fieldsGenerator = new FieldsGenerator();
			fieldsGenerator.run(null);
			fields = fieldsGenerator.getFields();
			logger.info("Completed generating Field (POJO and Unit Test) classes.");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		try {
			logger.info("Starting to write to 'resources/test/mt-allowed-follow-by-fields-testsuite.xml'");
			MTAllowedFollowByFieldsTestGenerator mtAllowedFollowByFieldsTestGenerator = new MTAllowedFollowByFieldsTestGenerator();
			mtAllowedFollowByFieldsTestGenerator.run();
			logger.info("Completed writing to 'resources/test/mt-allowed-follow-by-fields-testsuite.xml'");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		try {
			logger.info("Starting to write to 'src/net/uglobal/swiftvalidator/xml/beans/Field.java' (buildField method)");
			FieldClassBuildFieldMethodGenerator fieldClassBuildFieldMethodGenerator = new FieldClassBuildFieldMethodGenerator();
			fieldClassBuildFieldMethodGenerator.run(fields);
			logger.info("Completed writing to 'src/net/uglobal/swiftvalidator/xml/beans/Field.java'");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		try {
			logger.info("Starting to write to 'src_test/net/uglobal/swiftvalidator/parser/FieldPartParserTest.java'");
			FieldPartParserTestGenerator fieldPartParserTestGenerator = new FieldPartParserTestGenerator();
			fieldPartParserTestGenerator.run();
			logger.info("Completed writing to 'src_test/net/uglobal/swiftvalidator/parser/FieldPartParserTest.java'");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		try {
			logger.info("Starting to generate MTXXX class and include MTxxx class to MTType enum in 'src/net.uglobal.swiftvalidator.xml.beans' directory");
			MTTypeGenerator mtTypeGenerator = new MTTypeGenerator();
			mtTypeGenerator.run();
			logger.info("Completed generating MTXXX class and include MTxxx class to MTType enum in 'src/net.uglobal.swiftvalidator.xml.beans' directory");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		copyFieldTestFiles();
	}

	/*
	 * Copy all the FieldXXXTest.java 
	 * FROM : src_temp/net/uglobal/swiftvalidator/swift/field
	 * TO   : src_test/net/uglobal/swiftvalidator/swift/field
	 * 
	 * NOTE: 
	 * If files already exist in the "TO" directory, SKIP.
	 * 
	 * After all the NEW files are copied, remove the files from the "FROM" directory.
	 */
	private void copyFieldTestFiles() {
		final String fromFilePath = "src_temp/net/uglobal/swiftvalidator/swift/field";
		final String toFilePath = "src_test/net/uglobal/swiftvalidator/swift/field";

		File fromDir = new File(fromFilePath);
		File toDir = new File(toFilePath);

		File[] fromFiles = fromDir.listFiles();
		int i = 0;
		for (File fromFile : fromFiles) {
			String fromFileName = fromFile.getName();
			File toFile = new File(toDir, fromFileName);
			if (!toFile.exists()) {
				try {
					FileUtils.copyFile(fromFile, toFile);
				} catch (IOException e) {
					logger.error(e.getMessage(), e);
				}
				logger.info("Copied file=" + fromFileName + ".");
				i++;
			}
			fromFile.delete();
		}
		logger.info("Completed copying FieldTest files FROM '" + fromFilePath + "' directory TO '" + toFilePath + "' directory  \n(" + i
				+ " file(s) copied).");
	}
}
