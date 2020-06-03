package mobilePhone;

public class Contact {
	private String firstName, lastName, phoneNumber;

	public Contact(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	public String getContact(){
		return (this.firstName + " " + this.lastName + " --> " + this.phoneNumber);
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String number){
		this.phoneNumber = number;
	}
	
}
