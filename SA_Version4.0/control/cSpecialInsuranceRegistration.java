package control;

import java.util.ArrayList;

import dao.specialInsuranceClientDaoImpl;
import model_insuranceRegistration.mSpecialInsuranceRegistration;

public class cSpecialInsuranceRegistration {

   private mSpecialInsuranceRegistration specialInsuranceRegistrationVO;
   private specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl;

   public cSpecialInsuranceRegistration() {
      this.specialInsuranceRegistrationVO = new mSpecialInsuranceRegistration();
      try {
		this.specialInsuranceClientDaoImpl = new specialInsuranceClientDaoImpl();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   public void setData(ArrayList<String> list) {
		String category = list.get(0);
		specialInsuranceRegistrationVO.setInsuranceName(category);
		String name = list.get(1);
		specialInsuranceRegistrationVO.setName(name);
		String registrationNumber = list.get(2);
		specialInsuranceRegistrationVO.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(3);
		specialInsuranceRegistrationVO.setAge(age);
		String phoneNumber = list.get(4);
		specialInsuranceRegistrationVO.setPhoneNumber(phoneNumber);
		String address = list.get(5);
		specialInsuranceRegistrationVO.setAddress(address);
		String accountNumber = list.get(6);
		specialInsuranceRegistrationVO.setAccountNumber(accountNumber);
		String email = list.get(7);
		specialInsuranceRegistrationVO.setEmail(email);
		String property = list.get(8);
		specialInsuranceRegistrationVO.setProperty(property);
		String accidentHistory = list.get(9);
		specialInsuranceRegistrationVO.setAccidentHistory(accidentHistory);
	
		String gender = list.get(10);
		specialInsuranceRegistrationVO.setGender(gender);
		String job = list.get(11);
		specialInsuranceRegistrationVO.setJob(job);
		String longterm = list.get(12);
		if(longterm.equals("장기보험")) {
			specialInsuranceRegistrationVO.setLongterm(true);
		} else {
			specialInsuranceRegistrationVO.setLongterm(false);
		}
		String specialType = list.get(13);
		specialInsuranceRegistrationVO.setSpecialType(specialType);
		String note = list.get(14);
		specialInsuranceRegistrationVO.setNote(note);
		int totalPrice = Integer.parseInt(list.get(15));
		totalPrice = totalPrice*50000;
		specialInsuranceRegistrationVO.setTotalPrice(totalPrice);
		String date = list.get(16);
		specialInsuranceRegistrationVO.setDate(date);
		
		this.specialInsuranceClientDaoImpl.insert(specialInsuranceRegistrationVO);
	}

public boolean checkCategory(String name) {
	boolean checker = false;
	
	checker = specialInsuranceClientDaoImpl.search(name);//트루여야
	return checker;
}

}