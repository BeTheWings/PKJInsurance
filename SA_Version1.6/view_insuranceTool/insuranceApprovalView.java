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

			this.setTitle("3. ���� ����");
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

			JButton bu4 = new JButton("��ȸ");
			bu4.addActionListener(actionHandler);
			bu4.setActionCommand("��ȸ");

			JButton bu1 = new JButton("����");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("����");

			JButton bu2 = new JButton("����");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("����");

			JButton bu3 = new JButton("���");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("���");

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

		if (message == "����") {
			String insuranceInform = this.inquiryInsuranceView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cInsurnaceApproval.sendAcceptMessage(1);
				this.cInsurnaceApproval.acceptInsurance(insuranceInform);
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ������ �����ϴ�. ������ �������ּ���");
			}

		} else {
			String insuranceInform = this.inquiryInsuranceView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cInsurnaceApproval.sendDenialMessage(2);
				this.cInsurnaceApproval.denialInsurance(insuranceInform);
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ������ �����ϴ�. ������ �������ּ���");
			}
		}

	}

	public void inquiryInsuranceWaitList() {
		boolean searchMethod =false;
		this.insuranceInformationList = this.cinquryAboutInsuranceWaitList.searchInformation(searchMethod);
		
		if (this.insuranceInformationList.size() != 0) {
			this.inquiryInsuranceView.addRows(insuranceInformationList);
		} else {
			JOptionPane.showMessageDialog(null, "���δ������ ������ �����ϴ�.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("��ȸ")) {
				inquiryInsuranceWaitList();
			} else if (e.getActionCommand() == "����") {
				sendMessage(e.getActionCommand());

			} else if (e.getActionCommand() == "����") {
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