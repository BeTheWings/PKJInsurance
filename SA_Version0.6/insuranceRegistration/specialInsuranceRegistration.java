package insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.pdDaoImpl;
import dao.specialInsuranceClientDaoImpl;

public class specialInsuranceRegistration {
	private String insuranceName;
	private String name;
	private String residentRegistrationNumber;
	private String age;
	private String phoneNumber;
	private String address;
	private String accountNumber;
	private String gender;
	private String job;
	private String longterm;
	private String email;
	private String specialType;
	private String property;
	private specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl;
	private ArrayList<String> list;
	private String accidentHistory;
	private String selectAccidentHistory;
	private String date;
	private int totalPrice;

	private ArrayList<String> list2;
	private pdDaoImpl pdDaoImpl;

	public specialInsuranceRegistration() {
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = null;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.list = new ArrayList<String>();
		try {
			this.specialInsuranceClientDaoImpl = new specialInsuranceClientDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.date = null;
		this.totalPrice = 0;
		this.list2 = new ArrayList<String>();
		try {
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void run() {

		list.add(name);
		list.add(residentRegistrationNumber);
		list.add(age + "살");
		list.add(gender);
		list.add(phoneNumber);
		list.add(address);
		list.add(accountNumber);
		list.add(job);
		if (longterm.equals("장기보험")) {
			this.list.add(Integer.toString(1));
		} else {
			this.list.add(Integer.toString(0));
		}
		if (this.selectAccidentHistory.equals("사고 이력 있음")) {
			this.list.add(accidentHistory);
		} else {
			this.list.add("사고이력없음");
		}
		this.list.add(email);

		this.list.add(specialType);
		this.list.add(property);

		try {
			specialInsuranceClientDaoImpl.insert(list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(date);
		list2.add(Integer.toString(totalPrice));
		try {
			this.pdDaoImpl.insert4(list2);
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

	public void setLongterm(String longterm) {
		this.longterm = longterm;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSpecialType(String specialType) {
		this.specialType = specialType;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public void setAccidentHistory(String accidentHistory) {
		this.accidentHistory = accidentHistory;
	}

	public void setSelectAccidentHistory(String selectAccidentHistory) {
		this.selectAccidentHistory = selectAccidentHistory;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void setDate(String date) {
		this.date = date;
	}
}