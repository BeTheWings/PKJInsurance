package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;
import insuranceRegistration.fireInsuranceRegistrationVO;

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
		fireInsuranceRegistrationVO input = new fireInsuranceRegistrationVO();
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
		input.setAccidentHistory(list.get(9));
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
	public void update(clientVO client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(clientVO client) {
		// TODO Auto-generated method stub

	}

	public void insert(fireInsuranceRegistrationVO fireInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		fireInsuranceRegistrationVO input = new fireInsuranceRegistrationVO();

		input.setInsuranceName("화재보험");
		input.setName(fireInsuranceRegistration.getName());
		input.setResidentRegistrationNumber(fireInsuranceRegistration.getResidentRegistrationNumber());
		input.setAge(fireInsuranceRegistration.getAge());
		input.setGender(fireInsuranceRegistration.getGender());
		input.setPhoneNumber(fireInsuranceRegistration.getPhoneNumber());
		input.setAddress(fireInsuranceRegistration.getAddress());
		input.setAccountNumber(fireInsuranceRegistration.getAccountNumber());
		input.setJob(fireInsuranceRegistration.getJob());
		input.setLongterm(fireInsuranceRegistration.getLongterm());
		input.setAccidentHistory(fireInsuranceRegistration.getAccidentHistory());
		input.setEmail(fireInsuranceRegistration.getEmail());

		int output = session.insert("fireInsuranceMapper.fireInsertClient", input);

		session.commit();
		session.close();
	}

}