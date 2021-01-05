package control;

import dao.employeeDaoImpl;
import employee.employeeVO;

public class cEmployee {
//vairable
	private String id;
//Model
	private employeeDaoImpl employeeDaoImpl;
	// VO
	private employeeVO employee;

	public cEmployee() throws Exception {
		this.employeeDaoImpl = new employeeDaoImpl();
		this.employee = new employeeVO();
	}

	public boolean search(String id) {

		this.id = id;
		boolean checker = false;
		if (!this.id.contentEquals("")) {
			this.employee.setEmployeeID(Integer.parseInt(id));
			checker = this.employeeDaoImpl.search(employee);
			return checker;
		} else {
			return checker;
		}
	}

}
