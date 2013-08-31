package net.uglobal.gui;

import java.util.ArrayList;

import net.uglobal.gui.swiftvalidator.ConsolePanel;
import net.uglobal.gui.swiftvalidator.RawDataViewPanel;
import net.uglobal.gui.swiftvalidator.syntheticdata.SyntheticDataViewPanel;
import net.uglobal.gui.swiftvalidator.xmltree.XmlViewPanel;

public class MainFrame extends AbstractMainFrame {
	public MainFrame() {
		initialize();
	}

	private SyntheticDataViewPanel syntheticDataViewPanel;
	private XmlViewPanel xmlViewPanel;

	public SyntheticDataViewPanel getSyntheticDataViewPanel() {
		return this.syntheticDataViewPanel;
	}

	public XmlViewPanel getXMLViewPanel() {
		return this.xmlViewPanel;
	}

	private void initialize() {
		setTitle("Swift Validator");
		setFrameDividerLocation(300);
		//		setNavigationPanelDividerLocation(180);
		//		setContentPanelDividerLocation(50);

		// top navigation panel
		xmlViewPanel = new XmlViewPanel();
		addTopNavigationPanel("XML View", xmlViewPanel);

		// top content 
		// TODO: how to pass panel referens across different panels. 
		RawDataViewPanel mtMessagePanel = new RawDataViewPanel();
		mtMessagePanel.setMainFrame(this);
		addTopContentPanel("Raw Data View", mtMessagePanel);

		syntheticDataViewPanel = new SyntheticDataViewPanel();
		syntheticDataViewPanel.setMainFrame(this);
		addTopContentPanel("Synthetic Data View", syntheticDataViewPanel);

		// bottom content
		ConsolePanel consolePanel = new ConsolePanel();
		addBottomContentPanel("Console", consolePanel);

		// toolbar
		addToolbar(new ArrayList<String>() {
			{
				add("validate.png");
				//				add("Apple.png");
				//				add("Bird.png");
				//				add("Bull.png");
			}
		}, new ArrayList<String>() {
			{
				add("Validate");
				//				add("Apple");
				//				add("Bird");
				//				add("Bull");
			}
		});
	}

}
