package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgramService;
import kodlama.io.Devs.dataAccess.abstracts.ProgramRepository;
import kodlama.io.Devs.entities.concretes.Programs;

@Service
public class ProgramManager implements ProgramService {
	private ProgramRepository programRepository;
	
	@Autowired
	public ProgramManager(ProgramRepository programRepository) {

		this.programRepository = programRepository;
	}

	@Override
	public List<Programs> getAll() {

		return programRepository.getAll();
	}

	@Override
	public void add(Programs program) throws Exception {
		
		if(program.getName()=="") {
			throw new Exception("Program İsmi Boş Olamaz");
		}
		
		for(Programs pr : programRepository.getAll()) {
			if(pr.getName().equals(program.getName())) {
				throw new Exception("Program isimleri Aynı Olamaz");
			}
		}
		programRepository.add(program);
	}

	@Override
	public void delete(Programs program) {
		programRepository.delete(program);
	
		
	}

	@Override
	public void update(Programs program) throws Exception {
		
		for(Programs pr : programRepository.getAll()) {
			if(pr.getName().equals(program.getName())) {
				throw new Exception("Program isimleri Aynı Olamaz");
			}
		}
		programRepository.update(program);
	}



	@Override
	public void getById(int id) {
		programRepository.getById(id);
		
	}

}
