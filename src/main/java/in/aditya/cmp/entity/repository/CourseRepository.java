package in.aditya.cmp.entity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.aditya.cmp.entity.Course;


public interface CourseRepository extends JpaRepository<Course, Long>{
	

}
