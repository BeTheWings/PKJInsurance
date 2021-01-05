package dao_insuranceDesigning;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;
import model_insurance.mFireInsurance;
import model_insurance.mSpecialInsurance;
import model_insurnaceDesinging.mInsuranceDesinging;

public class specialInsuranceDaoImpl extends dao implements insuranceDao {
	private ArrayList<String> info;

	public specialInsuranceDaoImpl() throws Exception {
		super.connect();
	}

	@Override
	public void delete(String information) {
	}

	@Override
	public void update(String information) {
	}

	@Override
	public void search(ArrayList<String> list) {
	}

	public ArrayList<String> insertInfo() {
		// ������ ���̽� ����
		SqlSession session = super.getSqlSession();
		List<mSpecialInsurance> output = session.selectList("specialInsuranceMapper.insertInfo", "Ư������");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("��ȸ��� ����");
		} else {
			for (mSpecialInsurance item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getInsuranceMoney()));
			}
		}
		session.close();
		return this.info;

	}
	@Override
	public void insert(mInsuranceDesinging insuranceDesingingVO) {
		SqlSession session = super.getSqlSession();

		mInsuranceDesinging input = insuranceDesingingVO;
		input.getInsuranceName();
		input.getSubscriptionTarget();
		input.getPayment();
		input.getInsurancePeriod();
		input.getPaymentMethod();
		input.getInsuranceMoney();
		input.getNote();
		input.getSpecialSubscription();
		input.getInsuranceCategory();
		int output = session.insert("specialInsuranceMapper.specialInsert", input);
		System.out.println(output + "���� ������ �����.");
		session.commit();
		session.close();
	}

	public int findPayIn(String insuranceName) {
		SqlSession session = super.getSqlSession();
		mSpecialInsurance output = session.selectOne("specialInsuranceMapper.findPayIn", insuranceName);
		int out = output.getPayment();
		session.commit();
		System.out.println(out);
		
		if (out == 0) {
			System.out.println("����");
			session.close();
		} else {
			session.close();
			return out;
		}
		return out;
	}
}
