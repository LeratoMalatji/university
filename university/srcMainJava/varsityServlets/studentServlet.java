package varsityServlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Human.Student;
import contact.Address;
import contact.ContactDetails;
import universityDAO.StudentDAO;
import universityDAO.VarsityDAO;

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
		
		
		//***********************************************************************************************************************
		StudentDAO<Student> studentDao = new StudentDAO<Student>();
		
		if (req.getParameter("password").equals(req.getParameter("psw-repeat")))
		{
		student.setPassword(req.getParameter("password"));
		studentDao.create(student);
		
		}
		else
		{
			
			System.out.println("wrong password");
			
			
		}
		
	
		if (student.getDatabaseKey()!=0 && student.getAddress().getAddressId()!=0)
		{
		try {
			

			HttpSession session = req.getSession();
			session.setAttribute("student", student);
			
			res.sendRedirect("login.jsp");
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		}
		
		if (student.getStatus().equals("Active")|| student.getStatus().equals("registered"))
		{
			try {
				res.sendRedirect("login.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		
	}
	
	
	

}
