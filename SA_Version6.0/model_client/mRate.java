package model_client;

import java.sql.SQLException;

import dao_insuranceRegistration.pdDaoImpl;

public class mRate {

	private String job;
	private String rate;
	private pdDaoImpl pdDaoImpl;
	private String rate2;

	public mRate() {
		try {
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String searchRate(String job) {
		this.job = job;

		try {
			mRate list = pdDaoImpl.searchJob(this);
			rate2 = list.getRate();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rate2;
	}

}
