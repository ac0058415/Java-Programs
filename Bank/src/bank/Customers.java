package bank;

import java.util.ArrayList;

public class Customers {
	
	private ArrayList<Account> account;
	private String accountType, name;
	private String customerID;

	public Customers(){
		this.account = new ArrayList<Account>();
	}
	
	public String getCustomerID(){
		return this.customerID;
	}
	public String getCustomerName(){
		return this.name;
	}
	public Customers(String customerID, String name) {
		this.account = new ArrayList<Account>();
		this.customerID = customerID;
		this.name = name;
	}
	
	public void addAccount(String accountNumber, String accountType){
		if(!checkAccountNumber(accountNumber)){
			Account account = new Account(accountNumber);
			this.account.add(account);
			this.accountType = accountType;
			System.out.println(accountNumber + " added at " + this.account.indexOf(account));
		}else{
			System.err.println("Error adding in account number: " + accountNumber);
		}
		
	}
	
	public void deleteAccount(String accountNumber){
		if(checkAccountNumber(accountNumber)){
			System.out.println("Deleting account: " + accountNumber);
			this.account.remove(returnIndexOfAccountNumber(accountNumber));
		}else{
			System.err.println(accountNumber + " not found");
		}
	}
	
	public void showNumberOfAccounts(){
		System.out.println("***Showing Accounts for " + this.name + " ***" );
		System.out.println("Total Accounts: " + this.account.size());
		for(int i=0;i<this.account.size();i++){
			System.out.println("Account Type: " + this.accountType + '\t' + " Account Number: " + this.account.get(i).getAccountNumber());
		}
		
	}
	
	public void showTotalBalance(){
		System.out.println("***Total Balance for " + this.name + " ***");
		double sum = 0;
		for(int i=0;i<this.account.size();i++){
			System.out.println("Account Type: " + this.accountType + '\t' + " Account Number: " + this.account.get(i).getAccountNumber()
								+ '\t' + " Balance: " + this.account.get(i).getBalance());
			this.account.get(i).showTransactions();
			sum += this.account.get(i).getBalance();
		}
		System.out.println("Total Worth of " + this.name + ": " + sum);
		
	}
	
	public void editAccountName(String accountNumber, String newName){
		if(checkAccountNumber(accountNumber)){
			System.out.println("Current name: " + this.name);
			this.name = newName;
			System.out.println("Name has been changed to: " + this.name);
		}else{
			System.err.println(accountNumber + " not found");
		}
	}
	
	public void editAccountNumber(String accountNumber, String newAccountNumber){
		if(checkAccountNumber(accountNumber)){
			System.out.println("Current Account Number: " + this.account.get(returnIndexOfAccountNumber(accountNumber)).getAccountNumber());
			this.account.get(returnIndexOfAccountNumber(accountNumber)).setAccountNumber(newAccountNumber);
			System.out.println("Account number has been changed to: " + newAccountNumber);
		}else{
			System.err.println(accountNumber + " not found");
		}
		
	}
	
	private boolean checkAccountNumber(String accountNumber){
		
		for(int i=0;i<this.account.size();i++){
			if(this.account.get(i).getAccountNumber().equalsIgnoreCase(accountNumber)){
			//	System.out.println(accountNumber + " found at " + i);
				return true;
			}
		}
		return false;
	}
	
	private int returnIndexOfAccountNumber(String accountNumber){
		for(int i=0;i<this.account.size();i++){
			if(this.account.get(i).getAccountNumber().equalsIgnoreCase(accountNumber)){
				return i;
			}
		}
		return -1;
	}
	
	public void creditAmount(String accountNumber, double amount){
		System.out.println("***Running Credit***");
		if(checkAccountNumber(accountNumber)){
			int index =  returnIndexOfAccountNumber(accountNumber);
			this.account.get(index).creditBalance(amount);
		}else{
			System.err.println("Error! Account not found " + accountNumber );
		}
	}
	
	public void debitAmount(String accountNumber, double amount){
		System.out.println("***Running Debit***");
		if(checkAccountNumber(accountNumber)){
			int index =  returnIndexOfAccountNumber(accountNumber);
			this.account.get(index).debitBalance(amount);
		}else{
			System.err.println("Error! Account not found " + accountNumber );
		}
	}
	
	public void showBalance(String accountNumber){
		if(checkAccountNumber(accountNumber)){
			int index =  returnIndexOfAccountNumber(accountNumber);
			System.out.println("***Account Balance***");
			System.out.println(accountNumber + ": " + this.account.get(index).getBalance());
		}else{
			System.err.println(accountNumber + " not found");
		}
	}
}
