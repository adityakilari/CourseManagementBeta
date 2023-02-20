package in.aditya.cmp.serviceImplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aditya.cmp.entity.Course;
import in.aditya.cmp.entity.repository.CourseRepository;
import in.aditya.cmp.service.CourseService;

@Service
public class CourseImplimentation implements CourseService{
	public CourseImplimentation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private CourseRepository courserepo;
	
	@Override
	public List<Course> getCourses() {
		
		return courserepo.findAll();
	}

}
