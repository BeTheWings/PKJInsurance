package entity;

import dao.onTheSeaInsuranceClientDaoImpl;
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

	public void run(int totalPrice, mOnTheSeaInsuranceRegistration mOnTheSeaInsuranceRegistration) {
		totalPrice = totalPrice*50000;
		mOnTheSeaInsuranceRegistration.setTotalPrice(totalPrice);
		this.onTheSeaInsuranceClientDaoImpl.insert(mOnTheSeaInsuranceRegistration);
	}

}
