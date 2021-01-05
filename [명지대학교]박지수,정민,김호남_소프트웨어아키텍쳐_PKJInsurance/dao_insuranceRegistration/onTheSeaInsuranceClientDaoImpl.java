package dao_insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao_insuranceTool.clientDao;
import dao_main.dao;
import model_client.mClient;
import model_insurance.mCarInsurance;
import model_insurance.mInsurance;
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
		mOnTheSeaInsuranceRegistration input = onTheSeaInsuranceRegistration;

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

	public ArrayList<String> search(String insuranceName) {
		SqlSession session = super.getSqlSession();
		ArrayList<String> nameList = new ArrayList<String>();
		
		List<mOnTheSeaInsurance> output = session.selectList("InsuranceMapper.searchCategory", insuranceName);
		if(output == null) {
			
		} else {
			for(mInsurance item : output) {
				nameList.add(item.getName());
			}
		}
		session.close();
		return nameList; //저장은 확실히 됐음
	}

	public String takeCategory(mOnTheSeaInsuranceRegistration mOnTheSeaInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		
		String category = null;
		String name = mOnTheSeaInsuranceRegistration.getInsuranceName();
		List<mOnTheSeaInsurance> output = session.selectList("InsuranceMapper.takeCategory", name);
		
		if(output == null) {
			session.close();
			return null;
		} else {
			for(mInsurance item: output) {
				category = item.getInsuranceCategory();
				System.out.println(category);
			}
			session.close();
			return category;
		}
		
	}

}