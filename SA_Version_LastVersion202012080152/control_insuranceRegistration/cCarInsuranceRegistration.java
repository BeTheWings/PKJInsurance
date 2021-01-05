package control_insuranceRegistration;

import java.util.ArrayList;

import model_client.mRate;
import model_insuranceRegistration.mCarInsuranceRegistration;

public class cCarInsuranceRegistration {
	private mCarInsuranceRegistration mCarInsuranceRegistration;
	private mRate mRate;
	
	public cCarInsuranceRegistration() {
		this.mCarInsuranceRegistration = new mCarInsuranceRegistration();
		this.mRate = new mRate();
	}
	
	public void setData(ArrayList<String> list) {
		String insuranceName = list.get(0);
		mCarInsuranceRegistration.setInsuranceName(insuranceName);
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
		
		float payIn = Integer.parseInt(list.get(15));
		mCarInsuranceRegistration.setTotalPrice(payIn);
		String date = list.get(16);
		mCarInsuranceRegistration.setDate(date);
		
		// rate 받아옴
				String rate = this.mRate.searchRate(job);
				System.out.println(rate + "잘 받아옴");
				mCarInsuranceRegistration.setRate(rate);
				
		String category = mCarInsuranceRegistration.takeCategory(mCarInsuranceRegistration);
		mCarInsuranceRegistration.setInsuranceCategory(category);
		
		this.mCarInsuranceRegistration.TossToEntity(mCarInsuranceRegistration);
	}

	public boolean checkCategory(String name) {//name = 1번 입력값
		ArrayList<String> result = mCarInsuranceRegistration.search(name);//트루여야
		if(result != null) {
			return this.mCarInsuranceRegistration.checkName(name, result);
		} else return false;
	}

	public int findPayIn(String insuranceName) {
		int findPayIn = this.mCarInsuranceRegistration.findPayIn(insuranceName);
		return findPayIn;
	}
}