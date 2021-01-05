package control;

import java.util.ArrayList;

import view_insuranceTool.inquryAboutInsuranceWaitList;

public class cinquryAboutInsuranceWaitList {

	private ArrayList<String> insuranceInformationList;
	private inquryAboutInsuranceWaitList inquryAboutInsuranceWaitList;

	public cinquryAboutInsuranceWaitList() {
		this.inquryAboutInsuranceWaitList = new inquryAboutInsuranceWaitList();
		this.insuranceInformationList = new ArrayList<String>();

	}

	public ArrayList<String> searchInformation(boolean searchMethod) {
		this.insuranceInformationList = this.inquryAboutInsuranceWaitList.searchForInsuranceWaitList(searchMethod);
		return insuranceInformationList;
	}

}
