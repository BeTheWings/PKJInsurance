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
		mCarInsuranceRegistration input = carInsuranceRegistration;
		
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
        input.getCarModel();
        input.getCarNumber();
        input.getDate();
        input.getInsuranceCategory();
        
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

	public ArrayList<String> search(String name) {
		SqlSession session = super.getSqlSession();
		ArrayList<String> nameList = new ArrayList<String>();
		
		List<mCarInsurance> output = session.selectList("InsuranceMapper.searchCategory", name);
		if(output == null) {
			
		} else {
			for(mInsurance item : output) {
				nameList.add(item.getName());
			}
		}
		session.close();
		return nameList; //저장은 확실히 됐음
	}

	public String takeCategory(mCarInsuranceRegistration mCarInsuranceRegistration) {
		SqlSession session = super.getSqlSession();
		
		String category = null;
		String name = mCarInsuranceRegistration.getInsuranceName();
		List<mCarInsurance> output = session.selectList("InsuranceMapper.takeCategory", name);
		
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
