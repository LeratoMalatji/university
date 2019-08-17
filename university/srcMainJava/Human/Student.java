package Human;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import Faculties.Faculty;
import PastMarks.PreviousMarks;
import contact.Address;
import grades.OldMarks;

@Entity
public class Student extends Person  {
	
	// instance variables
	private String DbstudentNumber;
	private double marks;
	public PreviousMarks prevMarks ;
	private String password;
	private String status ;
	
	@Id
	private String studentNumber;
	
	private Faculty faculty;
	private OldMarks oldMark;
	

	public Faculty getFaculty() {
		return faculty;
	}


	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}


	public OldMarks getOldMark() {
		return oldMark;
	}


	public void setOldMark(OldMarks oldMark) {
		this.oldMark = oldMark;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	// getter
	public String DbgetStudentNumber() {
		return DbstudentNumber;
	}

	// setter
	public void DbsetStudentNumber() {
		this.DbstudentNumber = studentGenerator();
	}

	public double getMark() {
		return marks;
	}

	public void setMark(double mark) {
		this.marks = mark;
	}
	
	public void setPassword(String password)
	{
		
		this.password=password;
	}
	public String getPassword()
	{
		
		return password;
	}
	
	public String studentGenerator()
	{
		String temp ="MGI";
		
		LocalDate dateYear = LocalDate.now();
		
		String lastFour = ""+Math.random();
		

		String tempNo = temp+dateYear.getYear()+"-"+lastFour.substring(3, 7);
		
		return tempNo;
	}
	
	public void setStudenNumber(String studentNumber)
	{
		this.studentNumber=studentNumber;
		
		
	}
	
	public String getStudentNumber()
	{
		
		
		return studentNumber;
	}
	
	
}
