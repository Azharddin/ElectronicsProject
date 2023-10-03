package Student.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Student.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
