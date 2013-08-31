package net.uglobal.swiftvalidator.xml;

import net.uglobal.swiftvalidator.xml.beans.Content;
import net.uglobal.swiftvalidator.xml.beans.Description;
import net.uglobal.swiftvalidator.xml.beans.DetailedFieldName;
import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.Format;
import net.uglobal.swiftvalidator.xml.beans.GenericFieldName;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;
import net.uglobal.swiftvalidator.xml.beans.Option;
import net.uglobal.swiftvalidator.xml.beans.Options;
import net.uglobal.swiftvalidator.xml.beans.Qualifier;
import net.uglobal.swiftvalidator.xml.beans.Sequence;
import net.uglobal.swiftvalidator.xml.beans.Value;

import org.apache.log4j.Logger;

public class XmlBeanFactory {

	private static final Logger logger = Logger.getLogger(XmlBeanFactory.class);

	private static XmlBeanFactory instance;

	private XmlBeanFactory() {
	}

	public static XmlBeanFactory getInstance() {
		if (instance == null) {
			instance = new XmlBeanFactory();
		}
		return instance;
	}

	public MTMessage newSwiftMessageXmlBean(String mt) {
		Class clazz = null;
		try {
			clazz = Class.forName("net.uglobal.swiftvalidator.xml.beans." + mt.toUpperCase());
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage());
		}
		MTMessage mtMessage = null;
		try {
			mtMessage = (MTMessage) clazz.newInstance();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return mtMessage;
	}

	public Sequence newSequenceXmlBean() {
		return new Sequence();
	}

	public Field newFieldXmlBean() {
		return new Field();
	}

	public Options newOptionsXmlBean() {
		return new Options();
	}

	public Option newOptionXmlBean() {
		return new Option();
	}

	public Qualifier newQualifierXmlBean() {
		return new Qualifier();
	}

	public GenericFieldName newGenericFieldNameXmlBean() {
		return new GenericFieldName();
	}

	public DetailedFieldName newDetailedFieldNameXmlBean() {
		return new DetailedFieldName();
	}

	public Value newValueXmlBean() {
		return new Value();
	}

	public Description newDescriptionXmlBean() {
		return new Description();
	}

	public Format newFormatXmlBean() {
		return new Format();
	}

	public Content newContentXmlBean() {
		return new Content();
	}
}
