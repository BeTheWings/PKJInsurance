package insurnaceTool;

import java.util.ArrayList;

import dao.saerchclientDaoImpl;

public class searchAboutClientInformation {

   private saerchclientDaoImpl saerchclientDaoImpl;
   private ArrayList<String> clientList;

   public searchAboutClientInformation() {
      this.clientList = new ArrayList<String>();

      this.saerchclientDaoImpl = new saerchclientDaoImpl();

   }

   public ArrayList<String> searchForClientInfor(String name, String idNumber) {

      this.clientList = this.saerchclientDaoImpl.searchForClientInfor(name, idNumber);
      return clientList;
   }

   public void withdraw(String insuranceName, String clientname) {
      this.saerchclientDaoImpl.delete(insuranceName,clientname);
   }

}