package dao_insuranceDesigning;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dao_main.dao;
import model_client.mClient;
import model_insurance.mFireInsurance;
import model_insuranceRegistration.mFireInsuranceRegistration;
import model_insurnaceDesinging.mInsuranceDesinging;

public class fireInsuranceDaoImpl extends dao implements insuranceDao {

	private ArrayList<String> info;

	public fireInsuranceDaoImpl() throws Exception {
		super.connect();
	}

	public ArrayList<String> insertInfo() {
		SqlSession session = super.getSqlSession();
		List<mFireInsurance> output = session.selectList("fireInsuranceMapper.insertInfo", "화재보험");
		this.info = new ArrayList<String>();

		if (output == null) {
			System.out.println("조회결과 없음.");
		} else {
			for (mFireInsurance item : output) {
				this.info.add(item.getSubscriptionTarget());
				this.info.add(item.getInsurancePeriod());
				this.info.add(Integer.toString(item.getInsuranceMoney()));
				this.info.add(item.getSubscriptionTarget());
			}
		}

		session.close();
		return info;
	}

	@Override
	public void insert(mInsuranceDesinging insuranceDesingingVO) {
		SqlSession session = super.getSqlSession();

		mInsuranceDesinging input = insuranceDesingingVO;
		input.getInsuranceName();
		input.getSubscriptionTarget();
		input.getPayment();
		input.getInsurancePeriod();
		input.getPaymentMethod();
		input.getInsuranceMoney();
		input.getNote();
		input.getSpecialSubscription();
		input.getInsuranceCategory();
		int output = session.insert("fireInsuranceMapper.fireInsert", input);

		System.out.println(output + "성공!");
		session.commit();
		session.close();
	}

	public void insert(mFireInsuranceRegistration fireInsuranceRegistration) {
		SqlSession session = super.getSqlSession();

		mFireInsuranceRegistration input = fireInsuranceRegistration;
		input.getInsuranceName();
		input.getName();
		input.getResidentRegistrationNumber();
		input.getAge();
		input.getGender();
		input.getPhoneNumber();
		input.getAddress();
		input.getAccountNumber();
		input.getEmail();
		input.getJob();
		input.getAccidentHistory();
		input.getLongterm();
		int output = session.insert("fireInsuranceMapper.fireInsert", input);

		System.out.println(output + "성공!");
		session.commit();
		session.close();
	}

	@Override
	public void search(ArrayList<String> list) {
	}

	@Override
	public void delete(String information) {
	}

	@Override
	public void update(String information) {
	}

	public int findPayIn(String insuranceName) {
		SqlSession session = super.getSqlSession();
		System.out.println(insuranceName+" dao");
		mFireInsurance output = session.selectOne("fireInsuranceMapper.findPayIn", insuranceName);
		int out = output.getPayment();
		session.commit();
		System.out.println(out);
		
		if (out == 0) {
			System.out.println("없음");
			session.close();
		} else {
			session.close();
			return out;
		}
		return out;
	}

	public boolean checkOverlap(String insuranceName) {
		SqlSession session = super.getSqlSession();
		mFireInsurance output = session.selectOne("fireInsuranceMapper.checkOverlap", insuranceName);

		if (output == null) {
			session.close();
			return false;
		} else {
			session.close();
			return true;
		}
	}

}