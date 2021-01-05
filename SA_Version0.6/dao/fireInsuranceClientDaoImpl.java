package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.client;
import insuranceRegistration.fireInsuranceRegistration;

public class fireInsuranceClientDaoImpl extends dao implements clientDao {

	public fireInsuranceClientDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();
		fireInsuranceRegistration input = new fireInsuranceRegistration();
		input.setInsuranceName("화재보험");
		input.setName(list.get(0));
		input.setResidentRegistrationNumber(list.get(1));
		input.setAge(list.get(2));
		input.setGender(list.get(3));
		input.setPhoneNumber(list.get(4));
		input.setAddress(list.get(5));
		input.setAccountNumber(list.get(6));
		input.setJob(list.get(7));
		input.setLongterm(list.get(8));
		input.setAccidentHistroy(list.get(9));
		input.setEmail(list.get(10));

		int output = session.insert("fireInsuranceMapper.fireInsertClient", input);

		System.out.println(output + "개의 데이터 저장됨.");
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

}