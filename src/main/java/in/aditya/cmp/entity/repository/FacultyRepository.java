package in.aditya.cmp.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import in.aditya.cmp.entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long>{
	
	
	
	String getFacultywithCourseQuery = "SELECT DBFaculty.facultyID, DBFaculty.`faculty Name`, DBCourse.`Course Name` FROM DBFaculty INNER JOIN DBCourse on DBFaculty.Fk_CourseID = DBCourse.course_id ";
		
	
	
	@Query(value= getFacultywithCourseQuery, nativeQuery = true)
	public List<Object[]> getAllFacultywithCourse();
	
	
	@Procedure(name="DBFaculty.fetchFacultywithCourse")
	public List<Object> getFacultybyId(@Param("facultyID") Long id);
}
