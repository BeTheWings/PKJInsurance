package model_insurance;

public class mCarInsurance extends mInsurance {

	private String insuranceName;
	private String carNumber;
	private boolean longterm;

	public mCarInsurance() {
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public boolean isLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
	}

}