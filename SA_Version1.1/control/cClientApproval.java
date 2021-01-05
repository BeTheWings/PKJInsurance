package control;

import insurnaceTool.underWriterVO;

public class cClientApproval {

   private underWriterVO underWriter;

   public cClientApproval() {
      this.underWriter = new underWriterVO();
   }

   public void sendDenialMessage(int i) {
      // ����
      this.underWriter.sendDenialMessage(i);
   }

   public void sendAcceptMessage(int i) {
      // ����
      this.underWriter.sendAcceptMessage(i);
   }

   public void acceptClient(String insuranceInform, String clientName) {
      this.underWriter.approveClient(insuranceInform,clientName);
   }

   public void denialInsurance(String insuranceInform, String clientName) {
      this.underWriter.approveClient(insuranceInform,clientName);
   }

}