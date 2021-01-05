package control;

import java.util.ArrayList;

import dao.searchDaoImpl;

public class cInsuranceRetrieval {

	private ArrayList<String> insuranceInformationList;
	private searchDaoImpl searchDaoImpl;

	public cInsuranceRetrieval() {
		try {
			this.searchDaoImpl = new searchDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.insuranceInformationList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(String searchType, String searchMethod) {

		if (searchType == "보험종류") {
			this.insuranceInformationList = this.searchDaoImpl.searchByCategory(searchMethod);
		} else if (searchType == "보험기간") {
			this.insuranceInformationList = this.searchDaoImpl.searchByPeriod(searchMethod);
		} else if (searchType == "보험가격") {
			this.insuranceInformationList = this.searchDaoImpl.searchByAmount(searchMethod);
		}
		return insuranceInformationList;
	}

}
