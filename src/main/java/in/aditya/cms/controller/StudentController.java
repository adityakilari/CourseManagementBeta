package in.aditya.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aditya.cmp.entity.Student;
import in.aditya.cmp.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService stdservice;

	
	
	
	@GetMapping("/StudentController/getallstudents")
	public List<Object> getAllStudentDetais(){
		return stdservice.getAllStudentDetails();
	}
	
	@GetMapping("/StudentController/students")
	public List<Student> getStudents() {
		return stdservice.getStudents();
		
	}


	
}
	
