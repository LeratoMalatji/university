package validation;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Human.Student;
import util.Database;

// class that is used to validate if the login credentials are correct and match whats in the database
/**
 * @author lerato
 *
 * @param <T>
 */
public class Validate<T> {
	
	String queryAuthenticate ;
	
	public List<Student> authenticate(T t)
	{
		
		List<Student> StudentDetails = new ArrayList<>();
		
		Student student = (Student)t;
		Student dbstudent = new Student();
		
		String studentNum =null;
		String studPassword = null;
		
		try {
			
			PreparedStatement ps = Database.getConnection().prepareStatement(queryAuthenticate);
			ps.setString(1, student.getStudentNumber());
			
			ResultSet rset =ps.executeQuery();
			
			if (rset.next())
			{
				if (rset.getString("studentNumber") != "")
				{
				if (rset.next())
				{	
					
					studentNum = rset.getString("studentNumber");
					studPassword = rset.getString("password");
					
					if(student.getStudentNumber().equals(studentNum) && studentNum !=null)
					{
						if(student.getPassword().equals(studPassword)&& studPassword!= null)
						{
							
							System.out.println("your are login to account");
							
						student.setDbID(rset.getInt("studentId"));
						}else
						{
							
							System.out.println("in correct password");
						}
					
					}else
					{
						student.setStatus("incorrectStudentNumber");
						System.out.println("not login student numbers dont match");
						
					}
							
					
				}else
				{
					
					System.out.println(" wrong student number or user does not exist");
				}
				
				}
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	return StudentDetails;	
	}
	
	
	
	
	

}
