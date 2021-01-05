package control_insuranceTool;

import java.util.ArrayList;

import model_insurnaceTool.mInsuranceRetrieval;

public class cInsuranceRetrieval {

	private mInsuranceRetrieval insuranceRetrieval;
	private ArrayList<String> insuranceInformationList;

	public cInsuranceRetrieval() {
		this.insuranceRetrieval = new mInsuranceRetrieval();
		this.insuranceInformationList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(String searchType, String searchMethod) {

		if (searchType == "보험카테고리") {
			this.insuranceInformationList = this.insuranceRetrieval.searchForInsuranceName(searchMethod);
		} else if (searchType == "보험기간") {
			this.insuranceInformationList = this.insuranceRetrieval.searchByPeriod(searchMethod);
		} else if (searchType == "보험가격") {
			this.insuranceInformationList = this.insuranceRetrieval.searchByAmount(searchMethod);
		}
		return insuranceInformationList;
	}

	public void setText(String text) {
		this.insuranceRetrieval.setText(text);
	}

}
