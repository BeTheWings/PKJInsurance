package entity;

import dao.specialInsuranceClientDaoImpl;
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

	public void run(int totalPrice, mSpecialInsuranceRegistration mSpecialInsuranceRegistration) {
		totalPrice = totalPrice*50000;
		mSpecialInsuranceRegistration.setTotalPrice(totalPrice);
		this.specialInsuranceClientDaoImpl.insert(mSpecialInsuranceRegistration);
	}

}
