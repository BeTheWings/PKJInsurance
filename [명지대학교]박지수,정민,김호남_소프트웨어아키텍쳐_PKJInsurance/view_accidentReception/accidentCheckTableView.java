package view_accidentReception;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import global.constant.accidentTable;
import global.constant.retrievalInfo;

public class accidentCheckTableView extends JPanel {

	private inquiry inquiry;
	private Vector<String> getInformationList;

	private String[] test2;
	private static final long serialVersionUID = 1L;

	public accidentCheckTableView() {
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
			for (int i = 0; i < accidentTable.values().length; i++) {
				header.add(accidentTable.values()[i].getString());
			}
			this.tableModel = new DefaultTableModel(header, 0) {

				private static final long serialVersionUID = 1L;

				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			this.setModel(this.tableModel);
		}

		public void addRows(ArrayList<String> test) {
			this.tableModel.setRowCount(0);
			int count = test.size() / 5;
			test2 = new String[5];
			getInformationList = new Vector<String>();
			int i = 0;
			for (int j = 0; j < count; j++) {
				for (int k = 0; k < test.size() / count; k++) {
					System.out.println(count);
					test2[k] = test.get(i);
					if (k == 0) {
						getInformationList.add(test2[0]);
					}
					i++;
				}
				this.tableModel.addRow(test2);

			}

		}

		public ArrayList<String> AcceptInforamtionList() {

			for (int i = this.tableModel.getRowCount() - 1; i >= 0; i--) {
				if (this.isRowSelected(i)) {
					ArrayList<String> info = new ArrayList<String>();
					String insuranceInformation = (String) this.tableModel.getValueAt(i, 0);
					String insuranceInformation1 = (String) this.tableModel.getValueAt(i, 1);
					String insuranceInformation2 = (String) this.tableModel.getValueAt(i, 2);

					this.tableModel.removeRow(i);

					getInformationList.remove(i);

					info.add(insuranceInformation);
					info.add(insuranceInformation1);
					info.add(insuranceInformation2);

					return info;
				}
			}
			return null;
		}

	}

	public void addRows(ArrayList<String> insuranceInformationList) {
		this.inquiry.addRows(insuranceInformationList);
	}

	public ArrayList<String> AcceptInformationList() {
		ArrayList<String> information = this.inquiry.AcceptInforamtionList();
		return information;
	}

}