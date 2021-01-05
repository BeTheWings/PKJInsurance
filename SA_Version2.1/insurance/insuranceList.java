package insurance;

public interface insuranceList {

	public boolean add(boolean waitList, insuranceVO insurance);

	public boolean delete(boolean waitList, insuranceVO insurance);

	public boolean modify(insuranceVO insurance);

}