package net.uglobal.swiftvalidator.field;

import java.util.Iterator;
import java.util.List;

public interface FieldPart {
	public void add(FieldPart fp);

	public void add(int idx, FieldPart fp);

	public String getFieldPartStr();

	public void setFieldPartStr(String fieldPartStr);

	public FieldPartType getFieldPartType();

	public List<String> getAllFieldPartStr();

	public Iterator<FieldPart> iterator();

	public FieldLengthType getFieldLengthType();

	public FieldFormatType getFieldFormatType();

	public FieldPart subFieldPart(int beginIdx, int endIdx);

	public int fieldPartsLength();

	public boolean hasEmbeddedOptionalFieldPart();
}
