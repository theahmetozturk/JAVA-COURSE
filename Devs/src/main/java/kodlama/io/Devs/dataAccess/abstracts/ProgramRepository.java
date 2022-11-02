package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.Programs;

public interface ProgramRepository {
	List<Programs> getAll();
	void add(Programs program) throws Exception;
	
	void delete(Programs program);
	
	void update(Programs program) throws Exception;
	
	void getById(int id);
}
