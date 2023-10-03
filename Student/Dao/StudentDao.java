package Student.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Student.Entity.Student;
import Student.Repo.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo sr;
	
	public String postAll(Student s) throws Exception{
		sr.save(s);
		return "Data Saved Successfully";
	}
	public Student getById(int id) {
		return sr.findById(id).get();
	}
	public List<Student> getAll(){
		return sr.findAll();
	}
	public String update(Student s) {
		sr.save(s);
		return "Data Updated";
	}
	public String deleteById(int id) {
		sr.deleteById(id);
		return "Data Deleted";
	}

}
