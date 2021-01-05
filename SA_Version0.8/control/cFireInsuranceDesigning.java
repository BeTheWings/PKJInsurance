package control;

import insurnaceDesinging.fireInsuranceDesinging;

public class cFireInsuranceDesigning {

	private fireInsuranceDesinging fireInsuranceDesinging;

	public cFireInsuranceDesigning() {

		this.fireInsuranceDesinging = new fireInsuranceDesinging();
	}

	public void setPayment(String payment) {
		this.fireInsuranceDesinging.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.fireInsuranceDesinging.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.fireInsuranceDesinging.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.fireInsuranceDesinging.setInsurnaceMoney(insurnaceMoney);

	}

	public void setNotes(String notes) {
		this.fireInsuranceDesinging.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.fireInsuranceDesinging.setSpecialSubscription(SpecialSubscription);

	}

	public void setSubscriptionTarget(String text) {
		this.fireInsuranceDesinging.setSubscriptionTarget(text);

	}

	public void setLongtermPeriod(String check1) {
		if (check1.equals("가능")) {
			this.fireInsuranceDesinging.setLongtermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.fireInsuranceDesinging.setLongtermPeriod(false);
		}
	}

	public void runFireInsurnaceDesign() {
		this.fireInsuranceDesinging.run();
	}

}
