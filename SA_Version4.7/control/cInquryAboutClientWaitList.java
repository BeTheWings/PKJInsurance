package control;

import java.util.ArrayList;

import model_insurnaceTool.mInquiryAboutClientWaitList;

public class cInquryAboutClientWaitList {

	private ArrayList<String> clientWaitList;
	private mInquiryAboutClientWaitList inquryAboutClientWaitList;

	public cInquryAboutClientWaitList() {
		this.inquryAboutClientWaitList = new mInquiryAboutClientWaitList();
		
	}

	public ArrayList<String> searchInformation(boolean searchMethod) {
		this.clientWaitList = new ArrayList<String>();
		this.inquryAboutClientWaitList.setSearchMethod(searchMethod);
		this.inquryAboutClientWaitList.searchForClientWaitList();
		this.clientWaitList = this.inquryAboutClientWaitList.getClientWaitList();
		
		return clientWaitList;
	}

}
