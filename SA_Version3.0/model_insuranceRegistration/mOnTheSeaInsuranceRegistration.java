package model_insuranceRegistration;

import java.util.ArrayList;

import dao.onTheSeaInsuranceClientDaoImpl;
import dao.pdDaoImpl;

public class mOnTheSeaInsuranceRegistration {
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
	private String selectBoatType;
	private String selectOnTheSeaType;
	private String selectAccidentHistory;
	private String email;
	private String accidentHistory;
	private ArrayList<String> list;
	private onTheSeaInsuranceClientDaoImpl onTheSeaInsuranceClientDaoImpl;
	private String date;
	private int totalPrice;
	private String note;

	private ArrayList<String> list2;
	private pdDaoImpl pdDaoImpl;

	public mOnTheSeaInsuranceRegistration() {
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = null;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.longterm = false;
		this.list = new ArrayList<String>();
		this.list2 = new ArrayList<String>();

		try {
			this.onTheSeaInsuranceClientDaoImpl = new onTheSeaInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.date = null;
		this.totalPrice = 0;
		try {
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

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

	public String getSelectBoatType() {
		return selectBoatType;
	}

	public void setSelectBoatType(String selectBoatType) {
		this.selectBoatType = selectBoatType;
	}

	public String getSelectOnTheSeaType() {
		return selectOnTheSeaType;
	}

	public void setSelectOnTheSeaType(String selectOnTheSeaType) {
		this.selectOnTheSeaType = selectOnTheSeaType;
	}

	public String getSelectAccidentHistory() {
		return selectAccidentHistory;
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		this.selectAccidentHistory = selectAccidentHistory;
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

	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public onTheSeaInsuranceClientDaoImpl getOnTheSeaInsuranceClientDaoImpl() {
		return onTheSeaInsuranceClientDaoImpl;
	}

	public void setOnTheSeaInsuranceClientDaoImpl(onTheSeaInsuranceClientDaoImpl onTheSeaInsuranceClientDaoImpl) {
		this.onTheSeaInsuranceClientDaoImpl = onTheSeaInsuranceClientDaoImpl;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
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

}