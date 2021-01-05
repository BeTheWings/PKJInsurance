package insurnaceTool;

import dao.insuranceApproveDao;
import insurance.insuranceListImpl;

public class insuranceApprovalVO {

	private int approverID;
	private int insuranceID;
	private int isAllright;
	private insuranceApproveDao insuranceApproveDao;

	public insuranceApprovalVO() {
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