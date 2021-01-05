package control;

import insurnaceDesinging.onTheSeaInsuranceDesinging;

public class cOnTheSeaInsuranceDesinging {

	private onTheSeaInsuranceDesinging onTheSeaInsuranceDesigning;

	public cOnTheSeaInsuranceDesinging() {

		this.onTheSeaInsuranceDesigning = new onTheSeaInsuranceDesinging();
	}

	public void setSubscriptionTarget(String subscriptionTarget) {

		this.onTheSeaInsuranceDesigning.setSubscriptionTarget(subscriptionTarget);
	}

	public void setPayment(String payment) {
		this.onTheSeaInsuranceDesigning.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.onTheSeaInsuranceDesigning.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.onTheSeaInsuranceDesigning.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.onTheSeaInsuranceDesigning.setInsurnaceMoney(insurnaceMoney);

	}
	
	public void setNotes(String notes) {
		this.onTheSeaInsuranceDesigning.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.onTheSeaInsuranceDesigning.setSpecialSubscription(SpecialSubscription);

	}

	public void setLongtermPeriod(String check1) {
		if (check1.equals("가능")) {
			this.onTheSeaInsuranceDesigning.setLongTermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.onTheSeaInsuranceDesigning.setLongTermPeriod(false);
		}
	}

	public void runOnTheSeaInsurnaceDesign() {
		this.onTheSeaInsuranceDesigning.run();

	}

}
