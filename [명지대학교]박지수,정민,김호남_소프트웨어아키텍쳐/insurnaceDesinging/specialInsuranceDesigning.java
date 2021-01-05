package insurnaceDesinging;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.specialInsuranceDaoImpl;

public class specialInsuranceDesigning {
	private String subscriptionTarget;
	private String payment;
	private String insurancePeriod;
	private String paymentMethod;
	private String insuranceMoney;
	private String note;
	private String specialSubscription;
	private boolean waitList = true;
	private boolean longtermPeriod;
	
	private ArrayList<String> list;
	
	private specialInsuranceDaoImpl specialInsuranceDao;

	public specialInsuranceDesigning() {
		try {
			this.specialInsuranceDao = new specialInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.subscriptionTarget = null;
		this.payment = null;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.insuranceMoney = null;
		this.note = null;
		this.specialSubscription = null;
		this.list = new ArrayList<String>();
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
		this.note = notes2;
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
		this.list.add(this.note);
		this.list.add(this.specialSubscription);
		
		try {
			this.specialInsuranceDao.insert(this.list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}