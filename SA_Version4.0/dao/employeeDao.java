package dao;

import java.util.ArrayList;

import model_employee.mEmployee;

public interface employeeDao {

	void insert(ArrayList<String> list, ArrayList<String> jobList);

	boolean search(mEmployee employeeID);

}
