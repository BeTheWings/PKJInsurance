package dao_insuranceRegistration;

import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;
import model_client.mRate;
import model_insuranceRegistration.mCarInsuranceRegistration;
import model_insuranceRegistration.mFireInsuranceRegistration;
import model_insuranceRegistration.mOnTheSeaInsuranceRegistration;
import model_insuranceRegistration.mSpecialInsuranceRegistration;

public class pdDaoImpl extends dao {
	private ArrayList<String> list;

	public pdDaoImpl() throws Exception {
		super.connect();

		this.list = new ArrayList<String>();
	}

	public void insert(ArrayList<String> list) {
		SqlSession session = super.getSqlSession();

		mFireInsuranceRegistration input = new mFireInsuranceRegistration();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.fireInsert", input);

		session.commit();
		session.close();
	}

	public void insert2(ArrayList<String> list) {
		SqlSession session = super.getSqlSession();

		mCarInsuranceRegistration input = new mCarInsuranceRegistration();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.carInsert", input);

		session.commit();
		session.close();
	}

	public void insert3(ArrayList<String> list) {
		SqlSession session = super.getSqlSession();

		mOnTheSeaInsuranceRegistration input = new mOnTheSeaInsuranceRegistration();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.onTheSeaInsert", input);
		session.commit();
		session.close();
	}

	public void insert4(ArrayList<String> list) {
		SqlSession session = super.getSqlSession();

		mSpecialInsuranceRegistration input = new mSpecialInsuranceRegistration();
		input.setDate(list.get(0));
		input.setTotalPrice(Integer.parseInt(list.get(1)));
		int output = session.insert("pdMapper.specialInsert", input);
		session.commit();
		session.close();
	}

	public mRate searchJob(mRate mRate) throws SQLException {
		SqlSession session = super.getSqlSession();
		String job = mRate.getJob();
		System.out.println(job + " ���⵵ �Ծ�");
		mRate output = session.selectOne("pdMapper.searchFireJob", job);

		session.commit();

		System.out.println("�˻��ϴ� ��");
		if (output == null) {
			System.out.println("����");
		} else {
			session.close();
			System.out.println("�˻��Ϸ�");
			return output;
		}
		return output;
	}

}