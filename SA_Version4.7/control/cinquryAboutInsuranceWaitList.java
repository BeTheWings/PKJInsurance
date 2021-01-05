package control;

import java.util.ArrayList;

import model_insurnaceTool.mInquiryAboutInsuranceWaitList;

public class cinquryAboutInsuranceWaitList {

   private ArrayList<String> insuranceInformationList;
   private mInquiryAboutInsuranceWaitList mInquiryAboutInsuranceWaitList;

   public cinquryAboutInsuranceWaitList() {
      try {
         this.mInquiryAboutInsuranceWaitList = new mInquiryAboutInsuranceWaitList();
      } catch (Exception e) {	
         e.printStackTrace();
      }
   }

   public ArrayList<String> searchInformation(boolean searchMethod) {
      this.insuranceInformationList = new ArrayList<String>();
      this.insuranceInformationList = this.mInquiryAboutInsuranceWaitList.searchForInsuranceWaitList(searchMethod);
      return insuranceInformationList;
   }

}