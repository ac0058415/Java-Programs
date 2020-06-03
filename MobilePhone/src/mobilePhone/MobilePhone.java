package mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
	
	private String myNumber;
	private ArrayList<Contact> contactList;
	
	public MobilePhone(String myNumber){
		this.contactList = new ArrayList<Contact>();
		this.myNumber = myNumber;
	}
	
	public void showContactList(){
		System.out.println("There are " + contactList.size() + " contact(s) in phone");
		for(int i=0;i<contactList.size();i++){
			System.out.println((i+1) + ": " + contactList.get(i).getContact());
		}
	}
	
	public void addContact(Contact contact){
		if(findContact(contact.getPhoneNumber()) < 0){
			contactList.add(contact);
			System.out.println("Contact Added: " + contact.getContact());	
		}else{
			System.err.println(contact.getContact() + " exixts at " + findContact(contact.getPhoneNumber()));
		}
	}
	
	private int findContact(String phoneNumber){
		for(int i=0;i<this.contactList.size();i++){
			Contact temp = this.contactList.get(i);
			if(temp.getContact().contains(phoneNumber)){
				return i;
			}
		}
		return -1;
	}
	
	public void removeContact(String name){
		if(findContact(name)>=0){
			System.out.println("Contact Removed: " + this.contactList.get(findContact(name)).getContact());
			this.contactList.remove(findContact(name));
		
		}else{
			System.err.println(name + " not found");
		}
	}

	public void modifyContact(String oldNumber, String newNumber) {
		if(findContact(oldNumber)>=0){
			int i = findContact(oldNumber);
			System.out.println(oldNumber + " found at " + i);
			
			if(findContact(newNumber)>=0){
				System.out.println(newNumber + " exists at " + i + ". Error updating record ");
			}else{
				this.contactList.get(i).setPhoneNumber(newNumber);
				System.out.println(newNumber + " updated at " + i);
			}
			
		}else{
			System.err.println(oldNumber + " not found");
		}
	}

	public void searchContact(String number) {
		if(findContact(number) >= 0){
			System.out.println(number + " found at " + findContact(number));
			this.contactList.get(findContact(number)).getContact();
		} else{
			System.err.println(number + " not found");
		}
		
	}

	
}

