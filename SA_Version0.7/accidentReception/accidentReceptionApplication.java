package accidentReception;

import java.util.ArrayList;

import dao.accidentDaoImpl;
import insurnaceTool.insurancePostProcessor;

public class accidentReceptionApplication {
	private int isAllright;
	private accidentDaoImpl accidentDaoImpl;
	// employee
	public insurancePostProcessor insurancePostProcessor;

	private String name;
	private String idNumber;
	private String phoneNumber;
	private String eMail;
	private String gender;
	private String accidentContent;
	private ArrayList<String> list;

	public accidentReceptionApplication() {
		this.name = null;
		this.idNumber = null;
		this.phoneNumber = null;
		this.eMail = null;
		this.accidentContent = null;
		this.list = new ArrayList<String>();
		this.accidentDaoImpl = new accidentDaoImpl();
	}

	public void setName(String name2) {
		this.name = name2;
	}

	public void setIdNumber(String idNumber2) {
		this.idNumber = idNumber2;
	}

	public void setPhoneNumber(String phoneNumber2) {
		this.phoneNumber = phoneNumber2;
	}

	public void setEmail(String eMail2) {
		this.eMail = eMail2;
	}

	public void setGender(String actionCommand) {
		this.gender = actionCommand;
	}

	public void setAccidentContent(String text) {
		this.accidentContent = text;
	}

	public void run() {

	}

	public void sendAcceptMessage(int i) {
		this.isAllright = i;
	}

	public void sendApplication() {
		list.add(name);
		list.add(idNumber);
		list.add(gender);
		list.add(phoneNumber);
		list.add(eMail);
		list.add(accidentContent);
		this.accidentDaoImpl.insert(list);

	}

}