package insurance;

public class carInsuranceVO extends insuranceVO {

	private String insuranceName;
	private String carNumber;
	private boolean longterm;

	public carInsuranceVO() {
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