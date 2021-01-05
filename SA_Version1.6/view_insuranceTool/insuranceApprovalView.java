package view_insuranceTool;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.cInsurnaceApproval;
import control.cinquryAboutInsuranceWaitList;

public class insuranceApprovalView extends JFrame {
	private static final long serialVersionUID = 1L;

	private ArrayList<String> insuranceInformationList;

	private actionHandler actionHandler;

	private cInsurnaceApproval cInsurnaceApproval;
	private cinquryAboutInsuranceWaitList cinquryAboutInsuranceWaitList;

	private inquiryInsuranceView inquiryInsuranceView;
	private boolean painted = true;

	public insuranceApprovalView() {
		this.actionHandler = new actionHandler();
		this.cInsurnaceApproval = new cInsurnaceApproval();
		this.cinquryAboutInsuranceWaitList = new cinquryAboutInsuranceWaitList();
		this.inquiryInsuranceView = new inquiryInsuranceView();
		this.insuranceInformationList = new ArrayList<String>();
	}

	public void association() {
		this.inquiryInsuranceView.association();

	}

	public void run() {

		if (painted == true) {

			this.setTitle("3. 보험 승인");
			this.setSize(500, 300);
			this.setLocationRelativeTo(null);
			this.setBackground(Color.white);
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

			JPanel tableP = new JPanel();
			tableP.add(inquiryInsuranceView);
			tableP.setLayout(new BoxLayout(tableP, BoxLayout.X_AXIS));

			mainPanel.add(tableP);

			this.add(mainPanel);

			painted = false;
		}
		this.setVisible(true);
	}

	public void sendMessage(String message) {

		if (message == "승인") {
			String insuranceInform = this.inquiryInsuranceView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cInsurnaceApproval.sendAcceptMessage(1);
				this.cInsurnaceApproval.acceptInsurance(insuranceInform);
			} else {
				JOptionPane.showMessageDialog(null, "선택된 보험이 없습니다. 보험을 선택해주세요");
			}

		} else {
			String insuranceInform = this.inquiryInsuranceView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cInsurnaceApproval.sendDenialMessage(2);
				this.cInsurnaceApproval.denialInsurance(insuranceInform);
			} else {
				JOptionPane.showMessageDialog(null, "선택된 보험이 없습니다. 보험을 선택해주세요");
			}
		}

	}

	public void inquiryInsuranceWaitList() {
		boolean searchMethod =false;
		this.insuranceInformationList = this.cinquryAboutInsuranceWaitList.searchInformation(searchMethod);
		
		if (this.insuranceInformationList.size() != 0) {
			this.inquiryInsuranceView.addRows(insuranceInformationList);
		} else {
			JOptionPane.showMessageDialog(null, "승인대기중인 보험이 없습니다.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("조회")) {
				inquiryInsuranceWaitList();
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
					// 그냥 창 닫은 경우
				}
			}
		}
	}

}