package dao;

import java.util.ArrayList;

import employee.employeeVO;

public interface employeeDao {

	void insert(ArrayList<String> list, ArrayList<String> jobList);

	boolean search(employeeVO employeeID);

}
