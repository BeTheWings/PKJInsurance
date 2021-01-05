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
	public void insert(ArrayList<String> list) {

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
		
        input.setInsuranceName("해상보험");
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

		session.insert("onTheSeaInsuranceMapper.onTheSeaInsertClient", input);

		session.commit();
		session.close();
	}

}