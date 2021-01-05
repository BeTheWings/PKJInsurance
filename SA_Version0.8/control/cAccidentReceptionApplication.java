package control;

import accidentReception.accidentReceptionApplication;

public class cAccidentReceptionApplication {

   private accidentReceptionApplication accidentReceptionApplication;
   
   public cAccidentReceptionApplication() {
      this.accidentReceptionApplication = new accidentReceptionApplication();
   }

   public void setName(String name) {
      this.accidentReceptionApplication.setName(name);
   }

   public void setIdNumber(String idNumber) {
      this.accidentReceptionApplication.setIdNumber(idNumber);
   }

   public void setPhoneNumber(String phoneNumber) {
      this.accidentReceptionApplication.setPhoneNumber(phoneNumber);
   }

   public void runAccidentReceptionApplication() {
      this.accidentReceptionApplication.run();
   }

   public void sendAcceptMessage(int i) {
      this.accidentReceptionApplication.sendAcceptMessage(i);
      this.accidentReceptionApplication.sendApplication();
   }

   public void setEmail(String eMail) {
      this.accidentReceptionApplication.setEmail(eMail);
   }

   public void setGedner(String actionCommand) {
      this.accidentReceptionApplication.setGender(actionCommand);
      
   }

   public void setAccidnetContent(String text) {
      this.accidentReceptionApplication.setAccidentContent(text);
      
   }

}