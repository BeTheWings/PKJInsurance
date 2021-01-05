package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import insurance.specialInsurance;

public class specialInsuranceDaoImpl extends dao implements insuranceDao {
	private ArrayList<String> info;

	public specialInsuranceDaoImpl() throws Exception {
		super.connect();
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {

		SqlSession session = super.getSqlSession();

		specialInsurance input = new specialInsurance();
		input.setInsuranceName("특종보험");
		input.setSubscriptionTarget(list.get(0));
		input.setPayment(Integer.parseInt(list.get(1)));
		input.setInsurancePeriod(list.get(2));
		input.setPaymentMethod(list.get(3));
		input.setInsuranceMoney(Integer.parseInt(list.get(4)));
		input.setSpecialSubscription(list.get(6));

		int output = session.insert("specialInsuranceMapper.specialInsert", input);

		session.commit();
		session.close();

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
		// 데이터 베이스 접속
		SqlSession session = super.getSqlSession();
		List<specialInsurance> output = session.selectList("specialInsuranceMapper.insertInfo", "특종보험");
		this.info = new ArrayList<String>();

		// 현재 inster를 해서 정보를 집어넣어야하는데 구조상 insert를 하는 것이 아닌 결과같은 가져오는 구조로 만들어져 있음 아마
		// 초기판이라 그런것같음
		if (output == null) {
			System.out.println("조회결과 없음");
		} else {
			for (specialInsurance item : output) {
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
		return this.info;

	}
}
