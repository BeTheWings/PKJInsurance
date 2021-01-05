package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import insurance.insurance;

public class insuranceApproveDao extends dao implements insuranceDao {

	public insuranceApproveDao() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {

	}

	@Override
	public void delete(String information) {

		SqlSession session = super.getSqlSession();

		insurance input = new insurance();
		input.setName(information);

		int output = session.delete("insuranceApproveMapper.delete", input);

		session.commit();
		session.close();
	}

	@Override
	public void update(String information) {

		SqlSession session = super.getSqlSession();
		insurance input = new insurance();
		input.setName(information);
		int output = session.update("insuranceApproveMapper.Update", input);
		session.commit();
		session.close();
	}

	@Override
	public void search(ArrayList<String> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> insertInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
