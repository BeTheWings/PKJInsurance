package model_insurnaceTool;

import control_insuranceTool.cEmailSend;
import dao_insuranceTool.insuranceApproveDao;
import model_insurance.insuranceListImpl;

public class mInsuranceApproval {

	private int isAllright;
	private insuranceApproveDao insuranceApproveDao;

	public mInsuranceApproval() {
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