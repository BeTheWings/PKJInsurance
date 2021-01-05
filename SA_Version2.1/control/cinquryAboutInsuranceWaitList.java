package control;

import java.util.ArrayList;

import dao.searchDaoImpl;

public class cinquryAboutInsuranceWaitList {

   private ArrayList<String> insuranceInformationList;
   private searchDaoImpl searchDaoImpl;

   public cinquryAboutInsuranceWaitList() {
      try {
         this.searchDaoImpl = new searchDaoImpl();
      } catch (Exception e) {	
         e.printStackTrace();
      }
   }

   public ArrayList<String> searchInformation(boolean searchMethod) {
      this.insuranceInformationList = new ArrayList<String>();
      this.insuranceInformationList = this.searchDaoImpl.inquiryForInsuranceWaitList(searchMethod);
      return insuranceInformationList;
   }

}