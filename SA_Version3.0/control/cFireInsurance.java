package control;

import java.util.ArrayList;

import dao.fireInsuranceDaoImpl;
import model_insurance.mFireInsurance;

public class cFireInsurance {

   private mFireInsurance fireInsurance;
   private ArrayList<String> info;
   private fireInsuranceDaoImpl fireInsuranceDaoImpl;

   public cFireInsurance() {
      this.fireInsurance = new mFireInsurance();
      try {
         this.fireInsuranceDaoImpl = new fireInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      this.info = new ArrayList<String>();
   }

   public model_insurance.mFireInsurance insertInfo() {
      this.info = this.fireInsuranceDaoImpl.insertInfo();

      if (!this.info.isEmpty()) {
         String subscriptionT = this.info.get(0);
         fireInsurance.setSubscriptionTarget(subscriptionT);
         String insurancePeriod = this.info.get(1);
         fireInsurance.setInsurancePeriod(insurancePeriod);
         int money = Integer.parseInt(this.info.get(2));
         fireInsurance.setInsuranceMoney(money);
         fireInsurance.setArraySize(true);

      } else {
         fireInsurance.setArraySize(false);

      }

      return fireInsurance;
   }

}