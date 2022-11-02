package kodlama.io.Devs.wepApi;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgramService;
import kodlama.io.Devs.entities.concretes.Programs;

@RestController
@RequestMapping("/api/programs")
public class ProgramController {
	private ProgramService programService;
	

	public ProgramController(ProgramService programService) {

		this.programService = programService;
	}
	
	@GetMapping("/getAll")
	public List<Programs> getAll(){
	
		return programService.getAll();
	}
	
	@PostMapping("/add")
	public void add(Programs program) throws Exception {
		programService.add(program);
	}
	
	@DeleteMapping("/delete")
	public void delete(Programs program) {
		programService.delete(program);
	}
	
	@PutMapping("/update")
	public void update(Programs program) throws Exception {
		programService.update(program);
	}
	
	@GetMapping("/getById")
	public void getById(int id) {
		programService.getById(id);
	}
}
