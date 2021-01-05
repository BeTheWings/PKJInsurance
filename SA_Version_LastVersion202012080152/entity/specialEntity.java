package entity;

import java.util.ArrayList;

import dao_insuranceRegistration.specialInsuranceClientDaoImpl;
import model_insuranceRegistration.mSpecialInsuranceRegistration;

public class specialEntity {
	private specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl;
	
	public specialEntity() {
		try {
			this.specialInsuranceClientDaoImpl = new specialInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(float totalPrice, mSpecialInsuranceRegistration mSpecialInsuranceRegistration) {
		float rate = Float.parseFloat(mSpecialInsuranceRegistration.getRate());
		totalPrice = totalPrice * rate;
		mSpecialInsuranceRegistration.setTotalPrice(totalPrice);
		this.specialInsuranceClientDaoImpl.insert(mSpecialInsuranceRegistration);
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
