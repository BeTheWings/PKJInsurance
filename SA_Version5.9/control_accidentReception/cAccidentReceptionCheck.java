package control_accidentReception;

import model_accidentReception.mAccidentReceptionCheck;

public class cAccidentReceptionCheck {
	private mAccidentReceptionCheck accidentReceptionCheck;
	
	public cAccidentReceptionCheck() {
		this.accidentReceptionCheck = new mAccidentReceptionCheck();
	}

	public void sendAcceptMessage(int i) { //����
		this.accidentReceptionCheck.sendAcceptMessage(i);
		this.accidentReceptionCheck.sendInsuranceMoney();
	}

	public void sendDenialMessage(int i) { //����
		this.accidentReceptionCheck.sendDenialMessage(i);
		this.accidentReceptionCheck.sendInsuranceMoney();
	}

}
