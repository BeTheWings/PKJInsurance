package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model_client.mClient;

public class accidentDaoImpl extends dao {
	private ArrayList<String> list;
	private String sql;
	private String name;
	private String rr;
	private String phoneNumber;
	private String accidentContent;
	private String insuranceName;
	private String insuranceCategory;

	public accidentDaoImpl() {
		try {
			super.connect();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> searchInformation() {
		this.list = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		List<mClient> output = session.selectList("AccidentReceptionMapper.searchInformation", null);

		if (output == null) {

		} else {
			for (mClient item : output) {
				name = item.getClientName();
				insuranceName = item.getInsuranceName();
				insuranceCategory = item.getInsuranceCategory();
				phoneNumber = item.getPhoneNumber();
				accidentContent = item.getAccidentContent();

				list.add(name);
				list.add(insuranceName);
				list.add(insuranceCategory);
				list.add(phoneNumber);
				list.add(accidentContent);
			}
		}
		session.close();
		return list;
	}

	public void delete(String clientName) {

		SqlSession session = super.getSqlSession();
		session.delete("AccidentReceptionMapper.deleteInformation", clientName);
		session.commit();
		session.close();

	}

	public void insert(mClient client) {
		SqlSession session = super.getSqlSession();

		mClient clientVo = client;
		clientVo.getClientName();
		clientVo.getResidentRegistrationNumber();
		clientVo.getGender();
		clientVo.getPhoneNumber();
		clientVo.getEmail();
		clientVo.getAccidentContent();
		clientVo.getInsuranceName();
		session.insert("AccidentReceptionMapper.insertInformation", clientVo);
		session.commit();
		session.close();

	}

	public ArrayList<String> deleteInformation() {
		return null;
	}

	public boolean checkInsuranceName(mClient clientVO) {
		SqlSession session = super.getSqlSession();
		String insuranceName = clientVO.getInsuranceName();
		System.out.println(insuranceName);
		mClient output = session.selectOne("AccidentReceptionMapper.checkInsuranceName", insuranceName);
		if (output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

}