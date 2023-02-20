package in.aditya.cmp.serviceImplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aditya.cmp.entity.Student;
import in.aditya.cmp.entity.repository.StudentRepository;
import in.aditya.cmp.service.StudentService;

@Service
public class StudentImplimentation implements StudentService{

	public StudentImplimentation() {
		super();
		
	}

	@Autowired
	private StudentRepository stdrepo;
	
	@Override
	public List<Object> getAllStudentDetails() {		
		return stdrepo.getAllStudentDetails();		

	}

	@Override
	public List<Student> getStudents() {
		
		return stdrepo.findAll();
	}

}
