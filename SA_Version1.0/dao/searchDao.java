package dao;

import java.util.ArrayList;

public interface searchDao {

   public ArrayList<String> searchByAmount(String searchMethod);

   public ArrayList<String> searchByCategory(String searchMethod);

   public ArrayList<String> searchByPeriod(String searchMethod);

   public ArrayList<String> inquiryForInsuranceWaitList(boolean searchMethod); //?
}