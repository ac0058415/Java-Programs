package methods;

public class Numbers {

	public static void main(String[] args) {
		
		int start = 100, end = 100000000; 
		int sum = 0, count = 0;
		for(int i=start;i<=end;i++){
			if((i%3 == 0) && (i%5 == 0)){
				System.out.println(i);
				sum = sum+i;
				System.out.println("Sum now is " + sum);
				count++;
				if(count>=50000){
					break;
				}
			}
		}

	}

}
