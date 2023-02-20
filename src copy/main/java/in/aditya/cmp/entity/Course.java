package in.aditya.cmp.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DBCourse")
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long courseId;
	
	@Column(name = "Course Name", nullable = false)
	private String courseName;
	
	
	
	//new table will be created 
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(
	        name = "Student_Course", 
	        joinColumns = { @JoinColumn(name = "Course_id") }, 
	        inverseJoinColumns = { @JoinColumn(name = "Student_id") }
	    )
	Set<Student> student = new HashSet<>();
	
	
	
	
	//Fk_CourseID will be created in faculty table
	//@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	//@JoinColumn(name = "fk_facultyId")
	//private Faculty faculty;
	
	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	public List<Faculty> getFaculty() {
		return faculty;
	}

	public void setFaculty(List<Faculty> faculty) {
		this.faculty = faculty;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_CourseID", referencedColumnName= "courseId")
	List<Faculty> faculty = new ArrayList<>();
	
	 
	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
	
	public Course() {
		
	}
	
	
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
