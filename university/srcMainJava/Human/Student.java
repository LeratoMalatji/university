package Human;

import java.io.Serializable;
import java.time.LocalDate;

import Faculties.Faculty;
import PastMarks.PreviousMarks;
import contact.Address;

public class Student extends Person  {
	
	// instance variables
	private String DbstudentNumber;
	private double marks;
	public PreviousMarks prevMarks ;
	private String password;
	private String status ;
	private String studentNumber;
	
	private Faculty faculty;
	
	

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
