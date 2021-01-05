package insurnaceTool;

import java.util.ArrayList;

import dao.searchDaoImpl;

public class inquiryAboutClientWaitListVO {

	private ArrayList<String> clientWaitList;
	private searchDaoImpl searchDaoImpl;

	public inquiryAboutClientWaitListVO() {
		try {
			this.searchDaoImpl = new searchDaoImpl();
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.clientWaitList = new ArrayList<String>();
	}

	public ArrayList<String> searchForClientWaitList(boolean searchMethod) {
		this.clientWaitList = this.searchDaoImpl.inquiryClientWaitList(searchMethod);
		return clientWaitList;
	}

}
