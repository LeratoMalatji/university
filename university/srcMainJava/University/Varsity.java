package University;

import Human.Student;
import contact.Address;
import contact.ContactDetails;

public abstract class Varsity {

	private String CompusId;
	private String CompusName;
	private  Address address;
	private ContactDetails contact;
	
	private Student student;

	public String getCompusId() {
		return CompusId;
	}

	public void setCompusId(String compusId) {
		CompusId = compusId;
	}

	public String getCompusName() {
		return CompusName;
	}

	public void setCompusName(String compusName) {
		CompusName = compusName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ContactDetails getContact() {
		return contact;
	}

	public void setContact(ContactDetails contact) {
		this.contact = contact;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
