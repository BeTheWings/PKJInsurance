package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.client;

public class saerchclientDaoImpl extends dao implements searchDao {

	private ArrayList<String> test;
	private String sql;
	String insuranceName;
	String name;
	String residentRegistrationNumber;
	String gender;

	public saerchclientDaoImpl() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> searchForClientInfor(String name, String idNumber) {

		this.test = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		List<client> output = session.selectList("InsuranceToolClientMapper.searchForClientInfor", null);

		if (output == null) {
			System.out.println("없어");
		} else {
			for (client item : output) {
				insuranceName = item.getInsuranceName();
				name = item.getClientName();
				residentRegistrationNumber = item.getResidentRegistrationNumber();
				gender = item.getGender();
			}
		}

		return test;
	}

	@Override
	public ArrayList<String> searchByAmount(String searchMethod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> searchByName(String searchMethod) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> searchByPeriod(String searchMethod) {
		return null;
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> inquiryForInsuranceWaitList(boolean searchMethod) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String insuranceName, String clientName) {
		 SqlSession session = super.getSqlSession();
	      if (insuranceName.equals("화재보험")) {
	         session.delete("InsuranceToolClientMapper.deleteFireClientInfo", clientName);
	      } else if (insuranceName.equals("해상보험")) {
	         session.delete("InsuranceToolClientMapper.deleteOnTheSeaClientInfo", clientName);
	      } else if (insuranceName.equals("특종보험")) {
	         session.delete("InsuranceToolClientMapper.deleteSpecialClientInfo", clientName);
	      } else if (insuranceName.equals("자동차보험")) {
	         session.delete("InsuranceToolClientMapper.deleteCarClientInfo", clientName);
	      } else {
	         System.out.println(1);
	      }

	}

}