package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;

public class searchclientDaoImpl extends dao implements searchDao {

	private ArrayList<String> test;
	private String insuranceName;
	private String name;
	private String residentRegistrationNumber;
	private String gender;
	private String insuranceCategory;

	public searchclientDaoImpl() {
		try {
			super.connect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<String> searchForClientInfor(clientVO clientVO) {
		this.test = new ArrayList<String>();
		SqlSession session = super.getSqlSession();

		List<clientVO> output = session.selectList("InsuranceToolClientMapper.searchForClientInfor", clientVO);

		if (output == null) {
			System.out.println("¾ø¾î");
		} else {
			for (clientVO item : output) {
				this.insuranceCategory = item.getInsuranceCategory();
				this.name = item.getClientName();
				this.insuranceName = item.getInsuranceName();
				this.residentRegistrationNumber = item.getResidentRegistrationNumber();
				this.gender = item.getGender();
				this.test.add(this.insuranceCategory);
				this.test.add(this.name);
				this.test.add(this.insuranceName);
				this.test.add(residentRegistrationNumber);
				this.test.add(gender);
			}
		}

		return test;
	}

	@Override
	public ArrayList<String> searchByAmount(String searchMethod) {

		return null;
	}

	@Override
	public ArrayList<String> searchByName(String searchMethod) {

		return null;
	}

	@Override
	public ArrayList<String> searchByPeriod(String searchMethod) {

		return null;
	}

	@Override
	public ArrayList<String> inquiryForInsuranceWaitList(boolean searchMethod) {

		return null;
	}

	public void deleteFireInsurance(String insuranceCategory, String clientName, String insuranceName) {
		SqlSession session = super.getSqlSession();
		session.delete("InsuranceToolClientMapper.deleteFireClientInfo", clientName);
		session.commit();
		session.close();
	}

	public void deleteCarInsurance(String insuranceCategory, String clientName, String insuranceName) {
		SqlSession session = super.getSqlSession();
		session.delete("InsuranceToolClientMapper.deleteCarClientInfo", clientName);
		session.commit();
		session.close();
	}

	public void deleteOnTheSeaInsurance(String insuranceCategory, String clientName, String insuranceName) {
		SqlSession session = super.getSqlSession();
		session.delete("InsuranceToolClientMapper.deleteOnTheSeaClientInfo", clientName);
		session.commit();
		session.close();
	}

	public void deleteSpecialInsurance(String insuranceCategory, String clientName, String insuranceName) {
		SqlSession session = super.getSqlSession();
		session.delete("InsuranceToolClientMapper.deleteSpecialClientInfo", clientName);
		session.commit();
		session.close();
	}

}