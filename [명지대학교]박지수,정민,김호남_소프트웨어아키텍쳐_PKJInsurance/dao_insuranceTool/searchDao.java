package dao_insuranceTool;

import java.util.ArrayList;

public interface searchDao {

   public ArrayList<String> searchByAmount(String searchMethod);

   public ArrayList<String> searchByName(String searchMethod);

   public ArrayList<String> searchByPeriod(String searchMethod);

   public ArrayList<String> inquiryForInsuranceWaitList(boolean searchMethod); //?
}