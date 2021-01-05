package control;

import java.util.ArrayList;

import dao.carInsuranceDaoImpl;
import model_insurnaceDesinging.mInsuranceDesinging;

public class cCarInsuranceDesinging {

	private mInsuranceDesinging insuranceDesingingVO;
	private carInsuranceDaoImpl carInsuranceDao;

	public cCarInsuranceDesinging() {
		this.insuranceDesingingVO = new mInsuranceDesinging();
		try {
			this.carInsuranceDao = new carInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		this.insuranceDesingingVO.setInsuranceCategory("자동차보험");
		
		this.carInsuranceDao.insert(this.insuranceDesingingVO);

	}

}