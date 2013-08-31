package net.uglobal.gui.swiftvalidator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.miginfocom.swing.MigLayout;
import net.uglobal.gui.MainFrame;
import net.uglobal.swiftvalidator.swift.service.SwiftMessageService;
import net.uglobal.swiftvalidator.validator.ValidationError;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;

import org.apache.log4j.Logger;

public class RawDataViewPanel extends JPanel {
	private static final Logger logger = Logger.getLogger(RawDataViewPanel.class);

	private static final String BLANK = "";
	private JEditorPane editorPane;
	private JButton parseButton;
	private JButton validateButton;
	private MainFrame mainFrame;

	public RawDataViewPanel() {
		super(new MigLayout("", "[grow][][]", "[grow][]"));
		init();
	}

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	private void performParseAction() {
		//Execute when button is pressed
		System.out.println("You clicked the parse button");
	}

	//	private XMLViewPanel getXmlViewPanel() {
	//		XMLViewPanel xmlViewPanel = (XMLViewPanel) ((JScrollPane) mainFrame.getTopNavigationTabbedPane().getComponentAt(0)).getViewport().getView();
	//		return xmlViewPanel;
	//	}

	private ConsolePanel getConsolePanel() {
		return (ConsolePanel) mainFrame.getBottomContentTabbedPane().getComponentAt(0);
	}

	private void init() {
		add(new JScrollPane(editorPane = newJEditorPane()), "cell 0 0 3 1, grow");
		add(parseButton = new JButton("parse"), "cell 1 1 1 1, grow");
		add(validateButton = new JButton("validate"), "cell 2 1 1 1, grow");

		parseButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				performParseAction();
			}
		});
		// TODO: temporarily remove it
		parseButton.setVisible(false);

		validateButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//Execute when button is pressed
				System.out.println("You clicked the validate button");

				ConsolePanel consolePanel = (ConsolePanel) RawDataViewPanel.this.mainFrame.getBottomContentTabbedPane().getComponentAt(0);
				JEditorPane consoleEditorPane = consolePanel.getEditorPane();

				SwiftMessageService service = new SwiftMessageService();
				MTMessage mtMessage = service.getMTMessageFromFIN(editorPane.getText());

				// -----------------------------------------
				// test
				//				Map<Integer, Sequence> m3 = mtMessage.getSequencesBySequenceId();
				//				List<Field> enrichedFieldsList = mtMessage.getFieldsList();

				// test end
				// ------------------------------------------------------------------
				mainFrame.getXMLViewPanel().buildTree(mtMessage);

				// TODO: something is wrong with the isValid flag. Need to revisit.
				// NOTE: For now, just use the size of ValidationError list to determine if there is any error in the validation process.
				List<ValidationError> validationErrors = mtMessage.getSwiftMessage().getValidationErrors();
				if (validationErrors != null && validationErrors.size() > 0) {
					//				if (!isValid) {
					if (validationErrors.size() > 0) {
						String NEW_LINE = "\n";
						StringBuilder sb = new StringBuilder();
						//						sb.append("Validation Errors.").append(NEW_LINE);
						for (ValidationError error : validationErrors) {
							sb.append(error.getErrorMessage()).append(NEW_LINE);
						}
						consoleEditorPane.setText(sb.toString());
					}
				} else {
					int count = RawDataViewPanel.this.mainFrame.getBottomContentTabbedPane().getTabCount();

					int idx = RawDataViewPanel.this.mainFrame.getBottomContentTabbedPane().indexOfTab("Console");

					consoleEditorPane.setText("Validation pass.");

					mainFrame.getSyntheticDataViewPanel().buildTree(mtMessage);
				}
			}
		});
	}

	private static JEditorPane newJEditorPane() {
		return new JEditorPane() {
			public boolean getScrollableTracksViewportWidth() {
				return true;
			}
		};
	}
}
