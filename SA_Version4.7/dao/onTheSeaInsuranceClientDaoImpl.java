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
		input.getTotalPrice();
		input.getSelectBoatType();
		input.getSelectOnTheSeaType();
		input.getDate();

		session.insert("onTheSeaInsuranceMapper.onTheSeaInsertClient", input);

		session.commit();
		session.close();
	}

	public boolean search(String insuranceName) {
		SqlSession session = super.getSqlSession();

		List<mOnTheSeaInsurance> output = session.selectList("InsuranceMapper.searchCategory", insuranceName);
		if (output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

}