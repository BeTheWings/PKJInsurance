package dao;

import java.util.ArrayList;

import Employee.Employee;

public interface employeeDao {

	void insert(ArrayList<String> list, ArrayList<String> jobList);

	boolean search(Employee employeeID);

}
