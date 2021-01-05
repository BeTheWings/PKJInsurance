package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model_client.mClient;
import model_insurance.mFireInsurance;
import model_insuranceRegistration.mFireInsuranceRegistration;

public class fireInsuranceClientDaoImpl extends dao implements clientDao {

	public fireInsuranceClientDaoImpl() throws Exception {
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

	public void insert(mFireInsuranceRegistration fireInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		mFireInsuranceRegistration input = fireInsuranceRegistration;
	
		input.setInsuranceName(fireInsuranceRegistration.getInsuranceName());
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
		input.setProperty(fireInsuranceRegistration.getProperty());
		input.setTotalPrice(fireInsuranceRegistration.getTotalPrice());

		session.insert("fireInsuranceMapper.fireInsertClient", input);

		session.commit();
		session.close();
	}

	public boolean search(String insuranceName) {
		SqlSession session = super.getSqlSession();
		
		List<mFireInsurance> output = session.selectList("InsuranceMapper.searchCategory", insuranceName);
		if(output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

	public void inset(int totalPrice, String date) {
		
	}

}