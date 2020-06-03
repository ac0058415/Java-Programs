package array;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		SortArray sort = new SortArray();
		
		int[] myNumbers = sort.getNumbers(5);
		System.out.println(myNumbers);
		sort.printArray(myNumbers, "Show Array");
		sort.printArray(sort.sortDescending(myNumbers), "Descending Order");
		sort.printArray(sort.sortAscending(myNumbers), "Ascending Order");
		sort.minNumber(myNumbers);
		sort.maxNumber(myNumbers);
		System.out.println("Average: " + sort.average(myNumbers));
		System.out.println("Sum: " + sort.sum(myNumbers));
		sort.printArray(sort.copy(myNumbers), "Copy Array");
		sort.reverseArray(myNumbers);
	}

	private void reverseArray(int[] myNumbers) {
		int[] revArray = new int[myNumbers.length];
		int j = myNumbers.length;
		for(int i=0;i<myNumbers.length;i++){
			revArray[j-1] = myNumbers[i];
			j--;
		}
		printArray(revArray, "Reverse");
	}

	private int average(int[] myNumbers) {
		return sum(myNumbers)/(myNumbers.length);
	}

	private int sum(int[] myNumbers) {
		int sum=0;
		for(int i=0;i<myNumbers.length;i++){
			sum+=myNumbers[i];
		}
		return sum;
	}

	private void minNumber(int[] myNumbers) {
		sortAscending(myNumbers);
		System.out.println("Minimum Number: " + myNumbers[0]);		
	}
	
	private void maxNumber(int[] myNumbers) {
		sortDescending(myNumbers);
		System.out.println("Maximum Number: " + myNumbers[0]);		
	}

	private int[] sortDescending(int[] myNumbers) {
		int temp;
		for(int i=0;i<(myNumbers.length);i++){
			for(int j=i+1;j<(myNumbers.length);j++){
				if(myNumbers[i] < myNumbers[j]){
					temp = myNumbers[i];
					myNumbers[i] = myNumbers[j];
					myNumbers[j] = temp;
				}
			}
		}
		return myNumbers;	
	}

	private int[] sortAscending(int[] myNumbers) {
		int temp;
		for(int i=0;i<(myNumbers.length);i++){
			for(int j=i+1;j<(myNumbers.length);j++){
				if(myNumbers[i] > myNumbers[j]){
					temp = myNumbers[i];
					myNumbers[i] = myNumbers[j];
					myNumbers[j] = temp;
				}
			}
		}
		return myNumbers;
		
	}

	private int[] getNumbers(int size) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter " + size + " numbers: ");
		int[] array = new int[size];
		for(int i=0;i<array.length;i++){
			System.out.println("Enter " + (i+1) + "# ");
			array[i] = scanner.nextInt();	
		}
		return array;
	}

	private void printArray(int[] array, String operation){
		
		System.out.println("***" + operation + "***");
		for(int i=0;i<array.length;i++){
			System.out.println("myNumber[" + (i) + "] : " + array[i]);
		}
	}
	
	private int[] copy(int[] array){
		int[] copyArray = array;
		return copyArray;
	}
}
