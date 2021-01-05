package model_insurnaceTool;

import java.util.ArrayList;

import dao_insuranceTool.searchDaoImpl;
import model_insurance.insuranceList;
import model_insurance.insuranceListImpl;

public class mInsuranceRetrieval {

   public insuranceList insuranceList;

   private String text;
   private searchDaoImpl searchDaoImpl;
   private ArrayList<String> insuranceInformationList;

   public mInsuranceRetrieval() {
      this.text = null;
      this.insuranceInformationList = new ArrayList<String>();
      this.insuranceList = new insuranceListImpl();

      try {
         this.searchDaoImpl = new searchDaoImpl();
      } catch (Exception e) {
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