package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.clientVO;

public class accidentDaoImpl extends dao {
   private ArrayList<String> list;
   private String name;
   private String rr;
   private String email;
   private String accidentContent;

   public accidentDaoImpl() {
      try {
         super.connect();

      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public ArrayList<String> searchInformation() {
      this.list = new ArrayList<String>();
      SqlSession session = super.getSqlSession();
      List<clientVO> output = session.selectList("AccidentReceptionMapper.searchInformation", null);

      if (output == null) {

      } else {
         for (clientVO item : output) {
            name = item.getClientName();
            rr = item.getResidentRegistrationNumber();
            email = item.getEmail();
            accidentContent = item.getAccidentContent();
            list.add(name);
            list.add(rr);
            list.add(email);
            list.add(accidentContent);
         }
      }
      session.close();
      return list;
   }

   public void delete(String clientName) {

      SqlSession session = super.getSqlSession();
      session.delete("AccidentReceptionMapper.deleteInformation", clientName);
      session.commit();
      session.close();

   }

   public void insert(clientVO client) {
      SqlSession session = super.getSqlSession();

      clientVO clientVo = client;
      clientVo.getClientName();
      clientVo.getResidentRegistrationNumber();
      clientVo.getGender();
      clientVo.getPhoneNumber();
      clientVo.getEmail();
      clientVo.getAccidentContent();
      session.insert("AccidentReceptionMapper.insertInformation", clientVo);
      session.commit();
      session.close();

   }

   public ArrayList<String> deleteInformation() {

      return null;
   }

}