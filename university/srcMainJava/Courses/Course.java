package Courses;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import Modules.Module;

@MappedSuperclass
public abstract class Course {

	@Id
	private String courseId;
	private String CourseName;
	private double courseCost;
	private double Points;
	private Module module;
	
	public Course()
	{
		
		
	}
	
	public Course(String courseId,String CourseName,double Points)
	{
		
		this.courseId=courseId;
		this.CourseName=CourseName;
		this.Points=Points;
		
	}
	
	
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	private int duration;
	

	public double getCourseCost() {
		return courseCost;
	}
	public void setCourseCost(double courseCost) {
		this.courseCost = courseCost;
	}
	public double getPoints() {
		return Points;
	}
	public void setPoints(double points) {
		Points = points;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	

}
