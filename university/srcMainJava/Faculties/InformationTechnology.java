package Faculties;

public class InformationTechnology extends Faculty {

	public String description;
	
	@Override
	public void courseDescription(String description) {
		
		this.description=description;
		
	}

	public String getDescription() {
		return description;
	}
	
	

}
