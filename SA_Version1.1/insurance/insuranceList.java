package insurance;

public interface insuranceList {

	public boolean add(boolean waitList, insurance insurance);

	public boolean delete(boolean waitList, insurance insurance);

	public boolean modify(insurance insurance);

}