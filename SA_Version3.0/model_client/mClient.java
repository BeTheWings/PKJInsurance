package model_client;

import java.util.ArrayList;

import dao.searchclientDaoImpl;

public class mClient {

	private String accidentContent;
	private String accountNumber;
	private String address;
	private String email;

	private String age;
	private int clientID;
	private String gender;
	private int insuranceID;
	private String insuranceName;

	private int accidentID;
	private String job;
	private String clientName;
	private String phoneNumber;
	private int accidentId;
	private String insuranceCategory;

	// 주민등록번호

	private searchclientDaoImpl saerchclientDaoImpl;
	private ArrayList<String> clientList;

	private String residentRegistrationNumber;

	public mClient() {
		this.clientList = new ArrayList<String>();
		this.saerchclientDaoImpl = new searchclientDaoImpl();

	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getClientName() {
		return clientName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public int getAccidentId() {
		return accidentId;
	}

	public void setAccidentId(int accidentId) {
		this.accidentId = accidentId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAccidentID() {
		return accidentID;
	}

	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getInsuranceID() {
		return insuranceID;
	}

	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}

	public String getAccidentContent() {
		return accidentContent;
	}

	public void setAccidentContent(String accidentContent) {
		this.accidentContent = accidentContent;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public ArrayList<String> getClientList() {
		return clientList;
	}

	public void setClientList(ArrayList<String> clientList) {
		this.clientList = clientList;
	}

	public void searchForClientInfor() {
		this.clientList = this.saerchclientDaoImpl.searchForClientInfor(this);
	}

	public void withdraw() {

		if (this.insuranceCategory.equals("화재보험")) {
			this.saerchclientDaoImpl.deleteFireInsurance(this.insuranceCategory, this.clientName, this.insuranceName);
		} else if (this.insuranceCategory.equals("해상보험")) {
			this.saerchclientDaoImpl.deleteOnTheSeaInsurance(this.insuranceCategory, this.clientName,
					this.insuranceName);
		} else if (this.insuranceCategory.equals("특종보험")) {
			this.saerchclientDaoImpl.deleteSpecialInsurance(this.insuranceCategory, this.clientName,
					this.insuranceName);
		} else if (this.insuranceCategory.equals("자동차보험")) {
			this.saerchclientDaoImpl.deleteCarInsurance(this.insuranceCategory, this.clientName, this.insuranceName);
		} else {
			System.out.println("없는 카테고리의 보험입니다.");
		}
	}
}