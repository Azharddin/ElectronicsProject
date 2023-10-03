package Student.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Student.Entity.Student;
import Student.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping(value="/Post")
	public String postAll(@RequestBody Student s) throws Exception{
		return ss.postAll(s);
	}
	@GetMapping(value="/GetById/{id}")
	public Student getById(@PathVariable int id) {
		return ss.getById(id);
	}
	@GetMapping(value="/GetAll")
	public List<Student> getAll(){
		return ss.getAll();
	}
	@PutMapping(value="/Update")
	public String update(@RequestBody Student s) {
		return ss.update(s);
	}
	@DeleteMapping(value="delete/{id}")
	public String deteleById(@PathVariable int id) {
		return ss.deleteById(id);
	}
	

}
