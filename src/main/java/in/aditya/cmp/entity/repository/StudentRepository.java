package in.aditya.cmp.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;

import in.aditya.cmp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	//@Procedure(name="Student.fetchAllStudents")
	@Query(value="{call getAllStudents()}", nativeQuery = true)
	public List<Object> getAllStudentDetails();
}
