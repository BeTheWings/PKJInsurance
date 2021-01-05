package control;

import dao.checkInsuranceDaoImpl;

public class cCheckInsurance {
	private checkInsuranceDaoImpl checkInsuranceDaoImpl;

	public cCheckInsurance() {
		this.checkInsuranceDaoImpl = new checkInsuranceDaoImpl();
	}

	public boolean searchInsurance() {
		boolean checker = this.checkInsuranceDaoImpl.find();
		return checker;
	}

}
