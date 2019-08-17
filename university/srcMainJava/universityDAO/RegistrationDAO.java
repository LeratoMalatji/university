package universityDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Human.Student;

public class RegistrationDAO  implements VarsityDAO <Student>  {

	@Override
	public void create(Student t) {
		
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(t);
		tx.commit();
		
		
	}

	@Override
	public boolean update(Student t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Student> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(Student t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
