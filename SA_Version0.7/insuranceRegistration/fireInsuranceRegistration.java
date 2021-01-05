package insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.fireInsuranceClientDaoImpl;
import dao.pdDaoImpl;

public class fireInsuranceRegistration {

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

	public fireInsuranceRegistration() {
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

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setResidentRegistrationNumber(String residentRegistrationNumber) {
		this.residentRegistrationNumber = residentRegistrationNumber;
	}

	public void setLongterm(String longterm2) {
		this.longterm = longterm2;
	}

	public void setAge(String string) {
		this.age = string;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setBuildingType(String buildingType) {
		this.propertyType = buildingType;
	}

	public void setEmail(String eMail) {
		this.email = eMail;
	}

	public void setAccidentHistroy(String accidentHistory) {
		this.accidentHistory = accidentHistory;
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		this.selectAccidentHistory = selectAccidentHistory;
	}

	public void setTotalPrice(int totalPrice2) {
		this.totalPrice = totalPrice2;
	}

	public void setDate(String date2) {
		this.date = date2;

	}

}