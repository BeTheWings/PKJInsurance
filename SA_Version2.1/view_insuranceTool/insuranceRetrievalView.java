package view_insuranceTool;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import control.cInsuranceRetrieval;

public class insuranceRetrievalView extends JFrame {
	private static final long serialVersionUID = 1L;

	private ArrayList<String> insuranceInformationList;

	private JLabel inputLabel;
	private JTextField inputText;
	private actionHandler actionHandler;
	private boolean painted = true;
	private String[] languages = { "����ī�װ�", "����Ⱓ", "���谡��" };
	private int count = 0;
	private JComboBox<String> comboBox;
	private cInsuranceRetrieval cInsuranceRetrieval;
	private JButton bu1;
	private retrievalInfoView retrievalInfoView;
	private boolean stopper = true;

	public insuranceRetrievalView() {
		this.inputText = new JTextField(10);
		this.actionHandler = new actionHandler();
		this.comboBox = new JComboBox<String>();
		this.cInsuranceRetrieval = new cInsuranceRetrieval();
		this.retrievalInfoView = new retrievalInfoView();
		this.insuranceInformationList = new ArrayList<String>();
	}

	public void association() {
		retrievalInfoView.association();
	}

	public void run() {
		if (painted == true) {
			this.setTitle("4. ���� �˻�");
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			setLayout(new GridLayout(3, 3));

			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
			mainPanel.setBackground(Color.white);

			JPanel panel0 = new JPanel();
			panel0.setLayout(new BoxLayout(panel0, BoxLayout.Y_AXIS));
			inputLabel = new JLabel("<���� �˻�>");
			panel0.add(inputLabel);
			mainPanel.add(panel0);

			for (int i = 0; i < languages.length; i++) {
				comboBox.addItem(languages[count++]);
			}
			JPanel panel1 = new JPanel();
			panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
			panel1.add(comboBox);

			panel1.add(inputText);
			mainPanel.add(panel1);

			JPanel buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.white);
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

			JPanel panel2 = new JPanel();
			panel2.setLayout(new GridLayout(1, 6));
			JPanel blankPaenlleft = new JPanel();
			panel2.add(blankPaenlleft);

			this.bu1 = new JButton("�˻�");
			bu1.addActionListener(actionHandler);
			bu1.setActionCommand("�˻�");
			panel2.add(bu1);
		
			JButton bu2 = new JButton("���");
			bu2.addActionListener(actionHandler);
			bu2.setActionCommand("���");
			panel2.add(bu2);
			
			JPanel blankPaenlright = new JPanel();
			panel2.add(blankPaenlright);

			buttonPanel.add(panel2);
			mainPanel.add(buttonPanel);

			JPanel blank = new JPanel();
			mainPanel.add(blank);

			JPanel tableP = new JPanel();
			tableP.add(retrievalInfoView);
			tableP.setLayout(new BoxLayout(tableP, BoxLayout.X_AXIS));
			mainPanel.add(tableP);

			this.add(mainPanel);

			painted = false;
		}
		this.setVisible(true);
	}

	public boolean isBlank() {
		String content = this.inputText.getText();

		if (content.equals("")) {
			JOptionPane.showMessageDialog(null, "�˻��� ������ �Է����ּ���!");
		} else {
			return true;
		}
		return false;
	}

	public void searchInsurance() {
		
		String searchType = (String) this.comboBox.getSelectedItem();
		String searchMethod = this.inputText.getText();
		this.insuranceInformationList = this.cInsuranceRetrieval.searchInformation(searchType, searchMethod);
		
		if (this.insuranceInformationList.size()!=0) {
			this.retrievalInfoView.addRows(this.insuranceInformationList);
		} else {
			JOptionPane.showMessageDialog(null, "�˻��� ������ �����ϴ�.");
		}
	}

	class actionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "�˻�") {
				stopper = isBlank();
				if (stopper == true) {
					searchInsurance();
				} else {
				}

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