package net.uglobal.swiftvalidator.validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.uglobal.collections.tree.GenericTree;
import net.uglobal.collections.tree.GenericTreeNode;
import net.uglobal.swiftvalidator.field.FieldContent;
import net.uglobal.swiftvalidator.field.FieldFormatType;
import net.uglobal.swiftvalidator.field.FieldLengthType;
import net.uglobal.swiftvalidator.field.FieldPart;
import net.uglobal.swiftvalidator.field.FieldPartString;
import net.uglobal.swiftvalidator.field.FieldPartType;
import net.uglobal.swiftvalidator.field.MandatoryFieldPart;
import net.uglobal.swiftvalidator.field.PredefinedCharacter;
import net.uglobal.swiftvalidator.field.util.FieldFormatUtil;
import net.uglobal.swiftvalidator.field.util.FieldFormatUtil.MinMaxLengthValue;
import net.uglobal.swiftvalidator.parser.FieldPartParser;
import net.uglobal.swiftvalidator.xml.beans.Content;
import net.uglobal.swiftvalidator.xml.beans.Field;
import net.uglobal.swiftvalidator.xml.beans.Format;
import net.uglobal.swiftvalidator.xml.beans.Value;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.rits.cloning.Cloner;

// Each FieldPartValidator only validate 1 engine
// 1 validator per thread
// TODO: for future enhancement, ValidateEngine is used for multi-threading purpose.

public class FieldPartValidator {

	private static final Logger logger = Logger.getLogger(FieldPartValidator.class);

	private Field field;
	private FieldPart fieldPart;
	private String validateData;
	private String valueStr; // constant

	private Boolean isValid;

	private GenericTree<FieldContent> fieldContentTree = null;
	private GenericTreeNode<FieldContent> rootNode = null;
	private Integer nodeId = 0;

	// -- Constructors
	private FieldPartValidator() {
	}

	public FieldPartValidator(Field field, String validateData) {
		init(field, validateData);
	}

	public FieldPartValidator(Content content, String validateData) {
		init(content, validateData);
	}

	public FieldPartValidator(Format format, String validateData) {
		init(format, validateData);
	}

	public FieldPartValidator(Value value, String validateData) {
		init(value, validateData);
	}

	public FieldPartValidator(FieldPart fieldPart, String validateData) {
		init(fieldPart, validateData);
	}

	// -- init methods
	private void init(Field field, String validateData) {
		this.field = field;
		init(field.getContent(), validateData);
	}

	private void init(Content content, String validateData) {
		Format format = null;
		Value value = null;
		if ((format = content.getFormat()) != null && StringUtils.isNotBlank(format.getText())) {
			init(format, validateData);
		} else if ((value = content.getValue()) != null && StringUtils.isNotBlank(value.getText())) {
			init(value, validateData);
		} else {
			// TODO: throw exception.  Must have either formatStr or data
		}
	}

	private void init(Value value, String validateData) {
		this.valueStr = value.getText();
		this.validateData = validateData;
	}

	private void init(Format format, String validateData) {
		FieldPartParser parser = new FieldPartParser(format.getText());
		parser.parse();
		FieldPart fieldPart = parser.getCompleteFieldPart();

		init(fieldPart, validateData);
	}

	private void init(FieldPart fieldPart, String validateData) {
		this.fieldPart = fieldPart;
		this.validateData = validateData;

		if (rootNode == null) {
			rootNode = new GenericTreeNode<FieldContent>();
		}

		if (fieldContentTree == null) {
			fieldContentTree = new GenericTree<FieldContent>();
			fieldContentTree.setRoot(rootNode);
		}
	}

	private Integer getNextNodeId() {
		return ++nodeId;
	}

	public void validate() {
		if (StringUtils.isNotBlank(this.valueStr)) {
			if (getValidateData().equals(this.valueStr)) {
				this.isValid = true;
			} else {
				this.isValid = false;
			}
		} else if (this.fieldPart != null) {
			// NOTE: 
			// workaround : always add 0!e in the front, in case the first 1 is an optional field
			this.fieldPart.add(0, new MandatoryFieldPart("0!e"));
			buildTree(this.fieldPart, null);

			// problem here .... ??? 
			logger.debug(fieldContentTree.toStringWithDepth());

			//			GenericTreeNode<FieldContent> root = fieldContentTree.getRoot();

			List<FieldPartString> fieldPartStringList = getAllFieldPartStrings();
			//			List<GenericTreeNode<FieldContent>> children = root.getChildren();

			logger.info("fieldPartStringList=" + fieldPartStringList);

			Boolean matchFound = false;
			for (FieldPartString fieldPartString : fieldPartStringList) {
				if (fieldPartString.hasMatch(getValidateData())) {
					matchFound = true;
					break;
				}
			}

			if (matchFound) {
				this.isValid = true;
			} else {
				this.isValid = false;
			}
		} else {
			// TODO: either valueStr or fieldPart must exist
		}
	}

	private List<FieldPartString> getAllFieldPartStrings() {
		List<FieldPartString> fieldPartStringList = new ArrayList<FieldPartString>();

		List<List<GenericTreeNode<FieldContent>>> list = new ArrayList<List<GenericTreeNode<FieldContent>>>();
		this.fieldContentTree.allPathsTraversal(this.fieldContentTree.getRoot(), list);
		for (List<GenericTreeNode<FieldContent>> ll : list) {
			logger.debug(ll);
			FieldPartString fieldPartString = getFieldPartString(ll);

			fieldPartStringList.add(fieldPartString);
		}
		return fieldPartStringList;
	}

	private FieldPartString getFieldPartString(List<GenericTreeNode<FieldContent>> list) {
		FieldPartString fieldPartString = new FieldPartString();

		for (GenericTreeNode<FieldContent> node : list) {
			FieldContent fieldContent = node.getData();

			// TODO: revisit
			if (fieldContent.getPredefinedCharacterList().size() > 0) {
				List<PredefinedCharacter> predefinedCharacterList = fieldContent.getPredefinedCharacterList().get(0);
				if (predefinedCharacterList != null && predefinedCharacterList.size() > 0) {
					fieldPartString.addPredefinedCharacterList(predefinedCharacterList);
				}
			}
		}

		return fieldPartString;
	}

	//	private void traverse(GenericTreeNode<FieldContent> root) {
	//		for (GenericTreeNode<FieldContent> node = root.getChildAt(0); node != null; node = node.getChildAt(1)) {
	//			// print node information
	//			logger.debug(node);
	//			// traverse children
	//			traverse(node);
	//		}
	//	}

	public GenericTree<FieldContent> getFieldContentTree() {
		return this.fieldContentTree;
	}

	private final List<GenericTreeNode<FieldContent>> currentParentNodes = null;

	private void buildTree(FieldPart fieldPart, List<GenericTreeNode<FieldContent>> currentParentNodes) {

		// add root node
		if (currentParentNodes == null) {
			rootNode.setData(new FieldContent(getNextNodeId(), "root", fieldPart));
			currentParentNodes = new ArrayList<GenericTreeNode<FieldContent>>();
			currentParentNodes.add(rootNode);
		}

		int idx = 0;
		for (Iterator<FieldPart> iter = fieldPart.iterator(); iter.hasNext();) {
			FieldPart fp = iter.next();

			if (fp.getFieldPartType() == FieldPartType.OPTIONAL) {

				FieldPart optionalFieldPart = fieldPart.subFieldPart(idx + 1, fieldPart.fieldPartsLength()); // +1 is to skip the optional fieldpart
				optionalFieldPart.add(0, new MandatoryFieldPart("0!e"));

				// NOTE: a clone to maintain the old currentParents for optional tree
				Cloner cloner = new Cloner();
				List<GenericTreeNode<FieldContent>> tmpParentNodes = cloner.shallowClone(currentParentNodes);
				// TODO: 
				// keep the optionalTree aside to be processed later
				buildTree(optionalFieldPart, tmpParentNodes);

				if (fp.hasEmbeddedOptionalFieldPart()) {
					// TODO
					logger.debug("has embedded optional");
					//					this.fieldPart;

					//					fp.add(this.fieldPart.subFieldPart(idx + 1, this.fieldPart.fieldPartsLength()));
					buildTree(fp, currentParentNodes);
				} else {
					buildTree(fp, currentParentNodes);
				}
			}

			else {
				FieldLengthType lengthType = fp.getFieldLengthType();
				FieldFormatType formatType = fp.getFieldFormatType();

				if (formatType == FieldFormatType.Constant || lengthType == FieldLengthType.FixedLength
						|| lengthType == FieldLengthType.MultiLinesLength) {
					List<GenericTreeNode<FieldContent>> toBeParents = addTreeNode(currentParentNodes, fp, fp.getFieldPartStr());

					// 
					currentParentNodes.clear();
					currentParentNodes.addAll(toBeParents);
				}

				else if (lengthType == FieldLengthType.MaxLength) {
					int size = FieldFormatUtil.getLengthValue(fp/*, fp.getFieldPartStr()*/);

					List<GenericTreeNode<FieldContent>> tmpParents = new ArrayList<GenericTreeNode<FieldContent>>();
					for (int i = 0; i <= size; i++) {
						Character fieldPartLetter = getFieldPartLetter(fp.getFieldPartStr());
						String fieldPartPrefix = StringUtils.remove(fp.getFieldPartStr(), fieldPartLetter);

						//						List<GenericTreeNode<FieldContent>> toBeParents = addTreeNode(currentParentNodes, fp.getFieldPartStr() + i);
						List<GenericTreeNode<FieldContent>> toBeParents = addTreeNode(currentParentNodes, fp, i + "!" + fieldPartLetter);

						tmpParents.addAll(toBeParents);
					}

					currentParentNodes.clear();
					currentParentNodes.addAll(tmpParents);
				}

				else if (lengthType == FieldLengthType.MinMaxLength) {
					MinMaxLengthValue minMax = FieldFormatUtil.getMinMaxLengthValues(fp.getFieldPartStr());

					List<GenericTreeNode<FieldContent>> tmpParents = new ArrayList<GenericTreeNode<FieldContent>>();
					for (int i = minMax.getMin(); i <= minMax.getMax(); i++) {
						Character fieldPartLetter = getFieldPartLetter(fp.getFieldPartStr());
						String fieldPartPrefix = StringUtils.remove(fp.getFieldPartStr(), fieldPartLetter);

						//						List<GenericTreeNode<FieldContent>> toBeParents = addTreeNode(currentParentNodes, fp.getFieldPartStr() + i);
						List<GenericTreeNode<FieldContent>> toBeParents = addTreeNode(currentParentNodes, fp, i + "!" + fieldPartLetter);

						tmpParents.addAll(toBeParents);
					}

					currentParentNodes.clear();
					currentParentNodes.addAll(tmpParents);

				}
			}

			idx++;
		}
	}

	private Character getFieldPartLetter(String fieldPartStr) {
		for (Character c : fieldPartStr.toCharArray()) {
			if (Character.isLetter(c)) {
				return c;
			}
		}
		return null;
	}

	private List<GenericTreeNode<FieldContent>> addTreeNode(List<GenericTreeNode<FieldContent>> parentNodes, FieldPart fieldPart,
			String fieldPartString) {
		//		String field = fieldPart.getFieldPartStr();

		List<GenericTreeNode<FieldContent>> toBeParents = new ArrayList<GenericTreeNode<FieldContent>>();
		int i = 0;
		for (GenericTreeNode<FieldContent> parentNode : parentNodes) {
			GenericTreeNode<FieldContent> node = new GenericTreeNode<FieldContent>();
			node.setData(new FieldContent(getNextNodeId(), fieldPartString, fieldPart));
			parentNode.addChild(node);

			toBeParents.add(node);
		}
		return toBeParents;
	}

	public Boolean isValid() {
		return this.isValid;
	}

	public String getValidateData() {
		return this.validateData;
	}

	public static void main(String argv[]) {

		//		String s = "16x";
		//		Character x = 'x';
		//		String ss = StringUtils.remove(s, x);
		//		String ss = s.replace(x, '\0');
		//		logger.debug(ss);

		//		Value value = new Value();
		//		value.setText("SETDET");
		//		Content content  = new Content();
		//		content.setFormat(null);
		//		content.setValue(null);

		//		String validateData = "/US/3138E0AB5" + "\r\n" + "FN AJ7201";
		//		String validateData = ":SEME//845666";
		//		String validateData = ":SEME//845666";
		String validateData = "a/a\r\nb";

		//		String formatStr = "[ISIN1!e12!c][2!c4*35x]";
		//		String formatStr = ":4!c//7x";
		String formatStr = "1x/2*2x";

		String valueStr = "";
		//		String formatStr = "4!c//8!n6!n[,3n][/[N]2!n[2!n]]";
		//		String formatStr = "[N[2!n]]SEME";
		//		String formatStr = "[N[Y]]SEME";
		//		FieldPartParser parser = new FieldPartParser(formatStr);
		//		parser.parse();
		//		FieldPart fieldPart = parser.getCompleteFieldPart();

		//		List<String> allFieldPartStrList = fieldPart.getAllFieldPartStr();

		FieldPartValidator validator = new FieldPartValidator(new Format(formatStr), validateData);
		//		FieldPartValidator validator = new FieldPartValidator(new Value(valueStr), validateData);
		validator.validate();

		Boolean isValid = validator.isValid();
		logger.info("isValid=" + isValid);
	}
}
