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
			System.out.println("1. �����ϴ�");
			this.accidentDaoImpl.delete(accidnetInformation);

		} else if (this.isAllright == 2) {
			System.out.println("2. �ź��ϴ�");
			this.accidentDaoImpl.delete(accidnetInformation);
			// wait ����
		} else {
			System.out.println("���� ��ȣ�Դϴ�");
		}
	}

}