package insurnaceTool;

import control.cEmailSend;
import dao.insuranceApproveDao;
import etc.financialManagementCommittee;
import insurance.insuranceListImpl;

public class insuranceApproval {

	private int approverID;
	private int insuranceID;
	private int isAllright;
	private insuranceApproveDao insuranceApproveDao;

	private financialManagementCommittee financialManagementCommittee;

	// private boolean isAllright = false;

	public insuranceApproval() {
		this.insuranceApproveDao = new insuranceApproveDao();
	}

	public void association(insuranceListImpl insuranceListImpl) {

	}

	public void sendDenialMessage(int i) {
		this.isAllright = i;
	}

	public void sendAcceptMessage(int i) {

		this.isAllright = i;
	}

	public void approveInsurance(String insuranceInform) {

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