package control_insuranceRegistration;

import java.util.ArrayList;

import model_client.mRate;
import model_insuranceRegistration.mOnTheSeaInsuranceRegistration;

public class cOnTheSeaInsuranceRegistration {
	private mOnTheSeaInsuranceRegistration mOnTheSeaInsuranceRegistration;
	private mRate mRate;

	public cOnTheSeaInsuranceRegistration() {
		this.mOnTheSeaInsuranceRegistration = new mOnTheSeaInsuranceRegistration();
		this.mRate = new mRate();
	}

	public void setData(ArrayList<String> list) {
		String insuranceName = list.get(0);
		mOnTheSeaInsuranceRegistration.setInsuranceName(insuranceName);
		String name = list.get(1);
		mOnTheSeaInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		mOnTheSeaInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		mOnTheSeaInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		mOnTheSeaInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		mOnTheSeaInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		mOnTheSeaInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		mOnTheSeaInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(8);
		String gender = list.get(9);
		mOnTheSeaInsuranceRegistration.setGender(gender);
		String job = list.get(10);
		mOnTheSeaInsuranceRegistration.setJob(job);
		String longterm = list.get(11);
		if (longterm.equals("��⺸��")) {
			mOnTheSeaInsuranceRegistration.setLongterm(true);
		} else {
			mOnTheSeaInsuranceRegistration.setLongterm(false);
		}
		String boatType = list.get(12);
		mOnTheSeaInsuranceRegistration.setSelectBoatType(boatType);
		String onTheSeaType = list.get(13);
		mOnTheSeaInsuranceRegistration.setSelectOnTheSeaType(onTheSeaType);
		String note = list.get(14);
		if (note.equals("��� �̷� ����")) {
			mOnTheSeaInsuranceRegistration.setAccidentHistory(accidentHistory);
		} else {
			mOnTheSeaInsuranceRegistration.setAccidentHistory("����̷¾���");
		}
		float payIn = Integer.parseInt(list.get(15));
		mOnTheSeaInsuranceRegistration.setTotalPrice(payIn);
		String date = list.get(16);
		mOnTheSeaInsuranceRegistration.setDate(date);

		// rate �޾ƿ�
		String rate = this.mRate.searchRate(job);
		System.out.println(rate + "�� �޾ƿ�");
		mOnTheSeaInsuranceRegistration.setRate(rate);

		String category = mOnTheSeaInsuranceRegistration.takeCategory(mOnTheSeaInsuranceRegistration);
		mOnTheSeaInsuranceRegistration.setInsuranceCategory(category);

		this.mOnTheSeaInsuranceRegistration.TossToEntity(mOnTheSeaInsuranceRegistration);
	}

	public boolean checkCategory(String name) {// name = 1�� �Է°�
		ArrayList<String> result = mOnTheSeaInsuranceRegistration.search(name);// Ʈ�翩��
		if (result != null) {
			return this.mOnTheSeaInsuranceRegistration.checkName(name, result);
		} else
			return false;
	}

	public int findPayIn(String insuranceName) {
		int findPayIn = this.mOnTheSeaInsuranceRegistration.findPayIn(insuranceName);
		return findPayIn;
	}
}