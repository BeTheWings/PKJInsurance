package control;

import insuranceRegistration.onTheSeaInsuranceRegistration;

public class cOnTheSeaInsuranceRegistration {
	private onTheSeaInsuranceRegistration onTheSeaInsuranceRegistration;

	public cOnTheSeaInsuranceRegistration() {
		this.onTheSeaInsuranceRegistration = new onTheSeaInsuranceRegistration();
	}

	public void run() {
		onTheSeaInsuranceRegistration.run();
	}

	public void setName(String name) {
		onTheSeaInsuranceRegistration.setName(name);
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		onTheSeaInsuranceRegistration.setResidentRegistrationNumber(residentRegistrationNumber);
	}

	public void setAge(String age) {
		onTheSeaInsuranceRegistration.setAge(age);
	}

	public void setPhoneNumber(String phoneNumber) {
		onTheSeaInsuranceRegistration.setPhoneNumber(phoneNumber);
	}

	public void setAddress(String address) {
		onTheSeaInsuranceRegistration.setAddress(address);
	}

	public void setAccountNumber(String accountNumber) {
		onTheSeaInsuranceRegistration.setAccountNumber(accountNumber);
	}

	public void setGender(String gender) {
		onTheSeaInsuranceRegistration.setGender(gender);
	}

	public void setJob(String job) {
		onTheSeaInsuranceRegistration.setJob(job);
	}

	public void setLongterm(String longterm) {
		onTheSeaInsuranceRegistration.setLongterm(longterm);
	}

	public void setBoatType(String selectBoatType) {
		onTheSeaInsuranceRegistration.setBoatType(selectBoatType);
	}

	public void setOnTheSeaType(String selectOnTheSeaType) { // 보험종류선택
		onTheSeaInsuranceRegistration.setOnTheSeaType(selectOnTheSeaType);
	}

	public void setAccidentHistory(String accidentHistory) {
		onTheSeaInsuranceRegistration.setAccidentHistory(accidentHistory);
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		onTheSeaInsuranceRegistration.setSelectAccidentHistory(selectAccidentHistory);
	}

	public void setEmail(String eMail) {
		onTheSeaInsuranceRegistration.setEmail(eMail);
	}

	public void setTotalPrice(int totalPrice) {
		onTheSeaInsuranceRegistration.setTotalPrice(totalPrice);
	}

	public void setDate(String date) {
		onTheSeaInsuranceRegistration.setDate(date);
	}
}