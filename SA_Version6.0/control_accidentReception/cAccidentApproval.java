package control_accidentReception;

import java.util.ArrayList;

import model_accidentReception.mAccidentApproval;

public class cAccidentApproval {
	private mAccidentApproval accidentApproval;

	private ArrayList<String> information;

	public cAccidentApproval() {

		this.accidentApproval = new mAccidentApproval();
	}

	public void sendDenialMessage(int i) {
		// °ÅÀý
		this.accidentApproval.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// ½ÂÀÎ
		this.accidentApproval.sendAcceptMessage(i);
	}

	public void acceptRequest(String clientName, String insuranceName, String insuranceCategory) {
		this.accidentApproval.setClientName(clientName);
		this.accidentApproval.setInsuranceName(insuranceName);
		this.accidentApproval.setInsuranceCategory(insuranceCategory);
		this.accidentApproval.acceptRequest();
	}

	public void denialRequest(String clientName, String insuranceName, String insuranceCategory) {
		this.accidentApproval.setClientName(clientName);
		this.accidentApproval.setInsuranceName(insuranceName);
		this.accidentApproval.setInsuranceCategory(insuranceCategory);
		this.accidentApproval.acceptRequest();
	}

	public ArrayList<String> searchInformation(boolean checker) {
		this.accidentApproval.setStatemnt(checker);
		this.information = this.accidentApproval.searchInformation();
		return information;
	}

	public ArrayList<String> getInformation() {
		return information;
	}

	public void setInformation(ArrayList<String> information) {
		this.information = information;
	}

}