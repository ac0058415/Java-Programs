package methods;

import java.util.Scanner;

public class MinMaxInputNumber {

	public static void main(String[] args) {
		
		MinMaxInputNumber obj = new MinMaxInputNumber();
		obj.minMaxInputNumber();
	}
	
	private void minMaxInputNumber(){
		
		int min=0, max=0;
		Scanner scanner = new Scanner(System.in);
		int count = 0; 
		while(true){
			System.out.println("Enter a number: ");
			
			if(scanner.hasNextInt()){
				int num = scanner.nextInt(); //take the input
				//counter
				
				if(count == 0){ //First number
					max = min = num;
				}
				
				if(num > max){ //compare
					max = num;
				} else if(num < min){
					min = num;
				}
				count++; 
				showNumbers(min, max);
			} else{
				System.out.println("End of input numbers, out of " + count + " numbers");
				showNumbers(min, max);
				break;
			}	
		}
		scanner.close();
	}
	
	private void showNumbers(int min, int max) {
		System.out.println("Minimum: " + min + '\t' + "Maximum: " + max);
	}

}
