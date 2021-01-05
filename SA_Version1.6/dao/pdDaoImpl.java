package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import insuranceRegistration.carInsuranceRegistrationVO;
import insuranceRegistration.fireInsuranceRegistrationVO;
import insuranceRegistration.onTheSeaInsuranceRegistrationVO;
import insuranceRegistration.specialInsuranceRegistrationVO;

public class pdDaoImpl extends dao {
	private ArrayList<String> list;

	public pdDaoImpl() throws Exception {
		super.connect();

		this.list = new ArrayList<String>();
	}

	public ArrayList<String> insert(String date, int totalPrice) throws SQLException {
//      stmt = conn.createStatement();
//      String sql = "i;";
//      
//      while(rs.next()) {
//         String d = rs.getString("date");
//         String tp = rs.getString("totalPrice");
//         
//         list.add(d);
//         list.add(tp);
//      }

		return list;
	}

	public void insert(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();

		fireInsuranceRegistrationVO input = new fireInsuranceRegistrationVO();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.fireInsert", input);

		session.commit();
		session.close();
	}

	public void insert2(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();

		carInsuranceRegistrationVO input = new carInsuranceRegistrationVO();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.carInsert", input);

		session.commit();
		session.close();
	}

	public void insert3(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();

		onTheSeaInsuranceRegistrationVO input = new onTheSeaInsuranceRegistrationVO();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.onTheSeaInsert", input);
		session.commit();
		session.close();
	}

	public void insert4(ArrayList<String> list) throws SQLException {
		SqlSession session = super.getSqlSession();

		specialInsuranceRegistrationVO input = new specialInsuranceRegistrationVO();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.specialInsert", input);
		session.commit();
		session.close();
	}

}