package Student.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Student.Dao.StudentDao;
import Student.Entity.Student;
import Student.Exception.AgeNotFoundException;

@Service
public class StudentService {
	@Autowired
	StudentDao sd;
	
	public String postAll(Student s) throws Exception {
		if(s.getAge()>18) {
			return sd.postAll(s);
		}
		else {
			throw new AgeNotFoundException("Price Not Found");
		}
	}
	public Student getById(int id) {
		return sd.getById(id);
	}

	public List<Student> getAll() {
		return sd.getAll();
	}

	public String update(Student s) {
		return sd.update(s);
	}

	public String deleteById(int id) {
		return sd.deleteById(id);
	}

}
