package view_insuranceTool;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import global.constant.retrievalclientInfo;

public class inquiryClientView extends JPanel {

	private static final long serialVersionUID = 1L;

	private Vector<String> getInformationList;
	private inquiry inquiry;
	private String[] test2;
	private ArrayList<String> insuranceInformation;

	public inquiryClientView() {
		this.getInformationList = new Vector<String>();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.inquiry = new inquiry();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(this.inquiry);
		this.insuranceInformation = new ArrayList<String>();

		this.add(scrollPane);
	}

	private class inquiry extends JTable {

		private static final long serialVersionUID = 1L;
		private DefaultTableModel tableModel;

		public inquiry() {
			Vector<String> header = new Vector<String>();

			for (int i = 0; i < retrievalclientInfo.values().length; i++) {
				header.add(retrievalclientInfo.values()[i].getString());
			}
			this.tableModel = new DefaultTableModel(header, 0) {

				private static final long serialVersionUID = 1L;

				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			this.setModel(this.tableModel);
		}

		public void addRows(ArrayList<String> clientInformationList) {
			this.tableModel.setRowCount(0);
			int count = clientInformationList.size() / 4;
			test2 = new String[4];

			int i = 0;
			if (count == 0) {
				count = 1;
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < clientInformationList.size() / count; k++) {
						test2[k] = clientInformationList.get(i);
						if (k == 0) {
							getInformationList.add(test2[0]);
						} else if (k == 1) {
							getInformationList.add(test2[1]);
						}
						i++;
					}
					this.tableModel.addRow(test2);
				}
			} else {
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < clientInformationList.size() / count; k++) {
						test2[k] = clientInformationList.get(i);
						if (k == 0) {
							getInformationList.add(test2[0]);
						} else if (k == 1) {
							getInformationList.add(test2[1]);
						}
						i++;
					}
					this.tableModel.addRow(test2);
				}
			}

		}

		public ArrayList<String> getSelectedInformation() {

			for (int i = this.tableModel.getRowCount() - 1; i >= 0; i--) {
				if (this.isRowSelected(i)) {
					this.tableModel.removeRow(i);
					String selectedInformation = getInformationList.get(0);
					String selectedInformation1 = getInformationList.get(1);
					insuranceInformation.add(selectedInformation);
					insuranceInformation.add(selectedInformation1);
					getInformationList.remove(i);
					return insuranceInformation;
				}
			}
			return insuranceInformation;
		}
	}

	public void addRows(ArrayList<String> clientInformationList) {
		this.inquiry.addRows(clientInformationList);
	}

	public ArrayList<String> withDrawo() {
		ArrayList<String> information = new ArrayList<String>();
		information = this.inquiry.getSelectedInformation();
		return information;
	}

}