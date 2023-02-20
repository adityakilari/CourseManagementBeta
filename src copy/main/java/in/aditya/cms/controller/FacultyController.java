package in.aditya.cms.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.aditya.cmp.entity.Faculty;
import in.aditya.cmp.service.FacultyService;

@RestController
public class FacultyController {
	
	@Autowired
	private FacultyService facultyservice;
	
	
	@GetMapping("/FacultyController/faculty")
	public List<Faculty> getAllfaculty(){
		return facultyservice.getAllfaculty();
	}

	@GetMapping("/FacultyController/facultywithcourse")
	public List<Object[]> getFacultywithCourse(){
		return facultyservice.getAllFacultywithCourse();
	}
	
	@GetMapping("/FacultyController/facultybyId/{id}") 
	@Transactional
	public List<Object> getFacultybyId(@PathVariable Long id) {
		return facultyservice.getFacultybyId(id);
		
	}
	
	
}
