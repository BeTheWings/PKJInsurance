package control;

import java.util.ArrayList;

import dao.onTheSeaInsuranceClientDaoImpl;
import insuranceRegistration.onTheSeaInsuranceRegistrationVO;

public class cOnTheSeaInsuranceRegistration {
	private onTheSeaInsuranceRegistrationVO onTheSeaInsuranceRegistration;
	private onTheSeaInsuranceClientDaoImpl onTheSeaInsuranceClientDaoImpl;

	public cOnTheSeaInsuranceRegistration() {
		this.onTheSeaInsuranceRegistration = new onTheSeaInsuranceRegistrationVO();
		try {
			this.onTheSeaInsuranceClientDaoImpl = new onTheSeaInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setData(ArrayList<String> list) {
		String name = list.get(0);
		onTheSeaInsuranceRegistration.setName(name);
		String registrationNumber = list.get(1);
		onTheSeaInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(2);
		onTheSeaInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(3);
		onTheSeaInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(4);
		onTheSeaInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(5);
		onTheSeaInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(6);
		onTheSeaInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(7);
		onTheSeaInsuranceRegistration.setAccidentHistory(accidentHistory);

		String gender = list.get(8);
		onTheSeaInsuranceRegistration.setGender(gender);
		String job = list.get(9);
		onTheSeaInsuranceRegistration.setJob(job);
		String onTheSeaType = list.get(11);
		onTheSeaInsuranceRegistration.setSelectOnTheSeaType(onTheSeaType);
		String boatType = list.get(12);
		onTheSeaInsuranceRegistration.setLongterm(boatType);
		String longterm = list.get(13);
		onTheSeaInsuranceRegistration.setLongterm(longterm);
		int totalPrice = Integer.parseInt(list.get(14));
		onTheSeaInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(15);
		onTheSeaInsuranceRegistration.setDate(date);

		this.onTheSeaInsuranceClientDaoImpl.insert(this.onTheSeaInsuranceRegistration);
	}
}