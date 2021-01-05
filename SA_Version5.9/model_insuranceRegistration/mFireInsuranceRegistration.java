package model_insuranceRegistration;

import java.util.ArrayList;

import dao_insuranceDesigning.fireInsuranceDaoImpl;
import dao_insuranceRegistration.fireInsuranceClientDaoImpl;
import dao_insuranceRegistration.pdDaoImpl;
import entity.fireEntity;

public class mFireInsuranceRegistration {
	private String name;
	// 이름
	private String residentRegistrationNumber;
	// 주민번호
	private String age;
	// 나이
	// 성별
	private String gender;
	// 전화번호
	private String phoneNumber;
	// 주소
	private String address;
	// 통장번호
	private String accountNumber;
	// 이메일
	private String email;
	// 이메일
	private String job;
	// 사고 있없
	private String selectAccidentHistory;
	// 사고이력
	private String accidentHistory;
	// 장기보험여부
	private boolean longterm;
	// 재산
	private String propertyType;
	private String date;
	private float totalPrice;
	private String insuranceName;
	private String property;
	private String note;
	private String rate;
	private String insuranceCategory;

	private ArrayList<String> list;
	private ArrayList<String> list2;
	private pdDaoImpl pdDaoImpl;
	private ArrayList<String> labelList;
	private fireEntity fireEntity;
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;
	private fireInsuranceDaoImpl fireInsuranceDaoImpl;

	public mFireInsuranceRegistration() {

		this.labelList = new ArrayList<String>();
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = null;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.insuranceName = null;
		this.gender = null;
		this.email = null;
		this.accidentHistory = null;
		this.propertyType = null;
		this.longterm = false;
		this.date = null;
		this.totalPrice = 0;
		this.rate = null;

		this.list = new ArrayList<String>();
		this.list2 = new ArrayList<String>();
		this.fireEntity = new fireEntity();
		try {
			this.fireInsuranceDaoImpl = new fireInsuranceDaoImpl();
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public boolean checkName(String name2, ArrayList<String> result) {// name = 보험이름 입력값
		return this.fireEntity.checkName(name2, result);
	}

	public ArrayList<String> search(String name) {
		return this.fireInsuranceClientDaoImpl.search(name);
	}

	public void TossToEntity(mFireInsuranceRegistration mFireInsuranceRegistration) {
		System.out.println("직업" + this.job);
		System.out.println(mFireInsuranceRegistration.getRate() + "rate");
		System.out.println(rate + "rate222");
		this.fireEntity.run(this.getTotalPrice(), mFireInsuranceRegistration);
	}

	public int findPayIn(String insuranceName) {
		int findPayIn = this.fireInsuranceDaoImpl.findPayIn(insuranceName);
		return findPayIn;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSelectAccidentHistory() {
		return selectAccidentHistory;
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		this.selectAccidentHistory = selectAccidentHistory;
	}

	public String getAccidentHistory() {
		return accidentHistory;
	}

	public void setAccidentHistory(String accidentHistory) {
		this.accidentHistory = accidentHistory;
	}

	public boolean getLongterm() {
		return longterm;
	}

	public void setLongterm(boolean longterm) {
		this.longterm = longterm;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
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

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public ArrayList<String> getList2() {
		return list2;
	}

	public void setList2(ArrayList<String> list2) {
		this.list2 = list2;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRate() {
		return rate;
	}

	public pdDaoImpl getPdDaoImpl() {
		return pdDaoImpl;
	}

	public void setPdDaoImpl(pdDaoImpl pdDaoImpl) {
		this.pdDaoImpl = pdDaoImpl;
	}

	public ArrayList<String> getLabelList() {
		return labelList;
	}

	public void setLabelList(ArrayList<String> labelList) {
		this.labelList = labelList;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String takeCategory(mFireInsuranceRegistration mFireInsuranceRegistration) {
		return this.fireInsuranceClientDaoImpl.takeCategory(mFireInsuranceRegistration);
	}

}