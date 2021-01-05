package entity;

import java.util.ArrayList;

import dao_insuranceTool.accidentDaoImpl;
import model_accidentReception.mAccidentApproval;

public class accidentEntity {
	private accidentDaoImpl accidentDaoImpl;
	private ArrayList<String> InsuranceInformation;

	public accidentEntity() {
		this.accidentDaoImpl = new accidentDaoImpl();
		this.InsuranceInformation = new ArrayList<String>();
	}

	public void acceptRequest(mAccidentApproval mAccidentApproval) {
		if (mAccidentApproval.getIsAllright() == 1) {

			// 2. reception���� �ش� ���� ����̷� ��� ���� ���� ����
			if (mAccidentApproval.getInsuranceCategory().equals("ȭ�纸��")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateFireClientInfo(mAccidentApproval);
			} else if (mAccidentApproval.getInsuranceCategory().equals("�ػ���")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateSeaClientInfo(mAccidentApproval);
			} else if (mAccidentApproval.getInsuranceCategory().equals("�ڵ�������")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateCarClientInfo(mAccidentApproval);
			} else if (mAccidentApproval.getInsuranceCategory().equals("Ư������")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateSpecialClientInfo(mAccidentApproval);
			}

		} else if (mAccidentApproval.getIsAllright() == 2) {
			this.accidentDaoImpl.delete(mAccidentApproval.getClientName());
			// wait ����
		} else {
			System.out.println("���� ��ȣ�Դϴ�");
		}

	}

	public ArrayList<String> searchInformation(mAccidentApproval mAccidentApproval) {

		this.InsuranceInformation = this.accidentDaoImpl.searchInformation(mAccidentApproval);
		return InsuranceInformation;
	}

}
