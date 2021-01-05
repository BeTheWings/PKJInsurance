package view_insuranceTool;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import global.constant.clientTable;

public class approveTableView extends JPanel {

	private inquiry inquiry;
	private Vector<String> getInformationList;
	private String[] test2;
	private static final long serialVersionUID = 1L;
	private ArrayList<String> clientInformation;

	public approveTableView() {
		this.clientInformation = new ArrayList<String>();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.inquiry = new inquiry();
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportView(this.inquiry);
		this.add(scrollPane);
	}

	public void association() {

	}

	private class inquiry extends JTable {
		private static final long serialVersionUID = 1L;
		private DefaultTableModel tableModel;

		public inquiry() {
			Vector<String> header = new Vector<String>();
			for (int i = 0; i < clientTable.values().length; i++) {
				header.add(clientTable.values()[i].getString());
			}
			this.tableModel = new DefaultTableModel(header, 0) {

				private static final long serialVersionUID = 1L;

				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			this.setModel(this.tableModel);
		}

		public void addRows(ArrayList<String> clientWaitList) {
			this.tableModel.setRowCount(0);
			int count = clientWaitList.size() / 6;
			test2 = new String[6];
			getInformationList = new Vector<String>();
			if (count == 0) {
				count = 1;
				int i = 0;
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < clientWaitList.size() / count; k++) {
						
						test2[k] = clientWaitList.get(i);
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
				int i = 0;
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < clientWaitList.size() / count; k++) {
						test2[k] = clientWaitList.get(i);
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

		public ArrayList<String> AcceptInforamtionList() {

			for (int i = this.tableModel.getRowCount() - 1; i >= 0; i--) {
				if (this.isRowSelected(i)) {
					clientInformation = new ArrayList<String>();
					String insuranceInformation = (String) this.tableModel.getValueAt(i, 0);
					String insuranceInformation1 = (String) this.tableModel.getValueAt(i, 1);

					this.tableModel.removeRow(i);

					clientInformation.add(insuranceInformation);
					clientInformation.add(insuranceInformation1);

					getInformationList.remove(i);
					return clientInformation;
				}
			}
			return null;
		}
	}

	public void addRows(ArrayList<String> clientWaitList) {

		this.inquiry.addRows(clientWaitList);
	}

	public ArrayList<String> AcceptInformationList() {
		ArrayList<String> information;
		information = this.inquiry.AcceptInforamtionList();
		return information;
	}

}