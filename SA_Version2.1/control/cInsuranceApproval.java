package control;

import dao.insuranceApproveDao;
import insurnaceTool.insuranceApprovalVO;

public class cInsuranceApproval {
	private int isAllright;
	private insuranceApproveDao insuranceApproveDao;
	private insuranceApprovalVO insuranceApproval;

	public cInsuranceApproval() {
		this.insuranceApproval = new insuranceApprovalVO();
		this.insuranceApproveDao = new insuranceApproveDao();
	}

	public void sendDenialMessage(int i) {
		// ����
		this.isAllright = i;
		this.insuranceApproval.sendDenialMessage(i);
	}

	public void sendAcceptMessage(int i) {
		// ����
		this.isAllright = i;
		this.insuranceApproval.sendAcceptMessage(i);
	}

	public void acceptInsurance(String insuranceInform) {
		if (this.isAllright == 1) {
			System.out.println("1. �����ϴ�");
			this.insuranceApproveDao.update(insuranceInform);
			cEmailSend cEmailSend = new cEmailSend();
			cEmailSend.sendEmail(insuranceInform);

		} else if (this.isAllright == 2) {
			System.out.println("2. �����Ѵ�.");
			this.insuranceApproveDao.delete(insuranceInform);
			// wait ����
		} else {
			System.out.println("���� ��ȣ�Դϴ�");
		}
	}

}