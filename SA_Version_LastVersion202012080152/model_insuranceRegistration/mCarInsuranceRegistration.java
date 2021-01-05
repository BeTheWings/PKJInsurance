package model_insuranceRegistration;

import java.util.ArrayList;

import dao_insuranceDesigning.carInsuranceDaoImpl;
import dao_insuranceRegistration.carInsuranceClientDaoImpl;
import dao_insuranceRegistration.pdDaoImpl;
import entity.carEntity;

public class mCarInsuranceRegistration {
	private String insuranceName;
	private String name;
	private String residentRegistrationNumber;
	private String age;
	private String phoneNumber;
	private String address;
	private String accountNumber;
	private String gender;
	private String job;
	private boolean longterm;
	private String carModel;
	private String carNumber;
	private String email;
	private String accidentHistory;
	private String selectAccidentHistory;
	private String date;
	private float totalPrice;
	private carEntity carEntity;
	private String insuranceCategory;
	private String rate;

	private ArrayList<String> list2;
	private ArrayList<String> list;
	private carInsuranceClientDaoImpl carInsuranceClientDaoImpl;
	private carInsuranceDaoImpl carInsuranceDaoImpl;
	private pdDaoImpl pdDaoImpl;

	public mCarInsuranceRegistration() {
		this.carEntity = new carEntity();
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = null;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.email = null;
		this.accidentHistory = null;
		this.date = null;
		this.totalPrice = (float) 0;
		this.longterm = false;
		this.carModel = null;
		this.carNumber = null;
		this.insuranceCategory = null;
		this.rate = null;
		this.list = new ArrayList<String>();
		this.list2 = new ArrayList<String>();
		try {
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			this.carInsuranceDaoImpl = new carInsuranceDaoImpl();
			this.carInsuranceClientDaoImpl = new carInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String takeCategory(mCarInsuranceRegistration mCarInsuranceRegistration) {
		return this.carInsuranceClientDaoImpl.takeCategory(mCarInsuranceRegistration);
	}

	public ArrayList<String> search(String name2) {
		return this.carInsuranceClientDaoImpl.search(name2);
	}

	public boolean checkName(String name2, ArrayList<String> result) {// name = 보험이름 입력값
		return this.carEntity.checkName(name2, result);
	}

	public void TossToEntity(mCarInsuranceRegistration mCarInsuranceRegistration) {
		this.carEntity.run(this.getTotalPrice(), mCarInsuranceRegistration);
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResidentRegistrationNumber() {
		return residentRegistrationNumber;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public boolean getLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccidentHistory() {
		return accidentHistory;
	}

	public void setAccidentHistory(String accidentHistory) {
		this.accidentHistory = accidentHistory;
	}

	public String getSelectAccidentHistory() {
		return selectAccidentHistory;
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		this.selectAccidentHistory = selectAccidentHistory;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float payIn) {
		this.totalPrice = payIn;
	}

	public ArrayList<String> getList2() {
		return list2;
	}

	public void setList2(ArrayList<String> list2) {
		this.list2 = list2;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public int findPayIn(String insuranceName) {
		int findPayIn = this.carInsuranceDaoImpl.findPayIn(insuranceName);
		return findPayIn;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRate() {
		return rate;
	}

}