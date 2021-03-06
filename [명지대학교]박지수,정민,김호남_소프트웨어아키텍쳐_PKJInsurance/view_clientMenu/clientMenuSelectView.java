package view_clientMenu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import control_insuranceTool.cCheckInsurance;
import dao_main.dao;
import view_accidentReception.accidentReceptionApplicationView;
import view_insuranceRegistration.insuranceRegistrationView;
import view_insuranceRegistration.personalInformationAgreementView;
import view_insuranceTool.insuranceRetrievalView;

public class clientMenuSelectView extends JFrame {
	private static final long serialVersionUID = 1L;

	private accidentReceptionApplicationView accidentReceptionApplicationView;
	private insuranceRetrievalView insuranceRetrievalView;
	private personalInformationAgreementView personalInformationAgreementView;
	private boolean painted = true;
	private actionHandler actionHandler;
	private cCheckInsurance cCheckInsurance;
	private insuranceRegistrationView insuranceRegistrationView;

	public clientMenuSelectView() {
		this.actionHandler = new actionHandler();
		this.insuranceRetrievalView = new insuranceRetrievalView();
		this.personalInformationAgreementView = new personalInformationAgreementView();
		this.accidentReceptionApplicationView = new accidentReceptionApplicationView();
		this.cCheckInsurance = new cCheckInsurance();
		this.insuranceRegistrationView = new insuranceRegistrationView();
	}

	public void association(dao dao) {

	}

	public void run() {
		if (painted == true) {
			this.setTitle("2. 고객");
			this.setSize(400, 400);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			setLayout(new GridLayout(4, 1));

			JPanel panel1 = new JPanel();
			this.add(panel1);
			JButton bu1 = new JButton("1. 보험 검색");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("1");
			panel1.setBackground(new Color(240, 248, 255));
			panel1.add(bu1);

			JPanel panel2 = new JPanel();
			this.add(panel2);
			JButton bu2 = new JButton("2. 보험 가입");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("2");
			panel2.setBackground(new Color(240, 248, 255));
			panel2.add(bu2);

			JPanel panel3 = new JPanel();
			this.add(panel3);
			JButton bu3 = new JButton("3. 사고 접수");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("3");
			panel3.setBackground(new Color(240, 248, 255));
			panel3.add(bu3);

			JPanel panel5 = new JPanel();
			this.add(panel5);
			JButton bu5 = new JButton("     나가기     ");
			bu5.addActionListener(actionHandler);
			bu5.setActionCommand("5");
			panel5.setBackground(new Color(240, 248, 255));
			panel5.add(bu5);

			this.painted = false;
		}
		this.setVisible(true);
	}

	public void initialize() {
	}

	class actionHandler implements ActionListener {
		@Override

		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "1") {
				insuranceRetrievalView.run();
			} else if (e.getActionCommand() == "2") {
				boolean checker = cCheckInsurance.searchInsurance();
				if (checker == true) {
					insuranceRegistrationView.run();
//					personalInformationAgreementView.run();
//					personalInformationAgreementView = new personalInformationAgreementView();
				} else {
					JOptionPane.showMessageDialog(null, "가입할 수 있는 보험이 존재하지 않습니다.");
				}

			} else if (e.getActionCommand() == "3") {
				accidentReceptionApplicationView.run();
				accidentReceptionApplicationView = new accidentReceptionApplicationView();
			} else if (e.getActionCommand() == "5") {
				int result = JOptionPane.showConfirmDialog(null, "이 페이지에서 나가시겠습니까?", "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) {
					dispose();
				} else if (result == JOptionPane.NO_OPTION) {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				} else if (result == JOptionPane.CLOSED_OPTION) {

				}
			}
		}
	}

}
