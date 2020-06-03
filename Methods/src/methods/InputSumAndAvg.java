package methods;

import java.util.Scanner;

public class InputSumAndAvg {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int count = 0, sum = 0, avg = 0;
		
		while(true){
			System.out.println("Enter a number: ");
			if(scanner.hasNextInt()){
				int num = scanner.nextInt();
				count++; //number entered
				sum+=num;//sum
				avg = sum/count;
			}else{
				System.out.println("End on input, total " + count + " entered");
				System.out.println("Sum: " + sum + '\t' + "Average: " + avg );
				break;
			}
		}
		
		scanner.close();
	}

}
