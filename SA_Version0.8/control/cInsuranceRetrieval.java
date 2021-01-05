package control;

import java.util.ArrayList;

import insurnaceTool.insuranceRetrieval;

public class cInsuranceRetrieval {

	private insuranceRetrieval insuranceRetrieval;
	private ArrayList<String> insuranceInformationList;

	public cInsuranceRetrieval() {
		this.insuranceRetrieval = new insuranceRetrieval();
		this.insuranceInformationList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(String searchType, String searchMethod) {

		if (searchType == "�����̸�") {
			this.insuranceInformationList = this.insuranceRetrieval.searchForInsuranceName(searchMethod);

		} else if (searchType == "����Ⱓ") {
			this.insuranceRetrieval.searchByPeriod(searchMethod);
		} else if (searchType == "���谡��") {
			this.insuranceInformationList = this.insuranceRetrieval.searchByAmount(searchMethod);
		}
		return insuranceInformationList;
	}

	public void setText(String text) {
		this.insuranceRetrieval.setText(text);
	}

}
