package control_accidentReception;

import model_accidentReception.mAccidentReceptionCheck;

public class cAccidentReceptionCheck {
	private mAccidentReceptionCheck accidentReceptionCheck;
	
	public cAccidentReceptionCheck() {
		this.accidentReceptionCheck = new mAccidentReceptionCheck();
	}

	public void sendAcceptMessage(int i) { //½ÂÀÎ
		this.accidentReceptionCheck.sendAcceptMessage(i);
		this.accidentReceptionCheck.sendInsuranceMoney();
	}

	public void sendDenialMessage(int i) { //°ÅÀý
		this.accidentReceptionCheck.sendDenialMessage(i);
		this.accidentReceptionCheck.sendInsuranceMoney();
	}

}
