package net.uglobal.swiftvalidator.xml.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.uglobal.swiftvalidator.swift.field.Field;
import net.uglobal.swiftvalidator.swift.model.SwiftMessage;

import org.apache.log4j.Logger;

public abstract class MTMessage implements XmlBean {

	private static final Logger logger = Logger.getLogger(MTMessage.class);

	// key=sequenceId, value=Sequence
	private final Map<Integer, Sequence> enrichedSequencesBySequenceId = new HashMap<Integer, Sequence>();

	// key=fieldName, value=List<Field>
	private final Map<String, List<Field>> enrichedFieldsByFieldName = new HashMap<String, List<Field>>();

	// key=Class<Field>, List<Field>
	private final Map<Class<Field>, List<Field>> enrichedFieldsByFieldClass = new HashMap<Class<Field>, List<Field>>();

	// key=Sequence, value=List<Field>
	private final Map<Sequence, List<Field>> enrichedFieldsBySequence = new LinkedHashMap<Sequence, List<Field>>();

	// key=sequenceShortName, value=List<Field>
	private final Map<String, List<Field>> enrichedFieldsBySequenceShortName = new LinkedHashMap<String, List<Field>>();

	private final List<Field> enrichedFieldsList = new ArrayList<Field>();

	private SwiftMessage swiftMessage;

	public List<Field> getFields(String fieldName) {
		if (enrichedFieldsByFieldName.containsKey(fieldName)) {
			return enrichedFieldsByFieldName.get(fieldName);
		} else {
			return null;
		}
	}

	public Map<String, List<Field>> getFieldsByFieldName() {
		return this.enrichedFieldsByFieldName;
	}

	public void addEnrichedField(net.uglobal.swiftvalidator.swift.field.Field field, net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
		addEnrichedFieldToEnrichedFieldsList(field, xmlField);
		addEnrichedFieldToEnrichedFieldsByFieldName(field, xmlField);

		addEnrichedFieldToEnrichedFieldsBySequence(field, xmlField);

		addEnrichedFieldToEnrichedFieldsBySequenceShortName(field, xmlField);

		try {
			addEnrichedFieldToEnrichedFieldByFieldClass(field, xmlField);
		} catch (ClassNotFoundException e) {
			logger.error(e.getMessage(), e);
		}
	}

	public Map<Integer, Sequence> getSequencesBySequenceId() {
		return enrichedSequencesBySequenceId;
	}

	public void setEnrichedSequencesBySequenceId(Map<Integer, Sequence> enrichedMap) {
		enrichedSequencesBySequenceId.putAll(enrichedMap);
	}

	public Map<Sequence, List<Field>> getFieldsBySequence() {
		return enrichedFieldsBySequence;
	}

	public Map<Class<Field>, List<Field>> getFieldsByFieldClass() {
		return enrichedFieldsByFieldClass;
	}

	public Map<String, List<Field>> getFieldsBySequenceShortName() {
		return enrichedFieldsBySequenceShortName;
	}

	public List<Field> getFieldsList() {
		return enrichedFieldsList;
	}

	public void setSwiftMessage(SwiftMessage swiftMessage) {
		this.swiftMessage = swiftMessage;
	}

	public SwiftMessage getSwiftMessage() {
		return this.swiftMessage;
	}

	public MTType getMTType() {
		return MTType.fromMTMessage(getClass());
	}

	// -- 
	private void addEnrichedFieldToEnrichedFieldsList(final net.uglobal.swiftvalidator.swift.field.Field field,
			final net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
		enrichedFieldsList.add(field);
	}

	private void addEnrichedFieldToEnrichedFieldsBySequenceShortName(final net.uglobal.swiftvalidator.swift.field.Field field,
			final net.uglobal.swiftvalidator.xml.beans.Field xmlField) {

		String sequenceShortName = xmlField.getSequenceShortName();
		if (enrichedFieldsBySequenceShortName.containsKey(sequenceShortName)) {
			enrichedFieldsBySequenceShortName.get(sequenceShortName).add(field);
		} else {
			enrichedFieldsBySequenceShortName.put(sequenceShortName, new ArrayList<net.uglobal.swiftvalidator.swift.field.Field>() {
				{
					add(field);
				}
			});
		}
	}

	private void addEnrichedFieldToEnrichedFieldsBySequence(final net.uglobal.swiftvalidator.swift.field.Field field,
			final net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
		Integer sequenceId = xmlField.getSequenceId();

		Sequence sequence = enrichedSequencesBySequenceId.get(sequenceId);

		if (enrichedFieldsBySequence.containsKey(sequenceId)) {
			enrichedFieldsBySequence.get(sequence).add(field);
		} else {
			enrichedFieldsBySequence.put(sequence, new ArrayList<net.uglobal.swiftvalidator.swift.field.Field>() {
				{
					add(field);
				}
			});
		}
	}

	private void addEnrichedFieldToEnrichedFieldByFieldClass(final net.uglobal.swiftvalidator.swift.field.Field field,
			final net.uglobal.swiftvalidator.xml.beans.Field xmlField) throws ClassNotFoundException {
		Class<Field> clazz = (Class<Field>) field.getClass();
		if (enrichedFieldsByFieldClass.containsKey(clazz)) {
			enrichedFieldsByFieldClass.get(clazz).add(field);
		} else {
			enrichedFieldsByFieldClass.put(clazz, new ArrayList<net.uglobal.swiftvalidator.swift.field.Field>() {
				{
					add(field);
				}
			});
		}
	}

	private void addEnrichedFieldToEnrichedFieldsByFieldName(final net.uglobal.swiftvalidator.swift.field.Field field,
			final net.uglobal.swiftvalidator.xml.beans.Field xmlField) {
		String fieldName = field.getClass().getSimpleName();
		// fieldName = Fieldxxx (e.g. Field98A)
		// remove the string 'Field'
		fieldName = fieldName == null ? "" : fieldName.substring(5, fieldName.length());

		if (enrichedFieldsByFieldName.containsKey(fieldName)) {
			enrichedFieldsByFieldName.get(fieldName).add(field);
		} else {
			enrichedFieldsByFieldName.put(fieldName, new ArrayList<net.uglobal.swiftvalidator.swift.field.Field>() {
				{
					add(field);
				}
			});
		}
	}

	protected List<Field> filterFieldsBySequenceShortName(List<Field> fields, String sequenceShortName) {
		if (fields != null && fields.size() > 0) {
			for (Field field : fields) {
				if (!field.getSequenceShortName().equals(sequenceShortName)) {
					fields.remove(field);
				}
			}
		}
		return fields;
	}

	// ----------------------------
	private String id;
	private String name;
	private final List<Sequence> sequenceList = new ArrayList<Sequence>();

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Sequence> getSequenceList() {
		return sequenceList;
	}

	public void addSequence(Sequence sequence) {
		sequenceList.add(sequence);
	}

	//	public void setSequenceList(List<Sequence> sequenceList) {
	//		this.sequenceList = sequenceList;
	//	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("MTMessage [");
		sb.append("id=").append(getId()).append(", ");
		sb.append("name=").append(getName());
		//		if (sequenceList.size() > 0) {
		//			sb.append(", ");
		//			for (Sequence sequence : sequenceList) {
		//				sb.append("sequence=").append(sequence).append(", ");
		//			}
		//			sb.delete(sb.length() - 2, sb.length());
		//		}
		sb.append("]");
		return sb.toString();
	}
}
