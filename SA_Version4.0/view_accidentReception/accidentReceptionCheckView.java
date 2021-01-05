package view_accidentReception;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.cAccidentApproval;
import control.cAccidentReceptionCheck;
import view_insuranceTool.inquiryInsuranceView;

public class accidentReceptionCheckView extends JFrame {
	private static final long serialVersionUID = 1L;

	private actionHandler actionHandler;
	private boolean painted = true;
	private cAccidentReceptionCheck cAccidentReceptionCheck;
	private accidentCheckTableView accidentCheckTableView;
	private ArrayList<String> beforeText;
	private cAccidentApproval cAccidentApproval;
	private ArrayList<String> accidentInformation;
	private ArrayList<String> accidentList;

	public accidentReceptionCheckView() {
		this.accidentCheckTableView = new accidentCheckTableView();
		this.actionHandler = new actionHandler();
		this.cAccidentReceptionCheck = new cAccidentReceptionCheck();
		this.beforeText = new ArrayList<String>();
		this.accidentList = new ArrayList<String>();
		this.cAccidentApproval = new cAccidentApproval();
		this.accidentInformation = new ArrayList<String>();

	}

	public void run() {
		if (painted == true) {
			this.setTitle("<사고 접수 확인>");
			this.setSize(500, 500);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			setLayout(new GridLayout(2, 3));

			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
			mainPanel.setBackground(Color.white);

			JPanel panel1 = new JPanel();
			panel1.setLayout(new GridLayout(1, 4));
			panel1.setBackground(Color.white);

			JButton bu4 = new JButton("조회");
			bu4.addActionListener(actionHandler);
			bu4.setActionCommand("조회");

			JButton bu1 = new JButton("승인");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("승인");

			JButton bu2 = new JButton("거절");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("거절");

			JButton bu3 = new JButton("취소");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("취소");

			panel1.add(bu4);
			panel1.add(bu1);
			panel1.add(bu2);
			panel1.add(bu3);

			JPanel blankPanel = new JPanel();
			blankPanel.setBackground(Color.white);
			mainPanel.add(blankPanel);
			mainPanel.add(panel1);

			JPanel blank = new JPanel();
			mainPanel.add(blank);

			JPanel tableP = new JPanel();
			tableP.add(accidentCheckTableView);
			tableP.setLayout(new BoxLayout(tableP, BoxLayout.X_AXIS));
			mainPanel.add(tableP);

			this.add(mainPanel);

			painted = false;
		}
		this.setVisible(true);
	}

	public void sendMessage(String message) {
		if (message == "승인") {
			String insuranceInform = this.accidentCheckTableView.AcceptInformationList();
			// 승인을 누르면 emplyoeeID 3번을 할당 statement를 0->1로수정
			if (insuranceInform != null) {
				this.cAccidentApproval.sendAcceptMessage(1);
				this.cAccidentApproval.acceptRequest(insuranceInform);
				JOptionPane.showMessageDialog(null, "보험금 지급이 수락되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "선택된 사고가 없습니다. 접수된 사고를 선택해주세요");
			}

		} else if (message == "거절") {
			// 삭제
			String insuranceInform = this.accidentCheckTableView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cAccidentApproval.sendDenialMessage(2);
				this.cAccidentApproval.denialRequest(insuranceInform);
				JOptionPane.showMessageDialog(null, "보험금 지급이 거부되었습니다.");
			} else {
				JOptionPane.showMessageDialog(null, "선택된 사고가 없습니다. 접수된 사고를 선택해주세요");
			}
		}

	}

	public void accidentList() {

		boolean checker = false;
		this.accidentInformation = this.cAccidentApproval.searchInformation(checker);
		System.out.println(accidentList);
		if (this.accidentInformation.size() != 0) {
			System.out.println("왔니");
			this.accidentCheckTableView.addRows(accidentInformation);
		} else {
			JOptionPane.showMessageDialog(null, "접수된 사고가 없습니다.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "조회") {
				accidentList();
			} else if (e.getActionCommand() == "승인") {
				sendMessage(e.getActionCommand());

			} else if (e.getActionCommand() == "거절") {
				sendMessage(e.getActionCommand());

			} else if (e.getActionCommand() == "취소") {
				int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까?", "Confirm", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {

				} else if (result == JOptionPane.CLOSED_OPTION) {
				}
			}
		}

	}

	public void association() {
	}

}