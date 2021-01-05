package model_insurnaceTool;

import java.util.ArrayList;

import dao_insuranceTool.searchDaoImpl;

public class mInquiryAboutClientWaitList {

	private ArrayList<String> clientWaitList;
	private searchDaoImpl searchDaoImpl;
	private boolean searchMethod;

	public mInquiryAboutClientWaitList() {
		try {
			this.searchDaoImpl = new searchDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.clientWaitList = new ArrayList<String>();
	}

	public boolean isSearchMethod() {
		return searchMethod;
	}

	public void setSearchMethod(boolean searchMethod) {
		this.searchMethod = searchMethod;
	}

	public ArrayList<String> getClientWaitList() {
		return clientWaitList;
	}

	public void setClientWaitList(ArrayList<String> clientWaitList) {
		this.clientWaitList = clientWaitList;
	}

	public void searchForClientWaitList() {
		
		this.clientWaitList = this.searchDaoImpl.inquiryClientWaitList(this.searchMethod);
		
	}

}
