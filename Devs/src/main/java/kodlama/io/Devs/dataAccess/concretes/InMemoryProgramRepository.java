package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgramRepository;
import kodlama.io.Devs.entities.concretes.Programs;

@Repository
public class InMemoryProgramRepository implements ProgramRepository {

	List<Programs> programs;

	public InMemoryProgramRepository() {
		programs = new ArrayList<Programs>();
		
		programs.add(new Programs(1, "Java"));
		programs.add(new Programs(2, "Python"));
		programs.add(new Programs(3, "C"));
		programs.add(new Programs(4, "C++"));
		programs.add(new Programs(5, "HTML"));
		programs.add(new Programs(6, "C#"));

	}

	@Override
	public List<Programs> getAll() {

		return programs;
	}

	@Override
	public void add(Programs program) throws Exception {
		programs.add(program);
		
	}

	@Override
	public void delete(Programs program) {
		programs.remove(program);
		
	}

	@Override
	public void update(Programs program)throws Exception {
		
		
	}


	@Override
	public void getById(int id) {
		
		
	}

}
