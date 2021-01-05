package model_insurnaceTool;

import dao_insuranceTool.insuranceApproveDao;
import model_insurance.insuranceListImpl;

public class mInsuranceApproval {

	private int approverID;
	private int insuranceID;
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

}