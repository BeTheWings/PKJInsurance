package dao_insuranceDesigning;

import java.util.ArrayList;

import model_insurnaceDesinging.mInsuranceDesinging;

public interface insuranceDao {

	public void delete(String information);

	public void update(String insurance);

	public void search(ArrayList<String> list);

	public ArrayList<String> insertInfo();

	void insert(mInsuranceDesinging insuranceDesingingVO);

}
