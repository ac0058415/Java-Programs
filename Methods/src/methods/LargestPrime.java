package methods;

public class LargestPrime {

	public static void main(String[] args) {
		
		LargestPrime obj = new LargestPrime();
	//	obj.getPrimeNumbers(10);
	//	obj.isPrime(1);
		obj.getLargestPrimeDivisor(100);

	}
	
	private void getLargestPrimeDivisor(int num) {
		
		int i =2, maxDiv = 0;
		
		while(i<=num){
			
			//if i is a divisor
			if((num%i == 0) && (isPrime(i) >= 2)){
				System.out.println("Prime Divisor: " + i );
				maxDiv = i;
			}
			i++;
		}
		System.out.println("Largest Prime Divisor: " + maxDiv);
	}

	private int isPrime(int num) {
		int i = 2;
		while(i<num){
			if(num%i == 0){
				break;
			}
			i++;
		}
		
		if((num == 2) || (i == num)){
		//	System.out.println(num + " is Prime");
			return num;
		} else {
		//	System.out.println(num + " is not Prime");
			return -1;
		}
	}

	private void getPrimeNumbers(int num){
		int i = 2;
		
		while(i<=num){
			int val = isPrime(i);
			if (val > 0){
				System.out.print(val + " ");
			}
			i++;
		}
	}
}
