package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.client;
import insurance.insurance;

public class searchDaoImpl extends dao implements searchDao {

	private ArrayList<String> context;
	private String insuranceName;
	private int insuranceMoney;
	private String payIn;
	private String insurancePeriod;
	private String insuranceCategory;

	public searchDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<String> searchByAmount(String payIn) {
		this.context = new ArrayList<String>();
		SqlSession session = super.getSqlSession();

		List<insurance> output = session.selectList("searchMapper.searchByAmount", Integer.parseInt(payIn));

		if (output == null) {
			System.out.println("없음");
		} else {
			for (insurance item : output) {
				insuranceName = item.getName();
				insuranceCategory = item.getInsuranceCategory();
				insuranceMoney = item.getInsuranceID(); // insuranceMoney
				this.payIn = Integer.toString(item.getPayment());
				insurancePeriod = item.getInsurancePeriod(); // insurancePeriod

				this.context.add(insuranceName);
				this.context.add(insuranceCategory);
				this.context.add(this.payIn);
				this.context.add(Integer.toString(insuranceMoney));
				this.context.add(insurancePeriod);
			}
		}
		session.close();
		return context;

	}

	@Override
	public ArrayList<String> searchByCategory(String insuranceCategory) {
		this.context = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		List<insurance> output = session.selectList("searchMapper.searchByName", insuranceCategory);

		if (output == null) {
			System.out.println("없음");
		} else {
			for (insurance item : output) {
				this.insuranceName = item.getName();
				this.insuranceMoney = item.getInsuranceID(); // insuranceMoney
				this.payIn = Integer.toString(item.getPayment());
				this.insurancePeriod = item.getInsurancePeriod(); // insurancePeriod
				this.insuranceCategory = item.getInsuranceCategory();
				this.context.add(insuranceName);
				this.context.add(this.insuranceCategory);
				this.context.add(payIn);
				this.context.add(Integer.toString(insuranceMoney));
				this.context.add(insurancePeriod);

			}
		}
		session.close();
		return context;
	}

	@Override
	public ArrayList<String> searchByPeriod(String insurancePeriod) {
		this.context = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		List<insurance> output = session.selectList("searchMapper.searchByPeriod", insurancePeriod);

		if (output == null) {
			System.out.println("없음");
		} else {
			for (insurance item : output) {
				this.insuranceName = item.getName();
				this.insuranceCategory = item.getInsuranceCategory();
				this.insuranceMoney = item.getInsuranceID(); // insuranceMoney
				this.payIn = Integer.toString(item.getPayment());
				this.insurancePeriod = item.getInsurancePeriod(); // insurancePeriod

				this.context.add(insuranceName);
				this.context.add(insuranceCategory);
				this.context.add(payIn);
				this.context.add(Integer.toString(insuranceMoney));
				this.context.add(this.insurancePeriod);
			}
		}
		session.close();
		return context;
	}

	public ArrayList<String> inquiryForInsuranceWaitList(boolean statement) {
		this.context = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		List<insurance> output = session.selectList("InsuranceToolMapper.inquiryForInsuranceWaitList", statement);

		if (output == null) {

		} else {
			int count = 0;
			for (insurance item : output) {
				this.context.add(item.getName());
				this.context.add(Integer.toString(item.getInsuranceMoney()));
				this.context.add(Integer.toString(item.getPayment()));
				this.context.add(item.getInsurancePeriod());
				count++;
			}
		}
		session.close();
		return context;
	}

	public ArrayList<String> inquiryClientWaitList(boolean statement) {

		this.context = new ArrayList<String>();
		SqlSession session = super.getSqlSession();
		List<client> output = session.selectList("InsuranceToolClientMapper.inquiryClientWaitList", statement);

		if (output == null) {
			System.out.println("없음");
		} else {
			for (client item : output) {
				this.context.add(item.getInsuranceName());
				System.out.println(item.getInsuranceName());
				this.context.add(item.getClientName());
				this.context.add(item.getAge());
				this.context.add(item.getEmail());
				this.context.add(item.getAccidentContent());

			}
		}

		return context;

	}
}