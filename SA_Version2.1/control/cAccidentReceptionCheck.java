package control;

import accidentReception.accidentReceptionCheckVO;

public class cAccidentReceptionCheck {
	private accidentReceptionCheckVO accidentReceptionCheck;
	
	public cAccidentReceptionCheck() {
		this.accidentReceptionCheck = new accidentReceptionCheckVO();
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
