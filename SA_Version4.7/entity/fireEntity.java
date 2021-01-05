package entity;

import dao.fireInsuranceClientDaoImpl;
import model_insuranceRegistration.mFireInsuranceRegistration;

public class fireEntity {
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;
	public fireEntity() {
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run(int totalPrice, mFireInsuranceRegistration mFireInsuranceRegistration) {
		totalPrice = totalPrice*50000;
		mFireInsuranceRegistration.setTotalPrice(totalPrice);
		this.fireInsuranceClientDaoImpl.insert(mFireInsuranceRegistration);
	}

}
