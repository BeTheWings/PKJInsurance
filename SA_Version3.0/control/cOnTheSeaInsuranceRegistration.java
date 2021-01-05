package control;

import java.util.ArrayList;

import dao.onTheSeaInsuranceClientDaoImpl;
import model_insuranceRegistration.mOnTheSeaInsuranceRegistration;

public class cOnTheSeaInsuranceRegistration {
	private mOnTheSeaInsuranceRegistration onTheSeaInsuranceRegistration;
	private onTheSeaInsuranceClientDaoImpl onTheSeaInsuranceClientDaoImpl;

	public cOnTheSeaInsuranceRegistration() {
		this.onTheSeaInsuranceRegistration = new mOnTheSeaInsuranceRegistration();
		try {
			this.onTheSeaInsuranceClientDaoImpl = new onTheSeaInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void setData(ArrayList<String> list) {
		String category = list.get(0);
		onTheSeaInsuranceRegistration.setInsuranceName(category);
		String name = list.get(1);
		onTheSeaInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		onTheSeaInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		onTheSeaInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		onTheSeaInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		onTheSeaInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		onTheSeaInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		onTheSeaInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(8);
		onTheSeaInsuranceRegistration.setAccidentHistory(accidentHistory);
		
		String gender = list.get(9);
		onTheSeaInsuranceRegistration.setGender(gender);
		String job = list.get(10);
		onTheSeaInsuranceRegistration.setJob(job);
		String longterm = list.get(11);
		if(longterm.equals("장기보험")) {
			onTheSeaInsuranceRegistration.setLongterm(true);
		} else {
			onTheSeaInsuranceRegistration.setLongterm(false);
		}
		String boatType = list.get(12);
		onTheSeaInsuranceRegistration.setSelectBoatType(boatType);
		String onTheSeaType = list.get(13);
		onTheSeaInsuranceRegistration.setSelectOnTheSeaType(onTheSeaType);
		String note = list.get(14);
		onTheSeaInsuranceRegistration.setNote(note);
		int totalPrice = Integer.parseInt(list.get(15));
		totalPrice = totalPrice*50000;
		onTheSeaInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(16);
		onTheSeaInsuranceRegistration.setDate(date);
		
		this.onTheSeaInsuranceClientDaoImpl.insert(this.onTheSeaInsuranceRegistration);
	}

	public boolean checkCategory(String name) {
		boolean checker = false;
		
		checker = onTheSeaInsuranceClientDaoImpl.search(name);//트루여야
		return checker;
	}
}