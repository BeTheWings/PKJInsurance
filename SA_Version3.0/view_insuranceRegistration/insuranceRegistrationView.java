package view_insuranceRegistration;

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

public class insuranceRegistrationView extends JFrame {
	private static final long serialVersionUID = 1L;

	private actionHandler actionHandler;

	private fireInformation fireInformation;

	private onTheSeaInformation onTheSeaInformation;
	private carInformation carInformation;

	private specialInformation specialInformation;
	private boolean painted = true;
	private String name, date;

	public insuranceRegistrationView() {
		this.actionHandler = new actionHandler();
		fireInformation = new fireInformation();

		onTheSeaInformation = new onTheSeaInformation();
		carInformation = new carInformation();
		specialInformation = new specialInformation();

	}

	public void association() {
		this.fireInformation.association();
		this.onTheSeaInformation.association();
		this.carInformation.association();
		this.specialInformation.association();

	}

	public void run() {
		if (painted == true) {
			this.setTitle("5. 보험 가입");
			this.setSize(500, 500);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

			setLayout(new GridLayout(5, 1));

			JPanel panel1 = new JPanel();
			this.add(panel1);
			JButton bu1 = new JButton("  1. 화재보험  ");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("1");
			panel1.setBackground(new Color(240, 248, 255));
			panel1.add(bu1);

			JPanel panel2 = new JPanel();
			this.add(panel2);
			JButton bu2 = new JButton("  2. 해상보험  ");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("2");
			panel2.setBackground(new Color(240, 248, 255));
			panel2.add(bu2);

			JPanel panel3 = new JPanel();
			this.add(panel3);
			JButton bu3 = new JButton("3. 자동차보험");
			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("3");
			panel3.setBackground(new Color(240, 248, 255));
			panel3.add(bu3);

			JPanel panel4 = new JPanel();
			this.add(panel4);
			JButton bu4 = new JButton("  4. 특종보험  ");
			bu4.addActionListener(actionHandler);
			bu4.setActionCommand("4");
			panel4.setBackground(new Color(240, 248, 255));
			panel4.add(bu4);

			JPanel panel5 = new JPanel();
			this.add(panel5);
			JButton bu5 = new JButton("      나가기      ");
			bu5.addActionListener(actionHandler);
			bu5.setActionCommand("5");
			panel5.setBackground(new Color(240, 248, 255));
			panel5.add(bu5);

			painted = false;
		}
		this.setVisible(true);
	}

	public void vertifyDate(String name, String date) {
		this.name = name;
		this.date = date;
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "1") {
				fireInformation.run();
				fireInformation.sendName(name, date);
				fireInformation = new fireInformation();

			} else if (e.getActionCommand() == "2") {
				onTheSeaInformation.run();
				onTheSeaInformation.sendName(name, date);
				onTheSeaInformation = new onTheSeaInformation();

			} else if (e.getActionCommand() == "3") {
				carInformation.run();
				carInformation.sendName(name, date);
				carInformation = new carInformation();
			} else if (e.getActionCommand() == "4") {
				specialInformation.run();
				specialInformation.sendName(name, date);
				specialInformation = new specialInformation();
				
			} else if (e.getActionCommand() == "5") {
				int result = JOptionPane.showConfirmDialog(null, "이 페이지에서 나가시겠습니까?", "Confirm",
						JOptionPane.YES_NO_OPTION);
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
