package net.uglobal.swiftvalidator.xml.beans;

import java.util.ArrayList;
import java.util.List;

import net.uglobal.swiftvalidator.swift.field.*;

/*
 * <field id="1" tag="16R" status="M" repetitive="N" repetitiveStart="Y" repetitiveEnd="Y">
 *     <qualifier>
 *         <value></value>
 *         <format></format>
 *     </qualifier>
 *     <genericFieldName></genericFieldName>
 *     <detailedFieldName>Start of Block</detailedFieldName>
 *     <content>
 *         <value>GENL</value>
 *         <format></format>
 *     </content>
 *     <options>
 *         <option name="A">
 *             <format>:4!c//8!n</format>
 *         </option>
 *         <option name="C">
 *             <format>:4!c//8!n6!n</format>
 *         </option>
 *         <option name="C">
 *             <format>:4!c//8!n6!n[.3][/[N]2!n[2!n]]</format>
 *         </option>
 *     </options>
 * </field> 
 */

public class Field implements XmlBean {
	private Integer sequenceId;
	private String sequenceShortName;
	private Integer id;
	private String tag;
	private Status status;
	private Boolean repetitive;
	private Boolean repetitiveStart;
	private Boolean repetitiveEnd;
	private Boolean firstOfSequence;
	private Boolean lastOfSequence;
	private Qualifier qualifier;

	private GenericFieldName genericFieldName;
	private DetailedFieldName detailedFieldName;
	private Content content;

	private Options options;

	private List<Field> allowedFollowByFields;

	//	private List<Integer> allowedFollowByFieldIds;
	//	private List<String> allowedFollowByFieldNames;

	public List<Field> getAllowedFollowByFields() {
		return this.allowedFollowByFields;
	}

	public void setAllowedFollowByFields(List<Field> fields) {
		this.allowedFollowByFields = fields;
	}

	//	public List<String> getAllowedFollowByFieldNames() {
	//		return this.allowedFollowByFieldNames;
	//	}
	//
	//	public void setAllowedFollowByFieldNames(List<String> allowedFollowByFieldNames) {
	//		this.allowedFollowByFieldNames = allowedFollowByFieldNames;
	//	}
	//
	//	public List<Integer> getAllowedFollowByFieldIds() {
	//		return this.allowedFollowByFieldIds;
	//	}
	//
	//	public void setAllowedFollowByFieldIds(List<Integer> allowedFollowByFieldIds) {
	//		this.allowedFollowByFieldIds = allowedFollowByFieldIds;
	//	}
	//
	//	public void addAllowedFollowByFieldId(Integer fieldId) {
	//		this.allowedFollowByFieldIds.add(fieldId);
	//	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getSequenceShortName() {
		return sequenceShortName;
	}

	public void setSequenceShortName(String sequenceShortName) {
		this.sequenceShortName = sequenceShortName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
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

	public Boolean getRepetitiveStart() {
		return repetitiveStart;
	}

	public void setRepetitiveStart(Boolean repetitiveStart) {
		this.repetitiveStart = repetitiveStart;
	}

	public Boolean getFirstOfSequence() {
		return firstOfSequence;
	}

	public void setFirstOfSequence(Boolean firstOfSequence) {
		this.firstOfSequence = firstOfSequence;
	}

	public Boolean getLastOfSequence() {
		return lastOfSequence;
	}

	public void setLastOfSequence(Boolean lastOfSequence) {
		this.lastOfSequence = lastOfSequence;
	}

	public Boolean getRepetitiveEnd() {
		return repetitiveEnd;
	}

	public void setRepetitiveEnd(Boolean repetitiveEnd) {
		this.repetitiveEnd = repetitiveEnd;
	}

	public Qualifier getQualifier() {
		return qualifier;
	}

	public void setQualifier(Qualifier qualifier) {
		this.qualifier = qualifier;
	}

	public GenericFieldName getGenericFieldName() {
		return genericFieldName;
	}

	public void setGenericFieldName(GenericFieldName genericFieldName) {
		this.genericFieldName = genericFieldName;
	}

	public DetailedFieldName getDetailedFieldName() {
		return detailedFieldName;
	}

	public void setDetailedFieldName(DetailedFieldName detailedFieldName) {
		this.detailedFieldName = detailedFieldName;
	}

	public Content getContent() {
		return content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public List<String> getFullOptionNames() {
		if (getOptions() != null && getOptions().getOptionList() != null && getOptions().getOptionList().size() > 0) {
			List<String> fullOptionNames = new ArrayList<String>();
			String tagPrefix = getTagPrefix();
			for (Option option : getOptions().getOptionList()) {
				option.getName();
				fullOptionNames.add(tagPrefix + option.getName());
			}
			return fullOptionNames;
		}
		return null;
	}

	private String getTagPrefix() {
		int i = 0;
		for (Character c : getTag().toCharArray()) {
			if (!Character.isDigit(c)) {
				break;
			}
			i++;
		}
		return tag.substring(0, i);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[id=").append(getId());
		sb.append(", sequenceId=").append(getSequenceId());
		sb.append(", sequenceShortName=").append(getSequenceShortName());
		sb.append(", tag=").append(getTag());
		sb.append(", status=").append(getStatus().getText());
		sb.append(", repetitive=").append(getRepetitive());
		sb.append(", repetitiveStart=").append(getRepetitiveStart());
		sb.append(", repetitiveEnd=").append(getRepetitiveEnd());
		sb.append(", genericFieldName=").append(getGenericFieldName());
		sb.append(", detailedFieldName=").append(getDetailedFieldName());
		sb.append(", content=").append(getContent());
		sb.append(", options=").append(getOptions());
		sb.append(", qualifier=").append(getQualifier());

		List<Field> allowedFollowByFields = getAllowedFollowByFields();
		StringBuilder sb2 = new StringBuilder();
		if (allowedFollowByFields != null) {
			for (Field f : allowedFollowByFields) {
				sb2.append(f.getId()).append(", ");
			}
		}
		sb.append(", allowedFollowByFields=").append(sb2.toString());
		sb.append("]");
		return sb.toString();
	}

	// -- 
	//	public net.uglobal.swiftvalidator.swift.field.Field16R buildField16R(String validateData) {
	//		return new Field16R(validateData, this);
	//	}

	// *************************** IMPORTANT ***********************************
	// DO NOT REMOVE any lines below.  They are auto generated by code generator
	// *************************************************************************
	// %%%%%BEGIN%%%%%    public net.uglobal.swiftvalidator.swift.field.Field buildField(String validateData, String fieldName) {
        if (fieldName == null) {
            return null;
        }
        // NOTE: 
        // For now need to hardcode 16R and 16S in, since 'swift.fields.codegen.config.xml' does not have 16R and 16S defined.
        else if (fieldName.equals("16R")) {
            return new Field16R(validateData, this);
        }
        else if (fieldName.equals("16S")) {
            return new Field16S(validateData, this);
        }
        else if (fieldName.equals("11A")) {
            return new Field11A(validateData, this);
        }
        else if (fieldName.equals("12A")) {
            return new Field12A(validateData, this);
        }
        else if (fieldName.equals("12B")) {
            return new Field12B(validateData, this);
        }
        else if (fieldName.equals("12C")) {
            return new Field12C(validateData, this);
        }
        else if (fieldName.equals("13A")) {
            return new Field13A(validateData, this);
        }
        else if (fieldName.equals("13B")) {
            return new Field13B(validateData, this);
        }
        else if (fieldName.equals("13C")) {
            return new Field13C(validateData, this);
        }
        else if (fieldName.equals("13E")) {
            return new Field13E(validateData, this);
        }
        else if (fieldName.equals("13J")) {
            return new Field13J(validateData, this);
        }
        else if (fieldName.equals("13K")) {
            return new Field13K(validateData, this);
        }
        else if (fieldName.equals("14C")) {
            return new Field14C(validateData, this);
        }
        else if (fieldName.equals("16A")) {
            return new Field16A(validateData, this);
        }
        else if (fieldName.equals("17A")) {
            return new Field17A(validateData, this);
        }
        else if (fieldName.equals("17B")) {
            return new Field17B(validateData, this);
        }
        else if (fieldName.equals("17T")) {
            return new Field17T(validateData, this);
        }
        else if (fieldName.equals("17U")) {
            return new Field17U(validateData, this);
        }
        else if (fieldName.equals("19")) {
            return new Field19(validateData, this);
        }
        else if (fieldName.equals("19A")) {
            return new Field19A(validateData, this);
        }
        else if (fieldName.equals("19B")) {
            return new Field19B(validateData, this);
        }
        else if (fieldName.equals("20")) {
            return new Field20(validateData, this);
        }
        else if (fieldName.equals("20C")) {
            return new Field20C(validateData, this);
        }
        else if (fieldName.equals("20D")) {
            return new Field20D(validateData, this);
        }
        else if (fieldName.equals("21")) {
            return new Field21(validateData, this);
        }
        else if (fieldName.equals("21A")) {
            return new Field21A(validateData, this);
        }
        else if (fieldName.equals("21D")) {
            return new Field21D(validateData, this);
        }
        else if (fieldName.equals("21E")) {
            return new Field21E(validateData, this);
        }
        else if (fieldName.equals("21G")) {
            return new Field21G(validateData, this);
        }
        else if (fieldName.equals("21R")) {
            return new Field21R(validateData, this);
        }
        else if (fieldName.equals("22A")) {
            return new Field22A(validateData, this);
        }
        else if (fieldName.equals("22C")) {
            return new Field22C(validateData, this);
        }
        else if (fieldName.equals("22F")) {
            return new Field22F(validateData, this);
        }
        else if (fieldName.equals("22H")) {
            return new Field22H(validateData, this);
        }
        else if (fieldName.equals("23")) {
            return new Field23(validateData, this);
        }
        else if (fieldName.equals("23B")) {
            return new Field23B(validateData, this);
        }
        else if (fieldName.equals("23E")) {
            return new Field23E(validateData, this);
        }
        else if (fieldName.equals("23G")) {
            return new Field23G(validateData, this);
        }
        else if (fieldName.equals("24B")) {
            return new Field24B(validateData, this);
        }
        else if (fieldName.equals("24D")) {
            return new Field24D(validateData, this);
        }
        else if (fieldName.equals("25")) {
            return new Field25(validateData, this);
        }
        else if (fieldName.equals("25D")) {
            return new Field25D(validateData, this);
        }
        else if (fieldName.equals("26H")) {
            return new Field26H(validateData, this);
        }
        else if (fieldName.equals("28")) {
            return new Field28(validateData, this);
        }
        else if (fieldName.equals("28C")) {
            return new Field28C(validateData, this);
        }
        else if (fieldName.equals("28D")) {
            return new Field28D(validateData, this);
        }
        else if (fieldName.equals("28E")) {
            return new Field28E(validateData, this);
        }
        else if (fieldName.equals("29A")) {
            return new Field29A(validateData, this);
        }
        else if (fieldName.equals("29B")) {
            return new Field29B(validateData, this);
        }
        else if (fieldName.equals("29C")) {
            return new Field29C(validateData, this);
        }
        else if (fieldName.equals("30")) {
            return new Field30(validateData, this);
        }
        else if (fieldName.equals("30F")) {
            return new Field30F(validateData, this);
        }
        else if (fieldName.equals("30P")) {
            return new Field30P(validateData, this);
        }
        else if (fieldName.equals("30T")) {
            return new Field30T(validateData, this);
        }
        else if (fieldName.equals("30V")) {
            return new Field30V(validateData, this);
        }
        else if (fieldName.equals("30X")) {
            return new Field30X(validateData, this);
        }
        else if (fieldName.equals("31C")) {
            return new Field31C(validateData, this);
        }
        else if (fieldName.equals("31E")) {
            return new Field31E(validateData, this);
        }
        else if (fieldName.equals("31F")) {
            return new Field31F(validateData, this);
        }
        else if (fieldName.equals("31L")) {
            return new Field31L(validateData, this);
        }
        else if (fieldName.equals("31P")) {
            return new Field31P(validateData, this);
        }
        else if (fieldName.equals("31S")) {
            return new Field31S(validateData, this);
        }
        else if (fieldName.equals("31X")) {
            return new Field31X(validateData, this);
        }
        else if (fieldName.equals("32A")) {
            return new Field32A(validateData, this);
        }
        else if (fieldName.equals("32B")) {
            return new Field32B(validateData, this);
        }
        else if (fieldName.equals("32G")) {
            return new Field32G(validateData, this);
        }
        else if (fieldName.equals("32J")) {
            return new Field32J(validateData, this);
        }
        else if (fieldName.equals("32M")) {
            return new Field32M(validateData, this);
        }
        else if (fieldName.equals("33B")) {
            return new Field33B(validateData, this);
        }
        else if (fieldName.equals("33S")) {
            return new Field33S(validateData, this);
        }
        else if (fieldName.equals("33T")) {
            return new Field33T(validateData, this);
        }
        else if (fieldName.equals("34A")) {
            return new Field34A(validateData, this);
        }
        else if (fieldName.equals("34B")) {
            return new Field34B(validateData, this);
        }
        else if (fieldName.equals("35A")) {
            return new Field35A(validateData, this);
        }
        else if (fieldName.equals("35B")) {
            return new Field35B(validateData, this);
        }
        else if (fieldName.equals("35C")) {
            return new Field35C(validateData, this);
        }
        else if (fieldName.equals("35D")) {
            return new Field35D(validateData, this);
        }
        else if (fieldName.equals("35E")) {
            return new Field35E(validateData, this);
        }
        else if (fieldName.equals("35F")) {
            return new Field35F(validateData, this);
        }
        else if (fieldName.equals("35H")) {
            return new Field35H(validateData, this);
        }
        else if (fieldName.equals("35L")) {
            return new Field35L(validateData, this);
        }
        else if (fieldName.equals("35N")) {
            return new Field35N(validateData, this);
        }
        else if (fieldName.equals("35S")) {
            return new Field35S(validateData, this);
        }
        else if (fieldName.equals("35U")) {
            return new Field35U(validateData, this);
        }
        else if (fieldName.equals("36")) {
            return new Field36(validateData, this);
        }
        else if (fieldName.equals("36A")) {
            return new Field36A(validateData, this);
        }
        else if (fieldName.equals("36B")) {
            return new Field36B(validateData, this);
        }
        else if (fieldName.equals("36C")) {
            return new Field36C(validateData, this);
        }
        else if (fieldName.equals("36E")) {
            return new Field36E(validateData, this);
        }
        else if (fieldName.equals("37A")) {
            return new Field37A(validateData, this);
        }
        else if (fieldName.equals("37B")) {
            return new Field37B(validateData, this);
        }
        else if (fieldName.equals("37C")) {
            return new Field37C(validateData, this);
        }
        else if (fieldName.equals("37D")) {
            return new Field37D(validateData, this);
        }
        else if (fieldName.equals("37E")) {
            return new Field37E(validateData, this);
        }
        else if (fieldName.equals("37F")) {
            return new Field37F(validateData, this);
        }
        else if (fieldName.equals("37J")) {
            return new Field37J(validateData, this);
        }
        else if (fieldName.equals("39P")) {
            return new Field39P(validateData, this);
        }
        else if (fieldName.equals("44A")) {
            return new Field44A(validateData, this);
        }
        else if (fieldName.equals("50")) {
            return new Field50(validateData, this);
        }
        else if (fieldName.equals("50A")) {
            return new Field50A(validateData, this);
        }
        else if (fieldName.equals("50C")) {
            return new Field50C(validateData, this);
        }
        else if (fieldName.equals("50F")) {
            return new Field50F(validateData, this);
        }
        else if (fieldName.equals("50K")) {
            return new Field50K(validateData, this);
        }
        else if (fieldName.equals("51A")) {
            return new Field51A(validateData, this);
        }
        else if (fieldName.equals("52A")) {
            return new Field52A(validateData, this);
        }
        else if (fieldName.equals("52C")) {
            return new Field52C(validateData, this);
        }
        else if (fieldName.equals("52D")) {
            return new Field52D(validateData, this);
        }
        else if (fieldName.equals("52G")) {
            return new Field52G(validateData, this);
        }
        else if (fieldName.equals("53A")) {
            return new Field53A(validateData, this);
        }
        else if (fieldName.equals("53C")) {
            return new Field53C(validateData, this);
        }
        else if (fieldName.equals("53B")) {
            return new Field53B(validateData, this);
        }
        else if (fieldName.equals("53D")) {
            return new Field53D(validateData, this);
        }
        else if (fieldName.equals("53J")) {
            return new Field53J(validateData, this);
        }
        else if (fieldName.equals("54A")) {
            return new Field54A(validateData, this);
        }
        else if (fieldName.equals("54B")) {
            return new Field54B(validateData, this);
        }
        else if (fieldName.equals("54D")) {
            return new Field54D(validateData, this);
        }
        else if (fieldName.equals("56A")) {
            return new Field56A(validateData, this);
        }
        else if (fieldName.equals("56C")) {
            return new Field56C(validateData, this);
        }
        else if (fieldName.equals("56D")) {
            return new Field56D(validateData, this);
        }
        else if (fieldName.equals("56J")) {
            return new Field56J(validateData, this);
        }
        else if (fieldName.equals("57A")) {
            return new Field57A(validateData, this);
        }
        else if (fieldName.equals("57B")) {
            return new Field57B(validateData, this);
        }
        else if (fieldName.equals("57C")) {
            return new Field57C(validateData, this);
        }
        else if (fieldName.equals("57D")) {
            return new Field57D(validateData, this);
        }
        else if (fieldName.equals("57J")) {
            return new Field57J(validateData, this);
        }
        else if (fieldName.equals("58A")) {
            return new Field58A(validateData, this);
        }
        else if (fieldName.equals("58B")) {
            return new Field58B(validateData, this);
        }
        else if (fieldName.equals("58D")) {
            return new Field58D(validateData, this);
        }
        else if (fieldName.equals("58J")) {
            return new Field58J(validateData, this);
        }
        else if (fieldName.equals("59")) {
            return new Field59(validateData, this);
        }
        else if (fieldName.equals("59A")) {
            return new Field59A(validateData, this);
        }
        else if (fieldName.equals("67A")) {
            return new Field67A(validateData, this);
        }
        else if (fieldName.equals("69A")) {
            return new Field69A(validateData, this);
        }
        else if (fieldName.equals("69B")) {
            return new Field69B(validateData, this);
        }
        else if (fieldName.equals("69C")) {
            return new Field69C(validateData, this);
        }
        else if (fieldName.equals("69D")) {
            return new Field69D(validateData, this);
        }
        else if (fieldName.equals("69E")) {
            return new Field69E(validateData, this);
        }
        else if (fieldName.equals("69F")) {
            return new Field69F(validateData, this);
        }
        else if (fieldName.equals("69J")) {
            return new Field69J(validateData, this);
        }
        else if (fieldName.equals("70")) {
            return new Field70(validateData, this);
        }
        else if (fieldName.equals("70C")) {
            return new Field70C(validateData, this);
        }
        else if (fieldName.equals("70D")) {
            return new Field70D(validateData, this);
        }
        else if (fieldName.equals("70E")) {
            return new Field70E(validateData, this);
        }
        else if (fieldName.equals("70F")) {
            return new Field70F(validateData, this);
        }
        else if (fieldName.equals("70G")) {
            return new Field70G(validateData, this);
        }
        else if (fieldName.equals("71B")) {
            return new Field71B(validateData, this);
        }
        else if (fieldName.equals("71C")) {
            return new Field71C(validateData, this);
        }
        else if (fieldName.equals("71F")) {
            return new Field71F(validateData, this);
        }
        else if (fieldName.equals("71G")) {
            return new Field71G(validateData, this);
        }
        else if (fieldName.equals("71H")) {
            return new Field71H(validateData, this);
        }
        else if (fieldName.equals("71J")) {
            return new Field71J(validateData, this);
        }
        else if (fieldName.equals("71K")) {
            return new Field71K(validateData, this);
        }
        else if (fieldName.equals("71L")) {
            return new Field71L(validateData, this);
        }
        else if (fieldName.equals("72")) {
            return new Field72(validateData, this);
        }
        else if (fieldName.equals("75")) {
            return new Field75(validateData, this);
        }
        else if (fieldName.equals("77D")) {
            return new Field77D(validateData, this);
        }
        else if (fieldName.equals("77H")) {
            return new Field77H(validateData, this);
        }
        else if (fieldName.equals("80C")) {
            return new Field80C(validateData, this);
        }
        else if (fieldName.equals("82A")) {
            return new Field82A(validateData, this);
        }
        else if (fieldName.equals("82D")) {
            return new Field82D(validateData, this);
        }
        else if (fieldName.equals("82J")) {
            return new Field82J(validateData, this);
        }
        else if (fieldName.equals("83A")) {
            return new Field83A(validateData, this);
        }
        else if (fieldName.equals("83C")) {
            return new Field83C(validateData, this);
        }
        else if (fieldName.equals("83D")) {
            return new Field83D(validateData, this);
        }
        else if (fieldName.equals("83J")) {
            return new Field83J(validateData, this);
        }
        else if (fieldName.equals("84A")) {
            return new Field84A(validateData, this);
        }
        else if (fieldName.equals("84B")) {
            return new Field84B(validateData, this);
        }
        else if (fieldName.equals("84D")) {
            return new Field84D(validateData, this);
        }
        else if (fieldName.equals("84J")) {
            return new Field84J(validateData, this);
        }
        else if (fieldName.equals("85A")) {
            return new Field85A(validateData, this);
        }
        else if (fieldName.equals("85B")) {
            return new Field85B(validateData, this);
        }
        else if (fieldName.equals("85D")) {
            return new Field85D(validateData, this);
        }
        else if (fieldName.equals("85J")) {
            return new Field85J(validateData, this);
        }
        else if (fieldName.equals("87A")) {
            return new Field87A(validateData, this);
        }
        else if (fieldName.equals("87D")) {
            return new Field87D(validateData, this);
        }
        else if (fieldName.equals("87J")) {
            return new Field87J(validateData, this);
        }
        else if (fieldName.equals("88A")) {
            return new Field88A(validateData, this);
        }
        else if (fieldName.equals("88D")) {
            return new Field88D(validateData, this);
        }
        else if (fieldName.equals("88J")) {
            return new Field88J(validateData, this);
        }
        else if (fieldName.equals("90A")) {
            return new Field90A(validateData, this);
        }
        else if (fieldName.equals("90B")) {
            return new Field90B(validateData, this);
        }
        else if (fieldName.equals("90E")) {
            return new Field90E(validateData, this);
        }
        else if (fieldName.equals("90F")) {
            return new Field90F(validateData, this);
        }
        else if (fieldName.equals("90J")) {
            return new Field90J(validateData, this);
        }
        else if (fieldName.equals("90K")) {
            return new Field90K(validateData, this);
        }
        else if (fieldName.equals("92A")) {
            return new Field92A(validateData, this);
        }
        else if (fieldName.equals("92B")) {
            return new Field92B(validateData, this);
        }
        else if (fieldName.equals("92C")) {
            return new Field92C(validateData, this);
        }
        else if (fieldName.equals("92D")) {
            return new Field92D(validateData, this);
        }
        else if (fieldName.equals("92F")) {
            return new Field92F(validateData, this);
        }
        else if (fieldName.equals("92J")) {
            return new Field92J(validateData, this);
        }
        else if (fieldName.equals("92K")) {
            return new Field92K(validateData, this);
        }
        else if (fieldName.equals("92L")) {
            return new Field92L(validateData, this);
        }
        else if (fieldName.equals("92M")) {
            return new Field92M(validateData, this);
        }
        else if (fieldName.equals("92N")) {
            return new Field92N(validateData, this);
        }
        else if (fieldName.equals("93A")) {
            return new Field93A(validateData, this);
        }
        else if (fieldName.equals("93B")) {
            return new Field93B(validateData, this);
        }
        else if (fieldName.equals("93C")) {
            return new Field93C(validateData, this);
        }
        else if (fieldName.equals("94A")) {
            return new Field94A(validateData, this);
        }
        else if (fieldName.equals("94B")) {
            return new Field94B(validateData, this);
        }
        else if (fieldName.equals("94C")) {
            return new Field94C(validateData, this);
        }
        else if (fieldName.equals("94D")) {
            return new Field94D(validateData, this);
        }
        else if (fieldName.equals("94F")) {
            return new Field94F(validateData, this);
        }
        else if (fieldName.equals("94G")) {
            return new Field94G(validateData, this);
        }
        else if (fieldName.equals("94H")) {
            return new Field94H(validateData, this);
        }
        else if (fieldName.equals("95C")) {
            return new Field95C(validateData, this);
        }
        else if (fieldName.equals("95P")) {
            return new Field95P(validateData, this);
        }
        else if (fieldName.equals("95Q")) {
            return new Field95Q(validateData, this);
        }
        else if (fieldName.equals("95R")) {
            return new Field95R(validateData, this);
        }
        else if (fieldName.equals("95S")) {
            return new Field95S(validateData, this);
        }
        else if (fieldName.equals("95U")) {
            return new Field95U(validateData, this);
        }
        else if (fieldName.equals("97A")) {
            return new Field97A(validateData, this);
        }
        else if (fieldName.equals("97B")) {
            return new Field97B(validateData, this);
        }
        else if (fieldName.equals("97C")) {
            return new Field97C(validateData, this);
        }
        else if (fieldName.equals("97E")) {
            return new Field97E(validateData, this);
        }
        else if (fieldName.equals("98A")) {
            return new Field98A(validateData, this);
        }
        else if (fieldName.equals("98B")) {
            return new Field98B(validateData, this);
        }
        else if (fieldName.equals("98C")) {
            return new Field98C(validateData, this);
        }
        else if (fieldName.equals("98E")) {
            return new Field98E(validateData, this);
        }
        else if (fieldName.equals("98F")) {
            return new Field98F(validateData, this);
        }
        else if (fieldName.equals("99A")) {
            return new Field99A(validateData, this);
        }
        else if (fieldName.equals("99B")) {
            return new Field99B(validateData, this);
        }
        return null;
    }

	// %%%%%END%%%%%
}
