package mobilePhone;

import java.util.Scanner;

public class Main {

	private static MobilePhone phone = new MobilePhone("1111111");
	private static Scanner scanner = new Scanner(System.in);	
	
	public static void main(String[] args) {
		showMenu();
	}
	
	private static void showMenu(){
		
		printMenu();
		boolean loop = true;
		int choice;
		while(loop){
			System.out.println("Enter your choice: ");
			
			if(scanner.hasNextInt()){
				choice = scanner.nextInt();
			}else{
				System.out.println("Invalid choice");
				choice = 0;
			}
			scanner.nextLine();
			
			switch(choice){
				case 0:
					printMenu();
					break;
				case 1:
					showContacts();
					break;
				case 2:
					addContact();
					break;
				case 3:
					removeContact();
					break;
				case 4:
					searchContact();
					break;
				case 5:
					modifyContact();
					break;
				case 6:
					quit();
					loop = false;
					break;
				default:
					System.err.println("Invalid Choice");
					break;
			}
		}
		
	}

	private static void quit() {
		System.out.println("Have a good day! Thanks");	
	}

	private static void modifyContact() {
		System.out.println("Enter number to modify: ");
	//	scanner.nextLine();
		String oldNumber = scanner.nextLine();
		System.out.println("What's the new value: ");
		String newNumber = scanner.nextLine();
		phone.modifyContact(oldNumber, newNumber);		
	}

	private static void searchContact() {
		System.out.println("Enter name or number to search: ");
		scanner.nextLine();
		String number = scanner.nextLine();
		phone.searchContact(number);
	}

	private static void removeContact() {
		
		System.out.println("Enter number to be removed: ");
		scanner.nextLine();
		String number = scanner.nextLine();
		phone.removeContact(number);	
	}

	private static void addContact() {
	
		System.out.println("Enter number to enter: ");
	//	scanner.nextLine();
		String number = scanner.nextLine();
		System.out.println("Enter First Name to enter: ");
		String fName = scanner.nextLine();
		System.out.println("Enter Last Name to enter: ");
		String lName = scanner.nextLine();
		phone.addContact(new Contact(fName, lName, number));
	}

	private static void showContacts() {
		phone.showContactList();
	}

	private static void printMenu() {
		
		System.out.println('\n'+ "0. Print options" +
						'\n'+ "1. Show Contacts" +
						'\n'+ "2. Add Contact" +
						'\n'+ "3. Remove Contact" +
						'\n'+ "4. Search Contact" +
						'\n'+ "5. Update Contact" +
						'\n'+ "6. Exit Menu");
		
	}

}
