package control_insurance;

import java.util.ArrayList;

import dao_insuranceDesigning.onTheSeaInsuranceDaoImpl;
import model_insurance.mOnTheSeaInsurance;

public class cOnTheSeaInsurance {

   private mOnTheSeaInsurance onTheSeaInsurance;
   private onTheSeaInsuranceDaoImpl onTheSeaInsuranceDaoImpl;
   private ArrayList<String> info;

   public cOnTheSeaInsurance() {
      this.info = new ArrayList<String>();
      this.onTheSeaInsurance = new mOnTheSeaInsurance();
      try {
         this.onTheSeaInsuranceDaoImpl = new onTheSeaInsuranceDaoImpl();
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public model_insurance.mOnTheSeaInsurance insertInfo() {
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