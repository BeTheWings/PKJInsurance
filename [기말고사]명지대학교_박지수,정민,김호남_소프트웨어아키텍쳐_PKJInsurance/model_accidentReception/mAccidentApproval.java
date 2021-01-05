package model_accidentReception;

import java.util.ArrayList;

import dao_insuranceTool.accidentDaoImpl;
import entity.accidentEntity;
import model_insurance.insuranceListImpl;

public class mAccidentApproval {

	private int isAllright;

	private ArrayList<String> AccidentInformation;
	private ArrayList<String> InsuranceInformation;
	private ArrayList<String> TotalInformation;
	private String clientName;
	private String rr;
	private String accidentContent;
	private String insuranceCategory;
	private int insuranceMoney;
	private String insuranceName;
	private boolean statemnt;
	private accidentEntity accidentEntity;

	public mAccidentApproval() {
		this.AccidentInformation = new ArrayList<String>();
		this.InsuranceInformation = new ArrayList<String>();
		this.TotalInformation = new ArrayList<String>();
		this.accidentEntity = new accidentEntity();
	}

	public void association(insuranceListImpl insuranceListImpl) {

	}

	public void sendDenialMessage(int i) {
		this.isAllright = i;
	}

	public void sendAcceptMessage(int i) {

		this.isAllright = i;
	}

	public boolean isStatemnt() {
		return statemnt;
	}

	public void setStatemnt(boolean statemnt) {
		this.statemnt = statemnt;
	}

	public void acceptRequest() {
		this.accidentEntity.acceptRequest(this);

	}

	public int getIsAllright() {
		return isAllright;
	}

	public void setIsAllright(int isAllright) {
		this.isAllright = isAllright;
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

	public ArrayList<String> searchInformation() {

		this.InsuranceInformation = this.accidentEntity.searchInformation(this);

		return InsuranceInformation;
	}
}
