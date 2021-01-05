package dao;

import java.util.ArrayList;

import insurnaceDesinging.insuranceDesingingVO;

public interface insuranceDao {

	public void delete(String information);

	public void update(String insurance);

	public void search(ArrayList<String> list);

	public ArrayList<String> insertInfo();

	void insert(insuranceDesingingVO insuranceDesingingVO);

}
