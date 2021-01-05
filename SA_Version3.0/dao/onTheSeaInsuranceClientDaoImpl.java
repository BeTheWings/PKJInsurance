package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model_client.mClient;
import model_insurance.mOnTheSeaInsurance;
import model_insuranceRegistration.mOnTheSeaInsuranceRegistration;

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
	public void update(mClient client) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(mClient client) {
		// TODO Auto-generated method stub

	}

	public void insert(mOnTheSeaInsuranceRegistration onTheSeaInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		mOnTheSeaInsuranceRegistration input = new mOnTheSeaInsuranceRegistration();
		
        input.setInsuranceName(onTheSeaInsuranceRegistration.getInsuranceName());
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
		input.setTotalPrice(onTheSeaInsuranceRegistration.getTotalPrice());

		session.insert("onTheSeaInsuranceMapper.onTheSeaInsertClient", input);

		session.commit();
		session.close();
	}

	public boolean search(String insuranceName) {
		SqlSession session = super.getSqlSession();
//		String insuranceCategory = insuranceVO.getInsuranceCategory();
		
		List<mOnTheSeaInsurance> output = session.selectList("InsuranceMapper.searchCategory", insuranceName);
		if(output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

}