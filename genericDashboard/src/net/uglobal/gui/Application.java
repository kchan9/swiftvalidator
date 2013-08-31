package net.uglobal.gui;

import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	private static final Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		Application app = new Application();
		app.init(new ClassPathXmlApplicationContext("generic_dashboard.xml"));
	}

	//	private MessageSender messageSender;
	//	private SchedulerDao schedulerDao;

	private ApplicationContext appContext;

	private void init(ClassPathXmlApplicationContext appContext) {
		//		messageSender = (MessageSender) appContext.getBean("messageSender");
		//		schedulerDao = (SchedulerDao) appContext.getBean("schedulerGuiDao");
		this.appContext = appContext;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				showUI();
			}
		});
	}

	private void showUI() {
		//		try {
		// -- Standard
		//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

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

		MainFrame mainFrame = (MainFrame) appContext.getBean("mainFrame");

		//		AbstractMainFrame mainFrame = new MainFrame();
		//			mainFrame.setMessageSender(messageSender);
		//			mainFrame.setSchedulerDao(schedulerDao);
		mainFrame.setVisible(true);
		mainFrame.pack();

		// center the window
		//			mainFrame.setCenterLocation();
		//		} catch (Exception e) {
		//			logger.error(e.getMessage(), e);
		//		}
	}

}
