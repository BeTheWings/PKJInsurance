package control_employee;

import model_employee.mEmployee;

public class cEmployee {
	private String id;
	private boolean checker = false;

	private mEmployee employee;

	public cEmployee() {

		this.employee = new mEmployee();
	}

	public boolean search(String id) {

		this.id = id;
		this.employee.setEmployeeID(Integer.parseInt(id));
		checker = this.employee.findEmployeeID();

		return checker;

	}

}
