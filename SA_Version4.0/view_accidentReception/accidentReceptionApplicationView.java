package view_accidentReception;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextArea;
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

import control.cAccidentReceptionApplication;
import global.constant.eGender;

public class accidentReceptionApplicationView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel inputLabel;
	private JTextField[] inputText;
	private TextArea textArea;
	private actionHandler actionHandler;
	private Vector<JRadioButton> buttons;
	private cAccidentReceptionApplication cAccidentReceptionApplication;
	private boolean painted = true;
	private boolean stopper = true;
	private ButtonGroup group;
	private String gender;
	private boolean checker = false;
	private ArrayList<String> data;

	public accidentReceptionApplicationView() {
		this.actionHandler = new actionHandler();
		this.buttons = new Vector<JRadioButton>();
		this.group = new ButtonGroup();
		this.cAccidentReceptionApplication = new cAccidentReceptionApplication();
		this.inputText = new JTextField[5];
	}

	public void run() {
		if (painted == true) {

			this.setTitle("3. 사고접수");
			this.setSize(1000, 700);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			BoxLayout layout = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
			this.setLayout(layout);
			JPanel mainPanel = new JPanel();
			mainPanel.setBackground(Color.white);
			mainPanel.setLayout(new GridLayout(8, 2));

			JPanel panel0_0 = new JPanel();
			inputLabel = new JLabel("<사고접수>");
			panel0_0.add(inputLabel);
			panel0_0.setBackground(Color.white);
			panel0_0.setLayout(new BoxLayout(panel0_0, BoxLayout.Y_AXIS));

			JPanel blank = new JPanel();
			blank.add(panel0_0);
			blank.setBackground(Color.white);
			this.add(blank);

			JPanel panel00 = new JPanel();
			inputLabel = new JLabel("                                                  1. 가입한 보험을 입력해주세요.");
			panel00.add(inputLabel);
			panel00.setBackground(Color.white);
			panel00.setLayout(new BoxLayout(panel00, BoxLayout.Y_AXIS));
			mainPanel.add(panel00);

			JPanel panel00_0 = new JPanel();
			inputText[4] = new JTextField(30);
			panel00_0.add(inputText[4]);
			panel00_0.setBackground(Color.white);
			inputText[4].setToolTipText("ex)화재보험1");
			mainPanel.add(panel00_0);

			JPanel panel1 = new JPanel();
			inputLabel = new JLabel("                                                  2. 이름을 입력해주세요");
			panel1.add(inputLabel);
			panel1.setBackground(Color.white);
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
			mainPanel.add(panel1);

			JPanel panel1_1 = new JPanel();
			inputText[0] = new JTextField(30);
			panel1_1.add(inputText[0]);
			panel1_1.setBackground(Color.white);
			inputText[0].setToolTipText("ex)홍길동");
			mainPanel.add(panel1_1);

			JPanel panel2 = new JPanel();
			inputLabel = new JLabel("                                                  3. 주민등록번호를 입력해주세요");
			panel2.add(inputLabel);
			panel2.setBackground(Color.white);
			panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
			mainPanel.add(panel2);

			JPanel panel2_1 = new JPanel();
			inputText[1] = new JTextField(30);
			panel2_1.add(inputText[1]);
			panel2_1.setBackground(Color.white);
			inputText[1].setToolTipText("ex)990101-1020310");
			mainPanel.add(panel2_1);

			JPanel panel3 = new JPanel();
			inputLabel = new JLabel("                                                  4. 성별을 선택해주세요");
			panel3.add(inputLabel);
			panel3.setBackground(Color.white);
			panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
			mainPanel.add(panel3);

			JPanel panel3_1 = new JPanel();
			for (eGender eGender : eGender.values()) {
				JRadioButton button = new JRadioButton(eGender.getText());
				button.setActionCommand(eGender.getText());
				button.addActionListener(actionHandler);
				this.buttons.add(button);
				this.add(button);
				group.add(button);
				panel3_1.add(button);
			}
			mainPanel.add(panel3_1);
			panel3_1.setBackground(Color.white);

			JPanel panel4 = new JPanel();
			inputLabel = new JLabel("                                                  5. 전화번호를 입력해주세요");
			panel4.add(inputLabel);
			panel4.setBackground(Color.white);
			panel4.setLayout(new BoxLayout(panel4, BoxLayout.Y_AXIS));
			mainPanel.add(panel4);

			JPanel panel4_1 = new JPanel();
			inputText[2] = new JTextField(30);
			panel4_1.add(inputText[2]);
			panel4_1.setBackground(Color.white);
			inputText[2].setToolTipText("ex)010-1234-1234");
			mainPanel.add(panel4_1);

			JPanel panel5 = new JPanel();
			inputLabel = new JLabel("                                                  6. 이메일을 입력해주세요");
			panel5.add(inputLabel);
			panel5.setBackground(Color.white);
			panel5.setLayout(new BoxLayout(panel5, BoxLayout.Y_AXIS));
			mainPanel.add(panel5);

			JPanel panel5_1 = new JPanel();
			inputText[3] = new JTextField(30);
			panel5_1.add(inputText[3]);
			panel5_1.setBackground(Color.white);
			inputText[3].setToolTipText("ex)email@naver.com");
			mainPanel.add(panel5_1);

			JPanel panel6 = new JPanel();
			inputLabel = new JLabel("                                                  7. 사고 내용을 입력해주세요");
			panel6.add(inputLabel);
			panel6.setBackground(Color.white);
			panel6.setLayout(new BoxLayout(panel6, BoxLayout.Y_AXIS));
			mainPanel.add(panel6);

			JPanel panel6_1 = new JPanel();
			textArea = new TextArea(3, 45);
			panel6_1.add(textArea);
			panel6_1.setBackground(Color.white);
			mainPanel.add(panel6_1);

			JPanel panel7 = new JPanel();
			JButton bu1 = new JButton("완료");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("완료");
			mainPanel.add(panel7);
			panel7.setBackground(Color.white);
			panel7.add(bu1);

			JPanel panel8 = new JPanel();
			JButton bu2 = new JButton("취소");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("취소");
			panel8.setBackground(Color.white);
			mainPanel.add(panel8);
			panel8.add(bu2);

			this.add(mainPanel);
			painted = false;
		}
		this.setVisible(true);
	}

	private void putText() {
		this.data = new ArrayList<String>();

		for (int i = 0; i < this.inputText.length; i++) {
			this.data.add(this.inputText[i].getText());
		}
		this.data.add(group.getSelection().getActionCommand());
		this.data.add(this.textArea.getText());

		this.cAccidentReceptionApplication.setData(this.data);

	}

	public void sendMessage(String message) {
		if (message == "완료") {
			this.cAccidentReceptionApplication.sendAcceptMessage(1);
		} else {

		}
	}

	public boolean isBlank() {
		String insuranceName = this.inputText[4].getText();
		String name = this.inputText[0].getText();
		String idNumber = this.inputText[1].getText();
		String phoneNumber = this.inputText[2].getText();
		String eMail = this.inputText[3].getText();
		String accident = this.textArea.getText();

		if (insuranceName.equals("")) {
			JOptionPane.showMessageDialog(null, "보험이름을 입력해주세요!");
		} else if (name.equals("")) {
			JOptionPane.showMessageDialog(null, "이름을 입력해주세요!");
		} else if (idNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "주민번호를 입력해주세요!");
		} else if (gender == null) {
			JOptionPane.showMessageDialog(null, "성별을 입력해주세요");
		} else if (phoneNumber.equals("")) {
			JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요!");
		} else if (eMail.equals("")) {
			JOptionPane.showMessageDialog(null, "이메일을 입력해주세요!");
		} else if (accident.equals("")) {
			JOptionPane.showMessageDialog(null, "사고내용을 입력해주세요!");
		} else if (!insuranceName.equals("")) {
			checker = cAccidentReceptionApplication.search(insuranceName);
			if (!checker) {
				JOptionPane.showMessageDialog(null, "존재하지 않는 보험입니다!");
			} else {
				return true;
			}
		} else {
			return true;
		}
		return false;
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			if (e.getActionCommand() == "완료") {
				stopper = isBlank();
				if (stopper == true) {
					putText();
					sendMessage(e.getActionCommand());
					dispose();
				}

			} else if (e.getActionCommand() == "취소") {
				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
					// 그냥 창 닫은 경우
				}
			} else if (e.getActionCommand() == "여성" || e.getActionCommand() == "남성") {
				gender = e.getActionCommand();
			}

		}
	}
}