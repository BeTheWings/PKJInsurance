package insurance;

import java.util.ArrayList;

import dao.specialInsuranceDaoImpl;

public class specialInsurance extends insurance {

	private ArrayList<String> info;
	private String insuranceName;
	private String notes;
	private String SpecialType;
	private specialInsuranceDaoImpl specialInsuranceDaoImpl;

	public specialInsurance() {
		try {
			this.specialInsuranceDaoImpl = new specialInsuranceDaoImpl();
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getSpecialType() {
		return SpecialType;
	}

	public void setSpecialType(String specialType) {
		SpecialType = specialType;
	}

	public ArrayList<String> insertInfo() {
		this.info = this.specialInsuranceDaoImpl.insertInfo();
		return info;
	}
}