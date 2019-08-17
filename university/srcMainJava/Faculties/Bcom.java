package Faculties;

public class Bcom extends Faculty{

	private String description;
	
	public Bcom(String faculyId,String facultyName)
	{
		super(faculyId, facultyName);
		
	}
	
	
	@Override
	public void courseDescription(String description) {
		this.description=description;
	}


	public String getDescription() {
		return description;
	}

	

}


