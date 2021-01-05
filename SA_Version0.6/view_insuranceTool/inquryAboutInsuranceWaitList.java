package view_insuranceTool;

import java.util.ArrayList;

import dao.searchDaoImpl;
import insurance.insuranceList;
import insurance.insuranceListImpl;

public class inquryAboutInsuranceWaitList {

	public insuranceList insuranceList;
	private searchDaoImpl searchDaoImpl;
	private ArrayList<String> insuranceWaitList;

	public inquryAboutInsuranceWaitList() {

		this.insuranceWaitList = new ArrayList<String>();
		this.insuranceList = new insuranceListImpl();

		try {
			this.searchDaoImpl = new searchDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<String> searchForInsuranceWaitList(boolean searchMethod) {
		this.insuranceWaitList = this.searchDaoImpl.inquiryForInsuranceWaitList(searchMethod);

		return insuranceWaitList;
	}

}
