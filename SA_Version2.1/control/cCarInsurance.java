package control;

import java.util.ArrayList;

import dao.carInsuranceDaoImpl;
import insurance.carInsuranceVO;

public class cCarInsurance {

   private ArrayList<String> info;
   private carInsuranceVO carInsurance;
   private carInsuranceDaoImpl carInsuranceDaoImpl;

   public cCarInsurance() {
      this.info = new ArrayList<String>();
      this.carInsurance = new carInsuranceVO();
      try {
         this.carInsuranceDaoImpl = new carInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public insurance.carInsuranceVO insertInfo() {
      this.info = this.carInsuranceDaoImpl.insertInfo();

      if (!this.info.isEmpty()) {
         String subscriptionT = this.info.get(0);
         carInsurance.setSubscriptionTarget(subscriptionT);
         String insurancePeriod = this.info.get(1);
         carInsurance.setInsurancePeriod(insurancePeriod);
         int money = Integer.parseInt(this.info.get(2));
         carInsurance.setInsuranceMoney(money);
         carInsurance.setArraySize(true);
      } else {
         carInsurance.setArraySize(false);
      }

      return carInsurance;
   }

}