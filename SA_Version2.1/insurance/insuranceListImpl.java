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
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			this.insuranceWaitList.add(insurance);
			return true;
		} else if (insurance != null && !waitList && insuranceWaitList != null) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			this.insuranceList.add(this.insuranceWaitList.get(0));
			this.insuranceWaitList.remove(0);
			return true;
		} else {
			System.out.println("���� ���忡 �����Ͽ����ϴ�.");
			return false;
		}
	}

	public boolean delete(boolean waitList, insuranceVO insurance) {

		if (insurance != null && waitList) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			this.insuranceWaitList.remove(0);
			return true;
		} else if (insurance != null && !waitList && insuranceWaitList != null) {
			// ���߿� �κп� ���� ������ �� �ֵ��� ������ ��
			this.insuranceList.remove(0);
			return true;
		} else {
			System.out.println("������ ���� �Ͽ����ϴ�.");
			return false;
		}

	}

	public boolean modify(insuranceVO insurance) {

		if (insurance != null) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			return true;
		} else {
			System.out.println("���� ������ �����߽��ϴ�.");
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