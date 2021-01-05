package client;

import java.util.ArrayList;

public class clientListImpl implements clientList {

	private int clidnetJob;
	private ArrayList<String> clientAccidentHistory;
	private String clientAccountNumber;
	private int clientAge;
	private boolean clientGender;
	private int clientID;
	private ArrayList<clientVO> clientList;
	private ArrayList<clientVO> clientWaitList;
	private String clientName;
	private ArrayList<String> clientProperty;
	private int clientResidentRegistrationNumber;
	private String clinetAddress;
	private String clinetPhoneNumber;
	public clientVO m_client;

	public clientListImpl() {
		this.clientList = new ArrayList<clientVO>();
		this.clientWaitList = new ArrayList<clientVO>();
	}

	public boolean apply(int clientID) {
		return false;
	}

	public void delete() {

		
	}

	public boolean lookUpClientInformation(String clientName, String clientPhoneNumber) {
		if (clientName == this.clientName && clientPhoneNumber == this.clinetPhoneNumber) {// �̸� ������ ���� ����Ʈ�� ������

			System.out.println(this.clientName);
			System.out.println(this.clinetPhoneNumber);
			System.out.println(this.clientResidentRegistrationNumber);
			// �� ���� �����ٵ� �����Ƽ� �Ⱦ�����.

			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean add(boolean waitList, clientVO client) {
		if (client != null && waitList) {
			this.clientWaitList.add(client);
			System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");

			return true;
		} else if (client != null && !waitList && clientWaitList != null) {
			System.out.println("���� ���� �Ϸ� �Ǿ����ϴ�.");
			this.clientList.add(this.clientWaitList.get(0));
			this.clientWaitList.remove(0);
			return true;
		} else {
			System.out.println("���� ���� ���忡 ������ �ֽ��ϴ�.");
			return false;
		}
	}

	public boolean delete(boolean waitList, clientVO client) {
		if (client != null && waitList) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			this.clientWaitList.remove(0);
			return true;
		} else if (client != null && !waitList && clientWaitList != null) {
			this.clientList.remove(0);
			return true;
		} else {
			System.out.println("������ ���� �Ͽ����ϴ�.");
			return false;
		}
	}

	@Override
	public boolean modify(clientVO client) {

		return false;
	}

	public ArrayList<clientVO> getClientWaitList() {
		return clientWaitList;
	}

	public ArrayList<clientVO> getClientList() {
		return clientList;
	}
}