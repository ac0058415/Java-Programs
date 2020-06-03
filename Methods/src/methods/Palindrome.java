package methods;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome obj = new Palindrome();
		obj.palindrome(12332);
	}

	private void palindrome(int num){
		int reverse = 0, number=num;
		while ((num/10) > 0){
			reverse = (reverse*10) + (num % 10);
			num = (num/10);
		}
		reverse = reverse*10+num;
		
		if(reverse == number){
			System.out.println(reverse + " is Palindrome to " + number);
		}
		else{
			System.out.println(reverse + " is NOT Palindrome to " + number);
		}
		
	}
}
