package bank;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Bank boa =  new Bank("BOA");
	private static Bank citi =  new Bank("CITI");
	private static Bank bankObj = null;
	private static boolean bankMenu = true;
	
	public static void main(String[] args) {
		
		System.out.println("***Welcome to Banking System***");
		chooseBank();			
	}
	
	private static void goToBankMenu(){
		
		int choice = 0;
		
		while(bankMenu){
			System.out.println("Please choose an option");
			printOptions();
			if(scanner.hasNextInt()){
				choice = scanner.nextInt();
			}else{
				System.err.println("Invalid choice! Please choose a correct option");
				printOptions();
				scanner.nextLine();
			}
			
			switch(choice){
			case 0:
				printOptions();
				break;
				
			case 1:
				addBranchToBank();
				break;
				
			case 2:
				addCustomerToBranch();
				break;
				
			case 3:
				addAccountToCustomerOfBranch();
				break;
				
			case 4:
				showAllDetails();
				break;
				
			case 5:
				creditAmount();
				break;
				
			case 6:
				debitAmount();
				break;
				
			case 7:
				exit();
				bankMenu = false;
				break;
			
			case 9:
				chooseBank();
				break;
				
			}
		}
	}
	
	private static void chooseBank() {
		boolean chooseBank = true;
		System.out.println("Please choose either Bank - 1. BOA or 2. CITI");
		
		while(chooseBank){
			if(scanner.hasNextInt()){
				int choice =  scanner.nextInt();
				if(choice == 1){
					bankObj = boa;
					System.out.println("Welcome to BOA");
					goToBankMenu();
					chooseBank = false;
				}else if(choice == 2){
					bankObj = citi;
					System.out.println("Welcome to CITI Bank");
					goToBankMenu();
					chooseBank = false;
				} else{
					System.err.println("Invalid choice");
				}
			}else{
				System.err.println("Invalid choice! Please enter either Bank - 1. BOA or 2. CITI");
				scanner.nextLine();
			}
			
		}
	}

	private static void exit() {
		System.out.println("Thank You! Have a nice day!");	
	}

	private static void debitAmount() {
		System.out.println("Please enter the Branch ID");
		String branchID = scanner.next();
		System.out.println("Please enter the Customer ID");
		String customerID = scanner.next();
		System.out.println("Please enter the Account Number");
		String accountNumber = scanner.next();
		System.out.println("Please enter the Amount");
		double amount = scanner.nextDouble();
		bankObj.debitAccount(branchID, customerID, accountNumber, amount);
	}

	private static void creditAmount() {
		System.out.println("Please enter the Branch ID");
		String branchID = scanner.next();
		System.out.println("Please enter the Customer ID");
		String customerID = scanner.next();
		System.out.println("Please enter the Account Number");
		String accountNumber = scanner.next();
		System.out.println("Please enter the Amount");
		double amount = scanner.nextDouble();
		bankObj.creditAccount(branchID, customerID, accountNumber, amount);
		
	}

	private static void showAllDetails() {
		bankObj.showAllBranchesOfBankWithCustomers();
		
	}

	private static void addAccountToCustomerOfBranch() {
		System.out.println("Please enter the Branch ID");
		String branchID = scanner.next();
		System.out.println("Please enter the Customer ID");
		String customerID = scanner.next();
		System.out.println("Please enter the Account Number");
		String accountNumber = scanner.next();
		System.out.println("Please enter the Account type");
		String accountType = scanner.next();
		bankObj.addAccountToCustomerOfBranch(branchID, customerID, accountNumber, accountType);
		
	}

	private static void addCustomerToBranch() {
		System.out.println("Please enter the Branch ID");
		String branchID = scanner.next();
		System.out.println("Please enter the Customer ID");
		String customerID = scanner.next();
		System.out.println("Please enter the Customer Name");
		String custName = scanner.next();
		bankObj.addCustomersToBranch(branchID, customerID, custName); 
		
	}

	private static void addBranchToBank() {
		System.out.println("Please enter the Branch ID");
		String branchID = scanner.next();
		System.out.println("Please enter the Branch Name");
		String branchName = scanner.next();
		bankObj.addBranch(branchName, branchID); 
	}

	private static void printOptions(){
		System.out.println("*********************************" +
							'\n' + "0. Print options" +
							'\n' + "1. Add a Branch" +
							'\n' + "2. Add a Customer to a Branch" +
							'\n' + "3. Add an Account to Customer of a Branch" +
							'\n' + "4. Show all details of a Bank" +
							'\n' + "5. Credit to an Account to Customer of a Branch" +
							'\n' + "6. Debit to an Account to Customer of a Branch" +
							'\n' + "7. Exit" +
							'\n' + "9. Choose/Change Bank - BOA or CITI" +
							'\n' + "*********************************");
		
	}
}