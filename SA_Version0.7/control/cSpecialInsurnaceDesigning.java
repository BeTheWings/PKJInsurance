package control;

import insurnaceDesinging.specialInsuranceDesigning;

public class cSpecialInsurnaceDesigning {
	private specialInsuranceDesigning specialInsuranceDesigning;

	public cSpecialInsurnaceDesigning() {
		this.specialInsuranceDesigning = new specialInsuranceDesigning();

	}

	public void setSubscriptionTarget(String subscriptionTarget) {

		this.specialInsuranceDesigning.setSubscriptionTarget(subscriptionTarget);
	}

	public void setPayment(String payment) {
		this.specialInsuranceDesigning.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.specialInsuranceDesigning.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.specialInsuranceDesigning.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.specialInsuranceDesigning.setInsurnaceMoney(insurnaceMoney);

	}

	public void setNotes(String notes) {
		this.specialInsuranceDesigning.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.specialInsuranceDesigning.setSpecialSubscription(SpecialSubscription);

	}

	public void runcSpecialInsurnace() {
		this.specialInsuranceDesigning.run();

	}

	public void setLongtermPeriod(String check1) {
		if (check1.equals("가능")) {
			this.specialInsuranceDesigning.setLongtermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.specialInsuranceDesigning.setLongtermPeriod(false);
		}
	}
}