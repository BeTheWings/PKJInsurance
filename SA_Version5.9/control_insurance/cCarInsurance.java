package control_insurance;

import java.util.ArrayList;

import dao_insuranceDesigning.carInsuranceDaoImpl;
import model_insurance.mCarInsurance;

public class cCarInsurance {

   private ArrayList<String> info;
   private mCarInsurance carInsurance;
   private carInsuranceDaoImpl carInsuranceDaoImpl;

   public cCarInsurance() {
      this.info = new ArrayList<String>();
      this.carInsurance = new mCarInsurance();
      try {
         this.carInsuranceDaoImpl = new carInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public model_insurance.mCarInsurance insertInfo() {
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