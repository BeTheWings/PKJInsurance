package model_client;

import java.util.ArrayList;

public class clientListImpl implements clientList {

	private int clidnetJob;
	private ArrayList<String> clientAccidentHistory;
	private String clientAccountNumber;
	private int clientAge;
	private boolean clientGender;
	private int clientID;
	private ArrayList<mClient> clientList;
	private ArrayList<mClient> clientWaitList;
	private String clientName;
	private ArrayList<String> clientProperty;
	private int clientResidentRegistrationNumber;
	private String clinetAddress;
	private String clinetPhoneNumber;
	public mClient m_client;

	public clientListImpl() {
		this.clientList = new ArrayList<mClient>();
		this.clientWaitList = new ArrayList<mClient>();
	}

	public boolean apply(int clientID) {
		return false;
	}

	public void delete() {

		
	}

	public boolean lookUpClientInformation(String clientName, String clientPhoneNumber) {
		if (clientName == this.clientName && clientPhoneNumber == this.clinetPhoneNumber) {// �̸� ������ �� ����Ʈ�� ������

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
	public boolean add(boolean waitList, mClient client) {
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
			System.out.println("�� ���� ���忡 ������ �ֽ��ϴ�.");
			return false;
		}
	}

	public boolean delete(boolean waitList, mClient client) {
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
	public boolean modify(mClient client) {

		return false;
	}

	public ArrayList<mClient> getClientWaitList() {
		return clientWaitList;
	}

	public ArrayList<mClient> getClientList() {
		return clientList;
	}
}