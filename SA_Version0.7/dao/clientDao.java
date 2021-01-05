package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import client.client;

public interface clientDao {
	public void insert(ArrayList<String> list) throws SQLException;

	public void delete(String information);

	public void update(client client);

	public void search(client client);
}
