package control;

import java.util.ArrayList;

import dao.specialInsuranceDaoImpl;
import insurnaceDesinging.insuranceDesinging;

public class cSpecialInsurnaceDesigning {
	private insuranceDesinging insuranceDesinging;
	private specialInsuranceDaoImpl specialInsurnaceDao;

	public cSpecialInsurnaceDesigning() {
		this.insuranceDesinging = new insuranceDesinging();
		try {
			this.specialInsurnaceDao = new specialInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setData(ArrayList<String> data) {
		String insuranceName = data.get(0);
		this.insuranceDesinging.setInsuranceName(insuranceName);
		String subscriptionTarget = data.get(1);
		this.insuranceDesinging.setSubscriptionTarget(subscriptionTarget);
		String payment = data.get(2);
		this.insuranceDesinging.setPayment(payment);
		String period = data.get(3);
		this.insuranceDesinging.setPeriod(period);
		String paymentMethod = data.get(4);
		this.insuranceDesinging.setPaymentMethod(paymentMethod);
		String insuranceMoney = data.get(5);
		this.insuranceDesinging.setInsuranceMoney(Integer.parseInt(insuranceMoney));
		String Note = data.get(6);
		this.insuranceDesinging.setNote(Note);
		String specialSubscription = data.get(7);
		this.insuranceDesinging.setSpecialSubscription(specialSubscription);
		String check1 = data.get(8);
		if (check1.equals("가능")) {
			this.insuranceDesinging.setLongtermPeriod(true);
		} else if (check1.equals("불가능")) {
			this.insuranceDesinging.setLongtermPeriod(false);
		}
		this.insuranceDesinging.setInsuranceCategory("특종보험");
		this.specialInsurnaceDao.insert(this.insuranceDesinging);
	}

}