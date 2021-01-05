package control;

import java.util.ArrayList;

import dao.fireInsuranceClientDaoImpl;
import model_insuranceRegistration.mFireInsuranceRegistration;

public class cFireInsuranceRegistration {
	private mFireInsuranceRegistration fireInsuranceRegistration;
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;
	
	public cFireInsuranceRegistration() {
		this.fireInsuranceRegistration = new mFireInsuranceRegistration();
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setData(ArrayList<String> list) {
		
		String category = list.get(0);
		fireInsuranceRegistration.setInsuranceName(category);
		String name = list.get(1);
		fireInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		fireInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		fireInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		fireInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		fireInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		fireInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		fireInsuranceRegistration.setEmail(email);
		String property = list.get(8);
		fireInsuranceRegistration.setProperty(property);
		String accidentHistory = list.get(9);
		fireInsuranceRegistration.setAccidentHistory(accidentHistory);
		
		String gender = list.get(10);
		fireInsuranceRegistration.setGender(gender);
		String job = list.get(11);
		fireInsuranceRegistration.setJob(job);
		String propertyType = list.get(12);
		fireInsuranceRegistration.setPropertyType(propertyType);
		String longterm = list.get(13);
		if(longterm.equals("장기보험")) {
			fireInsuranceRegistration.setLongterm(true);
		} else {
			fireInsuranceRegistration.setLongterm(false);
		}
		String note = list.get(14);
		fireInsuranceRegistration.setNote(note);
		
		int totalPrice = Integer.parseInt(list.get(15));
		totalPrice = totalPrice*50000;
		fireInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(16);
		fireInsuranceRegistration.setDate(date);
		
		this.fireInsuranceClientDaoImpl.insert(fireInsuranceRegistration);
	}

	public boolean checkCategory(String name) {
		boolean checker = false;
		
		checker = fireInsuranceClientDaoImpl.search(name);//트루여야
		return checker;
	}
}