package entity;

import java.util.ArrayList;

import dao_insuranceRegistration.carInsuranceClientDaoImpl;
import model_insuranceRegistration.mCarInsuranceRegistration;

public class carEntity {
	private carInsuranceClientDaoImpl carInsuranceClientDaoImpl;
	public carEntity() {
		try {
			this.carInsuranceClientDaoImpl = new carInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(float totalPrice, mCarInsuranceRegistration mCarInsuranceRegistration) {
		float rate = Float.parseFloat(mCarInsuranceRegistration.getRate());
		totalPrice = totalPrice * rate;
		mCarInsuranceRegistration.setTotalPrice(totalPrice);
		this.carInsuranceClientDaoImpl.insert(mCarInsuranceRegistration);
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
