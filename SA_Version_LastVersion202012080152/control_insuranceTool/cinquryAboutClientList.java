package control_insuranceTool;

import java.util.ArrayList;

import model_client.mClient;

public class cinquryAboutClientList {
	private ArrayList<String> clientInforamtonList;
	// private searchAboutClientInformationVO searchAboutClientInformation;
	private mClient mClient;

	public cinquryAboutClientList() {
		this.clientInforamtonList = new ArrayList<String>();
		this.mClient = new mClient();
	}

	public ArrayList<String> searchInformation(String name, String idNumber) {// Á¶È¸

		this.mClient.setClientName(name);
		this.mClient.setResidentRegistrationNumber(idNumber);
		this.mClient.searchForClientInfor();
		this.clientInforamtonList = this.mClient.getClientList();

		return clientInforamtonList;
	}

	public void withDraw(String insuranceCategory, String ClientName, String insuranceName) {// Å»Åð
		this.mClient.setInsuranceCategory(insuranceCategory);
		this.mClient.setClientName(ClientName);
		this.mClient.setInsuranceName(insuranceName);
		this.mClient.withdraw();

	}
}