package insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.fireInsuranceClientDaoImpl;
import dao.pdDaoImpl;

public class fireInsuranceRegistration {

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
	private String longterm;
	// 재산
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
		this.list.add(age + "살");
		this.list.add(gender);
		this.list.add(phoneNumber);
		this.list.add(address);
		this.list.add(accountNumber);
		this.list.add(job);
		if (longterm.equals("장기보험")) {
			this.list.add(Integer.toString(1));
		} else {
			this.list.add(Integer.toString(0));
		}

		if (this.selectAccidentHistory.equals("사고 이력 있음")) {
			this.list.add(accidentHistory);
		} else {
			// 있으면 1 없으면 0
			this.list.add("사고이력없음");
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