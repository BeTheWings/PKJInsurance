package insurnaceTool;

import java.util.ArrayList;

import dao.searchDaoImpl;

public class inquiryAboutClientWaitList {

	private ArrayList<String> clientWaitList;
	private searchDaoImpl searchDaoImpl;

	public inquiryAboutClientWaitList() {
		try {
			this.searchDaoImpl = new searchDaoImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.clientWaitList = new ArrayList<String>();
	}

	public ArrayList<String> searchForClientWaitList(boolean searchMethod) {
		this.clientWaitList = this.searchDaoImpl.inquiryClientWaitList(searchMethod);
		return clientWaitList;
	}

}
