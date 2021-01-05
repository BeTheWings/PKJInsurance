package control_insuranceTool;

import dao_insuranceTool.insuranceApproveDao;
import model_insurnaceTool.mInsuranceApproval;

public class cInsuranceApproval {
	private int isAllright;
	private insuranceApproveDao insuranceApproveDao;
	private mInsuranceApproval insuranceApproval;

	public cInsuranceApproval() {
		this.insuranceApproval = new mInsuranceApproval();
		this.insuranceApproveDao = new insuranceApproveDao();
	}

	public void sendDenialMessage(int i) {
		// 거절
		this.isAllright = i;
		this.insuranceApproval.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// 승인
		this.isAllright = i;
		this.insuranceApproval.sendAcceptMessage(i);
	}

	public void acceptInsurance(String insuranceInform) {
		if (this.isAllright == 1) {
			this.insuranceApproveDao.update(insuranceInform);
			cEmailSend cEmailSend = new cEmailSend();
			cEmailSend.sendEmail(insuranceInform);

		} else if (this.isAllright == 2) {
			System.out.println("2. 거절한다.");
			this.insuranceApproveDao.delete(insuranceInform);
			// wait 삭제
		} else {
			System.out.println("없는 번호입니다");
		}
	}

}