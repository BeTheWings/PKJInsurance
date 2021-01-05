package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model_client.mClient;
import model_insurance.mSpecialInsurance;
import model_insuranceRegistration.mSpecialInsuranceRegistration;

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
	public void update(mClient client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(mClient client) {
		// TODO Auto-generated method stub

	}

	public void insert(mSpecialInsuranceRegistration specialInsuranceRegistrationVO) {
		SqlSession session = super.getSqlSession();
		mSpecialInsuranceRegistration input = new mSpecialInsuranceRegistration();
		
		input.setInsuranceName(specialInsuranceRegistrationVO.getInsuranceName());
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
		input.setTotalPrice(specialInsuranceRegistrationVO.getTotalPrice());

		session.insert("specialInsuranceMapper.specialInsertClient", input);

		session.commit();
		session.close();
	}

	public boolean search(String insuranceName) {
		SqlSession session = super.getSqlSession();
//		String insuranceCategory = insuranceVO.getInsuranceCategory();
		
		List<mSpecialInsurance> output = session.selectList("InsuranceMapper.searchCategory", insuranceName);
		if(output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

}
