package model_insurance;

import global.constant.eLandType;

public class mFireInsurance extends mInsurance {
	private String insuranceName;
	private String notes;
	private eLandType property;
	private String payIn;
	private String insuranceCategory;
	private boolean longterm;

	public mFireInsurance() {
	}

	public boolean isLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
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

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

}