package studentTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import Courses.Computer_Science;
import Courses.Course;
import Faculties.Bcom;
import Faculties.Faculty;
import Human.Student;
import Modules.Module;
import contact.Address;
import contact.ContactDetails;
import grades.Grade;
import serviceTransection.StudentTransaction;

public class createTest {

	@Test
	public void test() {
		
		Student s = new Student();
		Address address = new Address ();
		ContactDetails stuDetails = new ContactDetails();
		Faculty faculty = new Bcom("Law1","Law");
		Course course = new Computer_Science("CMC12","Computer Science", 32);
		Module module = new Module("ITIS122","Information system",1);
		Grade grade = new Grade();
		grade.setMark(88.0);
		grade.setPercentage(30);
		grade.setSimple('C');
		
		module.setStatus("passed");
		module.setGrades(grade);
		course.setCourseCost(100000.0000);
		course.setDuration(3);
		course.setModule(module);
		
		faculty.setDean("Valdy");
		faculty.setCourses(course);
		address.setAddressId(22);
		address.setCity("Gauteng");
		address.setHouseNumber(323);
		address.setPostalCode("1401");
		address.setProvence("Gauteng");
		address.setStreet("22 ixia road");
		
		stuDetails.setCellNumber("0843201626");
		stuDetails.setEmail("Leratomalatji@ymail.com");
		stuDetails.setLandLine("0843201626");
		
		s.setId("9103205629085");
		s.setGender("male");
		s.setAge("29");
		s.setName("lerato");
		s.setNationality("South african");
		s.setRace("Black");
		s.setSurname("malatji");
		s.setPassword("12345");
		s.studentGenerator();
		s.setAddress(address);
		s.setContactDetails(stuDetails);
		s.setStatus("active");
		s.setMark(33.0);
		//s.setFaculty(faculty);
		
		StudentTransaction<Student> vtest = new StudentTransaction<Student>();
		vtest.validate(s);
		
		System.out.println("heloooooooooooooo");
		
		
		
		
	}

}
