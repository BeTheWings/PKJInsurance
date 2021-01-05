package insurance;

public class specialInsuranceVO extends insuranceVO {

	private String insuranceName;
	private String notes;
	private String SpecialType;
	private boolean longterm;

	public specialInsuranceVO() {
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

	public boolean isLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
	}

}