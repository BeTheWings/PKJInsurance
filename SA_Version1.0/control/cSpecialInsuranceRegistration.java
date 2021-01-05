package control;

import java.util.ArrayList;

import insuranceRegistration.specialInsuranceRegistration;

public class cSpecialInsuranceRegistration {

	private specialInsuranceRegistration specialInsuranceRegistration;

	public cSpecialInsuranceRegistration() {
		this.specialInsuranceRegistration = new specialInsuranceRegistration();
	}

	public void setData(ArrayList<String> list) {
		String name = list.get(0);
		specialInsuranceRegistration.setName(name);
		String registrationNumber = list.get(1);
		specialInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(2);
		specialInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(3);
		specialInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(4);
		specialInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(5);
		specialInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(6);
		specialInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(7);
		specialInsuranceRegistration.setAccidentHistory(accidentHistory);

		String gender = list.get(8);
		specialInsuranceRegistration.setGender(gender);
		String job = list.get(9);
		specialInsuranceRegistration.setJob(job);
		String specialType = list.get(11);
		specialInsuranceRegistration.setSpecialType(specialType);
		String property = list.get(12);
		specialInsuranceRegistration.setProperty(property);
		String longterm = list.get(13);
		specialInsuranceRegistration.setLongterm(longterm);

		int totalPrice = Integer.parseInt(list.get(14));
		specialInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(15);
		specialInsuranceRegistration.setDate(date);
		
	}

}