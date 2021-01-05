package control;

import java.util.ArrayList;

import insurance.onTheSeaInsurance;

public class cOnTheSeaInsurance {

	private onTheSeaInsurance onTheSeaInsurance;
	private ArrayList<String> info;

	public cOnTheSeaInsurance() {
		this.info = new ArrayList<String>();
		this.onTheSeaInsurance = new onTheSeaInsurance();
	}

	public ArrayList<String> insertInfo() {
		this.info = onTheSeaInsurance.insertInfo();
	System.out.println(info);
		return info;
	}

}
