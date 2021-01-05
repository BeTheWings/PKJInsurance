package control_insuranceRegistration;

import java.util.ArrayList;

import model_client.mRate;
import model_insuranceRegistration.mSpecialInsuranceRegistration;

public class cSpecialInsuranceRegistration {

	private mSpecialInsuranceRegistration mSpecialInsuranceRegistration;
	private mRate mRate;

	public cSpecialInsuranceRegistration() {
		this.mRate = new mRate();
		this.mSpecialInsuranceRegistration = new mSpecialInsuranceRegistration();
	}

	public void setData(ArrayList<String> list) {
		String insuranceName = list.get(0);
		mSpecialInsuranceRegistration.setInsuranceName(insuranceName);
		String name = list.get(1);
		mSpecialInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		mSpecialInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		mSpecialInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		mSpecialInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		mSpecialInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		mSpecialInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		mSpecialInsuranceRegistration.setEmail(email);
		String property = list.get(8);
		mSpecialInsuranceRegistration.setProperty(property);
		String accidentHistory = list.get(9);
		String gender = list.get(10);
		mSpecialInsuranceRegistration.setGender(gender);
		String job = list.get(11);
		mSpecialInsuranceRegistration.setJob(job);
		String longterm = list.get(12);
		if (longterm.equals("장기보험")) {
			mSpecialInsuranceRegistration.setLongterm(true);
		} else {
			mSpecialInsuranceRegistration.setLongterm(false);
		}
		String specialType = list.get(13);
		mSpecialInsuranceRegistration.setSpecialType(specialType);
		String note = list.get(14);
		if (note.equals("사고 이력 있음")) {
			mSpecialInsuranceRegistration.setAccidentHistory(accidentHistory);
		} else {
			mSpecialInsuranceRegistration.setAccidentHistory("사고이력없음");
		}
		mSpecialInsuranceRegistration.setNote(note);

		float payIn = Integer.parseInt(list.get(15));
		mSpecialInsuranceRegistration.setTotalPrice(payIn);
		String date = list.get(16);
		mSpecialInsuranceRegistration.setDate(date);

		// rate 받아옴
		String rate = this.mRate.searchRate(job);
		System.out.println(rate + "잘 받아옴");
		mSpecialInsuranceRegistration.setRate(rate);

		String category = mSpecialInsuranceRegistration.takeCategory(mSpecialInsuranceRegistration);
		mSpecialInsuranceRegistration.setInsuranceCategory(category);

		this.mSpecialInsuranceRegistration.TossToEntity(mSpecialInsuranceRegistration);
	}

	public boolean checkCategory(String name) {// name = 1번 입력값
		ArrayList<String> result = mSpecialInsuranceRegistration.search(name);// 트루여야
		if (result != null) {
			return this.mSpecialInsuranceRegistration.checkName(name, result);
		} else
			return false;
	}

	public int findPayIn(String insuranceName) {
		int findPayIn = this.mSpecialInsuranceRegistration.findPayIn(insuranceName);
		return findPayIn;
	}

}