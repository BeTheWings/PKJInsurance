package control;

import java.util.ArrayList;

import insurnaceTool.inquiryAboutClientWaitList;

public class cInquryAboutClientWaitList {

	private ArrayList<String> clientWaitList;
	private inquiryAboutClientWaitList inquryAboutClientWaitList;
	
	public cInquryAboutClientWaitList() {
		this.inquryAboutClientWaitList = new inquiryAboutClientWaitList();
		this.clientWaitList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(boolean searchMethod) {
		this.clientWaitList = this.inquryAboutClientWaitList.searchForClientWaitList(searchMethod);
		return clientWaitList;
	}

}
