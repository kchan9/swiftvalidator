package net.uglobal.swiftvalidator.xml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.Sequence;
import net.uglobal.swiftvalidator.xml.beans.Status;

import org.apache.log4j.Logger;

public class AllowedFollowByFieldsBuilder {

	private static final Logger logger = Logger.getLogger(AllowedFollowByFieldsBuilder.class);

	//	private Map<Integer, Field> fieldMap;
	private List<Field> fieldList;
	private Map<Integer, Sequence> sequenceMap;
	//	private List<Field> fieldListCopy;
	private Field currentProcessingField;

	private final Map<Integer, List<Field>> allowedFollowByFieldsMap = new HashMap<Integer, List<Field>>();

	//	private Integer fieldCursor; // this is to check at which field (order number), it is being processed

	private AllowedFollowByFieldsBuilder() {
	}

	//	public AllowedFollowByFieldsBuilder(Map<Integer, Field> fieldMap) {
	//		this.fieldMap = fieldMap;
	//	}

	public AllowedFollowByFieldsBuilder(List<Field> fieldList, Map<Integer, Sequence> sequenceMap) {
		this.fieldList = fieldList;
		this.sequenceMap = sequenceMap;
		//		fieldListCopy = (new Cloner()).deepClone(this.fieldList);
	}

	public void build() {
		currentProcessingField = getFirstField();
		for (int i = 0; i < this.fieldList.size(); i++) {
			List<Field> list = getAllowedFieldIds(i);

			StringBuilder sb = new StringBuilder();
			for (Field f : list) {
				sb.append(f.getId()).append(", ");
			}

			logger.debug("FieldID=" + this.fieldList.get(i).getId() + " {" + sb.toString() + "} ");

			allowedFollowByFieldsMap.put(this.fieldList.get(i).getId(), list);
		}
	}

	public Map<Integer, List<Field>> getAllowedFollowByFieldsMap() {
		return this.allowedFollowByFieldsMap;
	}

	private List<Field> getAllowedFieldIds(Integer fieldIdx) {
		List<Field> list = new ArrayList<Field>();

		Field currentField = this.fieldList.get(fieldIdx);
		Sequence currentSequence = this.sequenceMap.get(currentField.getSequenceId());

		// 1) if the current field is self-repeat (repetitiveStart=true, repetitiveEnd=true)
		if (currentField.getRepetitiveStart() && currentField.getRepetitiveEnd()) {
			list.add(this.fieldList.get(fieldIdx));
		}

		// 1) if the current field is the lastOfSequence
		// 2) and current sequence is repetitive
		// THEN add the first fieldOfSequence field to the list, and move on
		if (currentField.getLastOfSequence() && currentSequence.getRepetitive()) {
			list.add(currentSequence.getFieldList().get(0));
		}

		// starting from the next one and onward
		for (int i = (fieldIdx + 1); i < fieldList.size(); i++) {
			Field nextField = this.fieldList.get(i);
			Sequence nextSequence = sequenceMap.get(nextField.getSequenceId());

			// TODO: place holder for other conditions
			if (false) {

			}

			// 1) if current field is the lastOfSequence
			// 2) next field is firstOfSequence
			// 3) currentSequence's nextSequenceId == nextSequence's id
			// 4) next field is Mandatory
			// 5) next sequence is mandatory
			else if (currentField.getLastOfSequence() && nextField.getFirstOfSequence()
					&& currentSequence.getNextSequenceId() == nextField.getSequenceId() && nextField.getStatus() == Status.MANDATORY
					&& nextSequence.getStatus() == Status.MANDATORY) {
				list.add(this.fieldList.get(i));
				return list;
			}

			// 1) if current field is lastOfSequence
			// 2) current field's sequence is the parent of next field's sequence
			// 3) next field status is mandatory
			// THEN add to list, and move on 
			else if (currentField.getLastOfSequence() && nextSequence.getId() == currentSequence.getParentSequenceId()
					&& nextField.getStatus() == Status.MANDATORY) {
				list.add(this.fieldList.get(i));
				return list;
			}

			// 1) if current field is lastOfSequence
			// 2) current field's sequence is the parent of next field's sequence
			// 3) next field status is optional
			// THEN add to list, and move on 
			else if (currentField.getLastOfSequence() // 
					&& nextSequence.getId() == currentSequence.getParentSequenceId() // 
					&& nextField.getStatus() == Status.OPTIONAL // 
			) {
				list.add(this.fieldList.get(i));
			}

			// 1) if current field is lastOfSequence
			// 2) current field's sequence is the parent of next field's sequence
			// 3) next field status is optional
			// THEN add to list, and move on 
			else if (currentField.getLastOfSequence() // 
					&& nextSequence.getId() == currentSequence.getParentSequenceId() // 
					&& nextField.getStatus() == Status.OPTIONAL // 
			) {
				list.add(this.fieldList.get(i));
			}

			// 1) if the next field is mandatory 
			// 2) within the same sequence, 
			// THEN add to return list
			else if (nextField.getStatus() == Status.MANDATORY //  
					&& currentField.getSequenceId() == nextField.getSequenceId()// 
			) {
				list.add(this.fieldList.get(i));
				return list;
			}
			// 1) if next field is optional 
			// 2) within the same sequence, 
			// THEN add to list, and move on
			else if (nextField.getStatus() == Status.OPTIONAL && currentField.getSequenceId() == nextField.getSequenceId()) {
				list.add(this.fieldList.get(i));
			}
			// 1) if next field is optional 
			// 2) and the firstOfSequence 
			// 3) in a different sequence
			// THEN add to list, and move on 
			else if (nextField.getStatus() == Status.OPTIONAL && nextField.getFirstOfSequence()
					&& nextField.getSequenceId() != currentField.getSequenceId()) {
				list.add(this.fieldList.get(i));
			}
			// 1) if next field is mandatory
			// 2) and the firstOfSequence
			// 3) and currentSequence is parent of next sequence
			// 4) and nextSequence is mandatory
			// THEN add to list, and return
			else if (nextField.getStatus() == Status.MANDATORY && nextField.getFirstOfSequence() && nextSequence.getParentSequenceId() != null
					&& nextSequence.getParentSequenceId() == currentSequence.getId() && nextSequence.getStatus() == Status.MANDATORY) {
				list.add(this.fieldList.get(i));
				return list;
			}
			// 1) if next field is mandatory
			// 2) and the firstOfSequence
			// 3) and in a different sequence
			// 4) and next sequence is mandatory
			// 5) and currentSequence and nextSequence have the SAME level
			// 6) and next Sequence is NOT DUMMY
			// THEN add to list, and return
			else if (nextField.getStatus() == Status.MANDATORY && nextField.getFirstOfSequence() // 
					&& nextField.getSequenceId() != currentField.getSequenceId() //  
					&& nextSequence.getStatus() == Status.MANDATORY //  
					&& getSequenceLevel(currentSequence.getId()) == getSequenceLevel(nextSequence.getId()) // 
					&& !nextSequence.getShortName().equals("DUMMY") // 
			) {
				list.add(this.fieldList.get(i));
				return list;
			}

			// 1) if next field is mandatory
			// 2) and the firstOfSequence
			// 3) in a different sequence
			// 4) and current sequence level must be less than next sequence level (currSeqLevel < nextSeqLevel)
			// 5) and current sequence's parent equals the next sequence's parent (NOTE: if both parents are NULL, they are considered as equivalent)
			// THEN add to list, and move on 
			else if (nextField.getStatus() == Status.MANDATORY && nextField.getFirstOfSequence()
					&& nextField.getSequenceId() != currentField.getSequenceId()
					&& getSequenceLevel(currentField.getSequenceId()) <= getSequenceLevel(nextField.getSequenceId())
					&& currentSequence.getParentSequenceId() == nextSequence.getParentSequenceId()) {
				list.add(this.fieldList.get(i));
			}

			// 1) if next field is mandatory
			// 2) and the firstOfSequence
			// 3) in a different sequence
			// 4) and current sequence level must be less than next sequence level (currSeqLevel < nextSeqLevel)
			// 5) and current sequence is the parent of the next sequence
			else if (nextField.getStatus() == Status.MANDATORY && nextField.getFirstOfSequence()
					&& nextField.getSequenceId() != currentField.getSequenceId()
					&& getSequenceLevel(currentField.getSequenceId()) <= getSequenceLevel(nextField.getSequenceId())
					&& currentSequence.getId() == nextSequence.getParentSequenceId()) {
				list.add(this.fieldList.get(i));
			}

			// ------------------------------------------------------
			// 1) if next field is first of sequence
			// 2) and next field and current field are in different sequence
			// 3) current sequence is INNER than next sequence
			// 4) current field is NOT first of Sequence
			// 5) current field is NOT last of sequence
			// THEN add to list,
			//
			// NOTE: added for MT300 Field 26
			else if (nextField.getFirstOfSequence() // 
					&& nextField.getSequenceId() != currentField.getSequenceId() // 
					&& getSequenceLevel(currentSequence.getId()) > getSequenceLevel(nextSequence.getId()) // 
					&& !currentField.getFirstOfSequence() // 
			) {
				list.add(this.fieldList.get(i));
			}

			// 1) current field is NOT first of sequence
			// 2) current sequence is NOT DUMMY
			// 3) next sequence is parent of current sequence
			// 4) next field is last of sequence
			// 
			// NOTE: added this for MT300 Field 43, 44
			else if (!currentField.getFirstOfSequence() //
					//					&& !currentField.getLastOfSequence() //
					&& currentSequence.getShortName().equals("DUMMY") // 
					&& currentSequence.getParentSequenceId() == nextSequence.getId() //
					&& nextField.getLastOfSequence() // 
			) {
				list.add(this.fieldList.get(i));
			}
		}

		return list;
	}

	// -- 
	private Field getFirstField() {
		return fieldList.get(0);
	}

	private int getSequenceLevel(Integer seqId) {
		Sequence sequence = sequenceMap.get(seqId);

		int level = 0;
		Integer parentSequenceId = null;
		while ((parentSequenceId = sequence.getParentSequenceId()) != null) {
			sequence = sequenceMap.get(parentSequenceId);
			level++;
		}
		return level;
	}
}
