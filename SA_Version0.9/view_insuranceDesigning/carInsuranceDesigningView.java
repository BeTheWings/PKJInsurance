package view_insuranceDesigning;

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

import control.cCarInsuranceDesinging;

public class carInsuranceDesigningView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private actionHandler actionHandler;
	private boolean painted = true;
	private cCarInsuranceDesinging cCarInsuranceDesinging;
	private boolean stopper;
	private ButtonGroup group;
	private String check1;
	private Vector<JRadioButton> buttons;
	private ArrayList<String> data;

	public carInsuranceDesigningView() {
		this.actionHandler = new actionHandler();
		this.inputText = new JTextField[8];
		this.buttons = new Vector<JRadioButton>();
		this.group = new ButtonGroup();
		this.cCarInsuranceDesinging = new cCarInsuranceDesinging();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("3. �ڵ�������");
			this.setSize(1000, 600);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);

			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new GridLayout(11, 2));
			mainPanel.setBackground(Color.white);

			JPanel panel0_0 = new JPanel();
			inputLabel = new JLabel("<�ڵ������� ����>");
			panel0_0.add(inputLabel);
			inputLabel.setFont(new Font("serif", Font.BOLD, 20));
			panel0_0.setBackground(Color.white);
			panel0_0.setLayout(new BoxLayout(panel0_0, BoxLayout.X_AXIS));

			JPanel topPanel = new JPanel();
			topPanel.add(panel0_0);
			topPanel.setBackground(Color.white);
			this.add(topPanel);

			JPanel panel0 = new JPanel();
			inputLabel = new JLabel("                                                  1. �����̸��� �Է����ּ���");
			panel0.add(inputLabel);
			panel0.setLayout(new BoxLayout(panel0, BoxLayout.Y_AXIS));
			panel0.setBackground(Color.white);
			mainPanel.add(panel0);

			JPanel panel1_0 = new JPanel();
			inputText[0] = new JTextField(30);
			inputText[0].setToolTipText("ex)������ ���㸦 �����ϰ� �ִ� 20�� �̻� ����");
			panel1_0.add(inputText[0]);
			panel1_0.setBackground(Color.white);
			mainPanel.add(panel1_0);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                                                  2. ���Դ���� �Է����ּ���");
			panel1.add(inputLabel);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			panel1.setBackground(Color.white);
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[1] = new JTextField(30);
			inputText[1].setToolTipText("ex)������ ���㸦 �����ϰ� �ִ� 20�� �̻� ����");
			panel1_1.add(inputText[1]);
			panel1_1.setBackground(Color.white);
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                                                  3. ���Ժ� �Է����ּ���");
			panel2.add(inputLabel);
			panel2.setBackground(Color.white);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[2] = new JTextField(30);
			inputText[2].setToolTipText("ex)5000");
			panel2_1.add(inputText[2]);
			panel2_1.setBackground(Color.white);
			mainPanel.add(panel2_1);

			JPanel panel3 = new JPanel();
			inputLabel = new JLabel("                                                  4. ���� �Ⱓ�� �Է����ּ���");
			panel3.add(inputLabel);
			panel3.setBackground(Color.white);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			inputText[3] = new JTextField(30);
			inputText[3].setToolTipText("ex)3");
			panel3_1.add(inputText[3]);
			panel3_1.setBackground(Color.white);
			mainPanel.add(panel3_1);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                                                  5. ���� ����� �Է����ּ���");
			panel4.add(inputLabel);
			panel4.setBackground(Color.white);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			inputText[4] = new JTextField(30);
			inputText[4].setToolTipText("ex)������ü");
			panel4_1.add(inputText[4]);
			panel4_1.setBackground(Color.white);
			mainPanel.add(panel4_1);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                                                  6. ������� �Է����ּ���");
			panel5.add(inputLabel);
			panel5.setBackground(Color.white);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
			inputText[5] = new JTextField(30);
			panel5_1.add(inputText[5]);
			inputText[5].setToolTipText("ex)5000000");
			panel5_1.setBackground(Color.white);
			mainPanel.add(panel5_1);

			JPanel panel7 = new JPanel();
			inputLabel = new JLabel("                                                  7. ��������� �Է����ּ���");
			panel7.add(inputLabel);
			panel7.setBackground(Color.white);
			panel7.setLayout(new BoxLayout(panel7, BoxLayout.Y_AXIS));
			mainPanel.add(panel7);

			JPanel panel7_1 = new JPanel();
			inputText[6] = new JTextField(30);
			panel7_1.add(inputText[6]);
			inputText[6].setToolTipText("ex)�ֱ� 2�� �� �ڵ������ ���� ���");
			panel7_1.setBackground(Color.white);
			mainPanel.add(panel7_1);

			JPanel panel8 = new JPanel();
			inputLabel = new JLabel("                                                  8. ���� Ư���� �Է����ּ���");
			panel8.add(inputLabel);
			panel8.setBackground(Color.white);
			panel8.setLayout(new BoxLayout(panel8, BoxLayout.Y_AXIS));
			mainPanel.add(panel8);

			JPanel panel8_1 = new JPanel();
			inputText[7] = new JTextField(30);
			panel8_1.add(inputText[7]);
			inputText[7].setToolTipText("ex)");
			panel8_1.setBackground(Color.white);
			mainPanel.add(panel8_1);

			JPanel panel9 = new JPanel();
			inputLabel = new JLabel("                                                  9. ��⺸�� ���� ���� ���θ� �������ּ���");
			panel9.add(inputLabel);
			panel9.setBackground(Color.white);
			panel9.setLayout(new BoxLayout(panel9, BoxLayout.Y_AXIS));
			mainPanel.add(panel9);

			JPanel panel9_1 = new JPanel();
			panel9_1.setBackground(Color.white);
			JRadioButton button1 = new JRadioButton("����");
			button1.setActionCommand("����");
			button1.addActionListener(actionHandler);
			button1.setBackground(Color.white);
			JRadioButton button2 = new JRadioButton("�Ұ���");
			button2.setActionCommand("�Ұ���");
			button2.setBackground(Color.white);
			button2.addActionListener(actionHandler);
			this.buttons.add(button1);
			this.buttons.add(button2);
			group.add(button1);
			group.add(button2);
			panel9_1.add(button1);
			panel9_1.add(button2);
			mainPanel.add(panel9_1);

			JPanel panel10 = new JPanel();
			JButton bu1 = new JButton("�Ϸ�");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("�Ϸ�");
			panel10.setBackground(Color.white);
			mainPanel.add(panel10);
			panel10.add(bu1);

			JPanel panel11 = new JPanel();
			JButton bu2 = new JButton("���");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("���");
			mainPanel.add(panel11);
			panel11.setBackground(Color.white);
			panel11.add(bu2);

			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}

	public boolean isBlank() {

		String insuranceName = this.inputText[0].getText();
		String subScriptionTarget = this.inputText[1].getText();
		String payment = this.inputText[2].getText();
		String period = this.inputText[3].getText();
		String paymentMethod = this.inputText[4].getText();
		String insurnaceMoney = this.inputText[5].getText();
		String notes = this.inputText[6].getText();
		String specialSubscription = this.inputText[7].getText();
		if (insuranceName.equals("")) {
			JOptionPane.showMessageDialog(null, "�����̸��� �Է����ּ���!");
		} else if (subScriptionTarget.equals("")) {
			JOptionPane.showMessageDialog(null, "���Դ���� �Է����ּ���!");
		} else if (payment.equals("")) {
			JOptionPane.showMessageDialog(null, "���Ժ� �Է����ּ���!");
		} else if (period.equals("")) {
			JOptionPane.showMessageDialog(null, "���� �Ⱓ�� �Է����ּ���!");
		} else if (paymentMethod.equals("")) {
			JOptionPane.showMessageDialog(null, "���� ����� �Է����ּ���!");
		} else if (insurnaceMoney.equals("")) {
			JOptionPane.showMessageDialog(null, "������� �Է����ּ���!");
		} else if (notes.equals("")) {
			JOptionPane.showMessageDialog(null, "��������� �Է����ּ���!");
		} else if (specialSubscription.equals("")) {
			JOptionPane.showMessageDialog(null, "���� Ư���� �Է����ּ���!");
		} else if (check1 != "����" && check1 != "�Ұ���") {
			JOptionPane.showMessageDialog(null, "��⺸�� ���ɿ��θ� �������ּ���");
		} else if (check1 == "����" && Integer.parseInt(period) < 3) {
			JOptionPane.showMessageDialog(null, "��⺸���� 3���̻� �Է��ϼž��մϴ�.");
		} else {
			return true;
		}
		return false;
	}

	private void putText() {
		this.data = new ArrayList<String>();
		for (int i = 0; i < this.inputText.length; i++) {
			this.data.add(this.inputText[i].getText());
		}
		this.data.add(check1);
		this.cCarInsuranceDesinging.setData(this.data);
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "����") {
				check1 = "����";
			} else if (e.getActionCommand() == "�Ұ���") {
				check1 = "�Ұ���";
			} else if (e.getActionCommand() == "�Ϸ�") {

				stopper = isBlank();

				if (stopper == true) {
					putText();
					dispose();
				}

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

	public void association() {

	}

	public void initialize() {
		// TODO Auto-generated method stub

	}
}
