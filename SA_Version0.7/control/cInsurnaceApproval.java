package control;

import insurnaceTool.insuranceApproval;

public class cInsurnaceApproval {
	private insuranceApproval insuranceApproval;

	public cInsurnaceApproval() {
		this.insuranceApproval = new insuranceApproval();
	}

	public void sendDenialMessage(int i) {
		// ����
		this.insuranceApproval.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// ����
		this.insuranceApproval.sendAcceptMessage(i);
	}

	public void acceptInsurance(String insuranceInform) {
		this.insuranceApproval.approveInsurance(insuranceInform);
	}

	public void denialInsurance(String insuranceInform) {
		this.insuranceApproval.approveInsurance(insuranceInform);
	}

}
