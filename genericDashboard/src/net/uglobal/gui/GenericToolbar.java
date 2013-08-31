package net.uglobal.gui;

import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JToolBar;

public class GenericToolbar extends JToolBar {

	private final List<String> imageFiles = new ArrayList<String>();
	private final List<String> toolbarLabels = new ArrayList<String>();
	private final Insets margins = new Insets(0, 0, 0, 0);

	public GenericToolbar() {
	}

	public GenericToolbar(List<String> imageFiles, List<String> toolbarLabels) {
		addImageFiles(imageFiles);
		addToolbarLabels(toolbarLabels);

		build();
	}

	protected void build() {
		if (imageFiles.size() == toolbarLabels.size()) {
			for (int i = 0; i < imageFiles.size(); i++) {
				ToolBarButton button = new ToolBarButton("../images/" + imageFiles.get(i));
				button.setToolTipText(toolbarLabels.get(i));
				button.setMargin(margins);
				add(button);
			}
		}
	}

	public void addImageFiles(List<String> imageFiles) {
		this.imageFiles.addAll(imageFiles);
	}

	public void addToolbarLabels(List<String> toolbarLabels) {
		this.toolbarLabels.addAll(toolbarLabels);
	}
}
