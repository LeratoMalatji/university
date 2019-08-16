package PastMarks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreviousMarks {
	
	private String institutionName;
	private LocalDate date;
	private double marks;
	private String subjectName;
	

	List<String> subj = new ArrayList<>();
	List<Double> mark = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	public void SetMarkSubject()
	{
		int temp=0;
		
		
		do
		{
			
		System.out.println("Enter subject name");
		subjectName= scan.next();
		subj.add(subjectName);
		
		System.out.println("Enter Mark");
		marks =scan.nextDouble();
		mark.add(marks);
		
		System.out.println("Add other Subject  enter (1) to continue or (-1) to quite");
		temp=scan.nextInt();
		
		
		
		}while( temp != -1);
		

	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(String date) {
		LocalDate date1 = LocalDate.parse(date);
		
		this.date=date1;
	}
	public List<String> getSubjectName() {
		return subj;
	}
	
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public List getMarks() {
		return mark;
	}
	
	// course to enroll in
	

}
