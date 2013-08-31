package net.uglobal.swiftvalidator.xml.beans;

import java.util.ArrayList;
import java.util.List;

/*
 * <sequence id="2" name="" status="O" repetitive="Y">
 *     <field id="6" tag="16R" status="M" repetitive="N">
 *         <qualifier />
 *         <genericFieldName />
 *         <detailedFieldName>Start of Block</detailedFieldName>
 *         <content>
 *             <value>LINK</value>
 *         </content>
 *     </field>
 *     <field></field>
 * </sequence> 
 */
public class Sequence implements XmlBean {
	private Integer id;
	private Integer parentSequenceId;
	private Integer nextSequenceId;
	private String name;
	private String shortName;
	private Status status;
	private Boolean repetitive;
	private Integer level;

	private List<Field> fieldList = new ArrayList<Field>();

	// SubSequence
	private List<Sequence> sequenceList = new ArrayList<Sequence>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParentSequenceId() {
		return parentSequenceId;
	}

	public void setParentSequenceId(Integer parentSequenceId) {
		this.parentSequenceId = parentSequenceId;
	}

	public Integer getNextSequenceId() {
		return this.nextSequenceId;
	}

	public void setNextSequenceId(Integer nextSequenceId) {
		this.nextSequenceId = nextSequenceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;

		// NOTE: hack 
		//		setLevel(shortName.length());
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Boolean getRepetitive() {
		return repetitive;
	}

	public void setRepetitive(Boolean repetitive) {
		this.repetitive = repetitive;
	}

	// -- field
	public List<Field> getFieldList() {
		return fieldList;
	}

	public void addField(Field field) {
		this.fieldList.add(field);
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

	// -- sequence
	public List<Sequence> getSequenceList() {
		return this.sequenceList;
	}

	public void addSequence(Sequence sequence) {
		this.sequenceList.add(sequence);
	}

	public void setSequenceList(List<Sequence> sequenceList) {
		this.sequenceList = sequenceList;
	}

	//	public Integer getLevel() {
	//		return level;
	//	}
	//
	//	public void setLevel(Integer level) {
	//		this.level = level;
	//	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[id=").append(getId());
		sb.append(", name=").append(getName());
		sb.append(", status=").append(getStatus().getText());
		sb.append(", repetitive=").append(getRepetitive());
		if (getParentSequenceId() != null) {
			sb.append(", parentSequenceId=").append(getParentSequenceId());
		}
		if (fieldList.size() > 0) {
			sb.append(", ");
			for (Field field : fieldList) {
				sb.append("field=").append(field).append(", ");
			}
			//			sb.substring(0, sb.length() - 2);
			sb.delete(sb.length() - 2, sb.length());
		}

		if (sequenceList.size() > 0) {
			sb.append(", ");
			for (Sequence sequence : sequenceList) {
				sb.append("sequence=").append(sequence).append(", ");
			}
			//			sb.substring(0, sb.length() - 2);
			sb.delete(sb.length() - 2, sb.length());
		}

		sb.append("]");
		return sb.toString();
	}
}
