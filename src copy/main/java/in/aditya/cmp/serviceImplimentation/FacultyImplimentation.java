package in.aditya.cmp.serviceImplimentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.aditya.cmp.entity.Faculty;
import in.aditya.cmp.entity.repository.FacultyRepository;
import in.aditya.cmp.service.FacultyService;

@Service
public class FacultyImplimentation implements FacultyService{

	public FacultyImplimentation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private FacultyRepository facultyrepo;
	
	@Override
	public List<Faculty> getAllfaculty() {
		
		
		return facultyrepo.findAll();
		
	}

	@Override
	public List<Object[]> getAllFacultywithCourse() {
		
		return facultyrepo.getAllFacultywithCourse();
	}

	@Override
	public List<Object> getFacultybyId(Long fac_id) {
	
		return facultyrepo.getFacultybyId(fac_id);
	}
	
	
	

}
