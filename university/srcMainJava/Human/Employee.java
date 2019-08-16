package Human;



public class Employee extends Person {
	
	// instance variable
	private String EmployeeNumber;
	private double Salary;
	
	// constructor
	public Employee()
	{
		
		
	}
	

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	//getter
	public String getEmployeeNumber() {
		return EmployeeNumber;
	}

	//setter
	public void setEmployeeNumber(String employeeNumber) {
		EmployeeNumber = employeeNumber;
	}

}
