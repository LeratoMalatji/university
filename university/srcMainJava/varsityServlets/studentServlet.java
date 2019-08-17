package varsityServlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Human.Student;
import contact.Address;
import contact.ContactDetails;
import serviceTransection.StudentService;
import serviceTransection.StudentTransaction;

@WebServlet("register")
public class studentServlet extends HttpServlet{
	
	public void service(HttpServletRequest req , HttpServletResponse res)
	{
		
		System.out.println("S*************************ervlet called************************************************************************ ");
		
		Student student = new Student();
		ContactDetails con = new ContactDetails();
		Address address =new Address();
		
		
		student.setName(req.getParameter("name").toLowerCase());
		student.setSurname(req.getParameter("surname").toLowerCase());
		student.setGender(req.getParameter("gender").toLowerCase());
		student.setAge(req.getParameter("age").toLowerCase());
		student.setNationality(req.getParameter("nationality").toLowerCase());
		student.setRace(req.getParameter("race").toLowerCase());
		student.setId(req.getParameter("ID"));
		
		
		//********************************************************************************************
		con.setCellNumber(req.getParameter("cellNumber"));
		con.setLandLine(req.getParameter("landLine"));
		con.setEmail(req.getParameter("email").toLowerCase());
		student.setContactDetails(con);
		
		//******************************************************************************************
	
		
		
		address.setCity(req.getParameter("town").toLowerCase());
		address.setProvence(req.getParameter("provence").toLowerCase());
		address.setStreet(req.getParameter("street").toLowerCase());
		address.setHouseNumber(Integer.parseInt(req.getParameter("houseNumber")));
		address.setPostalCode(req.getParameter("postalCode"));
		
		
		student.setAddress(address);
		
		if (req.getParameter("password").equals(req.getParameter("psw-repeat")))
		{
			student.setPassword(req.getParameter("password"));
			StudentService<Student> transection = new StudentTransaction<Student>();
			 transection.validate(student);
			
			
			
			
		}
		else
		{
			System.out.println("Password do not match");
			
		}
		
		
		
		
		//***********************************************************************************************************************
		
		
	}
	
	
	

}
