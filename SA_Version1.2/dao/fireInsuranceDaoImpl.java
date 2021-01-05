package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import insurance.fireInsurance;
import insurnaceDesinging.insuranceDesinging;

public class fireInsuranceDaoImpl extends dao implements insuranceDao {

	private ArrayList<String> info;

	public fireInsuranceDaoImpl() throws Exception {
		super.connect();

	}

	public ArrayList<String> insertInfo() {
		SqlSession session = super.getSqlSession();
		List<fireInsurance> output = session.selectList("fireInsuranceMapper.insertInfo", "화재보험");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("조회결과 없음.");
		} else {
			for (fireInsurance item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getPayment()));
				int longMoney = item.getPayment() - 1000;
				this.info.add(Integer.toString(longMoney));
				this.info.add(Integer.toString(item.getInsuranceMoney()));
				this.info.add(item.getSubscriptionTarget());

			}
		}

		session.close();
		return info;
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
		input.getNotes();
		input.getSpecialSubscription();
		input.getInsuranceCategory();
		int output = session.insert("fireInsuranceMapper.fireInsert", input);

		System.out.println(output + "개의 데이터 저장됨.");
		session.commit();
		session.close();
	}

	@Override
	public void search(ArrayList<String> list) {

	}

	@Override
	public void delete(String information) {
	}

	@Override
	public void update(String information) {
	}

}