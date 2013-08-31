package net.uglobal.gui.swiftvalidator;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.KeyStroke;

public class ConsolePanel extends JPanel {

	private static final String BLANK = "";

	private JEditorPane editorPane;

	public ConsolePanel() {
		//		super(new MigLayout("", "[grow][]", "[grow][5][]"));
		super(new BorderLayout(), true);
		init();
	}

	private void init() {
		editorPane = new JEditorPane() {
			public boolean getScrollableTracksViewportWidth() {
				return true;
			}
		};

		JScrollPane scrollPane = new JScrollPane(editorPane);
		//		scrollPane.add(editorPane, BorderLayout.CENTER);
		//		scrollPane.getViewport().add(editorPane, BorderLayout.CENTER);

		add(scrollPane);
		//		add(scrollPane, "cell 0 0 2 1");
		//		add(new JButton("clear"), "cell 1 2 1 1");
		//		add(new JButton("test"));

		int condition = JComponent.WHEN_FOCUSED;
		InputMap iMap = editorPane.getInputMap(condition);
		ActionMap aMap = editorPane.getActionMap();

		final String clearCommand = "clearCommand";
		//		iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enterKey);
		iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C, Event.CTRL_MASK), clearCommand);
		aMap.put(clearCommand, new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("clear screen");
				editorPane.setText(BLANK);
			}
		});
	}

	public JEditorPane getEditorPane() {
		return this.editorPane;
	}
}
