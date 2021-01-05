package insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.fireInsuranceClientDaoImpl;
import dao.pdDaoImpl;

public class fireInsuranceRegistrationVO {

	private String name;
	// �̸�
	private String residentRegistrationNumber;
	// �ֹι�ȣ
	private String age;
	// ����
	// ����
	private String gender;
	// ��ȭ��ȣ
	private String phoneNumber;
	// �ּ�
	private String address;
	// �����ȣ
	private String accountNumber;
	// �̸���
	private String email;
	// �̸���
	private String job;
	// ��� �־�
	private String selectAccidentHistory;
	// ����̷�
	private String accidentHistory;
	// ��⺸�迩��
	private String longterm;
	// ���
	private String propertyType;
	private String date;
	private int totalPrice;
	private String insuranceName;
	private ArrayList<String> list;
	private ArrayList<String> list2;
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;
	private pdDaoImpl pdDaoImpl;
	private ArrayList<String> labelList;

	public fireInsuranceRegistrationVO() {
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
		this.longterm = null;
		this.date = null;
		this.totalPrice = 0;

		this.list = new ArrayList<String>();
		this.list2 = new ArrayList<String>();

		try {
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void run() {

		this.list.add(name);
		this.list.add(residentRegistrationNumber);
		this.list.add(age + "��");
		this.list.add(gender);
		this.list.add(phoneNumber);
		this.list.add(address);
		this.list.add(accountNumber);
		this.list.add(job);
		if (longterm.equals("��⺸��")) {
			this.list.add(Integer.toString(1));
		} else {
			this.list.add(Integer.toString(0));
		}

		if (this.selectAccidentHistory.equals("��� �̷� ����")) {
			this.list.add(accidentHistory);
		} else {
			// ������ 1 ������ 0
			this.list.add("����̷¾���");
		}

		this.list.add(email);
		this.list.add(propertyType);

		this.list2.add(date);
		this.list2.add(Integer.toString(totalPrice));

		try {
			this.fireInsuranceClientDaoImpl.insert(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			this.pdDaoImpl.insert(list2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public String getLongterm() {
		return longterm;
	}

	public void setLongterm(String longterm) {
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

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
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

	public fireInsuranceClientDaoImpl getFireInsuranceClientDaoImpl() {
		return fireInsuranceClientDaoImpl;
	}

	public void setFireInsuranceClientDaoImpl(fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl) {
		this.fireInsuranceClientDaoImpl = fireInsuranceClientDaoImpl;
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
	
}