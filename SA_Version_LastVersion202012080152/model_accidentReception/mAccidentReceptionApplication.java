package model_accidentReception;

import java.util.ArrayList;

import dao_insuranceTool.accidentDaoImpl;
import model_client.mClient;

public class mAccidentReceptionApplication {
	private int isAllright;
	private accidentDaoImpl accidentDaoImpl;
	// employee
	public mInsurancePostProcessor insurancePostProcessor;
	private mClient mClient;
	

	private String name;
	private String idNumber;
	private String phoneNumber;
	private String eMail;
	private String gender;
	private String accidentContent;
	private ArrayList<String> list;
	private String insuranceName;

	public mAccidentReceptionApplication() {
		this.name = null;
		this.idNumber = null;
		this.phoneNumber = null;
		this.eMail = null;
		this.accidentContent = null;
		this.insuranceName = null;
		this.list = new ArrayList<String>();
		this.accidentDaoImpl = new accidentDaoImpl();
		this.mClient = new mClient();
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

	public void sendAcceptMessage(int i) {
		this.isAllright = i;
	}

	public void sendApplication() {
		mClient input = new mClient();
		input.setInsuranceName(insuranceName);
		input.setClientName(name);
		input.setResidentRegistrationNumber(idNumber);
		input.setGender(gender);
		input.setPhoneNumber(phoneNumber);
		input.setEmail(eMail);
		input.setAccidentContent(accidentContent);
		input.setEmployeeID(3);
		this.accidentDaoImpl.insert(input);

	}

	public boolean setCheckInsuranceName(String checkInsuranceName) {
		this.insuranceName = checkInsuranceName;
		boolean checker = false;
		
		if(!this.insuranceName.contentEquals("")) {
			this.mClient.setInsuranceName(checkInsuranceName);
			checker = this.accidentDaoImpl.checkInsuranceName(mClient);
			return checker;
		}
		return checker;
	}

}