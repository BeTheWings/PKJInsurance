package insurnaceDesinging;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.onTheSeaInsuranceDaoImpl;

public class onTheSeaInsuranceDesinging {

	private String subscriptionTarget;
	private String payIn;
	private String insurancePeriod;
	private String paymentMethod;
	private String insuranceMoney;
	private String note;
	private String specialSubscription;
	private String SeaInsurancetype;
	private String SpecialType;
	private boolean waitList = true;
	private boolean longTermPeriod;
	private onTheSeaInsuranceDaoImpl onTheSeaInsuranceDao;
	private ArrayList<String> list = new ArrayList<String>();

	public onTheSeaInsuranceDesinging() {
		this.subscriptionTarget = null;
		this.payIn = null;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.insuranceMoney = null;
		this.note = null;
		this.specialSubscription = null;
		try {
			this.onTheSeaInsuranceDao = new onTheSeaInsuranceDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.list = new ArrayList<String>();
	}

	public void setSubscriptionTarget(String subscriptionTarget2) {
		this.subscriptionTarget = subscriptionTarget2;
	}

	public void setPayment(String payment2) {
		if (payment2 != null) {
			System.out.println(payment2);
			 this.payIn = payment2;
		}
	}

	public void setPeriod(String period) {

		this.insurancePeriod = period;

	}

	public void setPaymentMethod(String paymentMethod2) {
		this.paymentMethod = paymentMethod2;

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		System.out.println(this.insuranceMoney);
		 this.insuranceMoney = insurnaceMoney;
	}

	public void setNotes(String notes2) {
		this.note = notes2;

	}

	public void setSpecialSubscription(String specialSubscription2) {
		this.specialSubscription = specialSubscription2;

	}

	public boolean isLongtermPeriod() {
		return longTermPeriod;
	}

	public void setLongTermPeriod(boolean longTermPeriod) {
		this.longTermPeriod = longTermPeriod;
	}
	
	public void run() {
		this.list.add(this.subscriptionTarget);
		this.list.add(this.payIn);
		this.list.add(this.insurancePeriod);
		this.list.add(this.paymentMethod);
		this.list.add(this.insuranceMoney);
		this.list.add(this.note);
		this.list.add(this.specialSubscription);
		
		try {
			this.onTheSeaInsuranceDao.insert(this.list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
