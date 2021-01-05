package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.JdbcTemplate;

import insurance.carInsurance;
import insurance.fireInsurance;

public class carInsuranceDaoImpl extends dao implements insuranceDao {

	private ArrayList<String> info;
	JdbcTemplate jdbcTemplate;

	public carInsuranceDaoImpl() throws Exception {
		try {
			super.connect();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();

		carInsurance input = new carInsurance();
		input.setInsuranceName("자동차보험");
		input.setSubscriptionTarget(list.get(0));
		input.setPayment(Integer.parseInt(list.get(1)));
		input.setInsurancePeriod(list.get(2));
		input.setPaymentMethod(list.get(3));
		input.setInsuranceMoney(Integer.parseInt(list.get(4)));
		input.setSpecialSubscription(list.get(5));

		int output = session.insert("carInsuranceMapper.carInsert", input);

		session.commit();
		session.close();
	}

	@Override
	public void delete(String information) {
		String sql = "";

		jdbcTemplate.execute(sql);
	}

	@Override
	public void update(String information) {

	}

	@Override
	public void search(ArrayList<String> list) {

	}

	@Override
	public ArrayList<String> insertInfo() {
		SqlSession session = super.getSqlSession();
		List<carInsurance> output = session.selectList("carInsuranceMapper.insertInfo", "자동차보험");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("조회결과 없음.");
		} else {
			for (carInsurance item : output) {
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
