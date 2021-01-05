package insurance;

import java.util.ArrayList;

public class insuranceListImpl implements insuranceList {

	private ArrayList<insuranceVO> insuranceWaitList;
	private ArrayList<insuranceVO> insuranceList;

	public insuranceVO insurance;

	public insuranceListImpl() {
		this.insurance = new insuranceVO();
		this.insuranceWaitList = new ArrayList<insuranceVO>();
		this.insuranceList = new ArrayList<insuranceVO>();
	}

	public boolean add(boolean waitList, insuranceVO insurance) {
		if (insurance != null && waitList) {
			System.out.println("보험 저장이 완료되었습니다.");
			this.insuranceWaitList.add(insurance);
			return true;
		} else if (insurance != null && !waitList && insuranceWaitList != null) {
			System.out.println("보험 승인이 완료되었습니다.");
			this.insuranceList.add(this.insuranceWaitList.get(0));
			this.insuranceWaitList.remove(0);
			return true;
		} else {
			System.out.println("보험 저장에 실패하였습니다.");
			return false;
		}
	}

	public boolean delete(boolean waitList, insuranceVO insurance) {

		if (insurance != null && waitList) {
			System.out.println("보험 삭제가 완료되었습니다.");
			this.insuranceWaitList.remove(0);
			return true;
		} else if (insurance != null && !waitList && insuranceWaitList != null) {
			// 나중에 부분에 따라서 삭제할 수 있도록 구현할 것
			this.insuranceList.remove(0);
			return true;
		} else {
			System.out.println("삭제에 실패 하였습니다.");
			return false;
		}

	}

	public boolean modify(insuranceVO insurance) {

		if (insurance != null) {
			System.out.println("보험 수정이 완료되었습니다.");
			return true;
		} else {
			System.out.println("보험 수정이 실패했습니다.");
			return false;
		}

	}

	public ArrayList<insuranceVO> getInsuranceWaitList() {
		return insuranceWaitList;
	}


	public ArrayList<insuranceVO> getInsuranceList() {
		return insuranceList;
	}

}