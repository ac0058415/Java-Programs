package methods;

public class PrintStar {

	public static void main(String[] args) {
		
		PrintStar obj = new PrintStar();
		
		System.out.println("===============printLeftUpTriangle==================");
		obj.printLeftUpTriangle(5);
		System.out.println("===============printLeftBottomTriangle==================");
		obj.printLeftBottomTriangle(5);
		System.out.println("===============printRightUpTriangle==================");
		obj.printRightUpTriangle(5);
		System.out.println("===============printRightBottomTriangle==================");
		obj.printRightBottomTriangle(5);
		System.out.println("===============printUpTriangle==================");
		obj.printUpTriangle(5);
		System.out.println("===============printdownTriangle==================");
		obj.printdownTriangle(5);
		System.out.println("===============printDiagonalStar==================");
		obj.printDiagonalStar(8);
	}

	private void printDiagonalStar(int num) {
	
		int line = 1, rowCount=1;
		
		while (line <= num){ //loop for line change
			int colCount = 1;
			
			for(int star=1;star<=num;star++){ //print star in each row
								
				if(rowCount == 1 || rowCount == num || colCount == num || colCount == 1 || rowCount == colCount || (colCount == (num-line+1))){
					System.out.print("*");
				} else{
					System.out.print(" ");
				}
				colCount++;
			}
			System.out.println(" ");
			rowCount++;
			line++;	
		}	
	}

	private void printdownTriangle(int num) {
		int line=1, star=num;
		
		while (line<=num){
			
			for(int space=1;space<line;space++){
				System.out.print("_");
			}
			
			for(int j=1;j<=star;j++){
				System.out.print("* ");
			}
			star--;
						
			System.out.println('\n');
			line++;
		}
		
		
	}

	private void printUpTriangle(int num) {
		
		int line=1, space = num;
		
		while (line<=num){
			
			for(int j=1;j<space;j++){
				System.out.print("_");
			}
			space--;
			for(int star=1;star<=line;star++){
				System.out.print("* ");
			}
			
			System.out.println('\n');
			
			line++;
		}
		
	}

	private void printRightBottomTriangle(int num) {
		int star = num, space = 0;
		
		while(star>0){
			
			for(int line=1;line<=space;line++){
				System.out.print(" _ ");
			}
			space++;
			
			for(int line=1;line<=star;line++){
				System.out.print(" * ");
			}
			star--;
				
			
			System.out.println('\n');
		}
		
		
	}

	private void printRightUpTriangle(int num) {
		int star = 1, space=num;
		
		while(star<=num){
			for(int line=1;line<space;line++){
				System.out.print("_");
			}
			space--;

			for(int line=1;line<=star;line++){
				System.out.print("*");
			}
			
			System.out.println('\n');
			star++;
			
		}
		
	}

	private void printLeftBottomTriangle(int num) {
		int i=num;

		while (i>=1){

			for(int j=1; j<=i;j++){
				System.out.print("*");
			}
			System.out.println('\n');
			i--;
		}
		
	}
		

	private void printLeftUpTriangle(int num) {
		
		int i=1;
		
		while (i<=num){
			
			for(int j=1; j<=i;j++){
				System.out.print("*");
			}
			System.out.println('\n');
			i++;
		}
		
	}

}
