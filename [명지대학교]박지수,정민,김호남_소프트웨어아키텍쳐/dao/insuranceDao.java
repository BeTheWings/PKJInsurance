package dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface insuranceDao {

	public void insert(ArrayList<String> list) throws SQLException;

	public void delete(String information);

	public void update(String insurance);

	public void search(ArrayList<String> list);

	public ArrayList<String> insertInfo();
	
}
