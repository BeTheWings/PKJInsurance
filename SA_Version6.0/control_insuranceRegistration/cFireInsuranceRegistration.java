package control_insuranceRegistration;

import java.util.ArrayList;

import model_client.mRate;
import model_insuranceRegistration.mFireInsuranceRegistration;

public class cFireInsuranceRegistration {
	private mFireInsuranceRegistration mFireInsuranceRegistration;
	private mRate mRate;

	public cFireInsuranceRegistration() {
		this.mFireInsuranceRegistration = new mFireInsuranceRegistration();
		this.mRate = new mRate();
	}

	public void setData(ArrayList<String> list) {
		String insuranceName = list.get(0);
		mFireInsuranceRegistration.setInsuranceName(insuranceName);
		String name = list.get(1);
		mFireInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		mFireInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		mFireInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		mFireInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		mFireInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		mFireInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		mFireInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(9);
		String gender = list.get(10);
		mFireInsuranceRegistration.setGender(gender);
		String job = list.get(11);
		mFireInsuranceRegistration.setJob(job);
		String propertyType = list.get(12);
		if (propertyType.equals("��������")) {
			mFireInsuranceRegistration.setProperty(propertyType);
		} else if (propertyType.equals("��Ÿ")) {
			mFireInsuranceRegistration.setProperty(list.get(8));
		}
		String longterm = list.get(13);
		if (longterm.equals("��⺸��")) {
			mFireInsuranceRegistration.setLongterm(true);
		} else {
			mFireInsuranceRegistration.setLongterm(false);
		}
		String note = list.get(14);
		if (note.equals("��� �̷� ����")) {
			mFireInsuranceRegistration.setAccidentHistory(accidentHistory);
		} else if (note.equals("��� �̷� ����")) {
			mFireInsuranceRegistration.setAccidentHistory("����̷¾���");
		}

		float payIn = Float.parseFloat(list.get(15));
		System.out.println(payIn + "�� �����´�");
		mFireInsuranceRegistration.setTotalPrice(payIn);
		String date = list.get(16);
		mFireInsuranceRegistration.setDate(date);

		// rate �޾ƿ�
		String rate = this.mRate.searchRate(job);
		System.out.println(rate + "�� �޾ƿ�");
		mFireInsuranceRegistration.setRate(rate);
		
		String category = mFireInsuranceRegistration.takeCategory(mFireInsuranceRegistration);
		mFireInsuranceRegistration.setInsuranceCategory(category);
		
		this.mFireInsuranceRegistration.TossToEntity(mFireInsuranceRegistration);

	}

	public boolean checkCategory(String name) {//name = 1�� �Է°�
		ArrayList<String> result = mFireInsuranceRegistration.search(name);//Ʈ�翩��
		if(result != null) {
			return this.mFireInsuranceRegistration.checkName(name, result);
		} else return false;
	}

	public int findPayIn(String insuranceName) {
		System.out.println(insuranceName + " MMM");
		int findPayIn = this.mFireInsuranceRegistration.findPayIn(insuranceName);
		System.out.println(findPayIn + " mmm");
		return findPayIn;
	}
}