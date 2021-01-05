package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import Employee.Employee;
import client.rate;

public class employeeDaoImpl extends dao implements employeeDao {

	public employeeDaoImpl() throws Exception {
		try {
			super.connect();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean search(Employee employee) {
		SqlSession sqlSession = super.getSqlSession();
		int employeeId = employee.getEmployeeID();
		Employee output = sqlSession.selectOne("employeeMapper.selectEmployeeID", employeeId);

		if (output == null) {
			sqlSession.close();
			return false;
		} else {
			sqlSession.close();
			return true;
		}
	}

	@Override
	public void insert(ArrayList<String> list, ArrayList<String> jobList) throws SQLException {
		SqlSession Session = super.getSqlSession();

		for (int i = 0; i < list.size(); i++) {
			rate input = new rate();
			input.setJob(jobList.get(i));
			input.setRate(list.get(i));
			int output = Session.insert("insuranceToolMapper.rateInsert", input);
		}
		Session.commit();
		Session.close();
//		stmt = conn.createStatement();
//
//		for (int i = 0; i < list.size(); i++) {
//			String sql = "insert into rate(job,rate)values('" + jobList.get(i) + "','" + list.get(i) + "');";
//
//			rs2 = stmt.executeUpdate(sql);
//		}
//
	}

}