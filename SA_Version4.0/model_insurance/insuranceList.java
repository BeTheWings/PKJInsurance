package model_insurance;

public interface insuranceList {

	public boolean add(boolean waitList, mInsurance insurance);

	public boolean delete(boolean waitList, mInsurance insurance);

	public boolean modify(mInsurance insurance);

}