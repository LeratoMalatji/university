package varsityServlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Human.Student;
import universityDAO.StudentDAO;
import universityDAO.VarsityDAO;

public class LoginServlet extends HttpServlet {
	
	
	public void service(HttpServletRequest req , HttpServletResponse res)
	{
		
		
		
		Student student = new Student();
		
		student.setStudenNumber(req.getParameter("username"));
		student.setPassword(req.getParameter("password"));
		
		
		StudentDAO <Student> studentDao = new StudentDAO<Student>();
		
		
		studentDao.authenticate(student);
		
		System.out.println("login servlet");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
