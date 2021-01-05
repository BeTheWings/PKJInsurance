package control;

import java.util.ArrayList;

import dao.fireInsuranceDaoImpl;
import insurance.fireInsuranceVO;

public class cFireInsurance {

   private fireInsuranceVO fireInsurance;
   private ArrayList<String> info;
   private fireInsuranceDaoImpl fireInsuranceDaoImpl;

   public cFireInsurance() {
      this.fireInsurance = new fireInsuranceVO();
      try {
         this.fireInsuranceDaoImpl = new fireInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      this.info = new ArrayList<String>();
   }

   public insurance.fireInsuranceVO insertInfo() {
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