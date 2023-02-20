package in.aditya.cmp.service;

import java.util.List;

import in.aditya.cmp.entity.Student;

public interface StudentService {
	
	List<Object> getAllStudentDetails();
	
	List<Student> getStudents();

}
