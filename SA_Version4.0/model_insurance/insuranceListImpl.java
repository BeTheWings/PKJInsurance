package model_insurance;

import java.util.ArrayList;

public class insuranceListImpl implements insuranceList {

	private ArrayList<mInsurance> insuranceWaitList;
	private ArrayList<mInsurance> insuranceList;

	public mInsurance insurance;

	public insuranceListImpl() {
		this.insurance = new mInsurance();
		this.insuranceWaitList = new ArrayList<mInsurance>();
		this.insuranceList = new ArrayList<mInsurance>();
	}

	public boolean add(boolean waitList, mInsurance insurance) {
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

	public boolean delete(boolean waitList, mInsurance insurance) {

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

	public boolean modify(mInsurance insurance) {

		if (insurance != null) {
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			return true;
		} else {
			System.out.println("���� ������ �����߽��ϴ�.");
			return false;
		}

	}

	public ArrayList<mInsurance> getInsuranceWaitList() {
		return insuranceWaitList;
	}


	public ArrayList<mInsurance> getInsuranceList() {
		return insuranceList;
	}

}