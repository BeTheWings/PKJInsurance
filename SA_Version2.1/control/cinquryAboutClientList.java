package control;

import java.util.ArrayList;

import client.clientVO;

public class cinquryAboutClientList {
	private ArrayList<String> clientInforamtonList;
	// private searchAboutClientInformationVO searchAboutClientInformation;
	private clientVO clientVO;

	public cinquryAboutClientList() {
		this.clientInforamtonList = new ArrayList<String>();
		this.clientVO = new clientVO();
	}

	public ArrayList<String> searchInformation(String name, String idNumber) {// Á¶È¸

		this.clientVO.setClientName(name);
		this.clientVO.setResidentRegistrationNumber(idNumber);
		this.clientVO.searchForClientInfor();
		this.clientInforamtonList = this.clientVO.getClientList();

		return clientInforamtonList;
	}

	public void withDraw(String insuranceCategory, String ClientName, String insuranceName) {// Å»Åð
		this.clientVO.setInsuranceCategory(insuranceCategory);
		this.clientVO.setClientName(ClientName);
		this.clientVO.setInsuranceName(insuranceName);
		this.clientVO.withdraw();

	}
}