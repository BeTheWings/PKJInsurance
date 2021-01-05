package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;
import insuranceRegistration.onTheSeaInsuranceRegistrationVO;

public class onTheSeaInsuranceClientDaoImpl extends dao implements clientDao {

	public onTheSeaInsuranceClientDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {

		SqlSession session = super.getSqlSession();
		onTheSeaInsuranceRegistrationVO input = new onTheSeaInsuranceRegistrationVO();
		input.setInsuranceName("해상보험");
		input.setName(list.get(0));
		input.setResidentRegistrationNumber(list.get(1));
		input.setAge(list.get(2));
		input.setGender(list.get(3));
		input.setPhoneNumber(list.get(4));
		input.setAddress(list.get(5));
		input.setAccountNumber(list.get(6));
		input.setJob(list.get(7));
		input.setLongterm(list.get(8));
		input.setAccidentHistory(list.get(9));
		input.setEmail(list.get(10));
		input.setSelectOnTheSeaType(list.get(11));

		int output = session.insert("onTheSeaInsuranceMapper.onTheSeaInsertClient", input);
		session.commit();
		session.close();
	}

	@Override
	public void delete(String information) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(clientVO client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(clientVO client) {
		// TODO Auto-generated method stub

	}

	public void insert(onTheSeaInsuranceRegistrationVO onTheSeaInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		onTheSeaInsuranceRegistrationVO input = new onTheSeaInsuranceRegistrationVO();

		input.setInsuranceName("해상보함");
		input.setName(onTheSeaInsuranceRegistration.getName());
		input.setResidentRegistrationNumber(onTheSeaInsuranceRegistration.getResidentRegistrationNumber());
		input.setAge(onTheSeaInsuranceRegistration.getAge());
		input.setGender(onTheSeaInsuranceRegistration.getGender());
		input.setPhoneNumber(onTheSeaInsuranceRegistration.getPhoneNumber());
		input.setAddress(onTheSeaInsuranceRegistration.getAddress());
		input.setAccountNumber(onTheSeaInsuranceRegistration.getAccountNumber());
		input.setJob(onTheSeaInsuranceRegistration.getJob());
		input.setLongterm(onTheSeaInsuranceRegistration.getLongterm());
		input.setAccidentHistory(onTheSeaInsuranceRegistration.getAccidentHistory());
		input.setEmail(onTheSeaInsuranceRegistration.getEmail());

		int output = session.insert("onTheSeaInsuranceMapper.onTheSeaInsertClient", input);

		session.commit();
		session.close();
	}

}