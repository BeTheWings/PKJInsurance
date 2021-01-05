package control;

import java.util.ArrayList;

import insuranceRegistration.fireInsuranceRegistration;

public class cFireInsuranceRegistration {

	private fireInsuranceRegistration fireInsuranceRegistration;
	private ArrayList<String> Data;
	private ArrayList<String> labelName;
	String name;
	String registrationNumber;

	public cFireInsuranceRegistration() {
		this.fireInsuranceRegistration = new fireInsuranceRegistration();
	}

	public void run(ArrayList<String> data) {
		this.Data = new ArrayList<String>();
		this.name = this.Data.get(0);
		this.registrationNumber = this.Data.get(1);
		// 여기서부터어케함?

	}

	public void setName() {
		fireInsuranceRegistration.setName(this.name);
	}

	public void setResidentRegistrationNumber() {
		fireInsuranceRegistration.setResidentRegistrationNumber(this.registrationNumber);
	}

	public void setAge(String age) {
		fireInsuranceRegistration.setAge(age);
	}

	public void setPhoneNumber(String phoneNumber) {
		fireInsuranceRegistration.setPhoneNumber(this.Data.get(3));
	}

	public void setAddress(String address) {
		fireInsuranceRegistration.setAddress(address);
	}

	public void setAccountNumber(String accountNumber) {
		fireInsuranceRegistration.setAccountNumber(accountNumber);
	}

	public void setGender(String gender) {
		fireInsuranceRegistration.setGender(gender);
	}

	public void setJob(String job) {
		fireInsuranceRegistration.setJob(job);
	}

	public void setLongterm(String longterm) {
		fireInsuranceRegistration.setLongterm(longterm);
	}

	public void setBuildingType(String buildingType) {
		fireInsuranceRegistration.setBuildingType(buildingType);
	}

	public void setEmail(String eMail) {
		fireInsuranceRegistration.setEmail(eMail);
	}

	public void setAccidentHistory(String accidentHistory) {
		fireInsuranceRegistration.setAccidentHistroy(accidentHistory);
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		fireInsuranceRegistration.setSelectAccidentHistory(selectAccidentHistory);
	}

	public void setTotalPrice(int totalPrice) {
		fireInsuranceRegistration.setTotalPrice(totalPrice);
	}

	public void setDate(String date) {
		fireInsuranceRegistration.setDate(date);
	}
}