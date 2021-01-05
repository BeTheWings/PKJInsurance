package control;

import java.util.ArrayList;

import dao.carInsuranceClientDaoImpl;
import model_insuranceRegistration.mCarInsuranceRegistration;

public class cCarInsuranceRegistration {
	private mCarInsuranceRegistration carInsuranceRegistrationVO;
	private carInsuranceClientDaoImpl carInsuranceClientDaoImpl;
	
	public cCarInsuranceRegistration() {
		try {
			this.carInsuranceClientDaoImpl = new carInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.carInsuranceRegistrationVO = new mCarInsuranceRegistration();
	}
	
	public void setData(ArrayList<String> list) {
		String category = list.get(0);
		carInsuranceRegistrationVO.setInsuranceName(category);
		String name = list.get(1);
		carInsuranceRegistrationVO.setName(name);
		String registrationNumber = list.get(2);
		carInsuranceRegistrationVO.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		carInsuranceRegistrationVO.setAge(age);
		String phoneNumber = list.get(4);
		carInsuranceRegistrationVO.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		carInsuranceRegistrationVO.setAddress(address);
		String accountNumber = list.get(6);
		carInsuranceRegistrationVO.setAccountNumber(accountNumber);
		String email = list.get(7);
		carInsuranceRegistrationVO.setEmail(email);
		String carNumber = list.get(8);
		carInsuranceRegistrationVO.setCarNumber(carNumber);
		String accidentHistory = list.get(9);
		carInsuranceRegistrationVO.setAccidentHistory(accidentHistory);
		
		String gender = list.get(10);
		carInsuranceRegistrationVO.setGender(gender);
		String job = list.get(11);
		carInsuranceRegistrationVO.setJob(job);
		String carModel = list.get(12);
		carInsuranceRegistrationVO.setCarModel(carModel);
		String longterm = list.get(13);
		if(longterm.equals("장기보험")) {
			carInsuranceRegistrationVO.setLongterm(true);
		} else {
			carInsuranceRegistrationVO.setLongterm(false);
		}
		int totalPrice = Integer.parseInt(list.get(15));
		totalPrice = totalPrice*50000;
		carInsuranceRegistrationVO.setTotalPrice(totalPrice);
		String date = list.get(16);
		carInsuranceRegistrationVO.setDate(date);
		
		this.carInsuranceClientDaoImpl.insert(this.carInsuranceRegistrationVO);
	}

	public boolean checkCategory(String name) {
		boolean checker = false;
		
		checker = carInsuranceClientDaoImpl.search(name);//트루여야
		return checker;
	}
}