package control;

import java.util.ArrayList;

import dao.onTheSeaInsuranceDaoImpl;
import insurance.onTheSeaInsurance;

public class cOnTheSeaInsurance {

	private onTheSeaInsurance onTheSeaInsurance;
	private onTheSeaInsuranceDaoImpl onTheSeaInsuranceDaoImpl;
	private ArrayList<String> info;

	public cOnTheSeaInsurance() {
		this.info = new ArrayList<String>();
		this.onTheSeaInsurance = new onTheSeaInsurance();
		try {
			this.onTheSeaInsuranceDaoImpl = new onTheSeaInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public insurance.onTheSeaInsurance insertInfo() {
		this.info = this.onTheSeaInsuranceDaoImpl.insertInfo();

		if (!this.info.isEmpty()) {
			String subscriptionT = this.info.get(0);
			onTheSeaInsurance.setSubscriptionTarget(subscriptionT);
			String insurancePeriod = this.info.get(1);
			onTheSeaInsurance.setInsurancePeriod(insurancePeriod);
			int money = Integer.parseInt(this.info.get(2));
			onTheSeaInsurance.setInsuranceMoney(money);
			onTheSeaInsurance.setArraySize(true);
		} else {
			onTheSeaInsurance.setArraySize(false);
		}
		return onTheSeaInsurance;
	}

}
