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
		//���⼭ dao�� �ٷΰ��ߵ�
		this.info = this.fireInsurance.insertInfo();
		
		return info;
	}

	public void association() {
		// TODO Auto-generated method stub

	}

}
