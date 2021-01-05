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

			// 2. reception에서 해당 고객의 사고이력 사고 있음 으로 변경
			if (mAccidentApproval.getInsuranceCategory().equals("화재보험")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateFireClientInfo(mAccidentApproval);
			} else if (mAccidentApproval.getInsuranceCategory().equals("해상보험")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateSeaClientInfo(mAccidentApproval);
			} else if (mAccidentApproval.getInsuranceCategory().equals("자동차보험")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateCarClientInfo(mAccidentApproval);
			} else if (mAccidentApproval.getInsuranceCategory().equals("특종보험")) {
				this.accidentDaoImpl.accept(mAccidentApproval.getClientName());
				this.accidentDaoImpl.updateSpecialClientInfo(mAccidentApproval);
			}

		} else if (mAccidentApproval.getIsAllright() == 2) {
			this.accidentDaoImpl.delete(mAccidentApproval.getClientName());
			// wait 삭제
		} else {
			System.out.println("없는 번호입니다");
		}

	}

	public ArrayList<String> searchInformation(mAccidentApproval mAccidentApproval) {

		this.InsuranceInformation = this.accidentDaoImpl.searchInformation(mAccidentApproval);
		return InsuranceInformation;
	}

}
