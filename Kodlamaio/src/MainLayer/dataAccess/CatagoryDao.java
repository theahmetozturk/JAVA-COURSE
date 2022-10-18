package MainLayer.dataAccess;

import java.util.List;

import MainLayer.entities.Catagory;

public interface CatagoryDao {
	void add(Catagory catagory);
	List <Catagory> getCatagories();
}
