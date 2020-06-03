package methods;

import java.util.Scanner;

public class ReadingUserInputChallange {

	public static void main(String[] args) {
		
		ReadingUserInputChallange obj =  new ReadingUserInputChallange();
		obj.sumUserInputs(10);

	}

	private void sumUserInputs(int num){
		
		Scanner scan = new Scanner(System.in);
		int sum=0, count=1;
		
		while(count<=num){
			System.out.println("Enter number #" + count + ": ");
			if(scan.hasNextInt()){
				int n = scan.nextInt();
				count++;
				sum+=n;
			}else {
				System.out.println("Invalid input");
			}
			scan.nextLine();
		}
		
		System.out.println("Sum of " + num + " numbers is: " + sum );
		
	}
}
