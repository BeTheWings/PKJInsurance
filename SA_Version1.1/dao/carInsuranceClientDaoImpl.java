package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.client;
import insuranceRegistration.carInsuranceRegistrationVO;

public class carInsuranceClientDaoImpl extends dao implements clientDao {

	public carInsuranceClientDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(carInsuranceRegistrationVO carInsuranceRegistration) throws SQLException {
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

		int output = session.insert("carInsuranceMapper.carInsertClient", input);

		session.commit();
		session.close();
	}

	@Override
	public void delete(String information) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(client client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(ArrayList<String> list){
		SqlSession session = super.getSqlSession();
		carInsuranceRegistrationVO input = new carInsuranceRegistrationVO();
		input.setInsuranceName("자동차보험");
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

		int output = session.insert("carInsuranceMapper.carInsertClient", input);

		session.commit();
		session.close();
	}

}
