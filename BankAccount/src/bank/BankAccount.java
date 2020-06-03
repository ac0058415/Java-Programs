package bank;

public class BankAccount {
	
	private String accountNumber, name, email;
	private double balance;
	private long phoneNumber;
	
	public BankAccount(){
		this("Default", "121212A", "abc@gmai.com", 8976897897L);
		System.out.println("Default set");
	}
	
	public BankAccount(String name, String accountNumber, String email, long phoneNumber){
		this.accountNumber = accountNumber;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void checkBalance(){
		if(checkMandatoryFields()){
			System.out.println("Current Balance in Account: " + this.accountNumber + " is - " + this.balance);
		}
	}
	
	public void deposit(double amount){
		if(checkMandatoryFields()){
			this.balance += amount;
			System.out.println(amount + " deposited to Account: " + this.accountNumber);
		}
	}
	
	public void withdraw(double amount){
		
		if(checkMandatoryFields()){
			if(this.balance >= amount){
				this.balance -= amount;
				System.out.println(amount + " withdrawn from Account: " + this.accountNumber);
			} else{
				System.out.println("Not sufficient balance in Account: " + this.accountNumber);
				System.out.println("Maximum amount withdrawn can be: " + this.balance);
			}
		}
	}
	
	private boolean checkMandatoryFields(){
		
		if(getAccountNumber() == null){
			System.out.println("Acccount number cannot be empty");
			return false;
		} else if(getName() == null){
			System.out.println("Name cannot be empty");
			return false;
		}else if(getPhoneNumber() == 0){
			System.out.println("Phone number is required");
			return false;
		}
	//	System.out.println("All mandatory fields are populated");
		return true;	
	}
}
