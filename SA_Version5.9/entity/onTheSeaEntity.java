package entity;

import java.util.ArrayList;

import dao_insuranceRegistration.onTheSeaInsuranceClientDaoImpl;
import model_insuranceRegistration.mOnTheSeaInsuranceRegistration;

public class onTheSeaEntity {
	private onTheSeaInsuranceClientDaoImpl onTheSeaInsuranceClientDaoImpl;
	
	public onTheSeaEntity() {
		try {
			this.onTheSeaInsuranceClientDaoImpl = new onTheSeaInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(float totalPrice, mOnTheSeaInsuranceRegistration mOnTheSeaInsuranceRegistration) {
		float rate = Float.parseFloat(mOnTheSeaInsuranceRegistration.getRate());
		totalPrice = totalPrice * rate;
		mOnTheSeaInsuranceRegistration.setTotalPrice(totalPrice);
		this.onTheSeaInsuranceClientDaoImpl.insert(mOnTheSeaInsuranceRegistration);
	}

	public boolean checkName(String name, ArrayList<String> result) {
		boolean finalcheck = false;

		for(int i =0; i<result.size(); i++) {
			if(name.equals(result.get(i))) {
				finalcheck = true;
				break;
			} else finalcheck = false;
		}
		return finalcheck;
	}

}
