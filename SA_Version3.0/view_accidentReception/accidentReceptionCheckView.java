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
			this.setTitle("<��� ���� Ȯ��>");
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
			tableP.add(accidentCheckTableView);
			tableP.setLayout(new BoxLayout(tableP, BoxLayout.X_AXIS));
			mainPanel.add(tableP);

			this.add(mainPanel);

			painted = false;
		}
		this.setVisible(true);
	}

	public void sendMessage(String message) {
		if (message == "����") {
			String insuranceInform = this.accidentCheckTableView.AcceptInformationList();
			// ������ ������ emplyoeeID 3���� �Ҵ� statement�� 0->1�μ���
			if (insuranceInform != null) {
				this.cAccidentApproval.sendAcceptMessage(1);
				this.cAccidentApproval.acceptRequest(insuranceInform);
				JOptionPane.showMessageDialog(null, "����� ������ �����Ǿ����ϴ�.");
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ��� �����ϴ�. ������ ��� �������ּ���");
			}

		} else if (message == "����") {
			// ����
			String insuranceInform = this.accidentCheckTableView.AcceptInformationList();
			if (insuranceInform != null) {
				this.cAccidentApproval.sendDenialMessage(2);
				this.cAccidentApproval.denialRequest(insuranceInform);
				JOptionPane.showMessageDialog(null, "����� ������ �źεǾ����ϴ�.");
			} else {
				JOptionPane.showMessageDialog(null, "���õ� ��� �����ϴ�. ������ ��� �������ּ���");
			}
		}

	}

	public void accidentList() {

		boolean checker = false;
		this.accidentInformation = this.cAccidentApproval.searchInformation(checker);
		System.out.println(accidentList);
		if (this.accidentInformation.size() != 0) {
			System.out.println("�Դ�");
			this.accidentCheckTableView.addRows(accidentInformation);
		} else {
			JOptionPane.showMessageDialog(null, "������ ��� �����ϴ�.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "��ȸ") {
				accidentList();
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
				}
			}
		}

	}

	public void association() {
	}

}