package control;

import java.util.ArrayList;

import dao.searchDaoImpl;

public class cInsuranceRetrieval {

	private ArrayList<String> insuranceInformationList;
	private searchDaoImpl searchDaoImpl;

	public cInsuranceRetrieval() {
		try {
			this.searchDaoImpl = new searchDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.insuranceInformationList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(String searchType, String searchMethod) {

		if (searchType == "��������") {
			//���⼭ �ٷ� dao�� ������ ������ ������µ� �?
			//�̷��� �������� vo���� ��������������?
			this.insuranceInformationList = this.searchDaoImpl.searchByCategory(searchMethod);
		} else if (searchType == "����Ⱓ") {
			this.insuranceInformationList = this.searchDaoImpl.searchByPeriod(searchMethod);
		} else if (searchType == "���谡��") {
			this.insuranceInformationList = this.searchDaoImpl.searchByAmount(searchMethod);
		}
		return insuranceInformationList;
	}

}
