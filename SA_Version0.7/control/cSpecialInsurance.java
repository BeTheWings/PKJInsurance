package control;

import java.util.ArrayList;

public class cSpecialInsurance {

	private ArrayList<String> info;
	private insurance.specialInsurance specialInsurance;

	public cSpecialInsurance() {
		this.info = new ArrayList<String>();
		this.specialInsurance = new insurance.specialInsurance();

	}

	public ArrayList<String> insertInfo() {
		this.info = this.specialInsurance.insertInfo();
		return this.info;
	}
}
