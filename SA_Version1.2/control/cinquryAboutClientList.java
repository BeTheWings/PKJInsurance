package control;

import java.util.ArrayList;

import client.clientVO;
import dao.saerchclientDaoImpl;

public class cinquryAboutClientList {
	private ArrayList<String> clientInforamtonList;
	private clientVO client;
	private String name;
	private String idNumber;
	private saerchclientDaoImpl saerchclientDaoImpl;

	public cinquryAboutClientList() {
		this.clientInforamtonList = new ArrayList<String>();
		this.client = new clientVO();
		this.saerchclientDaoImpl = new saerchclientDaoImpl();

	}

	public ArrayList<String> searchInformation(ArrayList<String> data) {

		this.name = data.get(0);
		this.idNumber = data.get(1);

		this.client.setClientName(this.name);
		this.client.setAccountNumber(this.idNumber);
		this.clientInforamtonList = this.saerchclientDaoImpl.searchForClientInfor(client);
		return clientInforamtonList;
	}

//	public ArrayList<String> searchForClientInfor(String name, String idNumber) {
//
//		this.clientList = this.saerchclientDaoImpl.searchForClientInfor(name, idNumber);
//		return clientList;
//	}
	public void withDraw(String insuranceName, String Clientname) {
		this.saerchclientDaoImpl.delete(insuranceName, Clientname);

	}
}