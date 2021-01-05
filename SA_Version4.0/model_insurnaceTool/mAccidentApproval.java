package model_insurnaceTool;

import java.util.ArrayList;

import dao.accidentDaoImpl;
import model_insurance.insuranceListImpl;

public class mAccidentApproval {

	private int isAllright;
	private accidentDaoImpl accidentDaoImpl;
	private ArrayList<String> AccidentInformation;
	private ArrayList<String> InsuranceInformation;
	private ArrayList<String> TotalInformation;
	private String clientName;
	private String rr;
	private String accidentContent;
	private String insuranceCategory;
	private int insuranceMoney;
	private String insuranceName;

	public mAccidentApproval() {
		this.AccidentInformation = new ArrayList<String>();
		this.InsuranceInformation = new ArrayList<String>();
		this.TotalInformation = new ArrayList<String>();
		this.accidentDaoImpl = new accidentDaoImpl();
	}

	public void association(insuranceListImpl insuranceListImpl) {

	}

	public void sendDenialMessage(int i) {
		this.isAllright = i;
	}

	public void sendAcceptMessage(int i) {

		this.isAllright = i;
	}

	public void acceptRequest(String accidnetInformation) {

		if (this.isAllright == 1) {
			this.accidentDaoImpl.delete(accidnetInformation);

		} else if (this.isAllright == 2) {
			this.accidentDaoImpl.delete(accidnetInformation);
			// wait 삭제
		} else {
			System.out.println("없는 번호입니다");
		}
	}

	public ArrayList<String> getInformation() {
		return AccidentInformation;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getRr() {
		return rr;
	}

	public void setRr(String rr) {
		this.rr = rr;
	}

	public ArrayList<String> getTotalInformation() {
		return TotalInformation;
	}

	public void setTotalInformation(ArrayList<String> totalInformation) {
		TotalInformation = totalInformation;
	}

	public String getInsuranceCategory() {
		return insuranceCategory;
	}

	public void setInsuranceCategory(String insuranceCategory) {
		this.insuranceCategory = insuranceCategory;
	}

	public int getInsuranceMoney() {
		return insuranceMoney;
	}

	public String getAccidentContent() {
		return accidentContent;
	}

	public void setAccidentContent(String accidentContent) {
		this.accidentContent = accidentContent;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public void setInsuranceMoney(int insuranceMoney) {
		this.insuranceMoney = insuranceMoney;
	}

	public ArrayList<String> searchInformation(boolean checker) {

		this.InsuranceInformation = this.accidentDaoImpl.searchInformation();
		return InsuranceInformation;
	}
}
