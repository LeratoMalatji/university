package universityDAO;

import java.util.ArrayList;
import java.util.List;

import Human.Student;
import contact.Address;
import util.Database;
import java.sql.*;

public class StudentDAO<T>implements VarsityDAO<T>{
	
	
	// instanciating the Address DAO
	AddressDAO <Address>addressDao = new AddressDAO<Address>();
	
	Student student ;
	
	//PREPARED STSTAMENT 
	String queryPersonal = "INSERT INTO `student`( `studentNumber`, `name`, `surname`, `gender`, `IdNo`, `race`, `nationality`, `age`, `password`) VALUES(?,?,?,?,?,?,?,?,?)";
	String queryStudentAddress ="INSERT INTO `studentAddress`(`studentId`, `addressId`) VALUES (?,?)";
	String queryCheckStudent ="SELECT IdNo FROM `student` WHERE IdNo = ?";
	String queryAuthenticate = "SELECT * FROM `student` WHERE studentNumber = ?";
	//String queryALLsTUDENT = "SELECT * FROM `student`";
	
	String queryJoin = "SELECT e.name,e.studentNumber ,ar.provence,ar.city,ar.street FROM student e join studentAddress a on e.studentId = 37 JOIN address ar on a.addressId=ar.addressId"; 
			

	/**
	 * This Method checks if the student exists within the database  if not registers the student
	 * @param This is  a generic type parameter
	 * 
	 * A student is a status based on the test
	 * @author lerato
	 *
	 */
	
	@Override
	public void create(T t) {
		
		
		student = (Student)t;
		
		try {// checking if student exist by their ID number
			PreparedStatement pcheck = Database.getConnection().prepareStatement(queryCheckStudent);
			
			pcheck.setString(1, student.getId());
			
			ResultSet statusSet = pcheck.executeQuery();
			
			String IDnumber = null;
			
			// checking if the student exist in the Db
			if (statusSet.next())
			{
				IDnumber =statusSet.getString(1);
				
				if (IDnumber.equals(student.getId()))
				{
					// giving the student a active status if they exist
					student.setStatus("Active");
					
					System.out.println("My ID in the db ="+IDnumber);
					
					
					
				}else if (student.getStatus().equals("registered"))// if status is null student does not exist
				{	
					try {
						
						
						//generating new student number if the student does not exist
						student.DbsetStudentNumber();
						
						int key =0;
						// creating a connection to database using the Database connection class
						PreparedStatement ps = Database.getConnection().prepareStatement(queryPersonal,Statement.RETURN_GENERATED_KEYS);
						
						ps.setString(1,student.DbgetStudentNumber());
						ps.setString(2, student.getName());
						ps.setString(3,student.getSurname());
						ps.setString(4,student.getGender());
						ps.setString(5, student.getId());
						ps.setString(6, student.getRace());
						ps.setString(7, student.getNationality());
						ps.setString(8,student.getAge());
						ps.setString(9, student.getPassword());
						int count = ps.executeUpdate();
						//passing the address reference from student to the addressDao;
						addressDao.create(student.getAddress());
						
						ResultSet rSet = ps.getGeneratedKeys(); //getting the generated address Id
						
						if (rSet.next())
						{
							key = rSet.getInt(1);
							
							student.setDatabaseKey(key); // setting the address Id back in the student object
							
							System.out.println("student key is :"+key);
							
						}
						
			//***********************************************************************
						ps=Database.getConnection().prepareStatement(queryStudentAddress); //query to map the keys for the student on the bridge table
						
						
						// inserting the matching foreign keys on the table
						ps.setInt(1,student.getDatabaseKey());
						ps.setInt(2, student.getAddress().getAddressId());
						count =ps.executeUpdate();
						
						
						
						
						System.out.println("student table raws affected :" + count);
					} catch (SQLException e) {
						
						System.out.println("could not conncet to database");
						e.printStackTrace();
					}
					
					
				}
				
				
			}
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}
	
	

	@Override
	public boolean update(T t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * @param takes in a generic type of of input
	 * @return returns the student details if the student exist
	 * 
	 * method to authenticate if the student exist and the password and student number is correct
	 * 
	 * input takes in a student 
	 * 
	 * output depends on the athenticating test , if student password and student number are correct the output is 
	 * @author lerato
	 */
	public List<Student> authenticate(T t)
	{
		System.out.println("in authenticate");
		
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
				System.out.println("student number db "+rset.getString("studentNumber"));
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
