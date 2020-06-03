package bank;

public class Main {

	public static void main(String[] args) {
	
		BankAccount cust1 = new BankAccount();
		BankAccount cust2 = new BankAccount("Neha", "34534", "asd@gmail.com", 234234L);
		BankAccount cust3 = new BankAccount();
		VipCustomer vip1 = new VipCustomer("VIP2", "asda");
		System.out.println(vip1.getName() + "    " + vip1.getCreditLimit());
		
		System.out.println(cust1.getName());
		cust1.checkBalance();
		cust1.deposit(5000);
		cust1.deposit(6000);
		cust1.withdraw(100000);
		cust1.withdraw(1000);
		cust1.checkBalance();
		
		System.out.println(cust2.getName());
		cust2.checkBalance();
		cust2.deposit(5000);
		cust2.deposit(6000);
		cust2.withdraw(100000);
		cust2.withdraw(1000);
		cust2.checkBalance();
		
		System.out.println(cust3.getName());
		cust3.checkBalance();
		cust3.deposit(5000);
		cust3.deposit(6000);
		cust3.withdraw(100000);
		cust3.withdraw(1000);
		cust3.checkBalance();
		/*
		cust1.setName("Neha");
		cust1.setAccountNumber("111111N");
		cust1.setEmail("abc@gmail.com");
		cust1.setPhoneNumber(989665656);
		System.out.println(cust1.getName());
		cust1.checkBalance();
		cust1.deposit(5000);
		cust1.deposit(6000);
		cust1.withdraw(100000);
		cust1.withdraw(1000);
		cust1.checkBalance();
		
		System.out.println();
	//	cust2.setName("Ahaan");
		System.out.println(cust2.getName());
		cust2.setAccountNumber("111111A");
		cust2.setEmail("abc@gmail.com");
		cust2.setPhoneNumber(5454545);
		cust2.checkBalance();
		cust2.deposit(5000);
		cust2.deposit(6000);
		cust2.withdraw(100000);
		cust2.withdraw(1000);
		cust2.checkBalance();
		System.out.println();
		
		cust3.setName("Anupam");
//		cust3.setAccountNumber("11111NA");
		cust3.setEmail("abc@gmail.com");
		cust3.checkBalance();
		cust3.deposit(5000);
		cust3.deposit(6000);
		cust3.withdraw(100000);
		cust3.withdraw(1000);
		cust3.checkBalance();
	*/	
	}

}
