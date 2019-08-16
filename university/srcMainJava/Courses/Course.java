package Courses;

public abstract class Course {

	private String courseId;
	private String CourseName;
	private double courseCost;
	private double Points;
	

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
