package dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface employeeDao {
	
	public boolean search(String employeeID);

	void insert(ArrayList<String> list, ArrayList<String> jobList) throws SQLException;
	
}
