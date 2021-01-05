package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model_accidentReception.mAccidentReceptionApplication;
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

	public void insert(mAccidentReceptionApplication mAccidentReceptionApplication) {
		SqlSession session = super.getSqlSession();

		mAccidentReceptionApplication accidentVo = mAccidentReceptionApplication;
		accidentVo.getName();
		accidentVo.getIdNumber();
		accidentVo.getGender();
		accidentVo.getPhoneNumber();
		accidentVo.geteMail();
		accidentVo.getAccidentContent();
		accidentVo.getInsuranceName();

		session.insert("AccidentReceptionMapper.insertInformation", accidentVo);
		session.commit();
		session.close();

	}

	public ArrayList<String> deleteInformation() {
		return null;
	}

	public boolean checkInsuranceName(mAccidentReceptionApplication mAccidentReceptionApplication) {
		SqlSession session = super.getSqlSession();
		String insuranceName = mAccidentReceptionApplication.getInsuranceName();

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