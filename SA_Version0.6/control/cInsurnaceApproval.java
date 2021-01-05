package control;

import insurnaceTool.insuranceApproval;

public class cInsurnaceApproval {
	private insuranceApproval insuranceApproval;

	public cInsurnaceApproval() {
		this.insuranceApproval = new insuranceApproval();
	}

	public void sendDenialMessage(int i) {
		// °ÅÀý
		this.insuranceApproval.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// ½ÂÀÎ
		this.insuranceApproval.sendAcceptMessage(i);
	}

	public void acceptInsurance(String insuranceInform) {
		this.insuranceApproval.approveInsurance(insuranceInform);
	}

	public void denialInsurance(String insuranceInform) {
		this.insuranceApproval.approveInsurance(insuranceInform);
	}

}
