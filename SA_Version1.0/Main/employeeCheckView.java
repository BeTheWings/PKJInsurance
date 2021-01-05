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

			this.setTitle("���� üũ ��");
			this.setSize(450, 150);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
			setLayout(new GridLayout(2, 2));

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("���� ID�� �Է��Ͻÿ�.");
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
			JButton bu1 = new JButton("Ȯ��");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("Ȯ��");
			this.add(panel10);
			panel10.add(bu1);

			JPanel panel11 = new JPanel();
			JButton bu2 = new JButton("���");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("���");
			this.add(panel11);
			panel11.add(bu2);
			this.painted = false;
		}
		this.setVisible(true);
	}

	private void checkOk() {
		this.id = inputText.getText();
		if (id.contentEquals("")) {
			JOptionPane.showMessageDialog(null, "ID�� �Է����� �����̽��ϴ�.");
		} else if (!id.contentEquals("")) {
			// controller�߰�
			checker = cEmployee.search(id);
			// checker = employeeDaoImpl.search(inputText.getText());
			if (checker == true) {
				menuSelectView.run();
				dispose();
			} else {
				JOptionPane.showMessageDialog(null, "Ȯ�� ���� ���� ���� ID �Դϴ�.");
			}
		}
	}

	class actionHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Ȯ��")) {
				// ���̵�Ȯ�����ϰ� boolean return����
				checkOk();
			} else if (e.getActionCommand().equals("���")) {
				int result = JOptionPane.showConfirmDialog(null, "����Ͻðڽ��ϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);

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