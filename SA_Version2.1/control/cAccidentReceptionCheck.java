package control;

import accidentReception.accidentReceptionCheckVO;

public class cAccidentReceptionCheck {
	private accidentReceptionCheckVO accidentReceptionCheck;
	
	public cAccidentReceptionCheck() {
		this.accidentReceptionCheck = new accidentReceptionCheckVO();
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
