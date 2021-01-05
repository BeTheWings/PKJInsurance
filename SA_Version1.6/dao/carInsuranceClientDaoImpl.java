package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;
import insuranceRegistration.carInsuranceRegistrationVO;

public class carInsuranceClientDaoImpl extends dao implements clientDao {

	public carInsuranceClientDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(carInsuranceRegistrationVO carInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		carInsuranceRegistrationVO input = new carInsuranceRegistrationVO();
		
        input.setInsuranceName("자동차보험");
		input.setName(carInsuranceRegistration.getName());
		input.setResidentRegistrationNumber(carInsuranceRegistration.getResidentRegistrationNumber());
		input.setAge(carInsuranceRegistration.getAge());
		input.setGender(carInsuranceRegistration.getGender());
		input.setPhoneNumber(carInsuranceRegistration.getPhoneNumber());
		input.setAddress(carInsuranceRegistration.getAddress());
		input.setAccountNumber(carInsuranceRegistration.getAccountNumber());
		input.setJob(carInsuranceRegistration.getJob());
		input.setLongterm(carInsuranceRegistration.getLongterm());
		input.setAccidentHistory(carInsuranceRegistration.getAccidentHistory());
		input.setEmail(carInsuranceRegistration.getEmail());

		session.insert("carInsuranceMapper.carInsertClient", input);

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

	@Override
	public void insert(ArrayList<String> list) {
		
	}

}
