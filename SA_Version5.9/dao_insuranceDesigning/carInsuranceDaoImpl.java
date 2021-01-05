package dao_insuranceDesigning;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.jdbc.core.JdbcTemplate;

import dao_main.dao;
import model_insurance.mCarInsurance;
import model_insurance.mFireInsurance;
import model_insurnaceDesinging.mInsuranceDesinging;

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
	public void delete(String information) {
		String sql = "";

		jdbcTemplate.execute(sql);
	}

	@Override
	public void update(String information) {

	}

	@Override
	public void search(ArrayList<String> list) {}

	@Override
	public ArrayList<String> insertInfo() {
		SqlSession session = super.getSqlSession();
		List<mCarInsurance> output = session.selectList("carInsuranceMapper.insertInfo", "자동차보험");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("조회결과 없음.");
		} else {
			for (mCarInsurance item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getInsuranceMoney()));
			}
		}
		session.close();
		return info;
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
		session.insert("carInsuranceMapper.carInsert", input);

		session.commit();
		session.close();
	}

	public int findPayIn(String insuranceName) {
		SqlSession session = super.getSqlSession();
		System.out.println(insuranceName+" dao");
		mCarInsurance output = session.selectOne("carInsuranceMapper.findPayIn", insuranceName);
		int out = output.getPayment();
		session.commit();
		System.out.println(out+"왜 null이니");
		
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
