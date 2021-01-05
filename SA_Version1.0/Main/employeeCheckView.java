package Main;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import control.cEmployee;
import dao.dao;
import dao.employeeDaoImpl;

public class employeeCheckView extends JFrame {
	private static final long serialVersionUID = 1L;

	// GUI
	private JLabel inputLabel;
	private JTextField inputText;
	private actionHandler actionHandler;
	private boolean painted = true;
	// view
	private employeeMenuSelectView menuSelectView;
	private boolean checker = false;

	// Controller
	private cEmployee cEmployee;

	// variable
	private String id;

	public employeeCheckView() throws Exception {
		this.actionHandler = new actionHandler();
		this.menuSelectView = new employeeMenuSelectView();
		this.cEmployee = new cEmployee();

	}

	public void initialize() {
		this.menuSelectView.initialize();

	}

	public void association(dao dao) {
		this.menuSelectView.association();
	}

	public void run() {

		if (painted == true) {

			this.setTitle("보안 체크 중");
			this.setSize(450, 150);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
			setLayout(new GridLayout(2, 2));

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("직원 ID를 입력하시오.");
			panel1.add(inputLabel);
			this.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText = new JTextField(10);

			panel1_1.add(inputText);
			inputText.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),
					"exit");

			inputText.getActionMap().put("exit", new AbstractAction() {

				@Override
				public void actionPerformed(ActionEvent e) {
					checkOk();
				}

			});
			this.add(panel1_1);

			JPanel panel10 = new JPanel();
			JButton bu1 = new JButton("확인");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("확인");
			this.add(panel10);
			panel10.add(bu1);

			JPanel panel11 = new JPanel();
			JButton bu2 = new JButton("취소");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("취소");
			this.add(panel11);
			panel11.add(bu2);
			this.painted = false;
		}
		this.setVisible(true);
	}

	private void checkOk() {
		this.id = inputText.getText();
		if (id.contentEquals("")) {
			JOptionPane.showMessageDialog(null, "ID를 입력하지 않으셨습니다.");
		} else if (!id.contentEquals("")) {
			// controller추가
			checker = cEmployee.search(id);
			// checker = employeeDaoImpl.search(inputText.getText());
			if (checker == true) {
				menuSelectView.run();
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "확인 되지 않은 직원 ID 입니다.");
			}
		}
	}

	class actionHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("확인")) {
				// 아이디확인을하고 boolean return해줘
				checkOk();
			} else if (e.getActionCommand().equals("취소")) {
				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);

				if (result == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		}

		class KeyHandler implements KeyListener {

			@Override
			public void keyPressed(KeyEvent event) {

			}

			@Override
			public void keyReleased(KeyEvent arg0) {

			}

			@Override
			public void keyTyped(KeyEvent arg0) {

			}

		}
	}
}