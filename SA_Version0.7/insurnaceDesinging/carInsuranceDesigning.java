package insurnaceDesinging;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.carInsuranceDaoImpl;
import insurance.insurance;

public class carInsuranceDesigning {
	private String subscriptionTarget;
	private String payment;
	private String insurancePeriod;
	private String paymentMethod;
	private String insuranceMoney;
	private String notes;
	private String specialSubscription;
	private boolean waitList = true;
	private boolean longtermPeriod;
	
	private ArrayList<String> list;
	
	private carInsuranceDaoImpl carInsuranceDao;

	public carInsuranceDesigning() {
		this.subscriptionTarget = null;
		this.payment = null;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.insuranceMoney = null;
		this.notes = null;
		this.specialSubscription = null;
		
		this.list = new ArrayList<String>();

		try {
			this.carInsuranceDao = new carInsuranceDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setSubscriptionTarget(String subscriptionTarget2) {
		this.subscriptionTarget = subscriptionTarget2;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public void setPeriod(String period) {
		this.insurancePeriod = period;
	}

	public void setPaymentMethod(String paymentMethod2) {
		this.paymentMethod = paymentMethod2;
	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		 this.insuranceMoney = insurnaceMoney;
	}
	
	public void setNotes(String notes2) {
		this.notes = notes2;
	}

	public void setSpecialSubscription(String specialSubscription2) {
		this.specialSubscription = specialSubscription2;
	}

	public boolean isLongtermPeriod() {
		return longtermPeriod;
	}

	public void setLongtermPeriod(boolean longTermPeriod) {
		this.longtermPeriod = longTermPeriod;
	}

	public void run() {
		this.list.add(this.subscriptionTarget);
		this.list.add(this.payment);
		this.list.add(this.insurancePeriod);
		this.list.add(this.paymentMethod);
		this.list.add(this.insuranceMoney);
		this.list.add(this.notes);
		this.list.add(this.specialSubscription);
		
		try {
			this.carInsuranceDao.insert(this.list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}