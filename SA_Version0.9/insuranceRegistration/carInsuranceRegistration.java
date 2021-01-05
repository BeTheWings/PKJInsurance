package insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.carInsuranceClientDaoImpl;
import dao.pdDaoImpl;

public class carInsuranceRegistration {
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
	private String carModel;
	private String carNumber;
	private String email;
	private String accidentHistory;
	private String selectAccidentHistory;
	private String date;
	private int totalPrice;

	private ArrayList<String> list2;
	private ArrayList<String> list;
	private carInsuranceClientDaoImpl carInsuranceClientDaoImpl;
	private pdDaoImpl pdDaoImpl;

	public carInsuranceRegistration() {
		this.name = null;
		this.residentRegistrationNumber = null;
		this.age = null;
		this.phoneNumber = null;
		this.address = null;
		this.accountNumber = null;
		this.email = null;
		this.accidentHistory = null;
		this.carNumber = null;
		this.list = new ArrayList<String>();
		this.date = null;
		this.totalPrice = 0;
		this.list2 = new ArrayList<String>();
		try {
			this.pdDaoImpl = new pdDaoImpl();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			this.carInsuranceClientDaoImpl = new carInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void run() {
		this.list.add(this.name);
		this.list.add(this.residentRegistrationNumber);
		this.list.add(this.age + "살");
		this.list.add(this.gender);
		this.list.add(this.phoneNumber);
		this.list.add(this.address);
		this.list.add(accountNumber);
		this.list.add(job);
		if (longterm.equals("장기보험")) {
			this.list.add(Integer.toString(1));
		} else {
			this.list.add(Integer.toString(0));
		}
		if (this.selectAccidentHistory.equals("사고 이력 없음")) {
			this.list.add(selectAccidentHistory);
		} else {
			this.list.add(accidentHistory);
		}
		this.list.add(email);

		this.list.add(carModel);
		System.out.println(carModel);
		this.list.add(carNumber);
		System.out.println(carNumber);

		try {
			this.carInsuranceClientDaoImpl.insert(this.list);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		list2.add(date);
		list2.add(Integer.toString(totalPrice));

		try {
			this.pdDaoImpl.insert2(list2);
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

	public void setCarModel(String carModel) {
		this.carModel = carModel;
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