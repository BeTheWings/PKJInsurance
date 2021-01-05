package dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import client.rateVO;
import employee.employeeVO;

public class employeeDaoImpl extends dao implements employeeDao {

	public employeeDaoImpl() throws Exception {

		super.connect();

	}

	@Override
	public boolean search(employeeVO employee) {
		SqlSession sqlSession = super.getSqlSession();
		int employeeId = employee.getEmployeeID();
		employeeVO output = sqlSession.selectOne("employeeMapper.selectEmployeeID", employeeId);

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
			rateVO input = new rateVO();
			input.setJob(jobList.get(i));
			input.setRate(list.get(i));
			int output = Session.insert("insuranceToolMapper.rateInsert", input);
		}
		Session.commit();
		Session.close();

	}

}