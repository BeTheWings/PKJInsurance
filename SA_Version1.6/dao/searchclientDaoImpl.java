package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;

public class searchclientDaoImpl extends dao implements searchDao {

	private ArrayList<String> test;
	String insuranceName;
	String name;
	String residentRegistrationNumber;
	String gender;

	public searchclientDaoImpl() {
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
		List<clientVO> output = session.selectList("InsuranceToolClientMapper.searchForClientInfor", null);

		if (output == null) {
			System.out.println("없어");
		} else {
			for (clientVO item : output) {
				this.insuranceName = item.getInsuranceName();
				this.name = item.getClientName();
				this.residentRegistrationNumber = item.getResidentRegistrationNumber();
				this.gender = item.getGender();
				
				this.test.add(this.insuranceName);
				this.test.add(this.name);
				this.test.add(residentRegistrationNumber);
				this.test.add(gender);
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
	      session.commit();
	      session.close();
	}

}