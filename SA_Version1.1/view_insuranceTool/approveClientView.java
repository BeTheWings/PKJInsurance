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

			this.setTitle("2. �μ� �ɻ�");
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

		if (message == "����") {

			ArrayList<String> insuranceInform = this.approveTableView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cClientApproval.sendAcceptMessage(1);
				this.cClientApproval.acceptClient(insuranceInform.get(0), insuranceInform.get(1));
				
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ���� �����ϴ�. ���� �������ּ���");
			}
		} else {
			ArrayList<String> insuranceInfrom = this.approveTableView.AcceptInformationList();
			if (insuranceInfrom != null) {
				this.cClientApproval.sendAcceptMessage(2);
				this.cClientApproval.denialInsurance(insuranceInfrom.get(0), insuranceInfrom.get(1));
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ���� �����ϴ�. ���� �������ּ���");
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
			JOptionPane.showMessageDialog(null, "���δ������ ���� �����ϴ�.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("��ȸ")) {
				clientWaitList();
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

	public void association() {
		this.inquiryInsuranceView.association();
	}

}