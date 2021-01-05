package control;

import java.util.ArrayList;

import dao.carInsuranceClientDaoImpl;
import insuranceRegistration.carInsuranceRegistrationVO;

public class cCarInsuranceRegistration {
	private carInsuranceRegistrationVO carInsuranceRegistrationVO;
	private carInsuranceClientDaoImpl carInsuranceClientDaoImpl;
	
	public cCarInsuranceRegistration() {
		try {
			this.carInsuranceClientDaoImpl = new carInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.carInsuranceRegistrationVO = new carInsuranceRegistrationVO();
	}
	
	public void setData(ArrayList<String> list) {
		String name = list.get(0);
		carInsuranceRegistrationVO.setName(name);
		String registrationNumber = list.get(1);
		carInsuranceRegistrationVO.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(2);
		carInsuranceRegistrationVO.setAge(age);
		String phoneNumber = list.get(3);
		carInsuranceRegistrationVO.setPhoneNumber(phoneNumber);
		String address = list.get(4);
		carInsuranceRegistrationVO.setAddress(address);
		String accountNumber = list.get(5);
		carInsuranceRegistrationVO.setAccountNumber(accountNumber);
		String email = list.get(6);
		carInsuranceRegistrationVO.setEmail(email);
		String carNumber = list.get(7);
		carInsuranceRegistrationVO.setCarNumber(carNumber);
		String accidentHistory = list.get(8);
		carInsuranceRegistrationVO.setAccidentHistory(accidentHistory);
		
		String gender = list.get(9);
		carInsuranceRegistrationVO.setGender(gender);
		String job = list.get(10);
		carInsuranceRegistrationVO.setJob(job);
		String carModel = list.get(11);
		carInsuranceRegistrationVO.setCarModel(carModel);
		String longterm = list.get(12);
		if(longterm.equals("장기보험")) {
			carInsuranceRegistrationVO.setLongterm(true);
		} else {
			carInsuranceRegistrationVO.setLongterm(false);
		}
		carInsuranceRegistrationVO.setInsuranceName("자동차보험");
		
		this.carInsuranceClientDaoImpl.insert(this.carInsuranceRegistrationVO);
	}
}