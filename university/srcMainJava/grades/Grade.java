package grades;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade {
	
	@Id
	int mID;
	private double mark;
	private double percentage;
	private char simple;
	
	
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
	public char getSimple() {
		return simple;
	}
	public void setSimple(char simple) {
		this.simple = simple;
	}
	
	
	

}
