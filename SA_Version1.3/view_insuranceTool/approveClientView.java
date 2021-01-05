package view_insuranceTool;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control.cClientApproval;
import control.cInquryAboutClientWaitList;

public class approveClientView extends JFrame {
	private static final long serialVersionUID = 1L;

	private ArrayList<String> clientWaitList;
	private actionHandler actionHandler;
	private boolean painted = true;
	private approveTableView approveTableView;
	private cInquryAboutClientWaitList cInquryAboutClientWaitList;
	private inquiryInsuranceView inquiryInsuranceView;
	private cClientApproval cClientApproval;

	public approveClientView() {
		this.cInquryAboutClientWaitList = new cInquryAboutClientWaitList();
		this.actionHandler = new actionHandler();
		this.approveTableView = new approveTableView();
		this.clientWaitList = new ArrayList<String>();
		this.inquiryInsuranceView = new inquiryInsuranceView();
		this.cClientApproval = new cClientApproval();
	}

	public void run() {

		if (painted == true) {

			this.setTitle("2. 인수 심사");
			this.setSize(500, 500);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
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

			JPanel blank = new JPanel();
			mainPanel.add(blank);

			JPanel tableP = new JPanel();
			tableP.add(approveTableView);
			tableP.setLayout(new BoxLayout(tableP, BoxLayout.X_AXIS));

			mainPanel.add(tableP);

			this.add(mainPanel);

			painted = false;
		}
		this.setVisible(true);

	}

	public void sendMessage(String message) {

		if (message == "승인") {

			ArrayList<String> insuranceInform = this.approveTableView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cClientApproval.sendAcceptMessage(1);
				this.cClientApproval.acceptClient(insuranceInform.get(0), insuranceInform.get(1));
				
			} else {
				JOptionPane.showMessageDialog(null, "선택된 고객이 없습니다. 고객을 선택해주세요");
			}
		} else {
			ArrayList<String> insuranceInfrom = this.approveTableView.AcceptInformationList();
			if (insuranceInfrom != null) {
				this.cClientApproval.sendAcceptMessage(2);
				this.cClientApproval.denialInsurance(insuranceInfrom.get(0), insuranceInfrom.get(1));
			} else {
				JOptionPane.showMessageDialog(null, "선택된 고객이 없습니다. 고객을 선택해주세요");
			}
		}

	}

	public void clientWaitList() {
		boolean searchMethod = false;
		this.clientWaitList = this.cInquryAboutClientWaitList.searchInformation(searchMethod);
		System.out.println(clientWaitList);
		if (this.clientWaitList.size() != 0) {
			this.approveTableView.addRows(clientWaitList);
		} else if (this.clientWaitList.size() == 0) {
			JOptionPane.showMessageDialog(null, "승인대기중인 고객이 없습니다.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("조회")) {
				clientWaitList();
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

	public void association() {
		this.inquiryInsuranceView.association();
	}

}