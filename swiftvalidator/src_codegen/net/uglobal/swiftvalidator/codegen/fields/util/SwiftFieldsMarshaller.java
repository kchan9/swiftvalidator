package net.uglobal.swiftvalidator.codegen.fields.util;

//import net.uglobal.swiftvalidator.codegen.beans.CodeGenConfig;
import net.uglobal.swiftvalidator.codegen.fields.beans.Component;
import net.uglobal.swiftvalidator.codegen.fields.beans.Field;
import net.uglobal.swiftvalidator.codegen.fields.beans.FieldDictionary;
import net.uglobal.swiftvalidator.codegen.fields.beans.Version;

import com.thoughtworks.xstream.XStream;

public final class SwiftFieldsMarshaller {
	private static final XStream xstream = new XStream() {
		{
			alias("fieldDictionary", FieldDictionary.class);
			//			alias("codeGenerationConfig", CodeGenConfig.class);
			alias("field", Field.class);
			alias("component", Component.class);
			//			alias("fields", Fields.class);
			alias("version", Version.class);

			//			addImplicitCollection(FieldDictionary.class, "fields");
			addImplicitCollection(Field.class, "components");

			useAttributeFor(FieldDictionary.class, "maxfid");
			useAttributeFor(Field.class, "name");
			useAttributeFor(Field.class, "fid");
			useAttributeFor(Component.class, "name");
			useAttributeFor(Version.class, "major");
			useAttributeFor(Version.class, "minor");
			//			useAttributeFor(Version.class, "value");
			//			useAttributeFor(Component.class, "order");
		}
	};

	public static String toXml(final FieldDictionary swiftFields) {
		//				final String xmlPrefix = "<?xml version=\"1.0\" encoding=\"utf-8\"?>";
		final StringBuilder sb = new StringBuilder();
		//		sb.append(xmlPrefix);
		sb.append(xstream.toXML(swiftFields));

		return sb.toString();
	}

	public static FieldDictionary fromXml(final String xml) {
		return (FieldDictionary) xstream.fromXML(xml);
	}
}
