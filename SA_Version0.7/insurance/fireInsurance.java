package insurance;

import java.util.ArrayList;

import dao.fireInsuranceDaoImpl;
import global.constant.eLandType;

public class fireInsurance extends insurance {
	private ArrayList<String> info;
	private String insuranceName;
	private String notes;
	private eLandType property;
	private fireInsuranceDaoImpl fireInsuranceDaoImpl;
	private String payIn;

	public fireInsurance() {
		try {
			this.fireInsuranceDaoImpl = new fireInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.info = new ArrayList<String>();
	}

	public String getPayIn() {
		return payIn;
	}

	public void setPayIn(String payIn) {
		this.payIn = payIn;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public eLandType getProperty() {
		return property;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public ArrayList<String> insertInfo() {
		this.info = this.fireInsuranceDaoImpl.insertInfo();
		return info;

	}
}