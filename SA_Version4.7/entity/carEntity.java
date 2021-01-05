package entity;

import dao.carInsuranceClientDaoImpl;
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

	public void run(int totalPrice, mCarInsuranceRegistration mCarInsuranceRegistration) {
		totalPrice = totalPrice*50000;
		mCarInsuranceRegistration.setTotalPrice(totalPrice);
		this.carInsuranceClientDaoImpl.insert(mCarInsuranceRegistration);
	}

}
