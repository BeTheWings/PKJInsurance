package control;

import java.util.ArrayList;

import model_accidentReception.mAccidentReceptionApplication;

public class cAccidentReceptionApplication {

	private mAccidentReceptionApplication accidentReceptionApplication;

	public cAccidentReceptionApplication() {
		this.accidentReceptionApplication = new mAccidentReceptionApplication();
	}

	public void sendAcceptMessage(int i) {

		this.accidentReceptionApplication.sendApplication();
	}

	public boolean search(String insuranceName) {
		boolean checker = false;
		checker = this.accidentReceptionApplication.setCheckInsuranceName(insuranceName);
		return checker;
	}

	public void setData(ArrayList<String> data) {
		// insuranceName
		this.accidentReceptionApplication.setInsuranceName(data.get(0));
		// name
		this.accidentReceptionApplication.setName(data.get(1));
		// idNumber
		this.accidentReceptionApplication.setIdNumber(data.get(2));
		// phoneNumber
		this.accidentReceptionApplication.setPhoneNumber(data.get(3));
		// email
		this.accidentReceptionApplication.setEmail(data.get(4));
		// gender
		this.accidentReceptionApplication.setGender(data.get(5));
		// accidentContent
		this.accidentReceptionApplication.setAccidentContent(data.get(6));

	}

}