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

	public void insert(mFireInsuranceRegistration mFireInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		mFireInsuranceRegistration input = mFireInsuranceRegistration;
	
		input.getInsuranceName();
		input.getName();
		input.getResidentRegistrationNumber();
		input.getAge();
		input.getGender();
		input.getPhoneNumber();
		input.getAddress();
		input.getAccountNumber();
		input.getJob();
		input.getLongterm();
		input.getAccidentHistory();
		input.getEmail();
		input.getProperty();
		input.getTotalPrice();
		input.getDate();

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

}