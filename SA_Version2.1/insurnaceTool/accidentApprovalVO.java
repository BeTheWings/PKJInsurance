package insurnaceTool;

import dao.accidentDaoImpl;
import insurance.insuranceListImpl;

public class accidentApprovalVO {

	private int isAllright;
	private accidentDaoImpl accidentDaoImpl;

	public accidentApprovalVO() {
		this.accidentDaoImpl = new accidentDaoImpl();
	}

	public void association(insuranceListImpl insuranceListImpl) {

	}

	public void sendDenialMessage(int i) {
		this.isAllright = i;
	}

	public void sendAcceptMessage(int i) {

		this.isAllright = i;
	}

	public void acceptRequest(String accidnetInformation) {

		if (this.isAllright == 1) {
			System.out.println("1. 승인하다");
			this.accidentDaoImpl.delete(accidnetInformation);

		} else if (this.isAllright == 2) {
			System.out.println("2. 거부하다");
			this.accidentDaoImpl.delete(accidnetInformation);
			// wait 삭제
		} else {
			System.out.println("없는 번호입니다");
		}
	}

}