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

		session.insert("specialInsuranceMapper.specialInsertClient", input);

		session.commit();
		session.close();
	}

}
