package grades;

import java.time.LocalDate;

public class OldMarks {
	
	private int MarkId;
	private String schoolName;
	private LocalDate dateCompleted;
	private String levelCompleted;
	private double mark;
	private double percentage;
	private char symble;
	
	
	
	
	
	public int getMarkId() {
		return MarkId;
	}
	public void setMarkId(int markId) {
		MarkId = markId;
	}
	public String getLevelCompleted() {
		return levelCompleted;
	}
	public void setLevelCompleted(String levelCompleted) {
		this.levelCompleted = levelCompleted;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public LocalDate getDateCompleted() {
		return dateCompleted;
	}
	public void setDateCompleted(LocalDate dateCompleted) {
		this.dateCompleted = dateCompleted;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char getSymble() {
		return symble;
	}
	public void setSymble(char symble) {
		this.symble = symble;
	}
	
	
	

}
