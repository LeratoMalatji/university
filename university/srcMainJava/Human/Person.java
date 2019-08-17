package Human;

import javax.persistence.MappedSuperclass;

import contact.Address;
import contact.ContactDetails;


public class Person {

	//instance variables
	private String name;
	private String surname;
	private String id;
	private String gender;
	private String race;
	private String nationality;
	private String age;
	
	private ContactDetails contact ;
	private Address address;
	

	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	
	public ContactDetails getContactDetails() {
		return contact;
	}
	public void setContactDetails(ContactDetails contact) {
		this.contact = contact;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		
		this.age = age;
	}
	
	
	
}
