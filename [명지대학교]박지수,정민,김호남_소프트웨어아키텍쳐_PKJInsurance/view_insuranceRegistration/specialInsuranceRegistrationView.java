package view_insuranceRegistration;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import control_insuranceRegistration.cSpecialInsuranceRegistration;
import global.constant.eAccidentHistory;
import global.constant.eGender;
import global.constant.eJob;
import global.constant.eLongTerm;
import global.constant.eSpecialType;

public class specialInsuranceRegistrationView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private actionHandler actionHandler;
	private Vector<JRadioButton> buttons;
	private boolean painted = true;
	private String gender, job, longterm, specialType, property, accidentHistory, selectAccidentHistory, name, date,
			nothing;
	private int totalPrice;
	private int totalPrice2;
	private String insuranceName;
	private ArrayList<String> list;
	private ButtonGroup group1, group2, group3, group4, group5;

	private cSpecialInsuranceRegistration cSpecialInsuranceRegistration;

	public specialInsuranceRegistrationView() {
		this.actionHandler = new actionHandler();
		this.inputText = new JTextField[10];
		group1 = new ButtonGroup();
		group2 = new ButtonGroup();
		group3 = new ButtonGroup();
		group4 = new ButtonGroup();
		group5 = new ButtonGroup();
		this.cSpecialInsuranceRegistration = new cSpecialInsuranceRegistration();
		this.buttons = new Vector<JRadioButton>();

		this.specialType = null;
		this.property = null;
		this.gender = null;
		this.longterm = null;
		this.job = null;
		this.accidentHistory = null;
		this.selectAccidentHistory = null;
		this.nothing = null;
		this.totalPrice2 = 0;
		this.insuranceName = null;
	}

	public void getInformation(String name, String date, int inputTextSize) {
		this.name = name;
		this.date = date;
		this.totalPrice = inputTextSize;
	}

	public void run() {
		if (painted == true) {
			this.setTitle("4. Ư������");
			this.setSize(1700, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(16, 2));
			mainPanel.setBackground(Color.white);

			JPanel panel = new JPanel();
			inputLabel = new JLabel("<Ư������ ����>");
			panel.add(inputLabel);
			inputLabel.setFont(new Font("serif", Font.BOLD, 20));
			panel.setBackground(Color.white);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

			JPanel topPanel = new JPanel();
			topPanel.add(panel);
			topPanel.setBackground(Color.white);
			this.add(topPanel);

			JPanel panel0 = new JPanel();
			inputLabel = new JLabel("                                                  1. �����̸��� �Է����ּ���");
			panel0.add(inputLabel);
			panel0.setBackground(Color.white);
			panel0.setLayout(new BoxLayout(panel0, BoxLayout.Y_AXIS));
			mainPanel.add(panel0);

			JPanel panel0_1 = new JPanel();
			inputText[0] = new JTextField(30);
			inputText[0].setToolTipText("ex)Ư������");
			panel0_1.add(inputText[0]);
			panel0_1.setBackground(Color.white);
			mainPanel.add(panel0_1);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                                                  2. �̸��� �Է����ּ���");
			panel1.add(inputLabel);
			panel1.setBackground(Color.white);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[1] = new JTextField(30);
			inputText[1].setToolTipText("ex)ȫ�浿");
			panel1_1.add(inputText[1]);
			panel1_1.setBackground(Color.white);
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                                                  3. �ֹε�Ϲ�ȣ�� �Է����ּ���");
			panel2.add(inputLabel);
			panel2.setBackground(Color.white);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[2] = new JTextField(30);
			inputText[2].setToolTipText("ex)990101-2991990");
			panel2_1.add(inputText[2]);
			panel2_1.setBackground(Color.white);
			mainPanel.add(panel2_1);

			JPanel panel3 = new JPanel();
			inputLabel = new JLabel("                                                  4. ���̸� �Է����ּ���");
			panel3.add(inputLabel);
			panel3.setBackground(Color.white);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			inputText[3] = new JTextField(30);
			inputText[3].setToolTipText("ex)22");
			panel3_1.add(inputText[3]);
			panel3_1.setBackground(Color.white);
			mainPanel.add(panel3_1);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                                                  5. ������ �������ּ���");
			panel4.add(inputLabel);
			panel4.setBackground(Color.white);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			for (eGender eGender : eGender.values()) {
				JRadioButton button = new JRadioButton(eGender.getText());
				button.setActionCommand(eGender.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group1.add(button);
				panel4_1.add(button);
				button.setBackground(Color.white);
			}
			panel4_1.setBackground(Color.white);
			mainPanel.add(panel4_1);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                                                  6. ��ȭ��ȣ�� �Է����ּ���");
			panel5.add(inputLabel);
			panel5.setBackground(Color.white);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
			inputText[4] = new JTextField(30);
			inputText[4].setToolTipText("ex)010-1111-2222");
			panel5_1.add(inputText[4]);
			panel5_1.setBackground(Color.white);
			mainPanel.add(panel5_1);

			JPanel panel6 = new JPanel();
			inputLabel = new JLabel("                                                  7. �ּҸ� �Է����ּ���");
			panel6.add(inputLabel);
			panel6.setBackground(Color.white);
			panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
			mainPanel.add(panel6);

			JPanel panel6_1 = new JPanel();
			inputText[5] = new JTextField(30);
			inputText[5].setToolTipText("ex)����Ư���� ���빮�� �����µ� �źϰ��34 �������б� �ι���Ȱ�� 8405ȣ");
			panel6_1.add(inputText[5]);
			panel6_1.setBackground(Color.white);
			mainPanel.add(panel6_1);

			JPanel panel7 = new JPanel();
			inputLabel = new JLabel("                                                  8. ���¹�ȣ�� �Է����ּ���");
			panel7.add(inputLabel);
			panel7.setBackground(Color.white);
			panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
			mainPanel.add(panel7);

			JPanel panel7_1 = new JPanel();
			inputText[6] = new JTextField(30);
			inputText[6].setToolTipText("ex)���� 67300201222444");
			panel7_1.add(inputText[6]);
			panel7_1.setBackground(Color.white);
			mainPanel.add(panel7_1);

			JPanel panel7_2 = new JPanel();
			inputLabel = new JLabel("                                                  9. �̸����� �Է����ּ���");
			panel7_2.add(inputLabel);
			panel7_2.setBackground(Color.white);
			panel7_2.setLayout(new BoxLayout(panel7_2, BoxLayout.Y_AXIS));
			mainPanel.add(panel7_2);

			JPanel panel7_3 = new JPanel();
			inputText[7] = new JTextField(30);
			inputText[7].setToolTipText("ex)email@naver.com");
			panel7_3.add(inputText[7]);
			panel7_3.setBackground(Color.white);
			mainPanel.add(panel7_3);

			JPanel panel8 = new JPanel();
			inputLabel = new JLabel("                                                  10. ������ �������ּ���");
			panel8.add(inputLabel);
			panel8.setBackground(Color.white);
			panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
			mainPanel.add(panel8);

			JPanel panel8_1 = new JPanel();
			for (eJob eJob : eJob.values()) { // values : object�ϳ��ϳ��� array
				JRadioButton button = new JRadioButton(eJob.getText());
				button.setActionCommand(eJob.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group2.add(button);
				panel8_1.add(button);
				button.setBackground(Color.white);
			}
			panel8_1.setBackground(Color.white);
			mainPanel.add(panel8_1);

			JPanel panelT = new JPanel();
			inputLabel = new JLabel("                                                  11. ���� ������ �������ּ���");
			panelT.setLayout(new BoxLayout(panelT, BoxLayout.X_AXIS));
			panelT.add(inputLabel);
			panelT.setBackground(Color.white);
			mainPanel.add(panelT);

			JPanel panelTT = new JPanel();
			for (eSpecialType eProperty : eSpecialType.values()) {
				JRadioButton button = new JRadioButton(eProperty.getText());
				button.setActionCommand(eProperty.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group4.add(button);
				panelTT.add(button);
				button.setBackground(Color.white);
			}
			panelTT.setBackground(Color.white);
			mainPanel.add(panelTT);

			// �� �� �����غ���
			JPanel panel13 = new JPanel();
			inputLabel = new JLabel("                                                  12. ��������� �Է����ּ���");
			panel13.add(inputLabel);
			panel13.setBackground(Color.white);
			panel13.setLayout(new BoxLayout(panel13, BoxLayout.X_AXIS));
			mainPanel.add(panel13);

			JPanel panel13_1 = new JPanel();
			inputText[8] = new JTextField(30);
			inputText[8].setEditable(false);
			panel13_1.setBackground(Color.white);
			panel13_1.add(inputText[8]);
			mainPanel.add(panel13_1);

			JPanel panel9 = new JPanel();
			inputLabel = new JLabel("                                                  13. ��⺸�� ���θ� �������ּ���");
			panel9.add(inputLabel);
			panel9.setBackground(Color.white);
			panel9.setLayout(new BoxLayout(panel9, BoxLayout.X_AXIS));
			mainPanel.add(panel9);

			JPanel panel9_1 = new JPanel();
			for (eLongTerm eLongTerm : eLongTerm.values()) {
				JRadioButton button = new JRadioButton(eLongTerm.getText());
				button.setActionCommand(eLongTerm.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group3.add(button);
				panel9_1.add(button);
				button.setBackground(Color.white);
			}
			panel9_1.setBackground(Color.white);
			mainPanel.add(panel9_1);

			JPanel panel10 = new JPanel();
			inputLabel = new JLabel("                                                  14. ��������� �������ּ���");
			panel10.add(inputLabel);
			panel10.setBackground(Color.white);
			panel10.setLayout(new BoxLayout(panel10, BoxLayout.X_AXIS));
			mainPanel.add(panel10);

			JPanel panel10_01 = new JPanel();
			for (eAccidentHistory eAccidentHistory : eAccidentHistory.values()) {
				JRadioButton button = new JRadioButton(eAccidentHistory.getText());
				button.setActionCommand(eAccidentHistory.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group5.add(button);
				panel10_01.add(button);
				button.setBackground(Color.white);
			}
			panel10_01.setBackground(Color.white);
			mainPanel.add(panel10_01);

			JPanel panel10_0 = new JPanel();
			inputLabel = new JLabel("                                                  15. ����̷��� �Է����ּ���");
			panel10_0.setBackground(Color.white);
			panel10_0.add(inputLabel);
			panel10_0.setLayout(new BoxLayout(panel10_0, BoxLayout.X_AXIS));
			mainPanel.add(panel10_0);

			JPanel panel10_1 = new JPanel();
			inputText[9] = new JTextField(30);
			inputText[9].setToolTipText("ex)�߿��̺�Ʈ�� �����Ϸ� �Ͽ����� ���۽��� ����� ����Ұ���. ���غ� 500000��");
			panel10_1.add(inputText[9]);
			inputText[9].setEditable(false);
			panel10_1.setBackground(Color.white);
			mainPanel.add(panel10_1);

			JPanel panel11 = new JPanel();
			JButton bu11 = new JButton("�Ϸ�");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("�Ϸ�");
			panel11.setBackground(Color.white);
			mainPanel.add(panel11);
			panel11.add(bu11);

			JPanel panel12 = new JPanel();
			JButton bu12 = new JButton("���");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("���");
			panel12.setBackground(Color.white);
			mainPanel.add(panel12);
			panel12.add(bu12);

			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}

	public void putText() {
		this.list = new ArrayList<String>();

		this.list.add(this.inputText[0].getText());// �����̸�
		this.list.add(this.inputText[1].getText());// �̸�
		this.list.add(this.inputText[2].getText());// �ֹι�ȣ
		this.list.add(this.inputText[3].getText());// ����
		this.list.add(this.inputText[4].getText());// ����
		this.list.add(this.inputText[5].getText());// �ּ�
		this.list.add(this.inputText[6].getText());// ����
		this.list.add(this.inputText[7].getText());// �̸���
		this.list.add(this.inputText[8].getText());// �������
		if (inputText[9].isEditable() != false) {
			this.list.add(this.inputText[9].getText());// ����̷�
		} else {
			this.list.add(nothing);
		}
		list.add(group1.getSelection().getActionCommand());// ����
		list.add(group2.getSelection().getActionCommand());// ����
		list.add(group3.getSelection().getActionCommand());// ��⺸��
		list.add(group4.getSelection().getActionCommand());// ��������
		list.add(group5.getSelection().getActionCommand());// �������

		findPayIn();
		list.add(Integer.toString(this.totalPrice2));
		list.add(this.date);
		this.cSpecialInsuranceRegistration.setData(this.list);
	}

	public void findPayIn() {
		this.totalPrice2 = cSpecialInsuranceRegistration.findPayIn(insuranceName);
	}

	public boolean isBlank(ActionEvent e) {
		insuranceName = this.inputText[0].getText();
		String name = this.inputText[1].getText();
		String residnetRegistrationNumber = this.inputText[2].getText();
		String age = this.inputText[3].getText();
		String phoneNumber = this.inputText[4].getText();
		String address = this.inputText[5].getText();
		String accountNumber = this.inputText[6].getText();
		String accidentHistory = this.inputText[9].getText();
		String eMail = this.inputText[7].getText();

		if (inputText[8].isEditable() != false) {
			property = inputText[8].getText();
		} else {
			property = e.getActionCommand();
		}

		if (inputText[9].isEditable() != false) {
			accidentHistory = inputText[9].getText();
		} else {
			accidentHistory = "��� �̷� ����";
		}
		if (insuranceName.equals("")) {
			JOptionPane.showMessageDialog(null, "�����̸��� �Է����ּ���!");
		} else if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "�̸��� �Է����ּ���!");
		} else if (residnetRegistrationNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "�ֹε�Ϲ�ȣ�� �Է����ּ���!");
		} else if (age.equals("")) {
			JOptionPane.showMessageDialog(null, "���̸� �Է����ּ���!");
		} else if (gender == null) {
			JOptionPane.showMessageDialog(null, "������ �������ּ���!");
		} else if (phoneNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "��ȭ��ȣ�� �Է����ּ���!");
		} else if (address.equals("")) {
			JOptionPane.showMessageDialog(null, "�ּҸ� �Է����ּ���!");
		} else if (accountNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "���¹�ȣ�� �Է����ּ���!");
		} else if (eMail.equals("")) {
			JOptionPane.showMessageDialog(null, "�̸����� �Է����ּ���!");
		} else if (job == null) {
			JOptionPane.showMessageDialog(null, "������ �������ּ���!");
		} else if (specialType == null) {
			JOptionPane.showMessageDialog(null, "���������� �������ּ���!");
		} else if (longterm == null) {
			JOptionPane.showMessageDialog(null, "��⺸�迩�θ� �������ּ���!");
		} else if (selectAccidentHistory == null && inputText[9].isEditable() != true) {
			JOptionPane.showMessageDialog(null, "��������� �������ּ���!");
		} else if (accidentHistory.equals("") && inputText[9].isEditable() != false) {
			JOptionPane.showMessageDialog(null, "����̷��� �Է����ּ���!");
		} else {
			return true;
		}
		return false;
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("�������պ���") || e.getActionCommand().equals("���Ʊ���������պ���")
					|| e.getActionCommand().equals("���꺸��") || e.getActionCommand().equals("��Ƽ���ú���")) {
				System.out.println("Ȯ��1");
				if (inputText[8].isEditable() == false) {
					System.out.println("Ȯ��");
					inputText[8].setEditable(true);
				}
			} else if (e.getActionCommand().equals("���غ���") || e.getActionCommand().equals("���å�Ӻ���")
					|| e.getActionCommand().equals("��������")) {
				if (inputText[8].isEditable() == true) {
					inputText[8].setEditable(false);
				}
				property = e.getActionCommand();
			} else if (e.getActionCommand() == "�Ϸ�") {
				// �Ϸ�
				if (inputText[1].getText().equals("")) {
					JOptionPane.showMessageDialog(null, "�Էµ� �̸��� ��ġ���� �ʽ��ϴ�.");
				} else if (cSpecialInsuranceRegistration.checkCategory(inputText[0].getText())) { // true����
					putText();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "�ش� ������ �������� �ʽ��ϴ�.");
				}
			} else if (e.getActionCommand() == "���") {
				int result = JOptionPane.showConfirmDialog(null, "����Ͻðڽ��ϱ�?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {

				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// �׳� â ���� ���
				}
			} else if (e.getActionCommand().equals("����")) {
				gender = "����";
			} else if (e.getActionCommand().equals("����")) {
				gender = "����";
			} else if (e.getActionCommand().equals("������") || e.getActionCommand().equals("����")
					|| e.getActionCommand().equals("������") || e.getActionCommand().equals("����")
					|| e.getActionCommand().equals("�¹���") || e.getActionCommand().equals("����")
					|| e.getActionCommand().equals("����") || e.getActionCommand().equals("��Ÿ")) {
				job = e.getActionCommand();
			} else if (e.getActionCommand().equals("��⺸��") || e.getActionCommand().equals("�ܱ⺸��")) {
				longterm = e.getActionCommand();
			} else if (e.getActionCommand().equals("���غ���") || e.getActionCommand().equals("���å�Ӻ���")
					|| e.getActionCommand().equals("��������") || e.getActionCommand().equals("�������պ���")
					|| e.getActionCommand().equals("���Ʊ���������պ���") || e.getActionCommand().equals("���꺸��")
					|| e.getActionCommand().equals("���ຸ��") || e.getActionCommand().equals("��Ƽ���ú���")) {
				specialType = e.getActionCommand();
			} else if (e.getActionCommand().equals("��� �̷� ����")) {
				inputText[9].setEditable(true);
			} else if (e.getActionCommand().equals("��� �̷� ����")) {
				if (inputText[9].isEditable() == true) {
					inputText[9].setEditable(false);
				}
				selectAccidentHistory = "��� �̷� ����";
			}
		}
	}

	public void association() {

	}

}