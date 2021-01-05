package control;

import java.util.ArrayList;

import accidentReception.accidentReceptionApplication;
import dao.accidentDaoImpl;

public class cAccidentReceptionApplication {

	private accidentReceptionApplication accidentReceptionApplicationVO;
	private String name;
	private String idNumber;
	private String phoneNumber;
	private String email;
	private String gender;
	private String accidentContent;
	private accidentDaoImpl accidentDaoImpl;

	public cAccidentReceptionApplication() {
		this.accidentReceptionApplicationVO = new accidentReceptionApplication();
		this.accidentDaoImpl = new accidentDaoImpl();
	}

	public void setData(ArrayList<String> data) {
		this.name = data.get(0);
		this.idNumber = data.get(1);
		this.gender = data.get(4);
		this.phoneNumber = data.get(2);
		this.email = data.get(3);
		this.accidentContent = data.get(5);
		
		this.accidentReceptionApplicationVO.setName(this.name);
		this.accidentReceptionApplicationVO.setIdNumber(this.idNumber);
		this.accidentReceptionApplicationVO.setGender(this.gender);
		this.accidentReceptionApplicationVO.setPhoneNumber(this.phoneNumber);
		this.accidentReceptionApplicationVO.setEmail(this.email);
		this.accidentReceptionApplicationVO.setAccidentContent(this.accidentContent);
		this.accidentDaoImpl.insert(accidentReceptionApplicationVO);

	}

}