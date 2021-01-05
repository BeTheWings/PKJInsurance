package control_insuranceTool;

import model_insurnaceTool.mInsuranceApproval;

public class cInsuranceApproval {
	private int isAllright;
	private mInsuranceApproval insuranceApproval;

	public cInsuranceApproval() {
		this.insuranceApproval = new mInsuranceApproval();
	}

	public void sendDenialMessage(int i) {
		// °ÅÀý
		this.isAllright = i;
		this.insuranceApproval.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// ½ÂÀÎ
		this.isAllright = i;
		this.insuranceApproval.sendAcceptMessage(i);
	}

	public void acceptInsurance(String insuranceInform) {
		insuranceApproval.acceptInsurance(insuranceInform);
		
	}

}