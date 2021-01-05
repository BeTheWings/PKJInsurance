package dao_insuranceDesigning;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;
import model_insurance.mFireInsurance;
import model_insurance.mOnTheSeaInsurance;
import model_insurnaceDesinging.mInsuranceDesinging;

public class onTheSeaInsuranceDaoImpl extends dao implements insuranceDao {
	private ArrayList<String> info;

	public onTheSeaInsuranceDaoImpl() throws Exception {

		super.connect();

	}

	@Override
	public void insert(mInsuranceDesinging insuranceDesinging) {
		SqlSession session = super.getSqlSession();

		mInsuranceDesinging input = insuranceDesinging;
		input.getInsuranceName();
		input.getSubscriptionTarget();
		input.getPayment();
		input.getInsurancePeriod();
		input.getPaymentMethod();
		input.getInsuranceMoney();
		input.getNote();
		input.getSpecialSubscription();
		input.getInsuranceCategory();
		int output = session.insert("onTheSeaInsuranceMapper.onTheSeaInsert", input);
		System.out.println(output + "개의 데이터 저장됨.");
		session.commit();
		session.close();
	}

	@Override
	public void delete(String information) {

	}

	@Override
	public void update(String information) {
		// TODO Auto-generated method stub

	}

	@Override
	public void search(ArrayList<String> list) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<String> insertInfo() {
		SqlSession session = super.getSqlSession();
		List<mOnTheSeaInsurance> output = session.selectList("onTheSeaInsuranceMapper.InsertInfo", "해상보험");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("조회결과 없음.");
		} else {
			for (mOnTheSeaInsurance item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getInsuranceMoney()));
			}
		}
		session.close();
		return info;

	}

	public int findPayIn(String insuranceName) {
		SqlSession session = super.getSqlSession();
		System.out.println(insuranceName+" dao");
		mOnTheSeaInsurance output = session.selectOne("onTheSeaInsuranceMapper.findPayIn", insuranceName);
		int out = output.getPayment();
		session.commit();
		
		if (out == 0) {
			System.out.println("없음");
			session.close();
		} else {
			session.close();
			return out;
		}
		return out;
	}

}