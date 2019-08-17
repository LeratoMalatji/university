package Faculties;

public class InformationTechnology extends Faculty {

	public String description;
	
	public InformationTechnology(String faculyId,String facultyName)
	{
		
		super(faculyId,facultyName);
	}
	
	@Override
	public void courseDescription(String description) {
		
		this.description=description;
		
	}

	public String getDescription() {
		return description;
	}
	
	

}
