package control;

import java.util.ArrayList;

import dao.specialInsuranceClientDaoImpl;
import insuranceRegistration.specialInsuranceRegistrationVO;

public class cSpecialInsuranceRegistration {

   private specialInsuranceRegistrationVO specialInsuranceRegistrationVO;
   private specialInsuranceClientDaoImpl specialInsuranceClientDaoImpl;

   public cSpecialInsuranceRegistration() {
      this.specialInsuranceRegistrationVO = new specialInsuranceRegistrationVO();
      try {
		this.specialInsuranceClientDaoImpl = new specialInsuranceClientDaoImpl();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }

   public void setData(ArrayList<String> list) {
		String name = list.get(0);
		specialInsuranceRegistrationVO.setName(name);
		String registrationNumber = list.get(1);
		specialInsuranceRegistrationVO.setResidentRegistrationNumber(registrationNumber);
		String age = list.get(2);
		specialInsuranceRegistrationVO.setAge(age);
		String phoneNumber = list.get(3);
		specialInsuranceRegistrationVO.setPhoneNumber(phoneNumber);
		String address = list.get(4);
		specialInsuranceRegistrationVO.setAddress(address);
		String accountNumber = list.get(5);
		specialInsuranceRegistrationVO.setAccountNumber(accountNumber);
		String accidentHistory = list.get(6);
		specialInsuranceRegistrationVO.setAccidentHistory(accidentHistory);
		String email = list.get(7);
		specialInsuranceRegistrationVO.setEmail(email);
		String property = list.get(8);
		specialInsuranceRegistrationVO.setProperty(property);
		
		String gender = list.get(8);
		specialInsuranceRegistrationVO.setGender(gender);
		String job = list.get(9);
		specialInsuranceRegistrationVO.setJob(job);
		String longterm = list.get(10);
		if(longterm.equals("장기보험")) {
			specialInsuranceRegistrationVO.setLongterm(true);
		} else {
			specialInsuranceRegistrationVO.setLongterm(false);
		}
		String specialType = list.get(11);
		specialInsuranceRegistrationVO.setSpecialType(specialType);
		String note = list.get(12);
		specialInsuranceRegistrationVO.setNote(note);
		
		int totalPrice = Integer.parseInt(list.get(13));
		specialInsuranceRegistrationVO.setTotalPrice(totalPrice);
		String date = list.get(14);
		specialInsuranceRegistrationVO.setDate(date);
		
		this.specialInsuranceClientDaoImpl.insert(specialInsuranceRegistrationVO);
	}

}