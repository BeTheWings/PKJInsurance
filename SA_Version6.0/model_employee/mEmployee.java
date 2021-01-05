package model_employee;

import dao_employee.employeeDaoImpl;

public class mEmployee {
	private int employeeID;
	private String name;
	private int age;
	private String address;
	private String phoneNumber;
	private String emailAddress;
	private String role;
	private employeeDaoImpl employeeDaoImpl;
	private boolean checker;

	public mEmployee() {
		try {
			this.employeeDaoImpl = new employeeDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean findEmployeeID() {

		if (!Integer.toString(employeeID).equals("")) {
			this.checker = this.employeeDaoImpl.search(this);
		}
		return checker;
	}

}
