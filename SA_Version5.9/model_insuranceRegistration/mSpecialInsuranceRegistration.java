package model_insuranceRegistration;

import java.util.ArrayList;

import dao_insuranceDesigning.specialInsuranceDaoImpl;
import dao_insuranceRegistration.pdDaoImpl;
import dao_insuranceRegistration.specialInsuranceClientDaoImpl;
import entity.specialEntity;

public class mSpecialInsuranceRegistration {
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
	private String email;
	private String specialType;
	private String property;
	private specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl;
	private specialInsuranceDaoImpl specialInsuranceDaoImpl;
	private ArrayList<String> list;
	private String accidentHistory;
	private String selectAccidentHistory;
	private String date;
	private float totalPrice;
	private String note;
	private specialEntity specialEntity;
	private String insuranceCategory;
	private String rate;

	private ArrayList<String> list2;
	private pdDaoImpl pdDaoImpl;

	public mSpecialInsuranceRegistration() {
		this.specialEntity = new specialEntity();
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = null;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.rate = null;
		this.longterm = false;
		this.list = new ArrayList<String>();
		try {
			this.specialInsuranceDaoImpl = new specialInsuranceDaoImpl();
			this.specialInsuranceClientDaoImpl = new specialInsuranceClientDaoImpl();
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.date = null;
		this.totalPrice = (float) 0;
		this.list2 = new ArrayList<String>();
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public boolean checkName(String name2, ArrayList<String> result) {// name = 보험이름 입력값
		return this.specialEntity.checkName(name2, result);
	}

	public void TossToEntity(mSpecialInsuranceRegistration mSpecialInsuranceRegistration) {
		this.specialEntity.run(this.getTotalPrice(), mSpecialInsuranceRegistration);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSpecialType() {
		return specialType;
	}

	public void setSpecialType(String specialType) {
		this.specialType = specialType;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public specialInsuranceClientDaoImpl getSpecialInsuranceClientDaoImpl() {
		return specialInsuranceClientDaoImpl;
	}

	public void setSpecialInsuranceClientDaoImpl(specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl) {
		this.specialInsuranceClientDaoImpl = specialInsuranceClientDaoImpl;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
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

	public pdDaoImpl getPdDaoImpl() {
		return pdDaoImpl;
	}

	public void setPdDaoImpl(pdDaoImpl pdDaoImpl) {
		this.pdDaoImpl = pdDaoImpl;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public ArrayList<String> search(String name2) {
		return this.specialInsuranceClientDaoImpl.search(name2);
	}

	public String takeCategory(mSpecialInsuranceRegistration mSpecialInsuranceRegistration) {
		return this.specialInsuranceClientDaoImpl.takeCategory(mSpecialInsuranceRegistration);
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRate() {
		return rate;
	}

	public int findPayIn(String insuranceName) {
		int findPayIn = this.specialInsuranceDaoImpl.findPayIn(insuranceName);
		return findPayIn;
	}
}