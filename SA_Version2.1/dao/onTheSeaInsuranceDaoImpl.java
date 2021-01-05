package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import insurance.onTheSeaInsuranceVO;
import insurnaceDesinging.insuranceDesingingVO;

public class onTheSeaInsuranceDaoImpl extends dao implements insuranceDao {
	private ArrayList<String> info;

	public onTheSeaInsuranceDaoImpl() throws Exception {

		super.connect();

	}

	@Override
	public void insert(insuranceDesingingVO insuranceDesinging) {
		SqlSession session = super.getSqlSession();

		insuranceDesingingVO input = insuranceDesinging;
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
		System.out.println(output + "���� ������ �����.");
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
		List<onTheSeaInsuranceVO> output = session.selectList("onTheSeaInsuranceMapper.InsertInfo", "�ػ���");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("��ȸ��� ����.");
		} else {
			for (onTheSeaInsuranceVO item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getInsuranceMoney()));
			}
		}
		session.close();
		return info;

	}

}