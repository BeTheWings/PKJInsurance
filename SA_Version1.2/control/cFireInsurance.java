package control;

import java.util.ArrayList;

import insurance.fireInsurance;

public class cFireInsurance {

	private fireInsurance fireInsurance;
	private ArrayList<String> info;

	public cFireInsurance() {
		this.fireInsurance = new fireInsurance();
		this.info = new ArrayList<String>();
	}

	public ArrayList<String> insertInfo() {
		//여기서 dao로 바로가야됨
		this.info = this.fireInsurance.insertInfo();
		
		return info;
	}

	public void association() {
		// TODO Auto-generated method stub

	}

}
