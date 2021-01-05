package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import client.clientVO;

public interface clientDao {
	public void insert(ArrayList<String> list) throws SQLException;

	public void delete(String information);

	public void update(clientVO client);

	public void search(clientVO client);
}
