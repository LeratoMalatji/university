package Courses;

import javax.persistence.Entity;

@Entity
public class Computer_Science extends Course{
	
	public Computer_Science()
	{
		
		
	}
	
	public Computer_Science(String courseId,String CourseName,double Points)
	{
		
		super(courseId, CourseName,Points);
		
	}
	

}
