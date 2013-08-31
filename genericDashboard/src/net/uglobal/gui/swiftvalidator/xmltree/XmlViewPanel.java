package net.uglobal.gui.swiftvalidator.xmltree;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.tree.DefaultTreeModel;

import net.uglobal.gui.GenericTree;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock2;
import net.uglobal.swiftvalidator.swift.model.SwiftBlock4;
import net.uglobal.swiftvalidator.swift.model.Tag;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;

public class XmlViewPanel extends JPanel {
	private GenericTree xmlTree;

	public XmlViewPanel() {
		super(new BorderLayout(), true);
		init();
	}

	//	private DefaultTreeModel xmlTreeModel;

	private void init() {
		if (xmlTree == null) {
			xmlTree = new XmlTree();
			//			xmlTreeModel = (DefaultTreeModel) xmlTree.getModel();
		}
		xmlTree.clearSelection();
		JScrollPane scrollPane = new JScrollPane(xmlTree);
		add(scrollPane);
	}

	public void buildTree(MTMessage mtMessage) {
		xmlTree.clear();

		SwiftBlock4 block4 = mtMessage.getSwiftMessage().getSwiftBlock4();
		SwiftBlock2 block2 = mtMessage.getSwiftMessage().getSwiftBlock2();
		List<Tag> tags = block4.getTags();

		xmlTree.getRoot().changeName(block2.getMessageType().name());
		for (Tag tag : tags) {
			tag.getName();
			tag.getValue();

			xmlTree.getRoot().add(new XmlTreeNode(tag));
		}
		xmlTree.expandAll();
		xmlTree.updateUI();
		((DefaultTreeModel) xmlTree.getModel()).reload();
	}
}
