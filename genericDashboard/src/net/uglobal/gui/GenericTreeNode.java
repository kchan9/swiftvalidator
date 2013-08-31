package net.uglobal.gui;

import javax.swing.tree.DefaultMutableTreeNode;

public class GenericTreeNode extends DefaultMutableTreeNode {
	public GenericTreeNode() {
		super();
	}

	public GenericTreeNode(Object o) {
		super(o);
	}

	public void changeName(String newName) {
		setUserObject(newName);
	}
}
