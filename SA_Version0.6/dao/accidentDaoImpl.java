package dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import client.client;

public class accidentDaoImpl extends dao {
	private ArrayList<String> list;
	private String sql;
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
		List<client> output = session.selectList("AccidentReceptionMapper.searchInformation", null);

		if (output == null) {

		} else {
			for (client item : output) {
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

	public void insert(ArrayList<String> list2) {
		SqlSession session = super.getSqlSession();

		client input = new client();
		input.setClientName(list2.get(0));
		input.setResidentRegistrationNumber(list2.get(1));
		input.setGender(list2.get(2));
		input.setPhoneNumber(list2.get(3));
		input.setEmail(list2.get(4));
		input.setAccidentContent(list2.get(5));

		session.insert("AccidentReceptionMapper.insertInformation", input);
		session.commit();
		session.close();

	}

	public ArrayList<String> deleteInformation() {

		return null;
	}

}