package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model_client.mClient;


public interface clientDao {
	public void insert(ArrayList<String> list) throws SQLException;

	public void delete(String information);

	public void update(mClient client);

	public void search(mClient client);

}
