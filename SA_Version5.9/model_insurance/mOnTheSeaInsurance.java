package model_insurance;

public class mOnTheSeaInsurance extends mInsurance {

	private String notes;
	private String SeaInsurancetype;
	private String insuranceName;
	private boolean longterm;

	public mOnTheSeaInsurance() {
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getSeaInsurancetype() {
		return SeaInsurancetype;
	}

	public void setSeaInsurancetype(String seaInsurancetype) {
		SeaInsurancetype = seaInsurancetype;
	}

	public boolean isLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
	}

}