package accidentReception;

import java.util.ArrayList;

import client.clientVO;
import dao.accidentDaoImpl;
import insurnaceTool.insurancePostProcessorVO;

public class accidentReceptionApplicationVO {
   private int isAllright;
   private accidentDaoImpl accidentDaoImpl;
   // employee
   public insurancePostProcessorVO insurancePostProcessor;

   private String name;
   private String idNumber;
   private String phoneNumber;
   private String eMail;
   private String gender;
   private String accidentContent;
   private ArrayList<String> list;

   public accidentReceptionApplicationVO() {
      this.name = null;
      this.idNumber = null;
      this.phoneNumber = null;
      this.eMail = null;
      this.accidentContent = null;
      this.list = new ArrayList<String>();
      this.accidentDaoImpl = new accidentDaoImpl();
   }

   public void setName(String name2) {
      this.name = name2;
   }

   public void setIdNumber(String idNumber2) {
      this.idNumber = idNumber2;
   }

   public void setPhoneNumber(String phoneNumber2) {
      this.phoneNumber = phoneNumber2;
   }

   public void setEmail(String eMail2) {
      this.eMail = eMail2;
   }

   public void setGender(String actionCommand) {
      this.gender = actionCommand;
   }

   public void setAccidentContent(String text) {
      this.accidentContent = text;
   }

   public void run() {

   }

   public void sendAcceptMessage(int i) {
      this.isAllright = i;
   }

   public void sendApplication() {
      clientVO input = new clientVO();
      input.setClientName(name);
      input.setResidentRegistrationNumber(idNumber);
      input.setGender(gender);
      input.setPhoneNumber(phoneNumber);
      input.setEmail(eMail);
      input.setAccidentContent(accidentContent);
      input.setAccidentContent(accidentContent);
      this.accidentDaoImpl.insert(input);

   }

}