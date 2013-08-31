package net.uglobal.swiftvalidator.xml;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.XMLEventAllocator;

import net.uglobal.swiftvalidator.codegen.fields.beans.FieldDictionary;
import net.uglobal.swiftvalidator.codegen.fields.util.SwiftFieldsMarshaller;
import net.uglobal.swiftvalidator.xml.beans.Content;
import net.uglobal.swiftvalidator.xml.beans.Description;
import net.uglobal.swiftvalidator.xml.beans.DetailedFieldName;
import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.Format;
import net.uglobal.swiftvalidator.xml.beans.GenericFieldName;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;
import net.uglobal.swiftvalidator.xml.beans.MTType;
import net.uglobal.swiftvalidator.xml.beans.Option;
import net.uglobal.swiftvalidator.xml.beans.Options;
import net.uglobal.swiftvalidator.xml.beans.Qualifier;
import net.uglobal.swiftvalidator.xml.beans.Sequence;
import net.uglobal.swiftvalidator.xml.beans.Status;
import net.uglobal.swiftvalidator.xml.beans.Value;
import net.uglobal.swiftvalidator.xml.beans.XmlBean;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sun.xml.internal.stream.events.XMLEventAllocatorImpl;

public class XmlBeanParser {

	private static final Logger logger = Logger.getLogger(XmlBeanParser.class);

	private static final String[] accessListArr = new String[] { "field", "sequence", "qualifier", "content", "options", "option",
			"genericFieldName", "detailedFieldName", "format", "value", "description" };
	private static final List<String> accessList = Arrays.asList(accessListArr);

	private static XmlBeanFactory xmlBeanFactory = XmlBeanFactory.getInstance();

	private XMLEventAllocator xmlEventAllocator = null;
	private XMLStreamReader xmlStreamReader;

	private MTMessage mtMessageXmlBean;

	private final Stack<XmlBean> parentElementStack = new Stack<XmlBean>();

	// TODO: write LinkedMap (jakarta collections LinkedMap, that supports generic)
	private final Map<Integer, Sequence> sequenceMap = new LinkedHashMap<Integer, Sequence>();

	private final Map<Integer, Field> fieldMap = new LinkedHashMap<Integer, Field>();
	private final List<Field> fieldList = new ArrayList<Field>();

	private static FieldDictionary fieldDictionary = null;
	private static final Map<String, String> fieldFormatMap = new HashMap<String, String>();

	private XmlBeanParser() {
	}

	public XmlBeanParser(MTType mtType) throws FileNotFoundException {
		// TODO: get mt (mtxxx_schema) files ?? should be injected from spring config? or resourcebundle?
		final String filename = "mt" + mtType.getText() + "_schema.xml";
		logger.info("filename=" + filename);
		InputStream in = getClass().getClassLoader().getResourceAsStream("swift_library/" + filename);
		init(in);
	}

	public XmlBeanParser(File file) throws FileNotFoundException {
		this(new FileInputStream(file));
	}

	public XmlBeanParser(String xml) {
		this(new ByteArrayInputStream(xml.getBytes()));
	}

	public XmlBeanParser(InputStream inputStream) {
		init(inputStream);
	}

	private void init(InputStream is) {
		if (fieldDictionary == null) {
			InputStream in = getClass().getClassLoader().getSystemResourceAsStream("swift_library/swift.fields.codegen.config.xml");
			String fieldDictionaryXml = "";
			try {
				fieldDictionaryXml = new Scanner(in).useDelimiter("\\A").next();
				fieldDictionary = SwiftFieldsMarshaller.fromXml(fieldDictionaryXml);

				List<net.uglobal.swiftvalidator.codegen.fields.beans.Field> fieldList = fieldDictionary.getFields();
				for (net.uglobal.swiftvalidator.codegen.fields.beans.Field f : fieldList) {
					fieldFormatMap.put(f.getName(), f.getFormatString());
				}
			} catch (java.util.NoSuchElementException e) {
				logger.error(e.getMessage(), e);
			}
		}

		try {
			XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
			xmlInputFactory.setEventAllocator(new XMLEventAllocatorImpl());
			xmlEventAllocator = xmlInputFactory.getEventAllocator();
			xmlStreamReader = xmlInputFactory.createXMLStreamReader(is);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}

	public void parse() {
		try {
			int eventType = getXmlStreamReader().getEventType();
			while (getXmlStreamReader().hasNext()) {
				eventType = getXmlStreamReader().next();

				switch (eventType) {
				case XMLStreamConstants.START_ELEMENT:
					processStartElement(xmlStreamReader);
					break;
				case XMLStreamConstants.END_ELEMENT:
					processEndElement(xmlStreamReader);
					break;
				case XMLStreamConstants.CHARACTERS:
					processCharacters(xmlStreamReader);
					break;
				case XMLStreamConstants.ATTRIBUTE:
					processAttribute(xmlStreamReader);
					break;
				default:
					break;
				}
			}
		} catch (XMLStreamException ex) {
			//			ex.printStackTrace();
			logger.error(ex.getMessage(), ex);
		}

		logger.debug("mtMessageXmlBean=" + getMTMessageXmlBean());
		logger.debug("------------------------------------------------------------------------------");
		logger.debug("sequenceMap=" + getSequenceMap());
		logger.debug("------------------------------------------------------------------------------");
		logger.debug("fieldMap=" + getFieldMap());
		logger.debug("------------------------------------------------------------------------------");
		logger.debug("sequenceMap(1)=" + getSequenceMap().get(1));
		logger.debug("------------------------------------------------------------------------------");

		rebuildFieldMapAndList();
		logger.debug("fieldMap (rebuilt)=" + getFieldMap());
	}

	// build FieldMap with 'allowedFollowByFields'
	private void rebuildFieldMapAndList() {
		AllowedFollowByFieldsBuilder builder = new AllowedFollowByFieldsBuilder(this.fieldList, this.sequenceMap);
		builder.build();

		if (getFieldMap().size() == getFieldList().size()) {
			Map<Integer, List<Field>> allowedFollowByFieldsMap = builder.getAllowedFollowByFieldsMap();
			for (int i = 0; i < getFieldList().size(); i++) {
				Field fieldFromList = getFieldList().get(i);
				Integer fieldId = fieldFromList.getId();
				Field fieldFromMap = getFieldMap().get(fieldId);

				List<Field> allowedFollowByFieldIds = allowedFollowByFieldsMap.get(fieldId);
				fieldFromMap.setAllowedFollowByFields(allowedFollowByFieldIds);
				fieldFromList.setAllowedFollowByFields(allowedFollowByFieldIds);

				// Set allowedFollowByFieldNames as well
				//				List<Field> allowedFollowByFieldNames = new ArrayList<Field>();
				//				for (Field id : allowedFollowByFieldIds) {
				//					Field f = getFieldMap().get(id);

				// TODO
				//					if (f.getOptions() != null && f.getOptions().getOptionList() != null
				//							&& f.getOptions().getOptionList().size() > 0) {
				//						//						addRefinedAllowedFollowByFieldNamesByOptions(f, allowedFollowByFieldNames);
				//						allowedFollowByFieldNames.addAll(f.getFullOptionNames());
				//					} else {
				//						String tagName = f.getTag();
				//						allowedFollowByFieldNames.add(tagName);
				//					}
				//				}
				//				fieldFromMap.setAllowedFollowByFields(allowedFollowByFieldNames);
				//				fieldFromList.setAllowedFollowByFields(allowedFollowByFieldNames);
			}
		} else {
			// TODO: 
			logger.error("Something went wrong.  Possibly the MT schema is not set properly.  Please check mt{xxx}_schema.xml");
		}
	}

	//	private void addRefinedAllowedFollowByFieldNamesByOptions(Field field,
	//			List<String> allowedFollowByFieldNames) {
	//		String tagPrefix = getTagPrefix(field.getTag());
	//
	//		List<Option> optionList = field.getOptions().getOptionList();
	//		for (Option option : optionList) {
	//			allowedFollowByFieldNames.add(tagPrefix + option.getName());
	//		}
	//	}
	//
	//	private String getTagPrefix(String tag) {
	//		int i = 0;
	//		for (Character c : tag.toCharArray()) {
	//			if (!Character.isDigit(c)) {
	//				break;
	//			}
	//			i++;
	//		}
	//		return tag.substring(0, i);
	//	}

	private void processCharacters(XMLStreamReader xmlr) {
		if (!xmlr.hasText()) {
			return;
		}

		String text = xmlr.getText();
		if (StringUtils.isBlank(text)) {
			return;
		}

		//		String elementName = xmlr.getLocalName();
		//		if (elementName.equals("genericFieldName")) {
		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();

			// genericFieldName
			if (xmlBean instanceof GenericFieldName) {
				((GenericFieldName) xmlBean).setText(text);
			}
			// detailedFieldName
			else if (xmlBean instanceof DetailedFieldName) {
				((DetailedFieldName) xmlBean).setText(text);
			}
			// value
			else if (xmlBean instanceof Value) {
				((Value) xmlBean).setText(text);
			}
			// format
			else if (xmlBean instanceof Format) {
				String formatText = fieldFormatMap.get(text);
				((Format) xmlBean).setText(StringUtils.isNotBlank(formatText) ? formatText : text);
			}
			// description
			else if (xmlBean instanceof Description) {
				((Description) xmlBean).setText(text);
			}
			// Unrecognized xmlBean
			else {
				logger.error("Unrecognized characters=" + xmlBean);
			}

		}
		//		}
	}

	private void processEndElement(XMLStreamReader xmlr) {
		String elementName = xmlr.getLocalName();

		if (canPopFromParentElementStack(elementName)) {
			parentElementStack.pop();
		}
	}

	private void processStartElement(XMLStreamReader xmlr) {
		String elementName = xmlr.getLocalName();
		//		logger.debug("elementName=" + elementName);
		Map<String, String> attributes = processAttribute(xmlr);

		XmlBean xmlBean = null;
		// MT
		if (elementName.startsWith("mt")) {
			xmlBean = processMTElement(elementName, attributes);
		}

		// sequence
		else if (elementName.equals("sequence")) {
			xmlBean = processSequenceElement(attributes);
		}

		// field
		else if (elementName.equals("field")) {
			xmlBean = processFieldElement(attributes);
		}
		// qualifier
		else if (elementName.equals("qualifier")) {
			xmlBean = processQualifierElement(attributes);
		}
		// value
		else if (elementName.equals("value")) {
			xmlBean = processValueElement(attributes, xmlr);
		}
		// format
		else if (elementName.equals("format")) {
			xmlBean = processFormatElement(attributes, xmlr);
		}
		// genericFieldName
		else if (elementName.equals("genericFieldName")) {
			xmlBean = processGenericFieldNameElement(attributes, xmlr);
		}

		// detailedFieldName
		else if (elementName.equals("detailedFieldName")) {
			xmlBean = processDetailedFieldNameElement(attributes, xmlr);
		}

		// content
		else if (elementName.equals("content")) {
			xmlBean = processContentElement(attributes, xmlr);
		}

		// description
		else if (elementName.equals("description")) {
			xmlBean = processDescriptionElement(attributes, xmlr);
		}

		// options
		else if (elementName.equals("options")) {
			xmlBean = processOptionsElement(attributes, xmlr);
		}
		// option
		else if (elementName.equals("option")) {
			xmlBean = processOptionElement(attributes, xmlr);
		}
		//
		else {
			logger.debug("unrecognized field=" + elementName);
		}

		if (canPushToParentElementStack(elementName)) {
			parentElementStack.push(xmlBean);
		}
	}

	private Map<String, String> processAttribute(XMLStreamReader xmlr) {
		int count = xmlr.getAttributeCount();
		Map<String, String> map = null;
		if (count > 0) {
			map = new HashMap<String, String>();
			for (int i = 0; i < count; i++) {
				String attributeName = xmlr.getAttributeName(i).toString();
				String attributeValue = xmlr.getAttributeValue(i);
				map.put(attributeName, attributeValue);
			}
		}
		return map;
	}

	// -- 

	private XmlBean processFormatElement(Map<String, String> attributes, XMLStreamReader xmlr) {

		Format format = getXmlBeanFactory().newFormatXmlBean();
		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Content) {
				((Content) xmlBean).setFormat(format);
			} else if (xmlBean instanceof Option) {
				((Option) xmlBean).setFormat(format);
			} else if (xmlBean instanceof Qualifier) {
				((Qualifier) xmlBean).setFormat(format);
			}
		}
		return format;
		//		String text = xmlr.getText();
		//
		//		if (!parentElementStack.isEmpty()) {
		//			XmlBean xmlBean = parentElementStack.peek();
		//			if (xmlBean instanceof Qualifier) {
		//				((Qualifier) xmlBean).setFormat(text);
		//			} else if (xmlBean instanceof Content) {
		//				((Content) xmlBean).setFormat(text);
		//			} else if (xmlBean instanceof Option) {
		//				((Option) xmlBean).setFormat(text);
		//			}
		//		}
	}

	private XmlBean processDescriptionElement(Map<String, String> attributes, XMLStreamReader xmlr) {

		Description description = getXmlBeanFactory().newDescriptionXmlBean();
		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Qualifier) {
				((Qualifier) xmlBean).setDescription(description);
			}
		}
		return description;

		//		String text = xmlr.getText();
		//
		//		if (!parentElementStack.isEmpty()) {
		//			XmlBean xmlBean = parentElementStack.peek();
		//			if (xmlBean instanceof Qualifier) {
		//				((Qualifier) xmlBean).setDescription(text);
		//			}
		//		}
	}

	private XmlBean processValueElement(Map<String, String> attributes, XMLStreamReader xmlr) {

		Value value = getXmlBeanFactory().newValueXmlBean();
		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Content) {
				((Content) xmlBean).setValue(value);
			} else if (xmlBean instanceof Qualifier) {
				((Qualifier) xmlBean).setValue(value);
			}
		}
		return value;

		//		String text = xmlr.getText();
		//
		//		if (!parentElementStack.isEmpty()) {
		//			XmlBean xmlBean = parentElementStack.peek();
		//			if (xmlBean instanceof Qualifier) {
		//				((Qualifier) xmlBean).setValue(text);
		//			} else if (xmlBean instanceof Content) {
		//				((Content) xmlBean).setValue(text);
		//			}
		//		}
	}

	private XmlBean processDetailedFieldNameElement(Map<String, String> attribues, XMLStreamReader xmlr) {

		DetailedFieldName detailedFieldName = getXmlBeanFactory().newDetailedFieldNameXmlBean();
		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Field) {
				((Field) xmlBean).setDetailedFieldName(detailedFieldName);
			}
		}
		return detailedFieldName;

		//		String text = xmlr.getText();
		//
		//		if (!parentElementStack.isEmpty()) {
		//			XmlBean xmlBean = parentElementStack.peek();
		//			if (xmlBean instanceof Field) {
		//				if (StringUtils.isNotBlank(text)) {
		//					DetailedFieldName detailedFieldName = getXmlBeanFactory().newDetailedFieldNameXmlBean();
		//					detailedFieldName.setText(text);
		//
		//					((Field) xmlBean).setDetailedFieldName(detailedFieldName);
		//				}
		//			}
		//		}
	}

	private XmlBean processGenericFieldNameElement(Map<String, String> attributes, XMLStreamReader xmlr) {
		GenericFieldName genericFieldName = getXmlBeanFactory().newGenericFieldNameXmlBean();
		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Field) {
				((Field) xmlBean).setGenericFieldName(genericFieldName);
			}
		}
		return genericFieldName;
	}

	private XmlBean processOptionsElement(Map<String, String> attributes, XMLStreamReader xmlr) {
		Options options = getXmlBeanFactory().newOptionsXmlBean();

		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Field) {
				((Field) xmlBean).setOptions(options);
			}
		}

		//		if (!fieldStack.isEmpty()) {
		//			Field field = fieldStack.peek();
		//			field.setOptions(options);
		//		}
		//		optionsStack.push(options);
		//		parentElementStack.push(options);

		return options;
	}

	private XmlBean processQualifierElement(Map<String, String> attributes) {
		Qualifier qualifier = getXmlBeanFactory().newQualifierXmlBean();

		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Field) {
				((Field) xmlBean).setQualifier(qualifier);
			}
		}
		//		
		//		if (!fieldStack.isEmpty()) {
		//			Field field = fieldStack.peek();
		//			field.setQualifier(qualifier);
		//		}

		//		parentElementStack.push(qualifier);
		//		qualifierStack.push(qualifier);

		//		++tagQualifierCounter;

		return qualifier;
	}

	private XmlBean processContentElement(Map<String, String> attributes, XMLStreamReader xmlr) {
		Content content = getXmlBeanFactory().newContentXmlBean();

		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Field) {
				((Field) xmlBean).setContent(content);
			}
		}

		//		if (!fieldStack.isEmpty()) {
		//			Field field = fieldStack.peek();
		//			field.setContent(content);
		//		}
		//		parentElementStack.push(content);
		//		contentStack.push(content);

		//		++tagContentCounter;

		return content;
	}

	private XmlBean processOptionElement(Map<String, String> attributes, XMLStreamReader xmlr) {
		Option option = getXmlBeanFactory().newOptionXmlBean();
		option.setName(getNameAttribute(attributes));

		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Options) {
				((Options) xmlBean).addOption(option);
			}
		}

		//		parentElementStack.push(option);

		return option;
	}

	private XmlBean processFieldElement(Map<String, String> attributes) {
		Field field = getXmlBeanFactory().newFieldXmlBean();
		field.setId(getIdAttribute(attributes));
		field.setTag(getTagAttribute(attributes));
		field.setStatus(getStatusAttribute(attributes));
		field.setRepetitive(getRepetitiveAttribute(attributes));
		field.setRepetitiveStart(getRepetitiveStartAttribute(attributes));
		field.setRepetitiveEnd(getRepetitiveEndAttribute(attributes));
		field.setFirstOfSequence(getFirstOfSequenceAttribute(attributes));
		field.setLastOfSequence(getLastOfSequenceAttribute(attributes));

		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof Sequence) {
				Sequence sequence = (Sequence) xmlBean;
				field.setSequenceId(sequence.getId());
				field.setSequenceShortName(sequence.getShortName());
				sequence.addField(field);
			}
		}
		//		if (!sequenceStack.isEmpty()) {
		//			Sequence sequence = sequenceStack.peek();
		//			field.setSequenceId(sequence.getId());
		//		}

		//		parentElementStack.push(field);
		//		fieldStack.push(field);
		fieldMap.put(field.getId(), field);
		fieldList.add(field);

		//		++tagFieldCounter;
		return field;
	}

	private XmlBean processSequenceElement(Map<String, String> attributes) {
		Sequence sequence = getXmlBeanFactory().newSequenceXmlBean();
		sequence.setId(getIdAttribute(attributes));
		sequence.setName(getNameAttribute(attributes));
		sequence.setShortName(getShortNameAttribute(attributes));
		sequence.setStatus(getStatusAttribute(attributes));
		sequence.setRepetitive(getRepetitiveAttribute(attributes));
		Integer parentSequenceId = getParentSequenceIdAttribute(attributes);
		if (parentSequenceId != null) {
			sequence.setParentSequenceId(parentSequenceId);
		}
		Integer nextSequenceId = getNextSequenceIdAttribute(attributes);
		if (nextSequenceId != null) {
			sequence.setNextSequenceId(nextSequenceId);
		}

		if (!parentElementStack.isEmpty()) {
			XmlBean xmlBean = parentElementStack.peek();
			if (xmlBean instanceof MTMessage) {
				((MTMessage) xmlBean).addSequence(sequence);
			}
			//
			else if (xmlBean instanceof Sequence) {
				((Sequence) xmlBean).addSequence(sequence);
			}

		}

		//		parentElementStack.push(sequence);
		//		sequenceStack.push(sequence);
		sequenceMap.put(sequence.getId(), sequence);

		//		this.mtMessageXmlBean.toString();

		//		++tagSequenceCounter;
		return sequence;
	}

	private XmlBean processMTElement(String elementName, Map<String, String> attributes) {
		String id = attributes.get("id");
		//		mtMessageXmlBean = getXmlBeanFactory().newSwiftMessageXmlBean(elementName);
		mtMessageXmlBean = getXmlBeanFactory().newSwiftMessageXmlBean("mt" + id);
		mtMessageXmlBean.setId(id);
		mtMessageXmlBean.setName(attributes.get("name"));

		//		parentElementStack.push(mtMessageXmlBean);
		//		++tagMtCounter;

		return mtMessageXmlBean;
	}

	// -- 
	private boolean canPushToParentElementStack(String elementName) {
		return canAccessParentElementStack(elementName);
	}

	private boolean canPopFromParentElementStack(String elementName) {
		return canAccessParentElementStack(elementName);
	}

	private boolean canAccessParentElementStack(String elementName) {
		if (accessList.contains(elementName)) {
			return true;
		}
		if (elementName.startsWith("mt")) {
			return true;
		}

		return false;
	}

	// -- get attributes
	private Boolean getRepetitiveStartAttribute(Map<String, String> attributes) {
		String repetitiveStart = attributes.get("repetitiveStart");
		return StringUtils.isNotBlank(repetitiveStart) && repetitiveStart.equals("Y") ? true : false;
	}

	private Boolean getFirstOfSequenceAttribute(Map<String, String> attributes) {
		String firstOfSequence = attributes.get("firstOfSequence");
		return StringUtils.isNotBlank(firstOfSequence) && firstOfSequence.equals("Y") ? true : false;
	}

	private Boolean getLastOfSequenceAttribute(Map<String, String> attributes) {
		String lastOfSequence = attributes.get("lastOfSequence");
		return StringUtils.isNotBlank(lastOfSequence) && lastOfSequence.equals("Y") ? true : false;
	}

	private Boolean getRepetitiveEndAttribute(Map<String, String> attributes) {
		String repetitiveEnd = attributes.get("repetitiveEnd");
		return StringUtils.isNotBlank(repetitiveEnd) && repetitiveEnd.equals("Y") ? true : false;
	}

	private Boolean getRepetitiveAttribute(Map<String, String> attributes) {
		String repetitive = attributes.get("repetitive");
		return StringUtils.isNotBlank(repetitive) && repetitive.equals("Y") ? true : false;
	}

	private Status getStatusAttribute(Map<String, String> attributes) {
		String status = attributes.get("status");
		return StringUtils.isNotBlank(status) && status.equals(Status.MANDATORY.getText()) ? Status.MANDATORY : Status.OPTIONAL;
	}

	private String getTagAttribute(Map<String, String> attributes) {
		String tag = attributes.get("tag");
		return tag != null ? tag : "";
	}

	private Integer getNextSequenceIdAttribute(Map<String, String> attributes) {
		String nextSequenceId = attributes.get("nextSequenceId");
		if (StringUtils.isNotBlank(nextSequenceId)) {
			return Integer.parseInt(nextSequenceId);
		}
		return null;
	}

	private Integer getParentSequenceIdAttribute(Map<String, String> attributes) {
		String parentSequenceId = attributes.get("parentSequenceId");
		if (StringUtils.isNotBlank(parentSequenceId)) {
			return Integer.parseInt(parentSequenceId);
		}
		return null;
	}

	private Integer getIdAttribute(Map<String, String> attributes) {
		String id = attributes.get("id");
		if (StringUtils.isNotBlank(id)) {
			return Integer.parseInt(id);
		}
		return -1;
	}

	private String getNameAttribute(Map<String, String> attributes) {
		String name = attributes.get("name");
		return name != null ? name : "";
	}

	private String getShortNameAttribute(Map<String, String> attributes) {
		String shortName = attributes.get("shortName");
		return shortName != null ? shortName : "";
	}

	// -- private methods
	private XmlBeanFactory getXmlBeanFactory() {
		return xmlBeanFactory;
	}

	private XMLStreamReader getXmlStreamReader() {
		return this.xmlStreamReader;
	}

	// Get the immutable XMLEvent from given XMLStreamReader using XMLEventAllocator 
	private XMLEvent getXMLEvent(XMLStreamReader reader) throws XMLStreamException {
		return xmlEventAllocator.allocate(reader);
	}

	public MTMessage getMTMessageXmlBean() {
		return this.mtMessageXmlBean;
	}

	public Map<Integer, Sequence> getSequenceMap() {
		return this.sequenceMap;
	}

	public Map<Integer, Field> getFieldMap() {
		return this.fieldMap;
	}

	public List<Field> getFieldList() {
		return this.fieldList;
	}

	// -- 
	public static void main(String[] args) throws Exception {
		XmlBeanParser main = new XmlBeanParser(new File("D:\\workspace_swiftvalidator\\swiftvalidator\\resources\\swift_library\\mt541_schema.xml"));
		main.parse();
		main.test();
	}

	private void test() {
		int i = 0;
		//		Map<Integer, Field> m = getFieldMap();
		List<Field> list = getFieldList();
		System.out.println(list);
		//		Map<Integer, Sequence> seqMap = getSequenceMap();
		//		MTMessage msg = getMTMessageXmlBean();
		int j = 0;

		Field f = list.get(0);
		f.getAllowedFollowByFields();

	}
}