package serviceTransection;

import java.util.List;

import Human.Student;
import universityDAO.RegistrationDAO;
import universityDAO.VarsityDAO;

public class StudentTransaction <T> implements StudentService <Student>{

	
	public Boolean validate(Student t) {
		
		if (t !=null && t.getAddress()!=null && t.getContactDetails() !=null)
		{
			
		VarsityDAO <Student> transection = new RegistrationDAO();
		transection.create(t);
		
		}
		
		
		
		return null;
	}

	@Override
	public Student checkFees(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getGrades(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student moduleRegister(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean validatePoints(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateProfile(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student viewProfile(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getModule(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean registerNew(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	

		


}
 