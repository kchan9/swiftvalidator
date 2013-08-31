package net.uglobal.swiftvalidator.field;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import net.uglobal.swiftvalidator.field.util.FieldFormatUtil;

public class AbstractFieldPart {

	private static final String NEW_LINE = "\n";
	protected String fieldPartStr;
	protected List<FieldPart> fieldPartList = new ArrayList<FieldPart>();
	private List<String> allFieldPartStrList = null;

	public AbstractFieldPart(String s) {
		this.fieldPartStr = s;
	}

	//	public FieldPart cloneOptionalFieldPart() {
	//		this.fieldPartStr
	//	}

	protected List<FieldPart> getFieldPartList() {
		return this.fieldPartList;
	}

	public boolean hasEmbeddedOptionalFieldPart() {
		return checkEmbeddedOptionalFieldPart((FieldPart) this);
	}

	private boolean checkEmbeddedOptionalFieldPart(FieldPart fieldPart) {
		if (fieldPart.getFieldPartType() == FieldPartType.OPTIONAL) {
			for (FieldPart fp : ((AbstractFieldPart) fieldPart).getFieldPartList()) {
				if (fp.getFieldPartType() == FieldPartType.OPTIONAL) {
					return true;
				} else {
					checkEmbeddedOptionalFieldPart(fp);
				}
			}
			return false;
		}
		return false;
	}

	public int fieldPartsLength() {
		return fieldPartList.size();
	}

	public FieldPart subFieldPart(int beginIdx, int endIdx) {
		FieldPart fieldPart = new MandatoryFieldPart(null);
		StringBuilder sb = new StringBuilder();

		for (int i = beginIdx; i < endIdx; i++) {
			FieldPart subFieldPart = fieldPartList.get(i);
			fieldPart.add(subFieldPart);

			sb.append(subFieldPart.getFieldPartStr());
		}
		fieldPart.setFieldPartStr(sb.toString());
		return fieldPart;
	}

	public List<String> getAllFieldPartStr() {
		if (allFieldPartStrList == null) {
			//			allFieldPartStrList = new ArrayList<String>(fieldPartList.size());

			if (fieldPartList.size() == 0) {
				if (allFieldPartStrList == null) {
					allFieldPartStrList = new ArrayList<String>(1);
				}
				String fieldPartStr = getFieldPartStr();
				if (this.getFieldPartType() == FieldPartType.OPTIONAL) {
					fieldPartStr = "[" + fieldPartStr + "]";
				}
				allFieldPartStrList.add(fieldPartStr);
			} else {
				if (allFieldPartStrList == null) {
					allFieldPartStrList = new ArrayList<String>(fieldPartList.size());
				}
				for (FieldPart fp : fieldPartList) {
					List<String> list = fp.getAllFieldPartStr();
					allFieldPartStrList.addAll(list);
				}
			}
		}
		return allFieldPartStrList;
	}

	public String getFieldPartStr() {
		return this.fieldPartStr;
	}

	public void setFieldPartStr(String fieldPartStr) {
		this.fieldPartStr = fieldPartStr;
	}

	public void add(FieldPart fp) {
		fieldPartList.add(fp);
	}

	public void add(int idx, FieldPart fp) {
		fieldPartList.add(idx, fp);
	}

	public FieldLengthType getFieldLengthType() {
		return FieldFormatUtil.getLengthType(this.fieldPartStr);
	}

	public FieldFormatType getFieldFormatType() {
		return FieldFormatUtil.getFormatType(this.fieldPartStr);
	}

	public FieldPartType getFieldPartType() {
		if (this instanceof OptionalFieldPart) {
			return FieldPartType.OPTIONAL;
		} else if (this instanceof MandatoryFieldPart) {
			return FieldPartType.MANDATORY;
		} else if (this instanceof CompositeOptionalFieldPart) {
			return FieldPartType.COMPOSITE_OPTIONAL;
		} else {
			// TODO: error, failed to recognize FieldPartType
			return null;
		}
	}

	public java.util.Iterator<FieldPart> iterator() {
		return new Itr();
	}

	private class Itr implements java.util.Iterator<FieldPart> {
		int cursor = 0;
		int lastRet = -1;

		public boolean hasNext() {
			return cursor != fieldPartList.size();
		}

		@Override
		public FieldPart next() {
			try {
				FieldPart next = fieldPartList.get(cursor);
				lastRet = cursor++;
				return next;
			} catch (IndexOutOfBoundsException e) {
				throw new NoSuchElementException();
			}
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		//		private void checkForComodification() {
		//			if (modCount != expectedModCount) {
		//				throw new ConcurrentModificationException();
		//			}
		//		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[fieldPartType=").append(getFieldPartType()).append("]").append(NEW_LINE);
		sb.append("[fieldPartStr=").append(fieldPartStr).append("]").append(NEW_LINE);
		sb.append("[fieldPartList=").append(fieldPartList).append("]").append(NEW_LINE);

		return sb.toString();
	}

}
