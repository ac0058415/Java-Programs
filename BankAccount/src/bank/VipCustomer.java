package bank;

public class VipCustomer {
	
	private String name, email;
	double creditLimit;
	
	public VipCustomer(){
		this("VIP", "VIP@email.com", 100001);
	}
	
	public VipCustomer(String name, String email, double creditLimit) {
		this.name = name;
		this.email = email;
		this.creditLimit = creditLimit;
	}

	public VipCustomer(String name, String email) {
		this.name = name;
		this.email = email;
		this.creditLimit = 99999;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getCreditLimit() {
		return creditLimit;
	}
	
	
}
