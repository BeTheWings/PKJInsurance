package dao_employee;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;
import model_client.mRate;
import model_employee.mEmployee;

public class employeeDaoImpl extends dao implements employeeDao {

	public employeeDaoImpl() throws Exception {

		super.connect();

	}

	@Override
	public boolean search(mEmployee employee) {
		SqlSession sqlSession = super.getSqlSession();
		int employeeId = employee.getEmployeeID();
		mEmployee output = sqlSession.selectOne("employeeMapper.selectEmployeeID", employeeId);

		if (output == null) {
			sqlSession.close();
			return false;
		} else {
			sqlSession.close();
			return true;
		}
	}

	@Override
	public void insert(ArrayList<String> list, ArrayList<String> jobList) {
		SqlSession Session = super.getSqlSession();

		for (int i = 0; i < list.size(); i++) {
			mRate input = new mRate();
			input.setJob(jobList.get(i));
			input.setRate(list.get(i));
			int output = Session.insert("InsuranceToolMapper.rateInsert", input);
		}
		Session.commit();
		Session.close();

	}

}