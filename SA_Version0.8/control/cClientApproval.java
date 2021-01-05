package control;

import insurnaceTool.underWriter;

public class cClientApproval {

   private underWriter underWriter;

   public cClientApproval() {
      this.underWriter = new underWriter();
   }

   public void sendDenialMessage(int i) {
      // °ÅÀý
      this.underWriter.sendDenialMessage(i);
   }

   public void sendAcceptMessage(int i) {
      // ½ÂÀÎ
      this.underWriter.sendAcceptMessage(i);
   }

   public void acceptClient(String insuranceInform, String clientName) {
      this.underWriter.approveClient(insuranceInform,clientName);
   }

   public void denialInsurance(String insuranceInform, String clientName) {
      this.underWriter.approveClient(insuranceInform,clientName);
   }

}