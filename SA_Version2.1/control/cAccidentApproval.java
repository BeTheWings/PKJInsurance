package control;

import java.util.ArrayList;

import dao.accidentDaoImpl;
import insurnaceTool.accidentApprovalVO;

public class cAccidentApproval {
	private accidentApprovalVO accidentApproval;
	private accidentDaoImpl accidentDaoImpl;
	private ArrayList<String> information;

	public cAccidentApproval() {
		this.accidentDaoImpl = new accidentDaoImpl();
		this.accidentApproval = new accidentApprovalVO();
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

	public ArrayList<String> searchInformation() {

		this.information = this.accidentDaoImpl.searchInformation();
		return information;
	}

}