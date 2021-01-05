package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import insurance.onTheSeaInsurance;

public class onTheSeaInsuranceDaoImpl extends dao implements insuranceDao {
	private ArrayList<String> info;

	public onTheSeaInsuranceDaoImpl() throws Exception {
		try {
			super.connect();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();

		onTheSeaInsurance input = new onTheSeaInsurance();
		input.setInsuranceName("해상보험");
		input.setSubscriptionTarget(list.get(0));
		input.setPayment(Integer.parseInt(list.get(1)));
		input.setInsurancePeriod(list.get(2));
		input.setPaymentMethod(list.get(3));
		input.setInsuranceMoney(Integer.parseInt(list.get(4)));
		input.setSpecialSubscription(list.get(6));

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
		List<onTheSeaInsurance> output = session.selectList("onTheSeaInsuranceMapper.InsertInfo", "해상보험");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("조회결과 없음.");
		} else {
			for (onTheSeaInsurance item : output) {			
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
}