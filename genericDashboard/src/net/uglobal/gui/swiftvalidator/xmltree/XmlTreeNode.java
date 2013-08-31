package net.uglobal.gui.swiftvalidator.xmltree;

import net.uglobal.swiftvalidator.swift.model.Tag;

public class XmlTreeNode extends net.uglobal.gui.GenericTreeNode {
	public XmlTreeNode() {
		super();
	}

	public XmlTreeNode(Object o) {
		super(o);
	}

	public XmlTreeNode(Tag tag) {
		super(tag.getName() + " - " + tag.getValue());
	}

}
