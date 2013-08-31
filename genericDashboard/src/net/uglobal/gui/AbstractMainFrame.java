package net.uglobal.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public abstract class AbstractMainFrame extends JFrame implements ApplicationContextAware {

	protected final Logger logger = Logger.getLogger(getClass());

	private static final String DEFAULT_TITLE = "Generic Dashboard";
	private static final int DEFAULT_PREFERRED_WIDTH = 1100;
	private static final int DEFAULT_PREFERRED_HEIGHT = 860;

	private JPanel statusPanel;
	private JMenuBar menuBar;
	private JSplitPane leftRightSplitPane;
	private JSplitPane navigationSplitPane;
	private JSplitPane contentSplitPane;

	private JTabbedPane topNavigationTabbedPane;
	private JTabbedPane bottomNavigationTabbedPane;
	private JTabbedPane topContentTabbedPane;
	private JTabbedPane bottomContentTabbedPane;

	private GenericToolbar toolbar;

	//	public JTabbedPane getTopContentTabbedPane() {
	//		return this.topContentTabbedPane;
	//	}
	//	public JTabbedPane getBottomContentTabbedPane;

	//	private JScrollPane topNavigationScrollPane;
	//	private JScrollPane bottomNavigationScrollPane;
	//	private JScrollPane topContentScrollPane;
	//	private JScrollPane bottomContentScrollPane;

	/**
	 * Create the application.
	 */
	public AbstractMainFrame() {
		ApplicationContext ctx = getApplicationContext();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			JFrame.setDefaultLookAndFeelDecorated(true);

			// -- Info Node
			//			UIManager.setLookAndFeel("net.infonode.gui.laf.InfoNodeLookAndFeel");

			// -- JTattoo
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			//			UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
			//			JFrame.setDefaultLookAndFeelDecorated(true);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		initialize();

		setVisible(true);
		pack();
		setCenterLocation();
	}

	// ---------------------------------------------------------------------------- 
	public JTabbedPane getTopNavigationTabbedPane() {
		return this.topNavigationTabbedPane;
	}

	public JTabbedPane getBottomNavigationTabbedPane() {
		return this.bottomNavigationTabbedPane;
	}

	public JTabbedPane getTopContentTabbedPane() {
		return this.topContentTabbedPane;
	}

	public JTabbedPane getBottomContentTabbedPane() {
		return this.bottomContentTabbedPane;
	}

	public JMenuBar getJMenuBar() {
		return this.menuBar;
	}

	public void setTitle(String title) {
		super.setTitle(title);
	}

	protected JPanel getStatusPane() {
		return this.statusPanel;
	}

	protected void setPreferredSize(int width, int height) {
		setPreferredSize(new Dimension(width, height));
	}

	protected void setFrameDividerLocation(int i) {
		leftRightSplitPane.setDividerLocation(i);
	}

	protected void setNavigationPanelDividerLocation(int i) {
		navigationSplitPane.setDividerLocation(i);
	}

	protected void setContentPanelDividerLocation(int i) {
		contentSplitPane.setDividerLocation(i);
	}

	protected void setFrameDividerLocation(double d) {
		leftRightSplitPane.setDividerLocation(d);
	}

	protected void setNavigationPanelDividerLocation(double d) {
		navigationSplitPane.setDividerLocation(d);
	}

	protected void setContentPanelDividerLocation(double d) {
		contentSplitPane.setDividerLocation(d);
	}

	/**
	 * i - NORTH = top navigation panel
	 * i - SOUTH = bottom navigation panel
	 * i - ALL   = whole navigation panel
	 * @param i
	 */
	protected void hideNavigationSplitPane(Layout layout) {
		setNavigationSplitPaneVisible(layout, false);
	}

	protected void showNavigationSplitPane(Layout layout) {
		setNavigationSplitPaneVisible(layout, true);
	}

	private void setNavigationSplitPaneVisible(Layout layout, boolean isVisible) {
		switch (layout) {
		case ALL:
			//			this.leftRightSplitPane.getLeftComponent().setVisible(isVisible);
			this.navigationSplitPane.getLeftComponent().setVisible(isVisible);
			this.navigationSplitPane.getRightComponent().setVisible(isVisible);
			break;
		case NORTH:
			this.navigationSplitPane.getLeftComponent().setVisible(isVisible);
			break;
		case SOUTH:
			//			this.navigationSplitPane.setRightComponent(null);
			this.navigationSplitPane.getRightComponent().setVisible(isVisible);
			break;
		default:

		}
	}

	/**
	 * i - NORTH = top content panel
	 * i - SOUTH = bottom content panel
	 * i - ALL   = whole content panel
	 * @param i
	 */
	protected void showContentSplitPane(Layout layout) {
		setContentSplitPaneVisible(layout, true);
	}

	protected void hideContentSplitPane(Layout layout) {
		setContentSplitPaneVisible(layout, false);
	}

	private void setContentSplitPaneVisible(Layout layout, boolean isVisible) {
		switch (layout) {
		case ALL:
			//			this.leftRightSplitPane.getRightComponent().setVisible(isVisible);
			this.contentSplitPane.getLeftComponent().setVisible(isVisible);
			this.contentSplitPane.getRightComponent().setVisible(isVisible);
			break;
		case NORTH:
			this.contentSplitPane.getLeftComponent().setVisible(isVisible);
			break;
		case SOUTH:
			this.contentSplitPane.getRightComponent().setVisible(isVisible);
			break;
		default:

		}
	}

	protected void addTopNavigationPanel(String tabTitle, JPanel jpanel) {
		topNavigationTabbedPane.addTab(tabTitle, jpanel);
		showNavigationSplitPane(Layout.NORTH);

		//		JScrollPane topNavigationScrollPane = new JScrollPane();
		//		topNavigationTabbedPane.addTab(tabTitle, topNavigationScrollPane);
		//		topNavigationScrollPane.add(jpanel);
		//		showNavigationSplitPane(Layout.NORTH);
	}

	protected void addBottomNavigationPanel(String tabTitle, JPanel jpanel) {
		JScrollPane bottomNavigationScrollPane = new JScrollPane();
		bottomNavigationTabbedPane.addTab(tabTitle, bottomNavigationScrollPane);
		bottomNavigationScrollPane.add(jpanel);
		showNavigationSplitPane(Layout.SOUTH);
	}

	protected void addTopContentPanel(String tabTitle, JPanel jpanel) {
		//		JScrollPane topContentScrollPane = new JScrollPane();
		topContentTabbedPane.addTab(tabTitle, jpanel);
		//		topContentScrollPane.add(jpanel);
		showContentSplitPane(Layout.NORTH);
	}

	protected void addBottomContentPanel(String tabTitle, JPanel jpanel) {
		//		JScrollPane bottomContentScrollPane = new JScrollPane();

		bottomContentTabbedPane.addTab(tabTitle, jpanel);
		//		bottomContentScrollPane.add(new JButton("test"));
		//		bottomContentTabbedPane.addTab(tabTitle, jpanel);

		//		bottomContentScrollPane.add(new JButton("test"));

		//		bottomContentScrollPane.add(jpanel);
		showContentSplitPane(Layout.SOUTH);
	}

	protected void addToolbar(List<String> imageFiles, List<String> toolbarLabels) {
		this.toolbar.addImageFiles(imageFiles);
		this.toolbar.addToolbarLabels(toolbarLabels);
		this.toolbar.build();
	}

	// ----------------------------------------------------------------------------

	private void initialize() {
		setTitle(DEFAULT_TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(DEFAULT_PREFERRED_WIDTH, DEFAULT_PREFERRED_HEIGHT));

		topNavigationTabbedPane = new JTabbedPane();
		bottomNavigationTabbedPane = new JTabbedPane();
		topContentTabbedPane = new JTabbedPane();
		bottomContentTabbedPane = new JTabbedPane();

		JSplitPane topBottomSplitPane = new JSplitPane();
		topBottomSplitPane.setResizeWeight(0.99);
		//		topBottomSplitPane.setDividerLocation(765);
		topBottomSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		getContentPane().add(topBottomSplitPane, BorderLayout.CENTER);

		leftRightSplitPane = new JSplitPane();
		leftRightSplitPane.setOneTouchExpandable(true);
		topBottomSplitPane.setLeftComponent(leftRightSplitPane);

		navigationSplitPane = new JSplitPane();
		navigationSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		leftRightSplitPane.setLeftComponent(navigationSplitPane);
		navigationSplitPane.setLeftComponent(topNavigationTabbedPane);
		navigationSplitPane.setRightComponent(bottomNavigationTabbedPane);

		contentSplitPane = new JSplitPane();
		contentSplitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		leftRightSplitPane.setRightComponent(contentSplitPane);
		contentSplitPane.setLeftComponent(topContentTabbedPane);
		contentSplitPane.setRightComponent(bottomContentTabbedPane);

		// Status Panel
		statusPanel = new JPanel(/*new MigLayout("", "[grow][grow][grow][grow][grow]", "[grow]")*/);
		statusPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		//		statusPanel.setSize(width, height)
		topBottomSplitPane.setRightComponent(statusPanel);

		// ------------------------------------------------------------------------------------------
		// -- Menu
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// File
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		mnFile.addSeparator();
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);

		// Edit
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);

		// View
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);

		// Preferences
		JMenu mnPreferences = new JMenu("Preferences");
		menuBar.add(mnPreferences);

		// Help Menu
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		JMenuItem mntmUsage = new JMenuItem("Usage");
		mnHelp.add(mntmUsage);
		mnHelp.addSeparator();
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);

		// ------------------------------------------------------------------------------------------ 
		// -- Toolbar
		toolbar = new GenericToolbar();
		getContentPane().add(toolbar, BorderLayout.NORTH);

		// -- 
		hideNavigationSplitPane(Layout.ALL);
		hideContentSplitPane(Layout.ALL);

	}

	// center the window
	private void setCenterLocation() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int width = getWidth();
		int height = getHeight();
		int X = (screen.width / 2) - (width / 2); // Center horizontally.
		int Y = (screen.height / 2) - (height / 2); // Center vertically.

		setBounds(X, Y, width, height);
	}

	// --
	public enum Layout {
		NORTH, EAST, SOUTH, WEST, ALL
	}

	// -- DI
	private ApplicationContext appContext;

	public void setApplicationContext(ApplicationContext appContext) {
		this.appContext = appContext;
	}

	public ApplicationContext getApplicationContext() {
		return this.appContext;
	}
}
