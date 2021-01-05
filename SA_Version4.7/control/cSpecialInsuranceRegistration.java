package control;

import java.util.ArrayList;

import dao.specialInsuranceClientDaoImpl;
import model_insuranceRegistration.mSpecialInsuranceRegistration;

public class cSpecialInsuranceRegistration {

   private mSpecialInsuranceRegistration mSpecialInsuranceRegistration;
   private specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl;

   public cSpecialInsuranceRegistration() {
      this.mSpecialInsuranceRegistration = new mSpecialInsuranceRegistration();
      try {
		this.specialInsuranceClientDaoImpl = new specialInsuranceClientDaoImpl();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   public void setData(ArrayList<String> list) {
		String category = list.get(0);
		mSpecialInsuranceRegistration.setInsuranceName(category);
		String name = list.get(1);
		mSpecialInsuranceRegistration.setName(name);
		String registrationNumber = list.get(2);
		mSpecialInsuranceRegistration.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		mSpecialInsuranceRegistration.setAge(age);
		String phoneNumber = list.get(4);
		mSpecialInsuranceRegistration.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		mSpecialInsuranceRegistration.setAddress(address);
		String accountNumber = list.get(6);
		mSpecialInsuranceRegistration.setAccountNumber(accountNumber);
		String email = list.get(7);
		mSpecialInsuranceRegistration.setEmail(email);
		String property = list.get(8);
		mSpecialInsuranceRegistration.setProperty(property);
		String accidentHistory = list.get(9);
	
		String gender = list.get(10);
		mSpecialInsuranceRegistration.setGender(gender);
		String job = list.get(11);
		mSpecialInsuranceRegistration.setJob(job);
		String longterm = list.get(12);
		if(longterm.equals("장기보험")) {
			mSpecialInsuranceRegistration.setLongterm(true);
		} else {
			mSpecialInsuranceRegistration.setLongterm(false);
		}
		String specialType = list.get(13);
		mSpecialInsuranceRegistration.setSpecialType(specialType);
		String note = list.get(14);
		if(note.equals("사고 이력 있음")) {
			mSpecialInsuranceRegistration.setAccidentHistory(accidentHistory);
		} else {
			mSpecialInsuranceRegistration.setAccidentHistory("사고이력없음");
		}
		mSpecialInsuranceRegistration.setNote(note);
		int totalPrice = Integer.parseInt(list.get(15));
		mSpecialInsuranceRegistration.setTotalPrice(totalPrice);
		String date = list.get(16);
		mSpecialInsuranceRegistration.setDate(date);
		
		this.mSpecialInsuranceRegistration.TossToEntity(mSpecialInsuranceRegistration);
	}

public boolean checkCategory(String name) {
	boolean checker = false;
	
	checker = specialInsuranceClientDaoImpl.search(name);//트루여야
	return checker;
}

}