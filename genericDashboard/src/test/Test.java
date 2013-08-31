package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import net.miginfocom.swing.MigLayout;

public class Test {

	private JFrame mainFrame;
	private JTextField tfJobName;
	private JTextField tfJobGroup;
	private JTextField tfJobDescription;
	private JTextField tfJobClass;
	private JTextField tfTriggerName;
	private JTextField tfTriggerGroup;
	private JTextField tfTriggerDescription;
	private JTextField tfTriggerStartTime;
	private JTextField tfTriggerEndTime;
	private JTextField tfCronTypeExpression;
	private JTable tblJobDataMap;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
					window.mainFrame.setVisible(true);
					window.mainFrame.pack();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame();
		mainFrame.setTitle("Scheduler");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setPreferredSize(new Dimension(1100, 850));

		JSplitPane topBottomSplitPane = new JSplitPane();
		topBottomSplitPane.setResizeWeight(0.99);
		topBottomSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		mainFrame.getContentPane().add(topBottomSplitPane, BorderLayout.CENTER);

		JSplitPane leftRightSplitPane = new JSplitPane();
		leftRightSplitPane.setOneTouchExpandable(true);
		leftRightSplitPane.setDividerLocation(510);
		topBottomSplitPane.setLeftComponent(leftRightSplitPane);

		JScrollPane scrollPane = new JScrollPane();
		leftRightSplitPane.setLeftComponent(scrollPane);

		JPanel filterPanel = new JPanel(new MigLayout("", "[grow]", "[][][][][grow][][]"));
		scrollPane.setViewportView(filterPanel);

		JPanel jobDetailPanel = new JPanel(new MigLayout("", "[][grow][][grow]", "[][][]"));
		jobDetailPanel.setBorder(new TitledBorder(null, "Job Detail", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		filterPanel.add(jobDetailPanel, "cell 0 0,grow");

		JLabel lblJobName = new JLabel("Name:");
		jobDetailPanel.add(lblJobName, "cell 0 0,alignx trailing");

		tfJobName = new JTextField();
		jobDetailPanel.add(tfJobName, "cell 1 0,growx");
		tfJobName.setColumns(10);

		JLabel lblJobGroup = new JLabel("Group:");
		jobDetailPanel.add(lblJobGroup, "cell 2 0,alignx trailing");

		tfJobGroup = new JTextField();
		jobDetailPanel.add(tfJobGroup, "cell 3 0,growx");
		tfJobGroup.setColumns(10);

		JLabel lblJobDescription = new JLabel("Description:");
		jobDetailPanel.add(lblJobDescription, "cell 0 1,alignx trailing");

		tfJobDescription = new JTextField();
		jobDetailPanel.add(tfJobDescription, "cell 1 1 3 1, grow");
		tfJobDescription.setColumns(10);

		JLabel lblJobClass = new JLabel("Job Class:");
		jobDetailPanel.add(lblJobClass, "cell 0 2,alignx trailing");

		tfJobClass = new JTextField();
		jobDetailPanel.add(tfJobClass, "cell 1 2 3 1,grow");
		tfJobClass.setColumns(10);

		JPanel triggerPanel = new JPanel(new MigLayout("", "[][grow][][grow]", "[][][][][]"));
		triggerPanel.setBorder(new TitledBorder(null, "Trigger", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		filterPanel.add(triggerPanel, "cell 0 1,grow");

		JLabel lblTriggerType = new JLabel("Type:");
		triggerPanel.add(lblTriggerType, "cell 0 0,alignx trailing");

		JComboBox cbTriggerType = new JComboBox();
		triggerPanel.add(cbTriggerType, "cell 1 0,growx");

		JLabel lblTriggerName = new JLabel("Name:");
		triggerPanel.add(lblTriggerName, "cell 0 1,alignx trailing");

		tfTriggerName = new JTextField();
		triggerPanel.add(tfTriggerName, "cell 1 1,growx");
		tfTriggerName.setColumns(10);

		JLabel lblTriggerGroup = new JLabel("Group:");
		triggerPanel.add(lblTriggerGroup, "cell 2 1,alignx trailing");

		tfTriggerGroup = new JTextField();
		triggerPanel.add(tfTriggerGroup, "cell 3 1,growx");
		tfTriggerGroup.setColumns(10);

		JLabel lblTriggerDescription = new JLabel("Description:");
		triggerPanel.add(lblTriggerDescription, "cell 0 2,alignx trailing");

		tfTriggerDescription = new JTextField();
		triggerPanel.add(tfTriggerDescription, "cell 1 2 3 1,growx");
		tfTriggerDescription.setColumns(10);

		JLabel lblTriggerStartTime = new JLabel("Start Time:");
		triggerPanel.add(lblTriggerStartTime, "cell 0 3,alignx trailing");

		tfTriggerStartTime = new JTextField();
		triggerPanel.add(tfTriggerStartTime, "cell 1 3,growx");
		tfTriggerStartTime.setColumns(10);

		JLabel lblTriggerEndTime = new JLabel("End Time:");
		triggerPanel.add(lblTriggerEndTime, "cell 2 3,alignx trailing");

		tfTriggerEndTime = new JTextField();
		triggerPanel.add(tfTriggerEndTime, "cell 3 3,growx");
		tfTriggerEndTime.setColumns(10);

		JLabel lblTriggerPriority = new JLabel("Priority:");
		triggerPanel.add(lblTriggerPriority, "cell 0 4,alignx trailing");

		JComboBox cbTriggerPriority = new JComboBox();
		triggerPanel.add(cbTriggerPriority, "cell 1 4,growx");

		JLabel lblTriggerCalendearName = new JLabel("Calendear Name:");
		triggerPanel.add(lblTriggerCalendearName, "cell 2 4,alignx trailing");

		JComboBox cbTriggerCalendarName = new JComboBox();
		triggerPanel.add(cbTriggerCalendarName, "cell 3 4,growx");

		JPanel simpleTypePanel = new JPanel(new MigLayout("", "[][grow][][grow][][grow]", "[]"));
		simpleTypePanel.setBorder(new TitledBorder(null, "Simple", TitledBorder.LEADING, TitledBorder.TOP,
				null, null));
		filterPanel.add(simpleTypePanel, "cell 0 2,grow");

		JLabel lblSimpleTypeRepeatCount = new JLabel("Repeat Count:");
		simpleTypePanel.add(lblSimpleTypeRepeatCount, "cell 0 0,alignx trailing");

		JComboBox cbSimpleTypeRepeatCount = new JComboBox();
		simpleTypePanel.add(cbSimpleTypeRepeatCount, "cell 1 0,growx");

		JLabel lblSimpleTypeRepeatInterval = new JLabel("Repeat Interval:");
		simpleTypePanel.add(lblSimpleTypeRepeatInterval, "cell 2 0,alignx trailing");

		JComboBox cbSimpleTypeRepeatInterval = new JComboBox();
		simpleTypePanel.add(cbSimpleTypeRepeatInterval, "cell 3 0,growx");

		JLabel lblSimpleTypeUnit = new JLabel("Unit:");
		simpleTypePanel.add(lblSimpleTypeUnit, "cell 4 0,alignx trailing");

		JComboBox cbSimpleTypeUnit = new JComboBox();
		simpleTypePanel.add(cbSimpleTypeUnit, "cell 5 0,growx");

		JPanel cronTypePanel = new JPanel(new MigLayout("", "[][grow][][grow]", "[]"));
		cronTypePanel.setBorder(new TitledBorder(null, "Cron", TitledBorder.LEADING, TitledBorder.TOP, null,
				null));
		filterPanel.add(cronTypePanel, "cell 0 3,grow");

		JLabel lblCrontTypeExpression = new JLabel("Expression:");
		cronTypePanel.add(lblCrontTypeExpression, "cell 0 0,alignx trailing");

		tfCronTypeExpression = new JTextField();
		tfCronTypeExpression.setToolTipText("second minute hour dayOfMonth month dayOfWeek year");
		cronTypePanel.add(tfCronTypeExpression, "cell 1 0,growx");
		tfCronTypeExpression.setColumns(10);

		JLabel lblCronTypeTimeZone = new JLabel("Time Zone:");
		cronTypePanel.add(lblCronTypeTimeZone, "cell 2 0,alignx trailing");

		JComboBox cbCronTypeTimeZone = new JComboBox();
		cronTypePanel.add(cbCronTypeTimeZone, "cell 3 0,growx");

		JPanel jobDataMapPanel = new JPanel(new MigLayout("", "[grow]", "[grow]"));
		jobDataMapPanel.setBorder(new TitledBorder(null, "JobDataMap", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		filterPanel.add(jobDataMapPanel, "cell 0 4,grow");
		jobDataMapPanel.setPreferredSize(new Dimension(450, 100));

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setPreferredSize(new Dimension(450, 180));
		jobDataMapPanel.add(scrollPane_2, "cell 0 0,grow");

		tblJobDataMap = new JTable();
		scrollPane_2.setViewportView(tblJobDataMap);

		JPanel actionPanel = new JPanel(new MigLayout("", "[][grow][][grow]", "[][]"));
		actionPanel.setBorder(new TitledBorder(null, "Action", TitledBorder.LEADING, TitledBorder.TOP, null,
				null));
		filterPanel.add(actionPanel, "cell 0 5,grow");

		JLabel lblNewLabel = new JLabel("New label");
		actionPanel.add(lblNewLabel, "cell 0 0,alignx trailing");

		textField = new JTextField();
		actionPanel.add(textField, "cell 1 0 3 1,growx");
		textField.setColumns(10);

		JPanel filterSubmitButtonsPanel = new JPanel(new MigLayout("", "[][grow][][]", "[]"));
		filterPanel.add(filterSubmitButtonsPanel, "cell 0 6,grow");

		JLabel lblPlaceHolder1 = new JLabel("");
		filterSubmitButtonsPanel.add(lblPlaceHolder1, "cell 0 0");

		JButton btnFilterDataClear = new JButton("Clear");
		filterSubmitButtonsPanel.add(btnFilterDataClear, "cell 2 0,alignx right,aligny baseline");

		JButton btnFilterDataSubmit = new JButton("Submit");
		filterSubmitButtonsPanel.add(btnFilterDataSubmit, "cell 3 0");

		JScrollPane scrollPane_1 = new JScrollPane();
		leftRightSplitPane.setRightComponent(scrollPane_1);

		JPanel tailLogPanel = new JPanel(new MigLayout("", "[grow]", "[][grow][]"));
		scrollPane_1.setViewportView(tailLogPanel);

		JPanel tailLogTitlePanel = new JPanel(new MigLayout("", "[][grow]", "[]"));
		tailLogPanel.add(tailLogTitlePanel, "cell 0 0,grow");

		JLabel lblLTailLogTiltleLogFile = new JLabel("Log File:");
		tailLogTitlePanel.add(lblLTailLogTiltleLogFile, "cell 0 0");

		JLabel lblTailLogFileName = new JLabel("");
		tailLogTitlePanel.add(lblTailLogFileName, "cell 1 0");

		JPanel tailLogContentPanel = new JPanel(new BorderLayout());
		tailLogPanel.add(tailLogContentPanel, "cell 0 1,grow");

		JScrollPane scrollPane_3 = new JScrollPane();
		tailLogContentPanel.add(scrollPane_3, BorderLayout.CENTER);

		JTextArea taTailLogContent = new JTextArea();
		scrollPane_3.setViewportView(taTailLogContent);

		JPanel tailLogSubmitButtonsPanel = new JPanel(new MigLayout("", "[grow][][][]", "[]"));
		tailLogPanel.add(tailLogSubmitButtonsPanel, "cell 0 2,grow");

		JButton btnTailLogClear = new JButton("Clear");
		tailLogSubmitButtonsPanel.add(btnTailLogClear, "cell 1 0");

		JButton btnTailLogStop = new JButton("Stop");
		tailLogSubmitButtonsPanel.add(btnTailLogStop, "cell 2 0");

		JButton btnTailLogStart = new JButton("Start");
		tailLogSubmitButtonsPanel.add(btnTailLogStart, "cell 3 0");

		JPanel statusPanel = new JPanel(new MigLayout("", "[grow][grow][grow][grow][grow]", "[grow]"));
		statusPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		topBottomSplitPane.setRightComponent(statusPanel);

		JMenuBar menuBar = new JMenuBar();
		mainFrame.setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenuItem mntmOpenLocalFile = new JMenuItem("Open Local File");
		mnFile.add(mntmOpenLocalFile);

		JMenuItem mntmOpenRemoteFile = new JMenuItem("Open Remote File");
		mnFile.add(mntmOpenRemoteFile);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		JMenu mnPreferences = new JMenu("Preferences");
		menuBar.add(mnPreferences);

		JMenuItem mntmHighlighting = new JMenuItem("Highlighting");
		mnPreferences.add(mntmHighlighting);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmUsage = new JMenuItem("Usage");
		mnHelp.add(mntmUsage);

		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);

	}
}
