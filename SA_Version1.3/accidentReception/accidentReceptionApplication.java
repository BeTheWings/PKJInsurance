package accidentReception;

import insurnaceTool.insurancePostProcessor;

public class accidentReceptionApplication {


	private String name;
	private String idNumber;
	private String phoneNumber;
	private String eMail;
	private String gender;
	private String accidentContent;

	public accidentReceptionApplication() {
		this.name = null;
		this.idNumber = null;
		this.phoneNumber = null;
		this.eMail = null;
		this.accidentContent = null;
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

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public String getAccidentContent() {
		return accidentContent;
	}

}