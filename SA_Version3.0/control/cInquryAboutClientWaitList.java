package control;

import java.util.ArrayList;

import model_insurnaceTool.mInquiryAboutClientWaitList;

public class cInquryAboutClientWaitList {

	private ArrayList<String> clientWaitList;
	private mInquiryAboutClientWaitList inquryAboutClientWaitList;

	public cInquryAboutClientWaitList() {
		this.inquryAboutClientWaitList = new mInquiryAboutClientWaitList();
		this.clientWaitList = new ArrayList<String>();
	}

	public ArrayList<String> searchInformation(boolean searchMethod) {
		this.inquryAboutClientWaitList.setSearchMethod(searchMethod);
		this.inquryAboutClientWaitList.searchForClientWaitList();
		this.clientWaitList = this.inquryAboutClientWaitList.getClientWaitList();
		return clientWaitList;
	}

}
