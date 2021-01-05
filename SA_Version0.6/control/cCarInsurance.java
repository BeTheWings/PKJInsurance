package control;

import java.util.ArrayList;

import insurance.carInsurance;

public class cCarInsurance {

	private ArrayList<String> info;
	private carInsurance carInsurance;
	
	public cCarInsurance() {
		this.info = new ArrayList<String>();
		this.carInsurance = new carInsurance();
	}

	public ArrayList<String> insertInfo() {
		this.info = this.carInsurance.insertInfo();
		return info;
	}
	
	
}
