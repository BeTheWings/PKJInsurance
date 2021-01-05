package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import Employee.Employee;

public interface employeeDao {

	void insert(ArrayList<String> list, ArrayList<String> jobList) throws SQLException;

	boolean search(Employee employeeID);

}
