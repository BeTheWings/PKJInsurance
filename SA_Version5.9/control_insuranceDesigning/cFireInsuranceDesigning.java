package control_insuranceDesigning;

import java.util.ArrayList;

import model_insurnaceDesinging.mInsuranceDesinging;

public class cFireInsuranceDesigning {

	private mInsuranceDesinging insuranceDesingingVO;

	public cFireInsuranceDesigning() {
		this.insuranceDesingingVO = new mInsuranceDesinging();
	}

	public void setData(ArrayList<String> data) {
		String insuranceName = data.get(0);
		this.insuranceDesingingVO.setInsuranceName(insuranceName);
		String subscriptionTarget = data.get(1);
		this.insuranceDesingingVO.setSubscriptionTarget(subscriptionTarget);
		String payment = data.get(2);
		this.insuranceDesingingVO.setPayment(payment);
		String period = data.get(3);
		this.insuranceDesingingVO.setPeriod(period);
		String paymentMethod = data.get(4);
		this.insuranceDesingingVO.setPaymentMethod(paymentMethod);
		String insuranceMoney = data.get(5);
		this.insuranceDesingingVO.setInsuranceMoney(Integer.parseInt(insuranceMoney));
		String Note = data.get(6);
		this.insuranceDesingingVO.setNote(Note);
		String specialSubscription = data.get(7);
		this.insuranceDesingingVO.setSpecialSubscription(specialSubscription);
		String check1 = data.get(8);
		
		if (check1.equals("가능")) {
			this.insuranceDesingingVO.setLongtermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.insuranceDesingingVO.setLongtermPeriod(false);
		}
		this.insuranceDesingingVO.setInsuranceCategory("화재보험");
		
		this.insuranceDesingingVO.fireInsert(this.insuranceDesingingVO);
	}

}
