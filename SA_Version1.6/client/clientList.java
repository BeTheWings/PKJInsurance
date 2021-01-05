package client;

public interface clientList {
	
	public boolean add(boolean waitList, clientVO client);

	public boolean delete(boolean waitList, clientVO client);

	public boolean modify(clientVO client);
}