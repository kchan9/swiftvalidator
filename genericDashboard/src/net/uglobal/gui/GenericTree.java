package net.uglobal.gui;

import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;

public abstract class GenericTree extends JTree {
	public GenericTree() {
		super();
	}

	public GenericTree(String rootNodeName) {
		super(new GenericTreeNode(rootNodeName));
		getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
	}

	public GenericTreeNode getRoot() {
		return (GenericTreeNode) getModel().getRoot();
	}

	public void collapseAll() {
		for (int i = getRowCount() - 1; i >= 0; i--) {
			collapseRow(i);
		}
	}

	public void expandAll() {
		for (int i = 0; i < getRowCount(); i++) {
			expandRow(i);
		}
	}

	public void clear() {
		getRoot().removeAllChildren();
	}
}
