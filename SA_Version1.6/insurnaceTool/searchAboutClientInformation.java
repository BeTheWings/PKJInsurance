package insurnaceTool;

import java.util.ArrayList;

import dao.searchclientDaoImpl;

public class searchAboutClientInformation {

   private searchclientDaoImpl saerchclientDaoImpl;
   private ArrayList<String> clientList;

   public searchAboutClientInformation() {
      this.clientList = new ArrayList<String>();

      this.saerchclientDaoImpl = new searchclientDaoImpl();

   }

   public ArrayList<String> searchForClientInfor(String name, String idNumber) {//Á¶È¸
      this.clientList = this.saerchclientDaoImpl.searchForClientInfor(name, idNumber);
      return clientList;
   }

   public void withdraw(String insuranceName, String clientName) {//Å»Åð
      this.saerchclientDaoImpl.delete(insuranceName,clientName);
   }

}