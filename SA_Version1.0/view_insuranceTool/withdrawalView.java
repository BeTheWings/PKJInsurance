package view_insuranceTool;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.cinquryAboutClientList;

public class withdrawalView extends JFrame {

	private static final long serialVersionUID = 1L;
	private ArrayList<String> clientInformationList;
	private JLabel inputLabel;
	private JTextField[] inputText;
	private actionHandler actionHandler;
	private boolean painted = true;
	private boolean stopper;
	private cinquryAboutClientList cinquryAboutClientList;
	private inquiryClientView inquiryClientView;

	public withdrawalView() {
		this.actionHandler = new actionHandler();
		this.inputText = new JTextField[5];
		this.clientInformationList = new ArrayList<String>();
		this.cinquryAboutClientList = new cinquryAboutClientList();
		this.inquiryClientView = new inquiryClientView();

	}

	public void run() {
		// �̸�,�ֹι�ȣ //Ż���ϱ� //������
		if (painted == true) {

			this.setTitle("4. ȸ��Ż��");
			this.setSize(600, 700);
			this.setLocationRelativeTo(null);

			this.setLayout(new FlowLayout());
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(4, 2));

			JPanel blankPanel = new JPanel();

			mainPanel.add(blankPanel);
			JPanel panel0_0 = new JPanel();
			inputLabel = new JLabel("<ȸ��Ż��>");
			panel0_0.add(inputLabel);
			panel0_0.setLayout(new BoxLayout(panel0_0, BoxLayout.X_AXIS));

			mainPanel.add(panel0_0);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                                                  1. �̸��� �Է����ּ���");
			panel1.add(inputLabel);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[0] = new JTextField(13);
			panel1_1.add(inputText[0]);
			inputText[0].setToolTipText("ex)ȫ�浿");
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                                                  2. �ֹε�Ϲ�ȣ�� �Է����ּ���");
			panel2.add(inputLabel);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[1] = new JTextField(13);
			panel2_1.add(inputText[1]);
			inputText[1].setToolTipText("ex)990101-1020310");
			mainPanel.add(panel2_1);

			JPanel panel7 = new JPanel();
			panel7.setLayout(new BoxLayout(panel7, BoxLayout.X_AXIS));

			JPanel blankPanel2 = new JPanel();
			blankPanel2.setLayout(new FlowLayout());

			JButton bu1 = new JButton("��ȸ");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("��ȸ");
			panel7.add(bu1);

			JButton bu2 = new JButton("Ż��");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("Ż��");
			panel7.add(bu2);

			JButton bu3 = new JButton("���");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("���");
			panel7.add(bu3);

			JPanel tableP = new JPanel();
			tableP.add(inquiryClientView);
			tableP.setLayout(new BoxLayout(tableP, BoxLayout.X_AXIS));

			blankPanel2.add(panel7);

			this.add(mainPanel);
			this.add(blankPanel2);
			this.add(tableP);
			painted = false;
		}
		this.setVisible(true);
	}

	public boolean isBlank() {
		String name = this.inputText[0].getText();
		String idNumber = this.inputText[1].getText();

		if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "�̸��� �Է����ּ���");
		} else if (idNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "�ֹε�Ϲ�ȣ�� �Է����ּ���");

		} else {
			return true;
		}
		return false;
	}

	public void searchClientInformation() {

		String name = this.inputText[0].getText();
		String idNumber = this.inputText[1].getText();
		this.clientInformationList = this.cinquryAboutClientList.searchInformation(name, idNumber);
		if (this.clientInformationList.size() != 0) {
			this.inquiryClientView.addRows(clientInformationList);
		} else {
			JOptionPane.showMessageDialog(null, "��ġ�ϴ� ������ �����ϴ�.");
		}

	}

	public void sendMessage(String actionCommand) {
		if (actionCommand == "Ż��") {
			ArrayList<String> clientInformation = new ArrayList<String>();
			clientInformation = this.inquiryClientView.withDrawo();
			if (clientInformation != null) {
				this.cinquryAboutClientList.withDraw(clientInformation.get(0), clientInformation.get(1));
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ������ �����ϴ�");
			}
		}
	}

	class actionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "��ȸ") {
				stopper = isBlank();
				if (stopper == true) {
					searchClientInformation();
				}
			} else if (e.getActionCommand() == "Ż��") {
				sendMessage(e.getActionCommand());
			} else if (e.getActionCommand() == "���") {
				int result = JOptionPane.showConfirmDialog(null, "����Ͻðڽ��ϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// �׳� â ���� ���
				}
			}
		}
	}

}