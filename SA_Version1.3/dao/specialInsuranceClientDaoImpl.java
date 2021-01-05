package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;
import insuranceRegistration.specialInsuranceRegistrationVO;

public class specialInsuranceClientDaoImpl extends dao implements clientDao {

	public specialInsuranceClientDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {

		SqlSession session = super.getSqlSession();
		specialInsuranceRegistrationVO input = new specialInsuranceRegistrationVO();
		input.setInsuranceName("특종보험");
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
		input.setSpecialType(list.get(11));

		int output = session.insert("specialInsuranceMapper.specialInsertClient", input);

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

	public void insert(specialInsuranceRegistrationVO specialInsuranceRegistrationVO) {

		SqlSession session = super.getSqlSession();
		specialInsuranceRegistrationVO input = new specialInsuranceRegistrationVO();

		input.setInsuranceName("특종보험");
		input.setName(specialInsuranceRegistrationVO.getName());
		input.setResidentRegistrationNumber(specialInsuranceRegistrationVO.getResidentRegistrationNumber());
		input.setAge(specialInsuranceRegistrationVO.getAge());
		input.setGender(specialInsuranceRegistrationVO.getGender());
		input.setPhoneNumber(specialInsuranceRegistrationVO.getPhoneNumber());
		input.setAddress(specialInsuranceRegistrationVO.getAddress());
		input.setAccountNumber(specialInsuranceRegistrationVO.getAccountNumber());
		input.setJob(specialInsuranceRegistrationVO.getJob());
		input.setLongterm(specialInsuranceRegistrationVO.getLongterm());
		input.setAccidentHistory(specialInsuranceRegistrationVO.getAccidentHistory());
		input.setEmail(specialInsuranceRegistrationVO.getEmail());

		int output = session.insert("specialInsuranceMapper.specialInsertClient", input);

		session.commit();
		session.close();
	}

}
