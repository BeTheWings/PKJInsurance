package control;

import insurnaceDesinging.carInsuranceDesigning;

public class cCarInsuranceDesinging {

	private carInsuranceDesigning carInsurnaceDesigning;

	public cCarInsuranceDesinging() {

		this.carInsurnaceDesigning = new carInsuranceDesigning();
	}

	public void setSubscriptionTarget(String subscriptionTarget) {

		this.carInsurnaceDesigning.setSubscriptionTarget(subscriptionTarget);
	}

	public void setPayment(String payment) {
		this.carInsurnaceDesigning.setPayment(payment);

	}

	public void setPeriod(String period) {
		this.carInsurnaceDesigning.setPeriod(period);

	}

	public void setPaymentMethod(String paymentMethod) {
		this.carInsurnaceDesigning.setPaymentMethod(paymentMethod);

	}

	public void setInsurnaceMoney(String insurnaceMoney) {
		this.carInsurnaceDesigning.setInsurnaceMoney(insurnaceMoney);

	}

	public void setNotes(String notes) {
		this.carInsurnaceDesigning.setNotes(notes);

	}

	public void setSpecialSubscription(String SpecialSubscription) {
		this.carInsurnaceDesigning.setSpecialSubscription(SpecialSubscription);

	}

	public void setLongtermPeriod(String check1) {
		if (check1.equals("가능")) {
			this.carInsurnaceDesigning.setLongtermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.carInsurnaceDesigning.setLongtermPeriod(false);
		}
	}

	public void runcarInsurnaceDesign() {
		this.carInsurnaceDesigning.run();

	}

}