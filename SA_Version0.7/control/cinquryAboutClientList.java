package control;

import java.util.ArrayList;

import insurnaceTool.searchAboutClientInformation;

public class cinquryAboutClientList {
   private ArrayList<String> clientInforamtonList;
   private searchAboutClientInformation searchAboutClientInformation;

   public cinquryAboutClientList() {
      this.clientInforamtonList = new ArrayList<String>();
      this.searchAboutClientInformation = new searchAboutClientInformation();
   }

   public ArrayList<String> searchInformation(String name, String idNumber) {

      this.clientInforamtonList = this.searchAboutClientInformation.searchForClientInfor(name, idNumber);
      return clientInforamtonList;
   }

   public void withDraw(String insuranceName, String Clientname) {
      this.searchAboutClientInformation.withdraw(insuranceName,Clientname);

   }
}