package control;

import java.util.ArrayList;

import model_insurnaceTool.mAccidentApproval;

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

	public void acceptRequest(String accidnetInformation) {
		this.accidentApproval.acceptRequest(accidnetInformation);
	}

	public void denialRequest(String insuranceInform) {
		this.accidentApproval.acceptRequest(insuranceInform);
	}

	public ArrayList<String> searchInformation(boolean checker) {
		this.information = this.accidentApproval.searchInformation(checker);
		return information;
	}

	public ArrayList<String> getInformation() {
		return information;
	}

	public void setInformation(ArrayList<String> information) {
		this.information = information;
	}

}