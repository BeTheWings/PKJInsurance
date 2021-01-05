package insurnaceDesinging;

public class insuranceDesinging {
	private int insuranceID;
	private String insuranceName;
	private String insuranceCategory;
	private String payment;
	private String insurancePeriod;
	private String paymentMethod;
	private int insuranceMoney;
	private String notes;
	private String specialSubscription;
	private boolean waitList = true;
	private String subscriptionTarget;
	private boolean longTermPeriod;

	public insuranceDesinging() {
		this.insuranceName = null;
		this.insuranceCategory = null;
		this.payment = null;
		this.insurancePeriod = null;
		this.paymentMethod = null;
		this.notes = null;
		this.specialSubscription = null;
		this.subscriptionTarget = null;
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

	public void setNotes(String notes) {
		this.notes = notes;
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

	public String getNotes() {
		return notes;
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

}
