package dao_insuranceTool;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;
import model_accidentReception.mAccidentApproval;
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

	public ArrayList<String> searchInformation(mAccidentApproval mAccidentApproval) {
		this.list = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		boolean statement = mAccidentApproval.isStatemnt();
		List<mClient> output = session.selectList("AccidentReceptionMapper.searchInformation", statement);

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

	public void accept(String clientName) {
		SqlSession session = super.getSqlSession();
		session.insert("AccidentReceptionMapper.updateInformation", clientName);
		session.commit();
		session.close();
	}

	public void updateFireClientInfo(mAccidentApproval mAccidentApproval) {
		SqlSession session = super.getSqlSession();
		mAccidentApproval input = mAccidentApproval;
		input.getClientName();
		input.getInsuranceName();
		session.update("AccidentReceptionMapper.updateFireClientInfo", input);
		session.commit();
		session.close();

	}

	public void updateSeaClientInfo(mAccidentApproval mAccidentApproval) {
		SqlSession session = super.getSqlSession();
		mAccidentApproval input = mAccidentApproval;
		input.getClientName();
		input.getInsuranceName();
		session.update("AccidentReceptionMapper.updateSeaClientInfo", input);
		session.commit();
		session.close();

	}

	public void updateCarClientInfo(mAccidentApproval mAccidentApproval) {
		SqlSession session = super.getSqlSession();
		mAccidentApproval input = mAccidentApproval;
		input.getClientName();
		input.getInsuranceName();
		session.update("AccidentReceptionMapper.updateCarClientInfo", input);
		session.commit();
		session.close();

	}

	public void updateSpecialClientInfo(mAccidentApproval mAccidentApproval) {
		SqlSession session = super.getSqlSession();
		mAccidentApproval input = mAccidentApproval;
		input.getClientName();
		input.getInsuranceName();
		session.update("AccidentReceptionMapper.updateSpecialClientInfo", input);
		session.commit();
		session.close();

	}

	public void insert(mClient client) {
		SqlSession session = super.getSqlSession();

		mClient clientVo = client;
		clientVo.getEmployeeID();
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