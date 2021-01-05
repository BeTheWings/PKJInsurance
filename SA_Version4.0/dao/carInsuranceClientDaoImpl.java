package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model_client.mClient;
import model_insurance.mCarInsurance;
import model_insuranceRegistration.mCarInsuranceRegistration;

public class carInsuranceClientDaoImpl extends dao implements clientDao {

	public carInsuranceClientDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(mCarInsuranceRegistration carInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		mCarInsuranceRegistration input = new mCarInsuranceRegistration();
		
        input.setInsuranceName(carInsuranceRegistration.getInsuranceName());
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
		input.setTotalPrice(carInsuranceRegistration.getTotalPrice());

		session.insert("carInsuranceMapper.carInsertClient", input);

		session.commit();
		session.close();
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

	@Override
	public void insert(ArrayList<String> list) {
		
	}

	public boolean search(String name) {
		SqlSession session = super.getSqlSession();
//		String insuranceCategory = insuranceVO.getInsuranceCategory();
		
		List<mCarInsurance> output = session.selectList("InsuranceMapper.searchCategory", name);
		if(output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

}
