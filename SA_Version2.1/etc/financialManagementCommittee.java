package etc;

import insurnaceTool.insuranceApprovalVO;

public class financialManagementCommittee {

	private String eMailAddress;
	private int financialManagementCommitteeID;
	private String name;
	public insuranceApprovalVO insuranceApproval;

	public financialManagementCommittee() {

		this.eMailAddress = "be_the_wings@kakao.com";
		this.name = "¹ÚÁö¼ö";
	}

	public String geteMailAddress() {
		return eMailAddress;
	}

	public void seteMailAddress(String eMailAddress) {
		this.eMailAddress = eMailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}