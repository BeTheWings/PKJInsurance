package entity;

import java.util.Date;

import dao.dao;
import dao.fireInsuranceClientDaoImpl;

public class entity {
	private dao fireInsuranceClientDaoImpl;
	
	public entity() {
		try {
			this.fireInsuranceClientDaoImpl = new fireInsuranceClientDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dataToss(int totalPrice, String date) {
		totalPrice = totalPrice*50000;
		Date now = new Date();
		date = now.toString();
		
	}

}
