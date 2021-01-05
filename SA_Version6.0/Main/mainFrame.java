package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import dao_main.dao;
import view_ClientMenu.clientMenuSelectView;
import view_employeeMenu.employeeCheckView;

public class mainFrame extends JFrame {
	private static final long serialVersionUID = 1L;
//Handler
	private actionHandler actionHandler;
	private windowHandler windowHandler;
	private dao dao;
	// View
	private clientMenuSelectView clientMenuSelectView;
	private employeeCheckView employeeCheckView;
	// etc
	private boolean painted = true;

	public mainFrame() throws Exception {
		// handler
		this.windowHandler = new windowHandler();
		this.actionHandler = new actionHandler();
		this.dao = new dao();

		// view
		this.employeeCheckView = new employeeCheckView();
		this.clientMenuSelectView = new clientMenuSelectView();
		this.addWindowListener(windowHandler);
	}

	public void initialize() {
		this.employeeCheckView.initialize();
		this.clientMenuSelectView.initialize();
	}

	public void association() {
		this.employeeCheckView.association(this.dao);
		this.clientMenuSelectView.association(this.dao);
	}

	public void run() {

		if (painted == true) {
			try {
				UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
					| UnsupportedLookAndFeelException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			this.setTitle("보험");
			this.setSize(400, 400);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			setLayout(new GridLayout(3, 1));

			JPanel panel1 = new JPanel();
			this.add(panel1);
			JButton bu1 = new JButton("1. 보험사 직원");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("1");
			panel1.setBackground(new Color(240, 248, 255));
			panel1.add(bu1);
			JPanel panel2 = new JPanel();
			this.add(panel2);

			JButton bu2 = new JButton("      2. 고객        ");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("2");
			panel2.setBackground(new Color(240, 248, 255));
			panel2.add(bu2);

			JPanel panel3 = new JPanel();
			this.add(panel3);
			JButton bu3 = new JButton("     종료하기     ");

			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("3");
			panel3.setBackground(new Color(240, 248, 255));
			panel3.add(bu3);

			bu3.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
					"exit");

			bu3.getActionMap().put("exit", new AbstractAction() {

				@Override
				public void actionPerformed(ActionEvent e) {
					finishProgram();
				}

			});

			this.painted = false;
		}

		this.setVisible(true);
	}

	protected void finishProgram() {

		JOptionPane.showMessageDialog(null, "종료하겠습니다.", "시스템종료", JOptionPane.WARNING_MESSAGE);
		System.exit(DISPOSE_ON_CLOSE);
	}

	class keyHandler implements KeyListener {

		@Override
		public void keyPressed(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {

		}

		@Override
		public void keyTyped(KeyEvent e) {

		}

	}

	class windowHandler implements WindowListener {

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.YES_OPTION) {
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			} else if (result == JOptionPane.NO_OPTION) {
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			} else if (result == JOptionPane.CLOSED_OPTION) {

				// 그냥 창 닫은 경우
			}

		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	class actionHandler implements ActionListener {
		@Override

		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "1") {
				employeeCheckView.run();
			} else if (e.getActionCommand() == "2") {
				clientMenuSelectView.run();
			} else if (e.getActionCommand() == "3") {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == 0) {
					System.exit(0);
				} else if (result == 1) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				} else if (result == -1) {

				}
			}
		}

	}

	public void finalization() {

	}

}
