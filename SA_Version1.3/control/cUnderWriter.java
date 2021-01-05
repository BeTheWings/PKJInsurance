package control;

import java.util.ArrayList;

import insurnaceTool.underWriterVO;

public class cUnderWriter {
	private underWriterVO underWriterVO;

	public cUnderWriter() throws Exception {
		this.underWriterVO = new underWriterVO();
	}

	public void sendAcceptMessage(int i) {
		this.underWriterVO.sendAcceptMessage(i);
	}

	public void setData(ArrayList<String> data) {
		String driver = data.get(0);
		this.underWriterVO.setDriver(driver);
		String solider = data.get(1);
		this.underWriterVO.setSolider(solider);
		String fieldJob = data.get(2);
		this.underWriterVO.setFieldJob(fieldJob);
		String planeCaptain = data.get(3);
		this.underWriterVO.setPlaneCaptain(planeCaptain);
		String stewardess = data.get(4);
		this.underWriterVO.setStewardess(stewardess);
		String captain = data.get(5);
		this.underWriterVO.setCaptain(captain);
		String sailor = data.get(6);
		this.underWriterVO.setSailor(sailor);
		String etc = data.get(7);
		this.underWriterVO.setEtc(etc);
		
		this.underWriterVO.calculatePremiumRate();
	
	}

}