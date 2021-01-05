package model_accidentReception;

import dao.accidentDaoImpl;
import model_insurnaceTool.mInsurancePostProcessor;

public class mAccidentReceptionApplication {

	private accidentDaoImpl accidentDaoImpl;
	// employee
	public mInsurancePostProcessor insurancePostProcessor;

	private String name;
	private String idNumber;
	private String phoneNumber;
	private String eMail;
	private String gender;
	private String accidentContent;
	private String insuranceName;
	private int accidentID;
	private String insuranceCategory;

	public int getAccidentID() {
		return accidentID;
	}

	public void setAccidentID(int accidentID) {
		this.accidentID = accidentID;
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public mAccidentReceptionApplication() {
		this.name = null;
		this.idNumber = null;
		this.phoneNumber = null;
		this.eMail = null;
		this.accidentContent = null;
		this.insuranceName = null;
		this.accidentDaoImpl = new accidentDaoImpl();
	}

	public mInsurancePostProcessor getInsurancePostProcessor() {
		return insurancePostProcessor;
	}

	public void setInsurancePostProcessor(mInsurancePostProcessor insurancePostProcessor) {
		this.insurancePostProcessor = insurancePostProcessor;
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

	public String getInsuranceName() {
		return insuranceName;
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

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public void sendApplication() {

		this.accidentDaoImpl.insert(this);

	}

	public boolean setCheckInsuranceName(String checkInsuranceName) {
		this.insuranceName = checkInsuranceName;
		boolean checker = false;

		if (!this.insuranceName.contentEquals("")) {

			checker = this.accidentDaoImpl.checkInsuranceName(this);
			return checker;
		}
		return checker;
	}

}