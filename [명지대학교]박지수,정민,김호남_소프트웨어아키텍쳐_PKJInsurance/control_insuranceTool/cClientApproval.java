package control_insuranceTool;

import model_insurnaceTool.mUnderWriter;

public class cClientApproval {

	private mUnderWriter underWriter;

	public cClientApproval() {
		this.underWriter = new mUnderWriter();
	}

	public void sendDenialMessage(int i) {
		// °ÅÀý
		this.underWriter.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// ½ÂÀÎ
		this.underWriter.sendAcceptMessage(i);
	}

	public void acceptClient(String clientName, String insuranceInform) {
		this.underWriter.approveClient(insuranceInform, clientName);
	}

	public void denialInsurance(String clientName, String insuranceInform) {
		this.underWriter.approveClient(insuranceInform, clientName);
	}
}