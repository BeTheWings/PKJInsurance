package control;

import java.util.ArrayList;

import dao.specialInsuranceDaoImpl;

public class cSpecialInsurance {

	private ArrayList<String> info;
	private insurance.specialInsurance specialInsurance;
	private specialInsuranceDaoImpl specialInsuranceDaoImpl;

	public cSpecialInsurance() {
		this.info = new ArrayList<String>();
		this.specialInsurance = new insurance.specialInsurance();
		try {
			this.specialInsuranceDaoImpl = new specialInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public insurance.specialInsurance insertInfo() {
		this.info = this.specialInsuranceDaoImpl.insertInfo();

		if (!this.info.isEmpty()) {
			String subscriptionT = this.info.get(0);
			specialInsurance.setSubscriptionTarget(subscriptionT);
			String insurancePeriod = this.info.get(1);
			specialInsurance.setInsurancePeriod(insurancePeriod);
			int money = Integer.parseInt(this.info.get(2));
			specialInsurance.setInsuranceMoney(money);
			specialInsurance.setArraySize(true);
		}else {
			specialInsurance.setArraySize(false);
		}

		return specialInsurance;
	}
}
