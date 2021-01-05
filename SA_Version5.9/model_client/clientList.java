package model_client;

public interface clientList {
	
	public boolean add(boolean waitList, mClient client);

	public boolean delete(boolean waitList, mClient client);

	public boolean modify(mClient client);
}