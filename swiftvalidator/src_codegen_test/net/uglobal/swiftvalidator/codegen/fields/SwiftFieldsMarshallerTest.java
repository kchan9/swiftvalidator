package net.uglobal.swiftvalidator.codegen.fields;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

import net.uglobal.swiftvalidator.codegen.fields.beans.Component;
import net.uglobal.swiftvalidator.codegen.fields.beans.Field;
import net.uglobal.swiftvalidator.codegen.fields.beans.FieldDictionary;
import net.uglobal.swiftvalidator.codegen.fields.util.SwiftFieldsMarshaller;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SwiftFieldsMarshallerTest {
	private static final String EOL = "\r\n";
	private static final String configFile = "resources\\swift_library\\swift.fields.codegen.config.xml";

	private String xml;

	@BeforeClass
	public void beforeClass() {
		//		xml.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
		//		xml.append("<fieldLibrary>");
		//		//		xml.append("	<codeGenerationConfig>");
		//		//		xml.append("		<packageName>net.uglobal.swiftvalidator.swift.field</packageName>");
		//		//		xml.append("		<classNamePrefix>Field</classNamePrefix>");
		//		//		xml.append("	</codeGenerationConfig>");
		//		xml.append("	<field name=\"13A\">");
		//		xml.append("		<component name=\"qualifier\" order=\"1\" />");
		//		xml.append("		<component name=\"numberId\" order=\"2\" />");
		//		xml.append("	</field>");
		//		xml.append("	<field name=\"94B\">");
		//		xml.append("		<component name=\"qualifier\" order=\"1\" />");
		//		xml.append("		<component name=\"dataSourceScheme\" order=\"2\" />");
		//		xml.append("		<component name=\"placeCode\" order=\"3\" />");
		//		xml.append("		<component name=\"narrative\" order=\"4\" />");
		//		xml.append("	</field>");
		//		xml.append("</fieldLibrary>");

		try {
			xml = readConfigFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private FieldDictionary fieldDictionary;

	@Test
	public void testFromXml() {
		fieldDictionary = SwiftFieldsMarshaller.fromXml(xml.toString());

		Integer maxFid = fieldDictionary.getMaxfid();
		List<Field> fields = fieldDictionary.getFields();

		List<Integer> list = new ArrayList<Integer>();
		SortedMap<String, Integer> mapFieldName = new TreeMap<String, Integer>();
		SortedMap<Integer, Integer> mapFieldId = new TreeMap<Integer, Integer>();
		for (Field field : fields) {
			Integer fid = field.getFid();
			String fName = field.getName();

			if (mapFieldName.containsKey(fName)) {
				int count = mapFieldName.get(fName);
				mapFieldName.put(fName, count++);
			} else {
				mapFieldName.put(fName, 1);
			}

			if (mapFieldId.containsKey(fid)) {
				int count = mapFieldId.get(fid);
				mapFieldId.put(fid, count++);
			} else {
				mapFieldId.put(fid, 1);
			}

		}

		// this is to check if the maxFid has been updated properly
		Assert.assertTrue(maxFid == fields.size(), "maxFid is not updated propertly. maxFid=" + maxFid + ", fields.size()=" + fields.size());

		// this is to check if there is any duplicate field.name
		for (Entry<String, Integer> val : mapFieldName.entrySet()) {
			String fName = val.getKey();
			Integer count = val.getValue();

			Assert.assertEquals(count, new Integer(1), "Duplicate fieldName found.  fieldName=" + fName);
		}

		// this is to check if there is any duplicate field.fId
		for (Entry<Integer, Integer> val : mapFieldId.entrySet()) {
			Integer fId = val.getKey();
			Integer count = val.getValue();

			Assert.assertEquals(count, new Integer(1), "Duplicate fId found.  fId=" + fId);
		}

	}

	@Test
	public void testToXml() {
		//		fieldDictionary = SwiftFieldsMarshaller.fromXml(xml.toString());
		String xml = SwiftFieldsMarshaller.toXml(fieldDictionary);
		xml = xml.replaceAll("\r\n", "");
		xml = xml.replaceAll("\n", "");
		xml = xml.replaceAll("\r", "");
		xml = trimSpace(xml);
		System.out.println(xml);

		Integer maxFid = fieldDictionary.getMaxfid();

		Assert.assertTrue(xml.contains("maxfid=\"" + maxFid + "\""));

		List<Field> fields = fieldDictionary.getFields();
		for (Field field : fields) {
			StringBuilder sb = new StringBuilder();
			sb.append("<field name=\"" + field.getName() + "\" fid=\"" + field.getFid() + "\">");

			List<Component> components = field.getComponents();
			for (Component component : components) {
				String componentName = component.getName();
				sb.append("<component name=\"" + componentName + "\"/>");
			}
			sb.append("<formatString>" + field.getFormatString() + "</formatString>");
			sb.append("</field>");

			Assert.assertTrue(xml.contains(sb.toString()));
		}

		// TODO: 
	}

	private String readConfigFile() throws IOException {
		File file = new File(configFile);
		BufferedReader br = new BufferedReader(new FileReader(file));

		StringBuilder sb = new StringBuilder();
		String line = null;
		while ((line = br.readLine()) != null) {
			sb.append(line).append(EOL);
		}
		return sb.toString();
	}

	private String trimSpace(String xml) {
		xml = xml.replaceAll("\r\n", "");
		xml = xml.replaceAll("\r", "");
		xml = xml.replaceAll("\n", "");

		StringBuilder sb = new StringBuilder();
		int counter = 0;
		for (int i = 0; i < xml.length(); i++) {
			char ch = xml.charAt(i);
			if (ch == '<') {
				counter++;
			}
			if (counter == 1) {
				sb.append(ch);
			} else if (ch != ' ') {
				sb.append(ch);
			}
			if (ch == '>') {
				counter--;
			}
		}
		return sb.toString();
	}

}
