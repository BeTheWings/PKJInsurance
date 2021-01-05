package insurance;

import java.util.ArrayList;

import dao.carInsuranceDaoImpl;

public class carInsurance extends insurance {

	private ArrayList<String> info;
	private carInsuranceDaoImpl carInsuranceDaoImpl;
	private String insuranceName;
	private String carNumber;

	public carInsurance() {
		try {
			this.carInsuranceDaoImpl = new carInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.info = new ArrayList<String>();
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

	public ArrayList<String> insertInfo() {
		this.info = this.carInsuranceDaoImpl.insertInfo();
		return info;
	}

}