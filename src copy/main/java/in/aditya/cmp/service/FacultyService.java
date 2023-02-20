package in.aditya.cmp.service;

import java.util.List;

import in.aditya.cmp.entity.Faculty;

public interface FacultyService {
	
	List<Object[]> getAllFacultywithCourse();
	
	List<Faculty> getAllfaculty();
	
	List<Object> getFacultybyId(Long id);

}
