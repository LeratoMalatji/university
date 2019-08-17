package Courses;

import javax.persistence.Entity;

@Entity
public class Bcom_Law extends Course{
	
	public Bcom_Law()
	{
		
		
	}
	
	public Bcom_Law(String courseId,String CourseName,double Points)
	{
		super(courseId,CourseName, Points);
		
	}
	
	

}
