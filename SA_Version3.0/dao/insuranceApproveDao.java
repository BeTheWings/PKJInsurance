package dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import model_insurance.mInsurance;
import model_insurnaceDesinging.mInsuranceDesinging;

public class insuranceApproveDao extends dao implements insuranceDao {

	public insuranceApproveDao() {
		try {
			super.connect();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(String information) {

		SqlSession session = super.getSqlSession();

		mInsurance input = new mInsurance();
		input.setName(information);

		int output = session.delete("insuranceApproveMapper.delete", input);

		session.commit();
		session.close();
	}

	@Override
	public void update(String information) {

		SqlSession session = super.getSqlSession();
		mInsurance input = new mInsurance();
		input.setName(information);
		int output = session.update("insuranceApproveMapper.Update", input);
		session.commit();
		session.close();
	}

	@Override
	public void search(ArrayList<String> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> insertInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(mInsuranceDesinging insuranceDesingingVO) {
		// TODO Auto-generated method stub

	}

}
