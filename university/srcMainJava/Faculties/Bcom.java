package Faculties;

public class Bcom extends Faculty{

	private String description;
	
	
	@Override
	public void courseDescription(String description) {
		this.description=description;
	}


	public String getDescription() {
		return description;
	}

	

}


