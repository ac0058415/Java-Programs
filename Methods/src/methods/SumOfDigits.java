package methods;

public class SumOfDigits {

	public static void main(String[] args) {
		
		SumOfDigits obj = new SumOfDigits();
	//	System.out.println(obj.sumOfDigits(12356));
	//	System.out.println(obj.sumOfFirstAndLastDigits(12356));
	//	System.out.println(obj.sumOfEvenDigits(3123));
	//	obj.sharedDigit(6878, 21825);
	//	obj.divisor(30,30);
	//	obj.isPerfectDivisor(28);
		obj.numberToWords(10232);

  	}
	
	private void numberToWords(int num) {
		
	//	System.out.println("Count: " + count(num));
	//	System.out.println("Reverse: " + reverse(num));
		
		int number = reverse(num);
		int length = count(num);
		while(length>0){
			System.out.print(digitToWord(number%10) + '\t');
			number = number/10;
			
			length--;
		}
		
	}
	
	private int reverse(int n){
		int rev = 0;
		String revString = null;
		int length = count(n);
		while(length>0){
			rev = (n%10) + rev;
			n=n/10;
			length--;
			if(length > 0){
			rev = rev*10;
	//		revString = String.valueOf(rev);
			}
		}
		
		return rev;
	//	return revString;
	}
	private int count(int n){
		int count = 0;
		while(n>0){
			count++;
			n = n/10;
		}
		return count;
	}
	
	private String digitToWord(int n){
		
		switch (n){
		case 1:
			return "One";
		case 2:
			return "Two";
		case 3:
			return "Three";
		case 4:
			return "Four";
		case 5:
			return "Five";
		case 6:
			return "Six";
		case 7:
			return "Seven";
		case 8:
			return "Eight";
		case 9:
			return "Nine";
		default:
			return "Zero";
		}
	}

	private void isPerfectDivisor(int num) {
		int sum = 0, i = 2, number = num;
		while(i<num){
			if((num%i) == 0){
				sum = sum + i; 
				System.out.println("Divisior : " + i);
			}
			i++;
				
		}
		if((sum+1) == num){
			System.out.println(number + " is a Perfect Number");
		}
		else{
			System.out.println(number + " is not a Perfect Number");
		}
	}

	private void divisor(int num1, int num2) {
		int i = 1, maxDiv = 0, minDiv = 0 ;
		//find minimum of two
		
		if(num1>num2){
			while (i<=num2){
				if((num1%i == 0) && (num2%i == 0)){
					maxDiv = i;
					System.out.println("Divisor: " + maxDiv);
				}
				i++;
			}
		}
		else if (num1<num2){
			while(i<=num1){
				if((num1%i == 0) && (num2%i == 0)){
					maxDiv = i;
					System.out.println("Divisor: " + maxDiv);
				}
				i++;
			}
		}
		else{
			System.out.println("Numbers are equal");
			maxDiv = num1;
		}
		if(!(maxDiv == 1)){
			System.out.println("Greatest divisor between " + num1 + " and " + num2 + " is " + maxDiv);
		}
		else{
			System.out.println("No commom divisor between " + num1 + " and " + num2);
		}
		
	}

	private void sharedDigit(int num1, int num2) {
		int d1 = 0, n1 = num1, n2 = num2;
		
		while(num1 > 0){
			d1 = num1 % 10;
			num2 = n2;
			while((num2/10) > 0){
				if (d1 == (num2 % 10)){
					System.out.println(d1 + " is shared between " + n1 + " and " + n2 );
				}
				num2 = num2 / 10;
			}
			if(d1 == num2){
				System.out.println(d1 + " is shared between " + n1 + " and " + n2 );
			}
			num1 = num1 / 10;
			System.out.println (d1 + " not common digit in " + n1 + " and " + n2);
		}
		
	}

	private String sumOfDigits(int num){
		int sum=0;
		while(num>=9){
			sum = sum + (num%10);
			num = num/10;
	//		System.out.println("Number: " + num);
		}
		
		return ("Sum of digits: " + (sum+num));
	}
	
	private String sumOfFirstAndLastDigits(int num){
		int sum= (num % 10), number = num;
		while ((num/10) > 0){
			num = num/10;
		}
		sum = sum + num;
		
		return ("Sum of first and last digits : " + sum);
	}
	
	private String sumOfEvenDigits(int num){
		int sum = 0, digit = 0, number = num;
		
		while(num/10 > 0){
			digit = num % 10;
			if((digit % 2) == 0 ){
				sum = sum + digit; 
			}
			num = num/10;
		}
		if (num%2 == 0){
			sum += num;
		}
		return("Sum of even digits in " + number + " : " + sum);
	}
}
