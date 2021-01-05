package insurance;

import java.util.ArrayList;

import dao.onTheSeaInsuranceDaoImpl;

public class onTheSeaInsurance extends insurance {

	private String notes;
	private String SeaInsurancetype;
	private String insuranceName;
	private ArrayList<String> info;
	private onTheSeaInsuranceDaoImpl onTheSeaDaoImpl;
	private boolean longterm;

	public onTheSeaInsurance() {
		this.info = new ArrayList<String>();
		try {
			this.onTheSeaDaoImpl = new onTheSeaInsuranceDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public ArrayList<String> insertInfo() {
		this.info = onTheSeaDaoImpl.insertInfo();

		return info;
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

}