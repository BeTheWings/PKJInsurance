package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import insurance.insurance;

public class checkInsuranceDaoImpl extends dao implements insuranceDao {

	public checkInsuranceDaoImpl() {

		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(String information) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(String insurance) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> insertInfo() {
		return null;
	}

	@Override
	public void search(ArrayList<String> list) {
		// TODO Auto-generated method stub

	}

	public boolean find() {

		SqlSession session = super.getSqlSession();
		insurance insurance = new insurance();
		List<insurance> output = session.selectList("InsuranceMapper.findInsuranceStatement", null);
		if (output == null) {
			System.out.println("조회에 실패했습니다.");
			return false;
		} else {
			return true;
		}

	}

}
