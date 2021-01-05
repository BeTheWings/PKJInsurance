package control;

import java.util.ArrayList;

import dao.fireInsuranceClientDaoImpl;
import insuranceRegistration.fireInsuranceRegistrationVO;

public class cFireInsuranceRegistration {
	private fireInsuranceRegistrationVO fireInsuranceRegistration;
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;
	
	public cFireInsuranceRegistration() {
		this.fireInsuranceRegistration = new fireInsuranceRegistrationVO();
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setData(ArrayList<String> list) {
		String name = list.get(0);
		fireInsuranceRegistration.setName(name);
		String registrationNumber = list.get(1);
		fireInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(2);
		fireInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(3);
		fireInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(4);
		fireInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(5);
		fireInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(6);
		fireInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(7);
		fireInsuranceRegistration.setAccidentHistory(accidentHistory);
		
		String gender = list.get(8);
		fireInsuranceRegistration.setGender(gender);
		String job = list.get(9);
		fireInsuranceRegistration.setJob(job);
		String propertyType = list.get(11);
		fireInsuranceRegistration.setPropertyType(propertyType);
		String longterm = list.get(12);
		fireInsuranceRegistration.setLongterm(longterm);
		int totalPrice = Integer.parseInt(list.get(13));
		fireInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(14);
		fireInsuranceRegistration.setDate(date);
		fireInsuranceRegistration.setInsuranceName("화재보험");
		
		this.fireInsuranceClientDaoImpl.insert(fireInsuranceRegistration);
	}
}