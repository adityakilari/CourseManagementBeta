package in.aditya.cmp.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DBStudent")

//@NamedStoredProcedureQuery(name = "Student.fetchAllStudents", 
//procedureName = "getAllStudents", 
//parameters = {
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "studentId", type = Long.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "student name", type = String.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "faculty name", type = String.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "course name", type = String.class)
//		}
//)




public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentID;
	
	@Column(name = "Student Name" , nullable = false)
	private String studentName;
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "student")	
	Set<Course> course = new HashSet<>();
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
	//List<Faculty> faculty = new ArrayList<>();
	
	
	public Long getStudentID() {
		return studentID;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student(String studentName) {
		super();
		this.studentName = studentName;
	}
	public Student() {
		
	}

}
