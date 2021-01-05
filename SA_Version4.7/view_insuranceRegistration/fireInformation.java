package view_insuranceRegistration;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import control.cFireInsurance;
import model_insurance.mFireInsurance;

public class fireInformation extends JFrame {
	private static final long serialVersionUID = 1L;

	private actionHandler actionHandler;
	private JTextField[] inputText;

	private String info1;
	private String info2;
	private String info3;
	private String info4;
	private String info5;
	private String info6;

	private fireInsuranceRegistrationView fireInsuranceRegistrationView;
	private cFireInsurance cFireInsurance;
	private mFireInsurance fireInsurance;
	private boolean painted = true;
	private boolean state = true;

	private JScrollPane jScrollPane;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JTextArea fireAgree1;
	private JTextArea fireAgree2;
	private JTextArea fireAgree3;

	private Vector<JCheckBox> buttons;
	private ButtonGroup group1, group2;

	private String answer1;
	private String answer2;
	private String name, date;
	private int TotalPrice;
	private String inputTextSize;

	public fireInformation() {
		this.fireInsuranceRegistrationView = new fireInsuranceRegistrationView();
		this.actionHandler = new actionHandler();
		this.cFireInsurance = new cFireInsurance();
		this.inputText = new JTextField[10];

		this.group1 = new ButtonGroup();
		this.group2 = new ButtonGroup();

		this.buttons = new Vector<JCheckBox>();
		this.inputTextSize = null;
	}

	public void association() {
		this.fireInsuranceRegistrationView.association();
	}

	public void initialize() {

	}

	public void sendName(String name, String date) {
		this.name = name;
		this.date = date;
	}

	public void run() {
		this.fireInsurance = this.cFireInsurance.insertInfo();

		if (this.fireInsurance.getArraySize()) {
			this.info1 = this.fireInsurance.getSubscriptionTarget();
			this.info2 = this.fireInsurance.getInsurancePeriod();
			this.info3 = Integer.toString(this.fireInsurance.getInsuranceMoney());
			this.info4 = Integer.toString(this.fireInsurance.getInsuranceMoney());
			this.info5 = Integer.toString(this.fireInsurance.getInsuranceMoney());
			this.info6 = this.fireInsurance.getSubscriptionTarget();
			this.state = true;
		} else {
			JOptionPane.showMessageDialog(null, "���� ������ ȭ�纸���� �����ϴ�.");
			this.state = false;
		}

		if (painted == true) {

			this.setTitle("ȭ�纸�� �����ȳ�");

			this.setSize(1450, 1050);
			this.setLocationRelativeTo(null);

			JPanel topPanel = new JPanel();
			topPanel.setLayout(new FlowLayout());
			topPanel.setBackground(Color.white);

			JPanel titlePanel = new JPanel();
			titlePanel.setBackground(Color.white);

			JLabel titleLabel = new JLabel("<ȭ�纸�� �����ȳ�>");
			titleLabel.setOpaque(true);
			titleLabel.setBackground(new Color(051, 102, 051));
			titleLabel.setFont(new Font("Serif", Font.BOLD, 11));
			titleLabel.setFont(titleLabel.getFont().deriveFont(50.0f));
			titleLabel.setForeground(Color.white);
			titlePanel.add(titleLabel);
			this.add(titlePanel);

			JPanel labelPanel1 = new JPanel();
			labelPanel1.setLayout(new BoxLayout(labelPanel1, BoxLayout.Y_AXIS));
			labelPanel1.setBackground(Color.white);

			JPanel labelPanel2 = new JPanel();
			labelPanel2.setLayout(new BoxLayout(labelPanel2, BoxLayout.Y_AXIS));
			labelPanel2.setBackground(Color.white);

			String sInform1 = "ȭ�纸�� ���Կ� �־�";
			String sInform2 = "���õ� ���� �ȳ�       ";

			String sInform3 = "���� Ȯ���� ���� �ʴ� ��쿡�� ����� û���� �Ұ����ϸ� �� �ȳ����� ���� ";
			String sInform4 = "����(�ſ�)���� ��ȸ�� ������ �ſ��޿� ������ ���� �ʽ��ϴ�.                     ";

			JLabel inform = new JLabel(sInform1);
			inform.setOpaque(true);
			inform.setBackground(new Color(153, 255, 153));
			inform.setFont(new Font("Serif", Font.BOLD, 11));
			inform.setFont(inform.getFont().deriveFont(15.0f));

			JLabel inform2 = new JLabel(sInform2);
			inform2.setOpaque(true);
			inform2.setBackground(new Color(153, 255, 153));
			inform2.setFont(new Font("Serif", Font.BOLD, 11));
			inform2.setFont(inform2.getFont().deriveFont(15.0f));
			labelPanel1.add(inform);
			labelPanel1.add(inform2);

			JLabel inform3 = new JLabel(sInform3);
			inform3.setOpaque(true);
			inform3.setBackground(new Color(255, 255, 204));
			inform3.setFont(new Font("Serif", Font.BOLD, 11));
			inform3.setFont(inform3.getFont().deriveFont(15.0f));
			JLabel inform4 = new JLabel(sInform4);
			inform4.setOpaque(true);
			inform4.setBackground(new Color(255, 255, 204));
			inform4.setFont(new Font("Serif", Font.BOLD, 11));
			inform4.setFont(inform4.getFont().deriveFont(15.0f));
			labelPanel2.add(inform3);

			labelPanel2.add(inform4);
			topPanel.add(labelPanel1);
			topPanel.add(labelPanel2);

			this.add(topPanel);

			String context = "1. ȭ�纸�� �ֿ� ���� ��༭";
			String context2 = "�� û��öȸ " + "\n\r" + "����ڴ� ���������� ���� ������ 15�� �̳��� �� û���� öȸ�� �� �ְ�, �� ��� ������ ����Ḧ ���� �帳�ϴ�."
					+ "\n\r" + "�� ����� ��ȿ" + "\n\r" + "1. ��ü ����" + "\n\r"
					+ ": ���� �� �� ������ �ش��ϴ� ��� ȸ��� ����� ��ȿ�� �� �� ������ �� ��� ȸ��� �̹� ������ ����Ḧ ���� �帳�ϴ�." + "\n\r"
					+ "- Ÿ���� ����� ����� ���޻����� �ϴ� ��࿡�� �Ǻ������� ���� ���Ǹ� ���� ���� ���." + "\n\r"
					+ "- �� 15�� �̸���, �ɽŻ���� �Ǵ� �ɽ� �ھ��ڸ� �Ǻ����ڷ� �Ͽ� ����� ����� ���޻����� �� ����� ���." + "\n\r"
					+ "�ٸ�, �ɽŹھ��ڰ� ����� �ǰ��ϰų� �Ҽ� ��ü�� �Ծ࿡ ��ü������ �Ǻ����ڰ� �� ���� �ǻ�ɷ��� �ִ� ��쿡�� ����� ��ȿ�մϴ�." + "\n\r" + "2. �繰 ����"
					+ "\n\r" + "����� ���� ���� ������ �̹� �߻��Ͽ��� ��� ȸ��� ����� ��ȿ�� �� �� ������ �� ��� ȸ��� �̹� ������ ����Ḧ ���� �帳�ϴ�." + "\n\r"
					+ "�� ����� �Ҹ�" + "\n\r" + "1. ��ü ����" + "\n\r"
					+ "�Ǻ������� ��� ������ ���Ͽ� ����� ���޻����� �� �̻� �߻��� �� ���� ���, �� �������� �׶����� ȿ���� �����ϴ�." + "\n\r" + "2. �繰 ����(�Ǽպ���)"
					+ "\n\r" + "�������� �� ���� ��� ���Ͽ� ���谡�Աݾ�(���谡���� �ѵ��� ��) �̻��� ������ �� ���غ����� ������ ���� ���κ��� �ش� ���������" + "\n\r"
					+ "���� ����� �Ҹ�˴ϴ�." + "\n\r" + "�� ������� ���Կ�ü �� ����� ������ ���� ����" + "\n\r"
					+ "����ڰ� ��2ȸ ���� ����Ḧ ���Ա��ϱ��� ������ ��ü ���� ��쿡 14���̻��� �Ⱓ�� ����� �����ְ�(����)�Ⱓ���� �ϸ�, �����ְ�(����)" + "\n\r"
					+ "�Ⱓ �ȿ� ����Ḧ �������� ���� ���, �����ְ�(����)�Ⱓ�� ������ ���� ���������� �������� �����˴ϴ�." + "\n\r" + "�� ������ �� �˸��ǹ� ����"
					+ "\n\r" + "- ���� ��� ��� ���� ȸ�翡 �˸��� ���� ��� ������� ���޹��� ���� ���� �ֽ��ϴ�." + "\n\r"
					+ "- ���� ��� ��� ���� �ݵ�� ���Լ��� �����ϱ� �ٶ��ϴ�." + "\n\r";

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);

			JPanel MainPanel01 = new JPanel();
			MainPanel01.setLayout(new FlowLayout());

			MainPanel01.setBackground(Color.white);

			JPanel Panel01 = new JPanel();
			Panel01.setLayout(new BoxLayout(Panel01, BoxLayout.Y_AXIS));
			Panel01.setBackground(Color.white);

			JLabel jLabel = new JLabel(context);
			jLabel.setFont(new Font("Serif", Font.BOLD, 12));
			jLabel.setFont(jLabel.getFont().deriveFont(20.0f));

			this.fireAgree1 = new JTextArea(context2, 5, 20);
			this.fireAgree1.setEditable(false);
			this.jScrollPane = new JScrollPane(fireAgree1, jScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			Panel01.add(jLabel);
			Panel01.add(jScrollPane);

			MainPanel01.add(Panel01);

			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
			buttonPanel.setBackground(Color.white);

			JCheckBox button1 = new JCheckBox("���� ������ Ȯ���߽��ϴ�.");
			button1.setBackground(new Color(255, 255, 153));
			button1.setActionCommand("����1");
			button1.addActionListener(actionHandler);
			this.buttons.add(button1);
			group1.add(button1);
			buttonPanel.add(button1);
			JCheckBox button2 = new JCheckBox("���� ������ Ȯ������ ���߽��ϴ�.");
			button2.setBackground(new Color(255, 255, 153));
			button2.setActionCommand("����X");
			button2.addActionListener(actionHandler);
			this.buttons.add(button2);
			group1.add(button2);
			buttonPanel.add(button2);
			Panel01.add(buttonPanel);

			String context3 = "�� ���νſ����� �����̿뿡 ���� �� �Ǹ� �ȳ�";
			String context4 = "1. ���������� ��3�� ���� �� ������ ������ ��ȭ ���� �ߴ� �䱸";
			String context5 = "- ���� [�ſ������� �̿� �� ��ȣ�� ���� ����] �� 37���� ���� ���� ��û�� ���Ǹ� �� ��쿡�� ���������� ��3�ڿ��� �����ϴ� �� �� �ش� ����ȸ�簡 ������ �������� ���ο��� �����ϴ� ���� ��ü �Ǵ� ��Ⱥ��� �ߴ� ��ų �� �ֽ��ϴ�.";
			String context6 = "2. ���������� ���� �� ���� �䱸";
			String context7 = "- ���� [�ſ������� �̿� �� ��ȣ�� ���� ����] �� 38���� ���� �������࿬��ȸ, �ſ���ȸȸ��, ����ȸ�� ���� ������ ���������� ���� ���� û���� �����ϸ�, ���������� ��ǰ� �ٸ� ��쿡�� ���� ���� �� ������ �䱸�� �� �ֽ��ϴ�.";
			String context8 = "���� �� ó�� ����� ���ǰ� �ִ� ��쿡�� ��������ȸ�� ������ ��û�� �� �ֽ��ϴ�.";
			String context9 = "3. ���������� ���� ���� �䱸";
			String context10 = "- ���� [�ſ������� �̿� �� ��ȣ�� ���� ����] �� 39���� ���� ���������� �ſ���ȸȸ�縦 ���Ͽ� ���� ���� ���� ������ ����� ������ �� �ֽ��ϴ�.";
			String context11 = "�ڼ��� ������ �� �ſ���ȸȸ�翡 �����Ͻñ� �ٶ��ϴ�.";
			String context12 = "    - ����ó";
			String context13 = "     �ڸ���ũ�������(��)  02)708-1000";

			JLabel jLabel3 = new JLabel(context3);
			JLabel jLabel4 = new JLabel(context4);
			JLabel jLabel5 = new JLabel(context5);
			JLabel jLabel6 = new JLabel(context6);
			JLabel jLabel7 = new JLabel(context7);
			JLabel jLabel8 = new JLabel(context8);
			JLabel jLabel9 = new JLabel(context9);
			JLabel jLabel10 = new JLabel(context10);
			JLabel jLabel11 = new JLabel(context11);
			JLabel jLabel12 = new JLabel(context12);
			JLabel jLabel13 = new JLabel(context13);

			Panel01.add(jLabel3);
			Panel01.add(jLabel4);
			Panel01.add(jLabel5);
			Panel01.add(jLabel6);
			Panel01.add(jLabel7);
			Panel01.add(jLabel8);
			Panel01.add(jLabel9);
			Panel01.add(jLabel10);
			Panel01.add(jLabel11);
			Panel01.add(jLabel12);
			Panel01.add(jLabel13);

			String sInfor3 = "2. ���� �ȳ� �� ����� ���� ���� ���� �ȳ�";
			String sInfor4 = "�� ����" + "\n\r" + "- �� ������ ȭ�纸�����ν� ������ ���� �� �ǹ�, �׸��� ���� ȭ��� ���� ���ذ� �߻����� ��� �������ִ� �����Դϴ�."
					+ "\n\r" + "- �� ������ ���Դ���� '" + info1 + "'�Դϴ�. ���Դ�� �������� ���ϴ� ��� ������ ������ �� �ֽ��ϴ�." + "\n\r"
					+ "- �� ������ �Ⱓ�� '" + info2 + "'�Դϴ�" + "\n\r" + "- ������ �����̸� ��� �Ⱓ�� ���� �� ������� ���ݾ� �޶����ϴ�." + "\n\r"
					+ "1) 1��~3��(�ܱ⺸��)�� ��� : " + info3 + "�� �Դϴ�." + "\n\r" + "2) 3��~10��(��⺸��)�� ��� : " + info4 + "�� �Դϴ�."
					+ "\n\r" + "- ȭ��� ���� �ս��� �߻����� ��� ������� �ִ� " + info5 + "�� �Դϴ�." + "\n\r" + "�� ����� ���� �ȳ�" + "\n\r"
					+ "- ���ͳ� ���� : ����Ȩ���������� '2. ��'�� ���� �� '3. �������'�� ���ͼ� ��������� ������ �� �ֽ��ϴ�." + "\n\r"
					+ "������� �ִ��� ���ϰ� �����ּž� ������ ����� ������ �����մϴ�." + "\n\r" + "������ ������� �������� ����ó���簡 ������� ������ ���Դϴ�."
					+ "\n\r" + "��� ������ ���ϱ� ���� �ʾ��� ��� ����� ������ ������ �� �ֽ��ϴ�.";
			JLabel jLabel2 = new JLabel(sInfor3);
			jLabel2.setFont(new Font("Serif", Font.BOLD, 12));
			jLabel2.setFont(jLabel.getFont().deriveFont(20.0f));

			this.fireAgree2 = new JTextArea(sInfor4, 5, 10);
			this.fireAgree2.setEditable(false);
			this.jScrollPane2 = new JScrollPane(fireAgree2, jScrollPane2.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			Panel01.add(jLabel2);
			Panel01.add(jScrollPane2);

			JPanel buttonPanel2 = new JPanel();
			buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));
			buttonPanel2.setBackground(Color.white);

			JCheckBox button3 = new JCheckBox("���� ������ Ȯ���߽��ϴ�.");
			button3.setBackground(new Color(255, 255, 153));
			button3.setActionCommand("����2");
			button3.addActionListener(actionHandler);
			this.buttons.add(button3);
			group2.add(button3);
			buttonPanel2.add(button3);
			JCheckBox button4 = new JCheckBox("���� ������ Ȯ������ ���߽��ϴ�.");
			button4.setBackground(new Color(255, 255, 153));
			button4.setActionCommand("����X");
			button4.addActionListener(actionHandler);
			this.buttons.add(button4);
			group2.add(button4);
			buttonPanel2.add(button4);
			Panel01.add(buttonPanel2);

			String context14 = "�� ���� ���� Ȯ�� ����";
			String context15 = "- '���� ������ Ȯ���߽��ϴ�.' ��� ��ư�� ������ ������ ���� ���� ȭ������ �Ѿ �� �����ϴ�.";
			String context17 = "- ���� ������ ���� �ʰ� ��ư�� ���� �� �߻��� ������ ���ؼ� �� ȸ��� å������ �ʽ��ϴ�.";
			String context18 = "- ���ذ� ���� �ʰų� ������ ������ ������ �� ȸ��(02-XXX-XXXX)�� ��ȭ���ֽñ� �ٶ��ϴ�.";

			JLabel jLabel14 = new JLabel(context14);
			JLabel jLabel15 = new JLabel(context15);
			JLabel jLabel17 = new JLabel(context17);
			JLabel jLabel18 = new JLabel(context18);

			Panel01.add(jLabel14);
			Panel01.add(jLabel15);
			Panel01.add(jLabel17);
			Panel01.add(jLabel18);

			String sInfor5 = "3. ����Ư��";
			JLabel inform5 = new JLabel(sInfor5);
			inform5.setFont(new Font("Serif", Font.BOLD, 12));
			inform5.setFont(jLabel.getFont().deriveFont(20.0f));

			// mysql�� ���� �޾ƿ� sInfo���� ����ֱ�.
			this.fireAgree3 = new JTextArea(info6, 5, 10);
			this.fireAgree3.setEditable(false);
			this.jScrollPane3 = new JScrollPane(fireAgree3, jScrollPane2.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			JPanel inputPanel = new JPanel();
			inputPanel.setBackground(Color.white);
			inputPanel.setLayout(new FlowLayout());
			String context19 = "���� Ư�� �ۼ��� : ";
			JLabel jLabel19 = new JLabel(context19);
			this.inputText[0] = new JTextField(20);

			inputPanel.add(jLabel19);
			inputPanel.add(inputText[0]);
			inputPanel.add(jLabel19);
			inputPanel.add(inputText[0]);
			Panel01.add(inform5);
			Panel01.add(jScrollPane3);
			Panel01.add(inputPanel);

			JPanel panel11 = new JPanel();
			panel11.setBackground(Color.white);

			JButton bu11 = new JButton("����");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("����");
			panel11.add(bu11);
			MainPanel01.add(panel11);

			JPanel panel12 = new JPanel();
			panel12.setBackground(Color.white);
			JButton bu12 = new JButton("���");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("���");
			panel12.add(bu12);
			MainPanel01.add(panel12);
			this.add(MainPanel01);
			painted = false;
		}
		if (state) {
			this.setVisible(true);
		} else {
			this.setVisible(false);
		}
	}

	public void getRegistrationInfo() {
//����Ư��
		//fireInformation���� �Է��� ����Ư�ప�� ->registration���� �Ű� -> controller�� �Ű� -> Model�� �Ű� ->dao�ΰ�
		String[] inputTextSize = this.inputText[0].getText().split(",");
		this.inputTextSize = Integer.toString(inputTextSize.length);
//		TotalPrice = inputTextSize.length * 50000;

	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "����") {

				if (answer1 != "����1" || answer2 != "����2") {
					JOptionPane.showMessageDialog(null, "������ ���� Ȯ������ �����̽��ϴ�.");
				} else {
					getRegistrationInfo();
					fireInsuranceRegistrationView.run();
					fireInsuranceRegistrationView.setInforamtion(name, date, inputTextSize);
					fireInsuranceRegistrationView = new fireInsuranceRegistrationView();
					dispose();
				}
			} else if (e.getActionCommand() == "���") {
				int result = JOptionPane.showConfirmDialog(null, "�� ���������� �����ðڽ��ϱ�?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// �׳� â ���� ���
				}

			} else if (e.getActionCommand() == "����2") {
				answer2 = "����2";
			} else if (e.getActionCommand() == "����1") {
				answer1 = "����1";
			}
		}
	}

}