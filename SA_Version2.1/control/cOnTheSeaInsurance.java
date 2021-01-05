package control;

import java.util.ArrayList;

import dao.onTheSeaInsuranceDaoImpl;
import insurance.onTheSeaInsuranceVO;

public class cOnTheSeaInsurance {

   private onTheSeaInsuranceVO onTheSeaInsurance;
   private onTheSeaInsuranceDaoImpl onTheSeaInsuranceDaoImpl;
   private ArrayList<String> info;

   public cOnTheSeaInsurance() {
      this.info = new ArrayList<String>();
      this.onTheSeaInsurance = new onTheSeaInsuranceVO();
      try {
         this.onTheSeaInsuranceDaoImpl = new onTheSeaInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public insurance.onTheSeaInsuranceVO insertInfo() {
      this.info = this.onTheSeaInsuranceDaoImpl.insertInfo();

      if (!this.info.isEmpty()) {
         String subscriptionT = this.info.get(0);
         onTheSeaInsurance.setSubscriptionTarget(subscriptionT);
         String insurancePeriod = this.info.get(1);
         onTheSeaInsurance.setInsurancePeriod(insurancePeriod);
         int money = Integer.parseInt(this.info.get(2));
         onTheSeaInsurance.setInsuranceMoney(money);
         onTheSeaInsurance.setArraySize(true);
      } else {
         onTheSeaInsurance.setArraySize(false);
      }
      return onTheSeaInsurance;
   }

}