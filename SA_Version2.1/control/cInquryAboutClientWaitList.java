package control;

import java.util.ArrayList;

import insurnaceTool.inquiryAboutClientWaitListVO;

public class cInquryAboutClientWaitList {

	private ArrayList<String> clientWaitList;
	private inquiryAboutClientWaitListVO inquryAboutClientWaitList;
	
	public cInquryAboutClientWaitList() {
		this.inquryAboutClientWaitList = new inquiryAboutClientWaitListVO();
		this.clientWaitList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(boolean searchMethod) {
		this.clientWaitList = this.inquryAboutClientWaitList.searchForClientWaitList(searchMethod);
		return clientWaitList;
	}

}
