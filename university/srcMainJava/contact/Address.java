package contact;

public class Address {
	
	int houseNumber;
	String street;
	String city;
	String provence;
	String PostalCode;
	
	int addressId;
	
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		
		this.city = city;
	}
	public String getProvence() {
		return provence;
	}
	public void setProvence(String provence) {
		this.provence = provence;
	}
	
	
	

}
