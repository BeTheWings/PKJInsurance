package control_insuranceDesigning;

import java.util.ArrayList;

import model_insurnaceDesinging.mInsuranceDesinging;

public class cFireInsuranceDesigning {

	private mInsuranceDesinging mInsuranceDesinging;

	public cFireInsuranceDesigning() {
		this.mInsuranceDesinging = new mInsuranceDesinging();
	}

	public void setData(ArrayList<String> data) {
		String insuranceName = data.get(0);
		this.mInsuranceDesinging.setInsuranceName(insuranceName);
		String subscriptionTarget = data.get(1);
		this.mInsuranceDesinging.setSubscriptionTarget(subscriptionTarget);
		String payment = data.get(2);
		this.mInsuranceDesinging.setPayment(payment);
		String period = data.get(3);
		this.mInsuranceDesinging.setPeriod(period);
		String paymentMethod = data.get(4);
		this.mInsuranceDesinging.setPaymentMethod(paymentMethod);
		String insuranceMoney = data.get(5);
		this.mInsuranceDesinging.setInsuranceMoney(Integer.parseInt(insuranceMoney));
		String Note = data.get(6);
		this.mInsuranceDesinging.setNote(Note);
		String specialSubscription = data.get(7);
		this.mInsuranceDesinging.setSpecialSubscription(specialSubscription);
		String check1 = data.get(8);
		
		if (check1.equals("가능")) {
			this.mInsuranceDesinging.setLongtermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.mInsuranceDesinging.setLongtermPeriod(false);
		}
		this.mInsuranceDesinging.setInsuranceCategory("화재보험");
		
		this.mInsuranceDesinging.fireInsert(this.mInsuranceDesinging);
	}

}
