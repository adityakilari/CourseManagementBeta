package in.aditya.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aditya.cmp.entity.Course;
import in.aditya.cmp.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@GetMapping("/CourseController/course")
	public List<Course> getAllCourses(){		
		return courseservice.getCourses();
	}

	
	
}
