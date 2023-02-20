package in.aditya.cmp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;

@Entity
@Table(name = "DBFaculty")


@NamedStoredProcedureQuery(name = "DBFaculty.fetchFacultywithCourse", 
procedureName = "getFacultywithCourse", 
parameters = {
		@StoredProcedureParameter(mode = ParameterMode.IN, name = "facultyID", type = Long.class)
		
		}
  )



public class Faculty {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long facultyID;
	
	@Column(name = "faculty Name", nullable = false)
	private String facultyName;
	
	//@OneToOne(mappedBy = "faculty")
	//private Course course;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_FacultyID", referencedColumnName= "facultyID")
	List<Student> student = new ArrayList<>();
	
	
	
	public Faculty() {
		
	}
	
	
	public Faculty(String facultyName) {
		super();
		this.facultyName = facultyName;
	}
	public Long getFacultyID() {
		return facultyID;
	}
	public void setFacultyID(Long facultyID) {
		this.facultyID = facultyID;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
}
