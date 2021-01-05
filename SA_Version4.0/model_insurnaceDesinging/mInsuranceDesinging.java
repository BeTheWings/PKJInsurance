package model_insurnaceDesinging;

import dao.carInsuranceDaoImpl;
import dao.fireInsuranceDaoImpl;
import dao.onTheSeaInsuranceDaoImpl;
import dao.specialInsuranceDaoImpl;

public class mInsuranceDesinging {
	private int insuranceID;
	private String insuranceName;
	private String insuranceCategory;
	private String payment;
	private String insurancePeriod;
	private String paymentMethod;
	private int insuranceMoney;
	private String note;
	private String notes;
	private String specialSubscription;
	private boolean waitList = true;
	private String subscriptionTarget;
	private boolean longTermPeriod;
	private fireInsuranceDaoImpl fireInsuranceDao;
	private onTheSeaInsuranceDaoImpl onTheSeaInsuranceDao;
	private carInsuranceDaoImpl carInsuranceDao;
	private specialInsuranceDaoImpl specialInsurnaceDao;

	public mInsuranceDesinging() {
		this.insuranceName = null;
		this.insuranceCategory = null;
		this.payment = null;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.note = null;
		this.specialSubscription = null;
		this.subscriptionTarget = null;

		try {
			this.fireInsuranceDao = new fireInsuranceDaoImpl();
			this.onTheSeaInsuranceDao = new onTheSeaInsuranceDaoImpl();
			this.carInsuranceDao = new carInsuranceDaoImpl();
			this.specialInsurnaceDao = new specialInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
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

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void setSpecialSubscription(String specialSubscription2) {
		this.specialSubscription = specialSubscription2;
	}

	public void setLongtermPeriod(boolean longTermPeriod) {
		this.longTermPeriod = longTermPeriod;
	}

	public boolean isLongtermPeriod() {
		return longTermPeriod;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public String getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(String insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

	public int getInsuranceMoney() {
		return insuranceMoney;
	}

	public void setInsuranceMoney(int insuranceMoney) {
		this.insuranceMoney = insuranceMoney;
	}

	public boolean isWaitList() {
		return waitList;
	}

	public void setWaitList(boolean waitList) {
		this.waitList = waitList;
	}

	public boolean isLongTermPeriod() {
		return longTermPeriod;
	}

	public void setLongTermPeriod(boolean longTermPeriod) {
		this.longTermPeriod = longTermPeriod;
	}

	public String getPayment() {
		return payment;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getSpecialSubscription() {
		return specialSubscription;
	}

	public String getSubscriptionTarget() {
		return subscriptionTarget;
	}

	public int getInsuranceID() {
		return insuranceID;
	}

	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}

	public void insertData() {
		if (this.insuranceCategory.equals("화재보험")) {
			this.fireInsuranceDao.insert(this);
		} else if (this.insuranceCategory.equals("해상보험")) {
			this.onTheSeaInsuranceDao.insert(this);
		} else if (this.insuranceCategory.equals("특종보험")) {
			this.specialInsurnaceDao.insert(this);
		} else if (this.insuranceCategory.equals("자동차보험")) {
			this.carInsuranceDao.insert(this);
		}

	}
}
