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
			JOptionPane.showMessageDialog(null, "가입 가능한 화재보험이 없습니다.");
			this.state = false;
		}

		if (painted == true) {

			this.setTitle("화재보험 정보안내");

			this.setSize(1450, 1050);
			this.setLocationRelativeTo(null);

			JPanel topPanel = new JPanel();
			topPanel.setLayout(new FlowLayout());
			topPanel.setBackground(Color.white);

			JPanel titlePanel = new JPanel();
			titlePanel.setBackground(Color.white);

			JLabel titleLabel = new JLabel("<화재보험 정보안내>");
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

			String sInform1 = "화재보험 가입에 있어";
			String sInform2 = "관련된 사항 안내       ";

			String sInform3 = "내용 확인을 하지 않는 경우에는 보험금 청구가 불가능하며 본 안내서에 의한 ";
			String sInform4 = "개인(신용)정보 조회는 귀하의 신용등급에 영향을 주지 않습니다.                     ";

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

			String context = "1. 화재보험 주요 내용 계약서";
			String context2 = "● 청약철회 " + "\n\r" + "계약자는 보험증권을 받은 날부터 15일 이내에 그 청약을 철회할 수 있고, 이 경우 납입한 보험료를 돌려 드립니다."
					+ "\n\r" + "● 계약의 무효" + "\n\r" + "1. 신체 관련" + "\n\r"
					+ ": 다음 중 한 가지에 해당하는 경우 회사는 계약을 무효로 할 수 있으며 이 경우 회사는 이미 납입한 보험료를 돌려 드립니다." + "\n\r"
					+ "- 타인의 사망을 보험금 지급사유로 하는 계약에서 피보험자의 서면 동의를 얻지 않은 경우." + "\n\r"
					+ "- 만 15세 미만자, 심신상실자 또는 심신 박약자를 피보험자로 하여 사망을 보험금 지급사유로 한 계약의 경우." + "\n\r"
					+ "다만, 심신박약자가 계약을 쳬결하거나 소속 단체의 규약에 단체보험의 피보험자가 될 때에 의사능력이 있는 경우에는 계약이 유효합니다." + "\n\r" + "2. 재물 관련"
					+ "\n\r" + "계약을 맺을 때에 보험사고가 이미 발생하였을 경우 회사는 계약을 무효로 할 수 있으며 이 경우 회사는 이미 납입한 보험료를 돌려 드립니다." + "\n\r"
					+ "● 계약의 소멸" + "\n\r" + "1. 신체 관련" + "\n\r"
					+ "피보험자의 사망 등으로 인하여 보험금 지급사유가 더 이상 발생할 수 없는 경우, 이 보험계약은 그때부터 효력이 없습니다." + "\n\r" + "2. 재물 관련(실손보상)"
					+ "\n\r" + "사고보험금이 한 번의 사고에 대하여 보험가입금액(보험가액을 한도로 함) 이상인 때에는 그 손해보상의 원인이 생긴 때로부터 해당 보험목적에" + "\n\r"
					+ "대한 계약은 소멸됩니다." + "\n\r" + "● 보험료의 납입연체 및 계약의 해지에 관한 사항" + "\n\r"
					+ "계약자가 제2회 이후 보험료를 납입기일까지 납이이 연체 중인 경우에 14일이상의 기간을 보험료 납입최고(독촉)기간으로 하며, 납입최고(독촉)" + "\n\r"
					+ "기간 안에 보험료를 납입하지 않은 경우, 납입최고(독촉)기간이 끝나는 날의 다음날부터 보험계약은 해지됩니다." + "\n\r" + "● 보험계약 전 알릴의무 위반"
					+ "\n\r" + "- 과거 사고 사실 등을 회사에 알리지 않을 경우 보험금을 지급받지 못할 수도 있습니다." + "\n\r"
					+ "- 과거 사고 사실 등을 반드시 가입서의 기입하기 바랍니다." + "\n\r";

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

			JCheckBox button1 = new JCheckBox("위의 내용을 확인했습니다.");
			button1.setBackground(new Color(255, 255, 153));
			button1.setActionCommand("동의1");
			button1.addActionListener(actionHandler);
			this.buttons.add(button1);
			group1.add(button1);
			buttonPanel.add(button1);
			JCheckBox button2 = new JCheckBox("위의 내용을 확인하지 못했습니다.");
			button2.setBackground(new Color(255, 255, 153));
			button2.setActionCommand("동의X");
			button2.addActionListener(actionHandler);
			this.buttons.add(button2);
			group1.add(button2);
			buttonPanel.add(button2);
			Panel01.add(buttonPanel);

			String context3 = "● 개인신용정보 제공이용에 대한 고객 권리 안내";
			String context4 = "1. 본인정보의 제3자 제공 및 마케팅 목적의 전화 등의 중단 요구";
			String context5 = "- 고객은 [신용정보의 이용 및 보호에 관한 볍률] 제 37조에 따라 가입 신청시 동의를 한 경우에도 본인정보를 제3자에게 제공하는 것 및 해당 금융회사가 마케팅 목적으로 본인에게 연락하는 것을 전체 또는 사안별로 중단 시킬 수 있습니다.";
			String context6 = "2. 본인정보의 열람 및 정정 요구";
			String context7 = "- 고객은 [신용정보의 이용 및 보호에 관한 법률] 제 38조에 따라 전국은행연합회, 신용조회회사, 금융회사 등이 보유한 본인정보에 대해 열람 청구가 가능하며, 본인정보가 사실과 다른 경우에는 이의 정정 및 삭제를 요구할 수 있습니다.";
			String context8 = "또한 그 처리 결과에 이의가 있는 경우에는 금융위원회에 시정을 요청할 수 있습니다.";
			String context9 = "3. 본인정보의 무료 열람 요구";
			String context10 = "- 고객은 [신용정보의 이용 및 보호에 관한 법률] 제 39조에 따라 본인정보를 신용조회회사를 통하여 연간 일정 범위 내에서 무료로 열람할 수 있습니다.";
			String context11 = "자세한 사항은 각 신용조회회사에 문의하시기 바랍니다.";
			String context12 = "    - 연락처";
			String context13 = "     코리아크레딧뷰로(주)  02)708-1000";

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

			String sInfor3 = "2. 보험 안내 및 보험금 지급 관련 내용 안내";
			String sInfor4 = "● 보험" + "\n\r" + "- 이 보험은 화재보험으로써 본인의 자택 및 건물, 그리고 땅이 화재로 인해 손해가 발생했을 경우 보상해주는 보험입니다."
					+ "\n\r" + "- 이 보험의 가입대상은 '" + info1 + "'입니다. 가입대상에 충족하지 못하는 경우 가입이 거절될 수 있습니다." + "\n\r"
					+ "- 이 보험의 기간은 '" + info2 + "'입니다" + "\n\r" + "- 보험료는 월납이며 계약 기간에 따라 그 보험금이 조금씩 달라집니다." + "\n\r"
					+ "1) 1년~3년(단기보험)일 경우 : " + info3 + "원 입니다." + "\n\r" + "2) 3년~10년(장기보험)일 경우 : " + info4 + "원 입니다."
					+ "\n\r" + "- 화재로 인한 손실이 발생했을 경우 보험금은 최대 " + info5 + "원 입니다." + "\n\r" + "● 보험금 지급 안내" + "\n\r"
					+ "- 인터넷 접수 : 보험홈페이지에서 '2. 고객'을 선택 후 '3. 사고접수'에 들어와서 사고접수를 진행할 수 있습니다." + "\n\r"
					+ "사고내용을 최대한 상세하게 적어주셔야 적절한 보험금 지급이 가능합니다." + "\n\r" + "접수한 사고내용을 바탕으로 사후처리사가 보험금을 지급할 것입니다."
					+ "\n\r" + "사고 내용을 상세하기 적지 않았을 경우 보험금 지급이 거절될 수 있습니다.";
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

			JCheckBox button3 = new JCheckBox("위의 내용을 확인했습니다.");
			button3.setBackground(new Color(255, 255, 153));
			button3.setActionCommand("동의2");
			button3.addActionListener(actionHandler);
			this.buttons.add(button3);
			group2.add(button3);
			buttonPanel2.add(button3);
			JCheckBox button4 = new JCheckBox("위의 내용을 확인하지 못했습니다.");
			button4.setBackground(new Color(255, 255, 153));
			button4.setActionCommand("동의X");
			button4.addActionListener(actionHandler);
			this.buttons.add(button4);
			group2.add(button4);
			buttonPanel2.add(button4);
			Panel01.add(buttonPanel2);

			String context14 = "● 보험 내용 확인 목적";
			String context15 = "- '위의 내용을 확인했습니다.' 라는 버튼을 누르지 않으면 보험 가입 화면으로 넘어갈 수 없습니다.";
			String context17 = "- 위의 내용을 읽지 않고 버튼을 누른 후 발생한 문제에 대해서 본 회사는 책임지지 않습니다.";
			String context18 = "- 이해가 가지 않거나 문의할 사항이 있으면 본 회사(02-XXX-XXXX)로 전화해주시기 바랍니다.";

			JLabel jLabel14 = new JLabel(context14);
			JLabel jLabel15 = new JLabel(context15);
			JLabel jLabel17 = new JLabel(context17);
			JLabel jLabel18 = new JLabel(context18);

			Panel01.add(jLabel14);
			Panel01.add(jLabel15);
			Panel01.add(jLabel17);
			Panel01.add(jLabel18);

			String sInfor5 = "3. 가입특약";
			JLabel inform5 = new JLabel(sInfor5);
			inform5.setFont(new Font("Serif", Font.BOLD, 12));
			inform5.setFont(jLabel.getFont().deriveFont(20.0f));

			// mysql로 부터 받아온 sInfo정보 집어넣기.
			this.fireAgree3 = new JTextArea(info6, 5, 10);
			this.fireAgree3.setEditable(false);
			this.jScrollPane3 = new JScrollPane(fireAgree3, jScrollPane2.VERTICAL_SCROLLBAR_ALWAYS,
					jScrollPane2.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			JPanel inputPanel = new JPanel();
			inputPanel.setBackground(Color.white);
			inputPanel.setLayout(new FlowLayout());
			String context19 = "가입 특약 작성란 : ";
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

			JButton bu11 = new JButton("다음");
			bu11.addActionListener(actionHandler);
			bu11.setActionCommand("다음");
			panel11.add(bu11);
			MainPanel01.add(panel11);

			JPanel panel12 = new JPanel();
			panel12.setBackground(Color.white);
			JButton bu12 = new JButton("취소");
			bu12.addActionListener(actionHandler);
			bu12.setActionCommand("취소");
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
//가입특약
		//fireInformation에서 입력한 가입특약값을 ->registration으로 옮겨 -> controller로 옮겨 -> Model로 옮겨 ->dao로가
		String[] inputTextSize = this.inputText[0].getText().split(",");
		this.inputTextSize = Integer.toString(inputTextSize.length);
//		TotalPrice = inputTextSize.length * 50000;

	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "다음") {

				if (answer1 != "동의1" || answer2 != "동의2") {
					JOptionPane.showMessageDialog(null, "내용을 전부 확인하지 않으셨습니다.");
				} else {
					getRegistrationInfo();
					fireInsuranceRegistrationView.run();
					fireInsuranceRegistrationView.setInforamtion(name, date, inputTextSize);
					fireInsuranceRegistrationView = new fireInsuranceRegistrationView();
					dispose();
				}
			} else if (e.getActionCommand() == "취소") {
				int result = JOptionPane.showConfirmDialog(null, "이 페이지에서 나가시겠습니까?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// 그냥 창 닫은 경우
				}

			} else if (e.getActionCommand() == "동의2") {
				answer2 = "동의2";
			} else if (e.getActionCommand() == "동의1") {
				answer1 = "동의1";
			}
		}
	}

}