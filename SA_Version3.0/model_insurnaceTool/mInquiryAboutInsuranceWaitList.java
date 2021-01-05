package model_insurnaceTool;

import java.util.ArrayList;

import dao.searchDaoImpl;
import model_insurance.insuranceList;
import model_insurance.insuranceListImpl;

public class mInquiryAboutInsuranceWaitList {

   public insuranceList insuranceList;
   private searchDaoImpl searchDaoImpl;
   private ArrayList<String> insuranceWaitList;

   public mInquiryAboutInsuranceWaitList() {

      this.insuranceList = new insuranceListImpl();

      try {
         this.searchDaoImpl = new searchDaoImpl();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public ArrayList<String> searchForInsuranceWaitList(boolean searchMethod) {
      this.insuranceWaitList = new ArrayList<String>();
      this.insuranceWaitList = this.searchDaoImpl.inquiryForInsuranceWaitList(searchMethod);
      return insuranceWaitList;
   }

}