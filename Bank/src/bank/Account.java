package bank;
import java.util.ArrayList;

public class Account {
	private double balance;
	private String accountNumber;
	private ArrayList<String> transactions;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public Account(String accountNumber) {
		this.balance = 0;
		this.accountNumber = accountNumber;
		this.transactions = new ArrayList<String>();
	}
	
	public void creditBalance(double amount){
		this.balance += amount;
		this.transactions.add("Credit[" + (this.transactions.size() + 1) + "] : " + amount);
	}
	
	public void debitBalance(double amount){
		if (this.getBalance() >= amount){
			this.balance -= amount;
			this.transactions.add("Debit[" + (this.transactions.size() + 1) + "] : " + amount);
		}else{
			System.out.println("Insufficent balance: " + this.balance);
		}
	}
	
	public void showTransactions(){
		for(int i=0;i<this.transactions.size();i++){
			System.out.println(this.transactions.get(i));
		}
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		
	}

}
