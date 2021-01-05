package entity;

import java.util.ArrayList;

import dao_insuranceRegistration.fireInsuranceClientDaoImpl;
import model_insuranceRegistration.mFireInsuranceRegistration;

public class fireEntity {
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;

	public fireEntity() {
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void run(float totalPrice, mFireInsuranceRegistration mFireInsuranceRegistration) {
		float rate = Float.parseFloat(mFireInsuranceRegistration.getRate());
		totalPrice = totalPrice * rate;
		mFireInsuranceRegistration.setTotalPrice(totalPrice);
		System.out.println(totalPrice + " 납입비 계산완료");
		this.fireInsuranceClientDaoImpl.insert(mFireInsuranceRegistration);
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
