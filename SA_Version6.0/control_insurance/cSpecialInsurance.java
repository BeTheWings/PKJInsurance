package control_insurance;

import java.util.ArrayList;

import dao_insuranceDesigning.specialInsuranceDaoImpl;

public class cSpecialInsurance {

   private ArrayList<String> info;
   private model_insurance.mSpecialInsurance specialInsurance;
   private specialInsuranceDaoImpl specialInsuranceDaoImpl;

   public cSpecialInsurance() {
      this.info = new ArrayList<String>();
      this.specialInsurance = new model_insurance.mSpecialInsurance();
      try {
         this.specialInsuranceDaoImpl = new specialInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public model_insurance.mSpecialInsurance insertInfo() {
      this.info = this.specialInsuranceDaoImpl.insertInfo();

      if (!this.info.isEmpty()) {
         String subscriptionT = this.info.get(0);
         specialInsurance.setSubscriptionTarget(subscriptionT);
         String insurancePeriod = this.info.get(1);
         specialInsurance.setInsurancePeriod(insurancePeriod);
         int money = Integer.parseInt(this.info.get(2));
         specialInsurance.setInsuranceMoney(money);
         specialInsurance.setArraySize(true);
      }else {
         specialInsurance.setArraySize(false);
      }

      return specialInsurance;
   }
}