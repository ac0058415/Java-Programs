package bank;

import java.util.ArrayList;

public class Bank {
	private String bankName;
	private ArrayList<Branch> branchList;
	
	public Bank(String bankName) {
		this.branchList = new ArrayList<Branch>();
		this.bankName = bankName;
	}
	
	public void addBranch(String branchName, String branchID){
		if(returnIndexOfBranch(branchID) < 0){
			branchList.add(new Branch(branchName, branchID));
			System.out.println("Success! Branch added: " + branchID);
		}else{
			System.err.println("Error! Branch exsits at " +  returnIndexOfBranch(branchID));
		}
	}
	
	public void addCustomersToBranch(String branchID, String customerID, String name){
		if(returnIndexOfBranch(branchID)>=0){
			this.branchList.get(returnIndexOfBranch(branchID)).addCustomerToBranch(customerID, name);
		}else{
			System.err.println("Error! Branch not found " +  branchID);
		}
	}
	
	public void addAccountToCustomerOfBranch(String branchID, String customerID, String accountNumber, String accountType){
		if(returnIndexOfBranch(branchID)>=0){
			this.branchList.get(returnIndexOfBranch(branchID)).addAccountToCustomer(customerID, accountNumber, accountType);
		}else{
			System.err.println("Error! Branch not found " +  branchID);
		}
	}
	
	public void creditAccount(String branchID, String customerID, String accountID, double amount){
		if(returnIndexOfBranch(branchID)>=0){
			this.branchList.get(returnIndexOfBranch(branchID)).creditAmountToAccount(customerID, accountID, amount);
		}else{
			System.err.println("Error! Branch not found " +  branchID);
		}
	}
	
	public void debitAccount(String branchID, String customerID, String accountID, double amount){
		if(returnIndexOfBranch(branchID)>=0){
			this.branchList.get(returnIndexOfBranch(branchID)).debitAmountToAccount(customerID, accountID, amount);
		}else{
			System.err.println("Error! Branch not found " +  branchID);
		}
	}
	
	public void showAllDetailsOfBank(){
		System.out.println("***Showing all details of Bank " + this.bankName + " ***");
		System.out.println("Total Branches: " + this.branchList.size());
		for(int i=0;i<this.branchList.size();i++){
			System.out.println("Bank Name: " + this.bankName);
			this.branchList.get(i).showAllCustomersWithAccountDetails();
		}
	}
	public void showAllBranchesOfBankWithCustomers(){
		System.out.println("***Showing all Branches of " + this.bankName + " ***");
		for(int i=0;i<this.branchList.size();i++){
			System.out.println("Branch Name: " +  this.branchList.get(i).getBranchName()
					+ '\t' + "Branch ID: " +  this.branchList.get(i).getBranchID());
			this.branchList.get(i).showAllCustomersWithAccountDetails();
		}
	}
	
	private int returnIndexOfBranch(String branchID){
		for(int i=0;i<this.branchList.size();i++){
			if(this.branchList.get(i).getBranchID().equalsIgnoreCase(branchID)){
				return i;
			}
		}
		return -1;
	}
	
}
