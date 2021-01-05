package dao_insuranceTool;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;

public class clientApproveDaoImpl extends dao implements clientApproveDao {

	String sql;

	public clientApproveDaoImpl() {
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
	public void delete(String insuranceName, String clientName) {
		SqlSession session = super.getSqlSession();
	
		if (insuranceName.equals("화재보험")) {
			session.delete("InsuranceToolClientMapper.deleteFireClientInfo", clientName);
		} else if (insuranceName.equals("해상보험")) {
			session.delete("InsuranceToolClientMapper.deleteOnTheSeaClientInfo", clientName);

		} else if (insuranceName.equals("특종보험")) {
			session.delete("InsuranceToolClientMapper.deleteSpecialClientInfo", clientName);

		} else if (insuranceName.equals("자동차보험")) {
			session.delete("InsuranceToolClientMapper.deleteCarClientInfo", clientName);

		} else {
			System.out.println(1);
		}
		session.commit();
		session.close();
	}

	@Override
	public void update(String insuranceName, String clientName) {
		
		SqlSession session = super.getSqlSession();
		System.out.println(insuranceName);
		if (insuranceName.equals("화재보험")) {
			session.update("InsuranceToolClientMapper.updateFireClientInfo", clientName);
			session.commit();
			session.close();
		} else if (insuranceName.equals("해상보험")) {
			session.update("InsuranceToolClientMapper.updateOnTheSeaClientInfo", clientName);
			session.commit();
			session.close();

		} else if (insuranceName.equals("특종보험")) {
			session.update("InsuranceToolClientMapper.updateSpecialClientInfo", clientName);
			session.commit();
			session.close();

		} else if (insuranceName.equals("자동차보험")) {
			session.update("InsuranceToolClientMapper.updateCarClientInfo", clientName);
			session.commit();
			session.close();

		} else {
			System.out.println(1);
		}

	}

}