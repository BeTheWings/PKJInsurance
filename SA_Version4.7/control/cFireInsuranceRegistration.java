package control;

import java.util.ArrayList;

import dao.fireInsuranceClientDaoImpl;
import model_insuranceRegistration.mFireInsuranceRegistration;

public class cFireInsuranceRegistration {
	private mFireInsuranceRegistration mFireInsuranceRegistration;
	private fireInsuranceClientDaoImpl fireInsuranceClientDaoImpl;
	
	public cFireInsuranceRegistration() {
		this.mFireInsuranceRegistration = new mFireInsuranceRegistration();
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setData(ArrayList<String> list) {
		String category = list.get(0);
		mFireInsuranceRegistration.setInsuranceName(category);
		String name = list.get(1);
		mFireInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		mFireInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		mFireInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		mFireInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		mFireInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		mFireInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		mFireInsuranceRegistration.setEmail(email);
		String accidentHistory = list.get(9);
//		fireInsuranceRegistration.setAccidentHistory(accidentHistory);
		
		String gender = list.get(10);
		mFireInsuranceRegistration.setGender(gender);
		String job = list.get(11);
		mFireInsuranceRegistration.setJob(job);
		String propertyType = list.get(12);
		if(propertyType.equals("��������")) {
			mFireInsuranceRegistration.setProperty(propertyType);
		} else if(propertyType.equals("��Ÿ")){
			mFireInsuranceRegistration.setProperty(list.get(8));
		}
		String longterm = list.get(13);
		if(longterm.equals("��⺸��")) {
			mFireInsuranceRegistration.setLongterm(true);
		} else {
			mFireInsuranceRegistration.setLongterm(false);	
		}
		String note = list.get(14);
		if(note.equals("��� �̷� ����")) {
			mFireInsuranceRegistration.setAccidentHistory(accidentHistory);
		} else if(note.equals("��� �̷� ����")) {
			mFireInsuranceRegistration.setAccidentHistory("����̷¾���");
		}

		int length = Integer.parseInt(list.get(15));// length ���� Ư�� ����.
		mFireInsuranceRegistration.setTotalPrice(length);
		String date = list.get(16);
		mFireInsuranceRegistration.setDate(date);
		
		this.mFireInsuranceRegistration.TossToEntity(mFireInsuranceRegistration);
		
//		this.fireInsuranceClientDaoImpl.insert(mFireInsuranceRegistration);
	}

	public boolean checkCategory(String name) {// name = �����̸� �ؽ�Ʈ
		boolean checker = false;
		
		checker = fireInsuranceClientDaoImpl.search(name);//Ʈ�翩��
		return checker;
	}
}