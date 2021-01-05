package insurnaceTool;

import java.util.ArrayList;

import dao.searchDaoImpl;
import insurance.insuranceList;
import insurance.insuranceListImpl;

public class insuranceRetrieval {

   public insuranceList insuranceList;

   private String text;
   private searchDaoImpl searchDaoImpl;
   private ArrayList<String> insuranceInformationList;

   public insuranceRetrieval() {
      this.text = null;
      this.insuranceInformationList = new ArrayList<String>();
      this.insuranceList = new insuranceListImpl();

      try {
         this.searchDaoImpl = new searchDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }

   public ArrayList<String> searchByAmount(String searchMethod) {
      this.insuranceInformationList = this.searchDaoImpl.searchByAmount(searchMethod);

      return this.insuranceInformationList;
   }

   public ArrayList<String> searchByPeriod(String searchMethod) {
      this.insuranceInformationList = this.searchDaoImpl.searchByPeriod(searchMethod);
      return this.insuranceInformationList;
   }

   public ArrayList<String> searchForInsuranceName(String searchMethod) {
      this.insuranceInformationList = this.searchDaoImpl.searchByName(searchMethod);
      return this.insuranceInformationList;

   }

   public void setText(String text) {
      this.text = text;
   }

}