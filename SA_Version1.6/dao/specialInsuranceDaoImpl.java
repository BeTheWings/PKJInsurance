package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import insurance.specialInsurance;
import insurnaceDesinging.insuranceDesinging;

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
		// TODO Auto-generated method stub

	}

	public ArrayList<String> insertInfo() {
		// ������ ���̽� ����
		SqlSession session = super.getSqlSession();
		List<specialInsurance> output = session.selectList("specialInsuranceMapper.insertInfo", "Ư������");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("��ȸ��� ����");
		} else {
			for (specialInsurance item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getInsuranceMoney()));
			}
		}
		session.close();
		return this.info;

	}
	@Override
	public void insert(insuranceDesinging insuranceDesingingVO) {
		SqlSession session = super.getSqlSession();

		insuranceDesinging input = insuranceDesingingVO;
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
}
