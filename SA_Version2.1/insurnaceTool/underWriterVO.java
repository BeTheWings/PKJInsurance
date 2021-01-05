package insurnaceTool;

import java.util.ArrayList;
import java.util.HashMap;

import client.clientListImpl;
import dao.clientApproveDaoImpl;
import dao.employeeDaoImpl;
import employee.employeeVO;
import global.constant.eJob;

public class underWriterVO extends employeeVO {

	private int UWID;
	private float rate;
	private clientListImpl clientList;
	private HashMap<String, Float> ratePrice;
	private int isAllright;
	private float driver;
	private float fieldJob;
	private float etc;
	private float planeCaptain;
	private float captain;
	private float solider;
	private float sailor;
	private float stewardess;
	private ArrayList<String> rateList;
	private ArrayList<String> jobList;

	private clientApproveDaoImpl clientApproveDaoImpl;
	private employeeDaoImpl employeeDaoImpl;

	public underWriterVO() {
		this.UWID = 1;
		this.rate = (float) 0.0;
		this.rateList = new ArrayList<String>();
		this.jobList = new ArrayList<String>();

		try {
			this.clientApproveDaoImpl = new clientApproveDaoImpl();
			this.employeeDaoImpl = new employeeDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void sendDenialMessage(int i) {
		isAllright = i;
	}

	public void approveClient(String clientInformation, String clientName) {

		if (this.isAllright == 1) {
			this.clientApproveDaoImpl.update(clientInformation, clientName);
		} else if (this.isAllright == 2) {
			this.clientApproveDaoImpl.delete(clientInformation, clientName);
		} else {
			System.out.println("없는 번호입니다");
		}
	}

	public void association(clientListImpl clientListImpl) {
		this.clientList = clientListImpl;
	}

	public void setDriver(String driver2) {
		this.driver = (float) Double.parseDouble(driver2);
	}

	public void setSolider(String solider2) {
		this.solider = (float) Double.parseDouble(solider2);
	}

	public void setFieldJob(String fieldJob2) {
		this.fieldJob = (float) Double.parseDouble(fieldJob2);
	}

	public void setPlaneCaptain(String planeCaptain2) {
		this.planeCaptain = (float) Double.parseDouble(planeCaptain2);
	}

	public void setStewardess(String stewardess2) {
		this.stewardess = (float) Double.parseDouble(stewardess2);
	}

	public void setCaptain(String captain2) {
		this.captain = (float) Double.parseDouble(captain2);
	}

	public void setSailor(String sailor2) {
		this.sailor = (float) Double.parseDouble(sailor2);
	}

	public void setEtc(String etc2) {
		this.etc = (float) Double.parseDouble(etc2);
	}

	public int getUWID() {
		return UWID;
	}

	public void setUWID(int uWID) {
		UWID = uWID;
	}

	public void sendAcceptMessage(int i) {
		this.isAllright = i;
	}

	public void calculatePremiumRate() {

		if (this.isAllright == 1) {

			rateList.add(Float.toString(this.driver));
			rateList.add(Float.toString(this.solider));
			rateList.add(Float.toString(this.fieldJob));
			rateList.add(Float.toString(this.planeCaptain));
			rateList.add(Float.toString(this.stewardess));
			rateList.add(Float.toString(this.captain));
			rateList.add(Float.toString(this.sailor));
			rateList.add(Float.toString(this.etc));

			for (eJob eJob : eJob.values()) {
				jobList.add(eJob.getText());

			}
			this.employeeDaoImpl.insert(rateList, jobList);
		} else {
			System.out.println("없는 번호입니다");
		}
	}
}