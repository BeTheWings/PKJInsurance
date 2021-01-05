package view_underWriter;

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

import view_insuranceTool.approveClientView;

public class underWriterSelectView extends JFrame {

	static final long serialVersionUID = 1L;
	private underWriterView underWriterView;
	private approveClientView approveClientView;

	private actionHandler actionHandler;
	private boolean painted = true;

	public underWriterSelectView() {
		this.actionHandler = new actionHandler();
		this.underWriterView = new underWriterView();
		this.approveClientView = new approveClientView();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("��������� ����");
			this.setSize(400, 400);
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setBackground(new Color(240,248,255));
			setLayout(new GridLayout(3, 1));

			JPanel panel1 = new JPanel();
			panel1.setBackground(Color.white);
			this.add(panel1);
			JButton bu1 = new JButton("1. �������");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("1");
			
			panel1.add(bu1);
			panel1.setBackground(new Color(240,248,255));
			JPanel panel2 = new JPanel();
			panel2.setBackground(new Color(240,248,255));
			this.add(panel2);

			JButton bu2 = new JButton("2. �μ��ɻ�");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("2");
		
			panel2.add(bu2);

			JPanel panel3 = new JPanel();
			panel3.setBackground(new Color(240,248,255));
			this.add(panel3);
			JButton bu3 = new JButton("    ������    ");

			bu3.addActionListener(actionHandler);
			bu3.setActionCommand("3");
			panel3.add(bu3);

			painted = false;
		}
		this.setVisible(true);

	}

	class actionHandler implements ActionListener {
		@Override

		
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand() == "1") {
				underWriterView.run();
			} else if (e.getActionCommand() == "2") {
				approveClientView.run();
			} else if (e.getActionCommand() == "3") {
				int result = JOptionPane.showConfirmDialog(null, "�� ���������� �����ðڽ��ϱ�?", "Confirm",
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
