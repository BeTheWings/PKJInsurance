package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;
import insurance.insuranceVO;

public class searchDaoImpl extends dao implements searchDao {

   private ArrayList<String> test;
   String insuranceName;
   int insuranceMoney;
   String payIn;
   String insurancePeriod;
   String insuranceCategory;

   public searchDaoImpl() throws Exception {
      try {
         super.connect();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   @Override
   public ArrayList<String> searchByAmount(String payIn) {
      this.test = new ArrayList<String>();
      SqlSession session = super.getSqlSession();
      List<insuranceVO> output = session.selectList("searchMapper.searchByAmount", payIn);

      if (output == null) {
         System.out.println("없음");
      } else {
         for (insuranceVO item : output) {
            insuranceCategory = item.getInsuranceCategory();
            insuranceName = item.getName();
            insuranceMoney = item.getInsuranceID(); // insuranceMoney
            payIn = Integer.toString(item.getPayment());
            insurancePeriod = item.getInsurancePeriod(); // insurancePeriod

            this.test.add(insuranceCategory);
            this.test.add(insuranceName);
            this.test.add(payIn);
            this.test.add(Integer.toString(insuranceMoney));
            this.test.add(insurancePeriod);
         }
      }
      session.close();
      return test;

   }

   @Override
   public ArrayList<String> searchByName(String name) {
      this.test = new ArrayList<String>();
      SqlSession session = super.getSqlSession();
      List<insuranceVO> output = session.selectList("searchMapper.searchByName", name);

      if (output == null) {
         System.out.println("없음");
      } else {
         for (insuranceVO item : output) {
            insuranceCategory = item.getInsuranceCategory();
            insuranceName = item.getName();
            insuranceMoney = item.getInsuranceID(); // insuranceMoney
            payIn = Integer.toString(item.getPayment());
            insurancePeriod = item.getInsurancePeriod(); // insurancePeriod

            this.test.add(insuranceCategory);
            this.test.add(insuranceName);
            this.test.add(payIn);
            this.test.add(Integer.toString(insuranceMoney));
            this.test.add(insurancePeriod);
         }
      }
      session.close();
      return test;
   }

   @Override
   public ArrayList<String> searchByPeriod(String insurancePeriod) {
      this.test = new ArrayList<String>();
      SqlSession session = super.getSqlSession();
      List<insuranceVO> output = session.selectList("searchMapper.searchByPeriod", insurancePeriod);

      if (output == null) {
         System.out.println("없음");
      } else {
         for (insuranceVO item : output) {
            insuranceCategory = item.getInsuranceCategory();
            insuranceName = item.getName();
            insuranceMoney = item.getInsuranceID(); // insuranceMoney
            payIn = Integer.toString(item.getPayment());
            insurancePeriod = item.getInsurancePeriod(); // insurancePeriod

            this.test.add(insuranceCategory);
            this.test.add(insuranceName);
            this.test.add(payIn);
            this.test.add(Integer.toString(insuranceMoney));
            this.test.add(insurancePeriod);
         }
      }
      session.close();
      return test;
   }

   public ArrayList<String> inquiryForInsuranceWaitList(boolean statement) {
      this.test = new ArrayList<String>();
      SqlSession session = super.getSqlSession();
      List<insuranceVO> output = session.selectList("InsuranceToolMapper.inquiryForInsuranceWaitList", statement);
      System.out.println(statement);

      if (output == null) {

      } else {
         int count = 0;
         for (insuranceVO item : output) {
            this.test.add(item.getName());
            this.test.add(item.getInsuranceCategory());
            this.test.add(Integer.toString(item.getInsuranceMoney()));
            this.test.add(Integer.toString(item.getPayment()));
            this.test.add(item.getInsurancePeriod());
            count++;
         }
      }
      session.close();
      return test;
   }

   public ArrayList<String> inquiryClientWaitList(boolean statement) {

      this.test = new ArrayList<String>();
      SqlSession session = super.getSqlSession();
      List<clientVO> output = session.selectList("InsuranceToolClientMapper.inquiryClientWaitList", statement);

      if (output == null) {
         System.out.println("없음");
      } else {
         for (clientVO item : output) {// 얘는 client. insurance.모두 사용해야함..? insuranceName 이 필요함
            this.test.add(item.getInsuranceName());
            this.test.add(item.getClientName());
            this.test.add(item.getAge());
            this.test.add(item.getPhoneNumber());
            this.test.add(item.getAccidentContent());
         }
      }

      return test;

   }
}