package dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface clientApproveDao {

   void insert(ArrayList<String> list) throws SQLException;

   void delete(String information, String clientName);

   void update(String information, String clientName);

}