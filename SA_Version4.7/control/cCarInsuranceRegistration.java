package control;

import java.util.ArrayList;

import dao.carInsuranceClientDaoImpl;
import model_insuranceRegistration.mCarInsuranceRegistration;

public class cCarInsuranceRegistration {
	private mCarInsuranceRegistration mCarInsuranceRegistration;
	private carInsuranceClientDaoImpl carInsuranceClientDaoImpl;
	
	public cCarInsuranceRegistration() {
		try {
			this.carInsuranceClientDaoImpl = new carInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.mCarInsuranceRegistration = new mCarInsuranceRegistration();
	}
	
	public void setData(ArrayList<String> list) {
		String category = list.get(0);
		mCarInsuranceRegistration.setInsuranceName(category);
		String name = list.get(1);
		mCarInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		mCarInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		mCarInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		mCarInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		mCarInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		mCarInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		mCarInsuranceRegistration.setEmail(email);
		String carNumber = list.get(8);
		mCarInsuranceRegistration.setCarNumber(carNumber);
		String accidentHistory = list.get(9);
		
		String gender = list.get(10);
		mCarInsuranceRegistration.setGender(gender);
		String job = list.get(11);
		mCarInsuranceRegistration.setJob(job);
		String carModel = list.get(12);
		mCarInsuranceRegistration.setCarModel(carModel);
		String longterm = list.get(13);
		if(longterm.equals("장기보험")) {
			mCarInsuranceRegistration.setLongterm(true);
		} else {
			mCarInsuranceRegistration.setLongterm(false);
		}
		String note = list.get(14);
		if(note.equals("사고 이력 있음")) {
			mCarInsuranceRegistration.setAccidentHistory(accidentHistory);
		} else {
			mCarInsuranceRegistration.setAccidentHistory("사고이력없음");
		}
		int totalPrice = Integer.parseInt(list.get(15));
		mCarInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(16);
		mCarInsuranceRegistration.setDate(date);
		
		this.mCarInsuranceRegistration.TossToEntity(mCarInsuranceRegistration);

	}

	public boolean checkCategory(String name) {
		boolean checker = false;
		
		checker = carInsuranceClientDaoImpl.search(name);//트루여야
		return checker;
	}
}