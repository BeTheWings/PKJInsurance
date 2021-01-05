package dao_insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao_insuranceTool.clientDao;
import dao_main.dao;
import model_client.mClient;
import model_insurance.mInsurance;
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
		mSpecialInsuranceRegistration input = specialInsuranceRegistrationVO;

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
		input.getSpecialType();
		input.getProperty();
		input.getDate();

		session.insert("specialInsuranceMapper.specialInsertClient", input);

		session.commit();
		session.close();
	}

	public ArrayList<String> search(String insuranceName) {
		SqlSession session = super.getSqlSession();
		ArrayList<String> nameList = new ArrayList<String>();
		
		List<mSpecialInsurance> output = session.selectList("InsuranceMapper.searchCategory", insuranceName);
		if(output == null) {
			
		} else {
			for(mInsurance item : output) {
				nameList.add(item.getName());
			}
		}
		session.close();
		return nameList; //저장은 확실히 됐음
	}

	public String takeCategory(mSpecialInsuranceRegistration mSpecialInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		
		String category = null;
		String name = mSpecialInsuranceRegistration.getInsuranceName();
		List<mSpecialInsurance> output = session.selectList("InsuranceMapper.takeCategory", name);
		
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
