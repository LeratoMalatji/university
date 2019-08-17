package Faculties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import Courses.Course;

/**
 * @author lerato
 *
 */
@Entity
public abstract class Faculty {
	
	@Id
	private String faculyId;
	
	private  String facultyName;
	
	private String Dean;
	
	private Course courses;
	
	
	
	public Faculty(String faculyId,String facultyName)
	{
		this.faculyId=faculyId;
		this.facultyName=facultyName;
		
	}
	
	
	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}
	
	

	public String getFaculyId() {
		return faculyId;
	}

	public void setFaculyId(String faculyId) {
		this.faculyId = faculyId;
	}

	public String getDean() {
		return Dean;
	}

	public void setDean(String dean) {
		Dean = dean;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	
	public abstract void courseDescription(String description);
	
	
}





