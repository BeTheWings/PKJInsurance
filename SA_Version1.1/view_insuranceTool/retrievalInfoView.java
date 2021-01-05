package view_insuranceTool;

import java.util.ArrayList;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import global.constant.retrievalInfo;

public class retrievalInfoView extends JPanel {
	private static final long serialVersionUID = 1L;

	private retrieval retrieval;

	public retrievalInfoView() {
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.retrieval = new retrieval();
		JScrollPane scrollpane = new JScrollPane();
		scrollpane.setViewportView(this.retrieval);
		this.add(scrollpane);
	}

	public void association() {

	}

	private class retrieval extends JTable {
		private static final long serialVersionUID = 1L;

		private DefaultTableModel tableModel;

		public retrieval() {
			Vector<String> header = new Vector<String>();
			for (int i = 0; i < retrievalInfo.values().length; i++) {
				header.add(retrievalInfo.values()[i].getString());
			}
			this.tableModel = new DefaultTableModel(header, 0) {

				private static final long serialVersionUID = 1L;

				@Override
				public boolean isCellEditable(int row, int column) { // 더블클릭 수정 막는 것
					return false;
				}
			};

			this.setModel(this.tableModel);
		}

		public void addRows(ArrayList<String> test) {
			this.tableModel.setRowCount(0);
			int count = test.size() / 5;
			String[] test2 = new String[5];

			if (count == 0) {
				count = 1;
				int i = 0;
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < test.size() / count; k++) {
						test2[k] = test.get(i);
						i++;
					}
					this.tableModel.addRow(test2);

				}
			} else {
				int i = 0;
				for (int j = 0; j < count; j++) {
					for (int k = 0; k < test.size() / count; k++) {
						test2[k] = test.get(i);
						i++;
					}
					this.tableModel.addRow(test2);

				}
			}

		}
	}

	public void addRows(ArrayList<String> test) {
		this.retrieval.addRows(test);

	}

}
