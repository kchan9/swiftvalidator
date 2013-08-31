package net.uglobal.gui.swiftvalidator.syntheticdata;

import java.awt.BorderLayout;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import net.uglobal.gui.MainFrame;
import net.uglobal.swiftvalidator.swift.field.Field;
import net.uglobal.swiftvalidator.xml.beans.MTMessage;
import net.uglobal.swiftvalidator.xml.beans.Sequence;

import org.apache.log4j.Logger;

public class SyntheticDataViewPanel extends JPanel {
	private static final Logger logger = Logger.getLogger(SyntheticDataViewPanel.class);

	private SyntheticDataTree syntheticDataTree;
	private MainFrame mainFrame;

	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public SyntheticDataViewPanel() {
		super(new BorderLayout(), true);
		init();
	}

	private void init() {
		if (syntheticDataTree == null) {
			syntheticDataTree = new SyntheticDataTree();
		}
		syntheticDataTree.clearSelection();
		JScrollPane scrollPane = new JScrollPane(syntheticDataTree);
		add(scrollPane);
	}

	public void buildTree(MTMessage mtMessage) {
		syntheticDataTree.clear();

		Map<Integer, Sequence> sequenceMap = mtMessage.getSequencesBySequenceId();
		List<Field> fields = mtMessage.getFieldsList();

		for (Field field : fields) {
			Sequence sequence = sequenceMap.get(field.getSequenceId());

			// TODO: to be continued

			//			sequence.getName()

			Method[] methods = field.getClass().getMethods();
			for (Method method : methods) {
				String methodName = method.getName();
				if (methodName.startsWith("get")
						&& !(methodName.equals("getComponents") || methodName.equals("getSequenceId") || methodName.equals("getClass") || methodName
								.equals("getSequenceShortName"))) {

					try {
						String returnVal = (String) method.invoke(field);
						logger.info(field.getClass().getName() + " - " + methodName + " - " + returnVal);
					} catch (Exception e) {
						logger.error(e.getMessage(), e);
					}
				}

			}

		}
	}
}
