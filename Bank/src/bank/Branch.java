package bank;

import java.util.ArrayList;

public class Branch {

	private String branchName;
	private String branchID;
	private ArrayList<Customers> customerList;
	
	
	public String getBranchName() {
		return branchName;
	}

	public String getBranchID() {
		return branchID;
	}

	public ArrayList<Customers> getCustomerList() {
		return customerList;
	}

	public Branch(String branchName, String branchID) {
		this.customerList = new ArrayList<Customers>();
		this.branchName = branchName;
		this.branchID = branchID;
	}
	
	public void addCustomerToBranch(String customerID, String customerName){
		if(!checkCustomerID(customerID)){
			Customers customer = new Customers(customerID, customerName);
			customerList.add(customer);
			System.out.println("Success! " + customerID + " added to the branch " + this.branchID );
		}else{
			System.err.println("Error adding " + customerID);
		}	
	}
	
		
	public void addAccountToCustomer(String customerID, String accountID, String accountType){
		if(checkCustomerID(customerID)){
			this.customerList.get(returnIndexOfCustomerID(customerID)).addAccount(accountID, accountType);
		}else{
			System.err.println("Error! Customer not found " + customerID );
		}
	}
	
	
	private boolean checkCustomerID(String customerID){
		for(int i=0;i<this.customerList.size();i++){
			if(this.customerList.get(i).getCustomerID().equalsIgnoreCase(customerID)){
			//	System.out.println(customerID + " found at " + i);
				return true;
			}
		}
		return false;
	}
	
	private int returnIndexOfCustomerID(String customerID){
		for(int i=0;i<this.customerList.size();i++){
			if(this.customerList.get(i).getCustomerID().equalsIgnoreCase(customerID)){
				return i;
			}
		}
		return -1;
	}
	
	public void showAllCustomersOfBranch(){
		System.out.println("***Showing all Customers of Branch " + this.branchName + "--" + this.branchID + " ***");
		System.out.println("Total Customers: " + this.customerList.size());
		for(int i=0;i<this.customerList.size();i++){
			System.out.println("Customer Name: " + this.customerList.get(i).getCustomerName()
								+ '\t' + "Customer ID: " + this.customerList.get(i).getCustomerID());
		}
	}
	
	public void showAllCustomersWithAccountDetails(){
		System.out.println("***Showing all Customers of Branch " + this.branchName + "--" + this.branchID + " (with Accounts)***");
		System.out.println("Total Customers: " + this.customerList.size());
		for(int i=0;i<this.customerList.size();i++){
			System.out.println("Customer Name: " + this.customerList.get(i).getCustomerName()
								+ '\t' + "Customer ID: " + this.customerList.get(i).getCustomerID());
			this.customerList.get(i).showTotalBalance();
		}
	}
	
	public void creditAmountToAccount(String customerID, String accountID, double amount){
		if(checkCustomerID(customerID)){
			this.customerList.get(returnIndexOfCustomerID(customerID)).creditAmount(accountID, amount);
		}else{
			System.err.println("Error! Customer not found " + customerID );
		}
	}
	
	public void debitAmountToAccount(String customerID, String accountID, double amount){
		if(checkCustomerID(customerID)){
			this.customerList.get(returnIndexOfCustomerID(customerID)).debitAmount(accountID, amount);
		}else{
			System.err.println("Error! Customer not found " + customerID );
		}
	}
}
